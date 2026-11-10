#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_gaming_wrapper.h"
#include <errno.h>
#ifdef _WIN32
#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif
#include <windows.h>
#else
#include <dlfcn.h>
#ifndef RTLD_DEFAULT
#define RTLD_DEFAULT ((void*)0)
#endif
#endif

int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeSilently(uint32_t privilegeid, void* scope, void* policy, void* hasprivilege) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeSilently");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(privilegeid, scope, policy, hasprivilege);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)hasprivilege;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeSilentlyForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* hasprivilege) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeSilentlyForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, privilegeid, scope, policy, hasprivilege);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)hasprivilege;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeWithUI(uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeWithUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(privilegeid, scope, policy, friendlymessage, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)friendlymessage;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_checkGamingPrivilegeWithUIForUser(void* user, uint32_t privilegeid, void* scope, void* policy, void* friendlymessage, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeWithUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, privilegeid, scope, policy, friendlymessage, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)friendlymessage;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_getExpandedResourceExclusiveCpuCount(void* exclusivecpucount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-expandedresources-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExpandedResourceExclusiveCpuCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exclusivecpucount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exclusivecpucount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_getGamingDeviceModelInformation(void* information) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-deviceinformation-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGamingDeviceModelInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(information);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)information;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_hasExpandedResources(void* hasexpandedresources) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-expandedresources-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HasExpandedResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hasexpandedresources);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hasexpandedresources;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_processPendingGameUI(int32_t waitforcompletion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessPendingGameUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(waitforcompletion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)waitforcompletion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_releaseExclusiveCpuSets(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-expandedresources-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseExclusiveCpuSets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showChangeFriendRelationshipUI(void* targetuserxuid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowChangeFriendRelationshipUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetuserxuid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showChangeFriendRelationshipUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowChangeFriendRelationshipUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, targetuserxuid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showCustomizeUserProfileUI(void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCustomizeUserProfileUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showCustomizeUserProfileUIForUser(void* user, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCustomizeUserProfileUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showFindFriendsUI(void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowFindFriendsUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showFindFriendsUIForUser(void* user, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowFindFriendsUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showGameInfoUI(uint32_t titleid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInfoUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(titleid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)titleid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showGameInfoUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInfoUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, titleid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)titleid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showGameInviteUI(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showGameInviteUIForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showGameInviteUIWithContext(void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUIWithContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, customactivationcontext, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)customactivationcontext;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showGameInviteUIWithContextForUser(void* user, void* serviceconfigurationid, void* sessiontemplatename, void* sessionid, void* invitationdisplaytext, void* customactivationcontext, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUIWithContextForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, serviceconfigurationid, sessiontemplatename, sessionid, invitationdisplaytext, customactivationcontext, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)customactivationcontext;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showPlayerPickerUI(void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint64_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowPlayerPickerUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(promptdisplaytext, xuids, xuidscount, preselectedxuids, preselectedxuidscount, minselectioncount, maxselectioncount, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)promptdisplaytext;
    (void)xuids;
    (void)xuidscount;
    (void)preselectedxuids;
    (void)preselectedxuidscount;
    (void)minselectioncount;
    (void)maxselectioncount;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showPlayerPickerUIForUser(void* user, void* promptdisplaytext, void* xuids, uint64_t xuidscount, void* preselectedxuids, uint64_t preselectedxuidscount, uint64_t minselectioncount, uint64_t maxselectioncount, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*, uint64_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowPlayerPickerUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, promptdisplaytext, xuids, xuidscount, preselectedxuids, preselectedxuidscount, minselectioncount, maxselectioncount, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)promptdisplaytext;
    (void)xuids;
    (void)xuidscount;
    (void)preselectedxuids;
    (void)preselectedxuidscount;
    (void)minselectioncount;
    (void)maxselectioncount;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showProfileCardUI(void* targetuserxuid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowProfileCardUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetuserxuid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showProfileCardUIForUser(void* user, void* targetuserxuid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowProfileCardUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, targetuserxuid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showTitleAchievementsUI(uint32_t titleid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowTitleAchievementsUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(titleid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)titleid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showTitleAchievementsUIForUser(void* user, uint32_t titleid, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowTitleAchievementsUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, titleid, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)titleid;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showUserSettingsUI(void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowUserSettingsUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_showUserSettingsUIForUser(void* user, void* completionroutine, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowUserSettingsUIForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(user, completionroutine, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)user;
    (void)completionroutine;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_gaming_tryCancelPendingGameUI(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryCancelPendingGameUI");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

