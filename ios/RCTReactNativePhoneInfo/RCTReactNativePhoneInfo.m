#import "RCTReactNativePhoneInfo.h"

@implementation ReactNativePhoneInfo

RCT_EXPORT_MODULE();

RCT_REMAP_METHOD(getPhoneNumber,
                 resolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject)
{
    resolve(@"Hello World!");
}

@end
