import React from 'react'
const UserProfileComponent = ({ profileList }) => {
    return (
        <div>
            {profileList.map(function (profile, index) {
                return <div><li key={profile.id}>USERNAME : {profile.userName}</li>
                    <li key={profile.id}>ADDRESS : {profile.address}</li>
                    <li key={profile.id}>EMAILID:{profile.emailId}</li>
                </div>
            })}
        </div>)

}
export default UserProfileComponent
