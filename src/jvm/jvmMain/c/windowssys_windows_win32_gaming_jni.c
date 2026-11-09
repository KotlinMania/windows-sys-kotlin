#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1CheckGamingPrivilegeSilently(JNIEnv* km_env, jclass km_clazz, jint privilegeid, jlong scope, jlong policy, jlong hasprivilege) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeSilently");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)privilegeid, (void*)(uintptr_t)scope, (void*)(uintptr_t)policy, (void*)(uintptr_t)hasprivilege) : -1;
#else
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)hasprivilege;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1CheckGamingPrivilegeSilentlyForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jint privilegeid, jlong scope, jlong policy, jlong hasprivilege) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeSilentlyForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (uint32_t)privilegeid, (void*)(uintptr_t)scope, (void*)(uintptr_t)policy, (void*)(uintptr_t)hasprivilege) : -1;
#else
    (void)user;
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)hasprivilege;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1CheckGamingPrivilegeWithUI(JNIEnv* km_env, jclass km_clazz, jint privilegeid, jlong scope, jlong policy, jlong friendlymessage, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeWithUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)privilegeid, (void*)(uintptr_t)scope, (void*)(uintptr_t)policy, (void*)(uintptr_t)friendlymessage, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)friendlymessage;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1CheckGamingPrivilegeWithUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jint privilegeid, jlong scope, jlong policy, jlong friendlymessage, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckGamingPrivilegeWithUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (uint32_t)privilegeid, (void*)(uintptr_t)scope, (void*)(uintptr_t)policy, (void*)(uintptr_t)friendlymessage, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)privilegeid;
    (void)scope;
    (void)policy;
    (void)friendlymessage;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1GetExpandedResourceExclusiveCpuCount(JNIEnv* km_env, jclass km_clazz, jlong exclusivecpucount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-expandedresources-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExpandedResourceExclusiveCpuCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exclusivecpucount) : -1;
#else
    (void)exclusivecpucount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1GetGamingDeviceModelInformation(JNIEnv* km_env, jclass km_clazz, jlong information) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-deviceinformation-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGamingDeviceModelInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)information) : -1;
#else
    (void)information;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1HasExpandedResources(JNIEnv* km_env, jclass km_clazz, jlong hasexpandedresources) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-expandedresources-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HasExpandedResources");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hasexpandedresources) : -1;
#else
    (void)hasexpandedresources;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ProcessPendingGameUI(JNIEnv* km_env, jclass km_clazz, jint waitforcompletion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessPendingGameUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)waitforcompletion) : -1;
#else
    (void)waitforcompletion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ReleaseExclusiveCpuSets(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-expandedresources-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseExclusiveCpuSets");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowChangeFriendRelationshipUI(JNIEnv* km_env, jclass km_clazz, jlong targetuserxuid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowChangeFriendRelationshipUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetuserxuid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowChangeFriendRelationshipUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong targetuserxuid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowChangeFriendRelationshipUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)targetuserxuid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowCustomizeUserProfileUI(JNIEnv* km_env, jclass km_clazz, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCustomizeUserProfileUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowCustomizeUserProfileUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCustomizeUserProfileUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowFindFriendsUI(JNIEnv* km_env, jclass km_clazz, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowFindFriendsUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowFindFriendsUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowFindFriendsUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowGameInfoUI(JNIEnv* km_env, jclass km_clazz, jint titleid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInfoUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)titleid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)titleid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowGameInfoUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jint titleid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInfoUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (uint32_t)titleid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)titleid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowGameInviteUI(JNIEnv* km_env, jclass km_clazz, jlong serviceconfigurationid, jlong sessiontemplatename, jlong sessionid, jlong invitationdisplaytext, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceconfigurationid, (void*)(uintptr_t)sessiontemplatename, (void*)(uintptr_t)sessionid, (void*)(uintptr_t)invitationdisplaytext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowGameInviteUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong serviceconfigurationid, jlong sessiontemplatename, jlong sessionid, jlong invitationdisplaytext, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)serviceconfigurationid, (void*)(uintptr_t)sessiontemplatename, (void*)(uintptr_t)sessionid, (void*)(uintptr_t)invitationdisplaytext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowGameInviteUIWithContext(JNIEnv* km_env, jclass km_clazz, jlong serviceconfigurationid, jlong sessiontemplatename, jlong sessionid, jlong invitationdisplaytext, jlong customactivationcontext, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUIWithContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceconfigurationid, (void*)(uintptr_t)sessiontemplatename, (void*)(uintptr_t)sessionid, (void*)(uintptr_t)invitationdisplaytext, (void*)(uintptr_t)customactivationcontext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)customactivationcontext;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowGameInviteUIWithContextForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong serviceconfigurationid, jlong sessiontemplatename, jlong sessionid, jlong invitationdisplaytext, jlong customactivationcontext, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowGameInviteUIWithContextForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)serviceconfigurationid, (void*)(uintptr_t)sessiontemplatename, (void*)(uintptr_t)sessionid, (void*)(uintptr_t)invitationdisplaytext, (void*)(uintptr_t)customactivationcontext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)serviceconfigurationid;
    (void)sessiontemplatename;
    (void)sessionid;
    (void)invitationdisplaytext;
    (void)customactivationcontext;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowPlayerPickerUI(JNIEnv* km_env, jclass km_clazz, jlong promptdisplaytext, jlong xuids, jlong xuidscount, jlong preselectedxuids, jlong preselectedxuidscount, jlong minselectioncount, jlong maxselectioncount, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint64_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowPlayerPickerUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)promptdisplaytext, (void*)(uintptr_t)xuids, (uint64_t)xuidscount, (void*)(uintptr_t)preselectedxuids, (uint64_t)preselectedxuidscount, (uint64_t)minselectioncount, (uint64_t)maxselectioncount, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowPlayerPickerUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong promptdisplaytext, jlong xuids, jlong xuidscount, jlong preselectedxuids, jlong preselectedxuidscount, jlong minselectioncount, jlong maxselectioncount, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*, uint64_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowPlayerPickerUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)promptdisplaytext, (void*)(uintptr_t)xuids, (uint64_t)xuidscount, (void*)(uintptr_t)preselectedxuids, (uint64_t)preselectedxuidscount, (uint64_t)minselectioncount, (uint64_t)maxselectioncount, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowProfileCardUI(JNIEnv* km_env, jclass km_clazz, jlong targetuserxuid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowProfileCardUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetuserxuid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowProfileCardUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong targetuserxuid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowProfileCardUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)targetuserxuid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)targetuserxuid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowTitleAchievementsUI(JNIEnv* km_env, jclass km_clazz, jint titleid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowTitleAchievementsUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)titleid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)titleid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowTitleAchievementsUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jint titleid, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowTitleAchievementsUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (uint32_t)titleid, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)titleid;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowUserSettingsUI(JNIEnv* km_env, jclass km_clazz, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowUserSettingsUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1ShowUserSettingsUIForUser(JNIEnv* km_env, jclass km_clazz, jlong user, jlong completionroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowUserSettingsUIForUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)user, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)user;
    (void)completionroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_gaming_WindowsWin32GamingJniBridge_windowssys_1windows_1win32_1gaming_1TryCancelPendingGameUI(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-gaming-tcui-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryCancelPendingGameUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

