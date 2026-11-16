#ifndef WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32GamingCheckGamingPrivilegeSilently(uint32_t privilegeid, void* scope, void* policy, void* hasprivilege);
int32_t windowssysWindowsWin32GamingCheckGamingPrivilegeSilentlyForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* hasprivilege);
int32_t windowssysWindowsWin32GamingCheckGamingPrivilegeWithUI(uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingCheckGamingPrivilegeWithUIForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingGetExpandedResourceExclusiveCpuCount(void* exclusivecpucount);
int32_t windowssysWindowsWin32GamingGetGamingDeviceModelInformation(void* information);
int32_t windowssysWindowsWin32GamingHasExpandedResources(void* hasexpandedresources);
int32_t windowssysWindowsWin32GamingProcessPendingGameUI(int32_t waitforcompletion);
int32_t windowssysWindowsWin32GamingReleaseExclusiveCpuSets(void);
int32_t windowssysWindowsWin32GamingShowChangeFriendRelationshipUI(void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowChangeFriendRelationshipUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowCustomizeUserProfileUI(void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowCustomizeUserProfileUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowFindFriendsUI(void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowFindFriendsUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowGameInfoUI(uint32_t titleid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowGameInfoUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowGameInviteUI(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowGameInviteUIForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowGameInviteUIWithContext(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowGameInviteUIWithContextForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowPlayerPickerUI(void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowPlayerPickerUIForUser(void* user, void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowProfileCardUI(void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowProfileCardUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowTitleAchievementsUI(uint32_t titleid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowTitleAchievementsUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowUserSettingsUI(void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingShowUserSettingsUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssysWindowsWin32GamingTryCancelPendingGameUI(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H */
