#ifndef WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_gaming_CheckGamingPrivilegeSilently(uint32_t privilegeid, void* scope, void* policy, void* hasprivilege);
int32_t windowssys_windows_win32_gaming_CheckGamingPrivilegeSilentlyForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* hasprivilege);
int32_t windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUI(uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_CheckGamingPrivilegeWithUIForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_GetExpandedResourceExclusiveCpuCount(void* exclusivecpucount);
int32_t windowssys_windows_win32_gaming_GetGamingDeviceModelInformation(void* information);
int32_t windowssys_windows_win32_gaming_HasExpandedResources(void* hasexpandedresources);
int32_t windowssys_windows_win32_gaming_ProcessPendingGameUI(int32_t waitforcompletion);
int32_t windowssys_windows_win32_gaming_ReleaseExclusiveCpuSets(void);
int32_t windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUI(void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowChangeFriendRelationshipUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowCustomizeUserProfileUI(void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowCustomizeUserProfileUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowFindFriendsUI(void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowFindFriendsUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowGameInfoUI(uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowGameInfoUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowGameInviteUI(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowGameInviteUIForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowGameInviteUIWithContext(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowGameInviteUIWithContextForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowPlayerPickerUI(void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowPlayerPickerUIForUser(void* user, void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowProfileCardUI(void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowProfileCardUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowTitleAchievementsUI(uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowTitleAchievementsUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowUserSettingsUI(void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_ShowUserSettingsUIForUser(void* user, void* completionroutine, void* context);
int32_t windowssys_windows_win32_gaming_TryCancelPendingGameUI(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_GAMING_WINDOWS_WIN32_GAMING_WRAPPER_H */
