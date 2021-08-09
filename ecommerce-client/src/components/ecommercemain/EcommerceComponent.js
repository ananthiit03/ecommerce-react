import React from 'react'
import './EcommerceComponent'
import ÚserProfileComponent from './UserProfileComponent'

export default class EcommerceComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            profiles: []
        }
    }
    componentDidMount() {
        /**
         * Fetch Userprofilelist from server to display userprofileinformation
         */
        async function fetchProfileList() {
            const response = await fetch('http://localhost:8080/api/userprofiles');
            const profiles = await response.json();
            return profiles;
        }
        fetchProfileList().then(res => {
            console.log('pro', res)
            this.setState({ profiles: res });
        })

    }
    render() {
        const { profiles } = this.state;
        console.log(profiles);
        /**
         * Pass profileList to child component
         */
        return (
            <div className="container">
                <div className="row profile">
                    <div className="col-md-3">
                        <h1>Welcome</h1>
                        <div className="profile-sidebar">
                            <div className="profile-userpic">
                                <img src="https://gravatar.com/avatar/31b64e4876d603ce78e04102c67d6144?s=80&d=https://codepen.io/assets/avatars/user-avatar-80x80-bdcd44a3bfb9a5fd01eb8b86f9e033fa1a9897c3a15b33adfc2649a002dab1b6.png" className="img-responsive" alt="">
                                </img>
                            </div>
                            <div className="profile-usertitle">
                                <ÚserProfileComponent profileList={profiles} />
                                <div className="profile-usertitle-job">
                                    Developer
					</div>
                            </div>

                            <div className="profile-userbuttons">
                                <button type="button" className="btn btn-success btn-sm">Register User</button>
                                <br />
                                <button type="button" className="btn btn-danger btn-sm">Login</button>
                            </div>

                            <div className="profile-usermenu">
                                <ul className="nav">
                                    <li className="active">
                                        <a href="#">
                                            <i className="glyphicon glyphicon-home"></i>
							Overview </a>
                                    </li>
                                    <li>
                                        <a href="https://codepen.io/jasondavis/pen/jVRwaG?editors=1000">
                                            <i className="glyphicon glyphicon-user"></i>
							Account Settings </a>
                                    </li>
                                    <li>
                                        <a href="#" target="_blank">
                                            <i className="glyphicon glyphicon-ok"></i>
							Tasks </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i className="glyphicon glyphicon-flag"></i>
							Help </a>
                                    </li>
                                </ul>
                            </div>


                            <div className="portlet light bordered">



                            </div>



                        </div>
                    </div>
                    <div className="col-md-9">
                        <div className="profile-content">
                            Some user related content goes here...
            </div>
                    </div>
                </div>
            </div>
        );
    }
}
