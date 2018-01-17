#if __has_include(<React/RCTConvert.h>)
#import <React/RCTConvert.h>
#else
#import "RCTConvert.h"
#endif

#import "RNAltheaTalkable.h"
#import <TalkableSDK/Talkable.h>

@implementation RNAltheaTalkable

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(showAdvocateSignUp) {
    
    [[Talkable manager] registerOrigin:TKBLAffiliateMember params:nil];
}

RCT_EXPORT_METHOD(showAdvocateShare:(NSDictionary *)data tag:(NSString *)campaignTag) {

    NSDictionary* params = @{
                             TKBLAffiliateMemberKey: @{
                                     TKBLAffiliateMemberEmailKey: [RCTConvert NSString:data[@"customer_email"]],
                                     TKBLAffiliateMemberFirstNameKey: [RCTConvert NSString:data[@"customer_firstname"]],
                                     TKBLAffiliateMemberLastNameKey: [RCTConvert NSString:data[@"customer_lastname"]],
                             },
                             TKBLCampaignTags: campaignTag
                             };
                             
    [[Talkable manager] registerOrigin:TKBLAffiliateMember params:params];
}

@end
