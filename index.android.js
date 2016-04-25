import React from 'react-native';

var PhoneInfo = React.NativeModules.ReactNativePhoneInfo;

module.exports = {
    getPhoneNumber: function() {
        return PhoneInfo.phoneNumber;
    }
}