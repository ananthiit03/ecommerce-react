import React from "react";

const UserProfileComponent = (profileList) => {
    /**
     * Iterated profileList and display userprofile information
     */

    return (
        <>
            <div className="hero is-primary">
                <div className="hero-body container">
                    <h4 className="title">Profile List</h4>
                </div>
            </div>
            <br />
            <div className="container">
                <div className="column columns is-multiline">
                    {profileList.map((item) => {
                        <li>{item.name}</li>
                    })}
                </div>
            </div>
        </>
    );
};

export default UserProfileComponent;