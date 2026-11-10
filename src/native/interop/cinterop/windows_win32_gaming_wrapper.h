#ifndef WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(uint32_t privilegeid, void* scope, void* policy, void* hasprivilege);
int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* hasprivilege);
int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount(void* exclusivecpucount);
int32_t windowssys_windows_win32_gaming_getGamingDeviceModelInformation(void* information);
int32_t windowssys_windows_win32_gaming_hasExpandedResources(void* hasexpandedresources);
int32_t windowssys_windows_win32_gaming_processPendingGameUI(int32_t waitforcompletion);
int32_t windowssys_windows_win32_gaming_releaseExclusiveCpuSets(void);
int32_t windowssys_windows_win32_gaming_showChangeFriendRelationshipUI(void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showCustomizeUserProfileUI(void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showFindFriendsUI(void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showFindFriendsUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showGameInfoUI(uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showGameInfoUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showGameInviteUI(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showGameInviteUIForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showGameInviteUIWithContext(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showPlayerPickerUI(void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showPlayerPickerUIForUser(void* user, void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showProfileCardUI(void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showProfileCardUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showTitleAchievementsUI(uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showTitleAchievementsUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showUserSettingsUI(void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_showUserSettingsUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_tryCancelPendingGameUI(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H */
