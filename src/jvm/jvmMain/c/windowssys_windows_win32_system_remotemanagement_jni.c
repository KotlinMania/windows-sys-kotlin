#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManCloseCommand(JNIEnv* km_env, jclass km_clazz, jlong commandhandle, jint flags, jlong async) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseCommand");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)commandhandle, (uint32_t)flags, (void*)(uintptr_t)async);
    } else {
        errno = ENOSYS;
    }
#else
    (void)commandhandle;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManCloseOperation(JNIEnv* km_env, jclass km_clazz, jlong operationhandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseOperation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)operationhandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)operationhandle;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManCloseSession(JNIEnv* km_env, jclass km_clazz, jlong session, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseSession");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManCloseShell(JNIEnv* km_env, jclass km_clazz, jlong shellhandle, jint flags, jlong async) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseShell");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shellhandle, (uint32_t)flags, (void*)(uintptr_t)async);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shellhandle;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManConnectShell(JNIEnv* km_env, jclass km_clazz, jlong session, jint flags, jlong resourceuri, jlong shellid, jlong options, jlong connectxml, jlong async, jlong shell) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManConnectShell");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)session, (uint32_t)flags, (void*)(uintptr_t)resourceuri, (void*)(uintptr_t)shellid, (void*)(uintptr_t)options, (void*)(uintptr_t)connectxml, (void*)(uintptr_t)async, (void*)(uintptr_t)shell);
    } else {
        errno = ENOSYS;
    }
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)shellid;
    (void)options;
    (void)connectxml;
    (void)async;
    (void)shell;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManConnectShellCommand(JNIEnv* km_env, jclass km_clazz, jlong shell, jint flags, jlong commandid, jlong options, jlong connectxml, jlong async, jlong command) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManConnectShellCommand");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (uint32_t)flags, (void*)(uintptr_t)commandid, (void*)(uintptr_t)options, (void*)(uintptr_t)connectxml, (void*)(uintptr_t)async, (void*)(uintptr_t)command);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)flags;
    (void)commandid;
    (void)options;
    (void)connectxml;
    (void)async;
    (void)command;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManCreateSession(JNIEnv* km_env, jclass km_clazz, jlong apihandle, jlong connection, jint flags, jlong serverauthenticationcredentials, jlong proxyinfo, jlong session) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCreateSession");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)apihandle, (void*)(uintptr_t)connection, (uint32_t)flags, (void*)(uintptr_t)serverauthenticationcredentials, (void*)(uintptr_t)proxyinfo, (void*)(uintptr_t)session);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)apihandle;
    (void)connection;
    (void)flags;
    (void)serverauthenticationcredentials;
    (void)proxyinfo;
    (void)session;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManCreateShell(JNIEnv* km_env, jclass km_clazz, jlong session, jint flags, jlong resourceuri, jlong startupinfo, jlong options, jlong createxml, jlong async, jlong shell) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCreateShell");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)session, (uint32_t)flags, (void*)(uintptr_t)resourceuri, (void*)(uintptr_t)startupinfo, (void*)(uintptr_t)options, (void*)(uintptr_t)createxml, (void*)(uintptr_t)async, (void*)(uintptr_t)shell);
    } else {
        errno = ENOSYS;
    }
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)startupinfo;
    (void)options;
    (void)createxml;
    (void)async;
    (void)shell;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManCreateShellEx(JNIEnv* km_env, jclass km_clazz, jlong session, jint flags, jlong resourceuri, jlong shellid, jlong startupinfo, jlong options, jlong createxml, jlong async, jlong shell) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCreateShellEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)session, (uint32_t)flags, (void*)(uintptr_t)resourceuri, (void*)(uintptr_t)shellid, (void*)(uintptr_t)startupinfo, (void*)(uintptr_t)options, (void*)(uintptr_t)createxml, (void*)(uintptr_t)async, (void*)(uintptr_t)shell);
    } else {
        errno = ENOSYS;
    }
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)shellid;
    (void)startupinfo;
    (void)options;
    (void)createxml;
    (void)async;
    (void)shell;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManDeinitialize(JNIEnv* km_env, jclass km_clazz, jlong apihandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManDeinitialize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)apihandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)apihandle;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManDisconnectShell(JNIEnv* km_env, jclass km_clazz, jlong shell, jint flags, jlong disconnectinfo, jlong async) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManDisconnectShell");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (uint32_t)flags, (void*)(uintptr_t)disconnectinfo, (void*)(uintptr_t)async);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)flags;
    (void)disconnectinfo;
    (void)async;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManGetErrorMessage(JNIEnv* km_env, jclass km_clazz, jlong apihandle, jint flags, jlong languagecode, jint errorcode, jint messagelength, jlong message, jlong messagelengthused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManGetErrorMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)apihandle, (uint32_t)flags, (void*)(uintptr_t)languagecode, (uint32_t)errorcode, (uint32_t)messagelength, (void*)(uintptr_t)message, (void*)(uintptr_t)messagelengthused);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)apihandle;
    (void)flags;
    (void)languagecode;
    (void)errorcode;
    (void)messagelength;
    (void)message;
    (void)messagelengthused;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsDword(JNIEnv* km_env, jclass km_clazz, jlong session, jint option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManGetSessionOptionAsDword");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int32_t)option, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)option;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManGetSessionOptionAsString(JNIEnv* km_env, jclass km_clazz, jlong session, jint option, jint stringlength, jlong string, jlong stringlengthused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManGetSessionOptionAsString");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int32_t)option, (uint32_t)stringlength, (void*)(uintptr_t)string, (void*)(uintptr_t)stringlengthused);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)option;
    (void)stringlength;
    (void)string;
    (void)stringlengthused;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManInitialize(JNIEnv* km_env, jclass km_clazz, jint flags, jlong apihandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManInitialize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)apihandle);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)apihandle;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzOperationComplete(JNIEnv* km_env, jclass km_clazz, jlong senderdetails, jint flags, jlong userauthorizationcontext, jint errorcode, jlong extendederrorinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginAuthzOperationComplete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)senderdetails, (uint32_t)flags, (void*)(uintptr_t)userauthorizationcontext, (uint32_t)errorcode, (void*)(uintptr_t)extendederrorinformation);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)senderdetails;
    (void)flags;
    (void)userauthorizationcontext;
    (void)errorcode;
    (void)extendederrorinformation;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzQueryQuotaComplete(JNIEnv* km_env, jclass km_clazz, jlong senderdetails, jint flags, jlong quota, jint errorcode, jlong extendederrorinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginAuthzQueryQuotaComplete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)senderdetails, (uint32_t)flags, (void*)(uintptr_t)quota, (uint32_t)errorcode, (void*)(uintptr_t)extendederrorinformation);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)senderdetails;
    (void)flags;
    (void)quota;
    (void)errorcode;
    (void)extendederrorinformation;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginAuthzUserComplete(JNIEnv* km_env, jclass km_clazz, jlong senderdetails, jint flags, jlong userauthorizationcontext, jlong impersonationtoken, jint userisadministrator, jint errorcode, jlong extendederrorinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginAuthzUserComplete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)senderdetails, (uint32_t)flags, (void*)(uintptr_t)userauthorizationcontext, (void*)(uintptr_t)impersonationtoken, (int32_t)userisadministrator, (uint32_t)errorcode, (void*)(uintptr_t)extendederrorinformation);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)senderdetails;
    (void)flags;
    (void)userauthorizationcontext;
    (void)impersonationtoken;
    (void)userisadministrator;
    (void)errorcode;
    (void)extendederrorinformation;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginFreeRequestDetails(JNIEnv* km_env, jclass km_clazz, jlong requestdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginFreeRequestDetails");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)requestdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginGetConfiguration(JNIEnv* km_env, jclass km_clazz, jlong plugincontext, jint flags, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginGetConfiguration");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plugincontext, (uint32_t)flags, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plugincontext;
    (void)flags;
    (void)data;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginGetOperationParameters(JNIEnv* km_env, jclass km_clazz, jlong requestdetails, jint flags, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginGetOperationParameters");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestdetails, (uint32_t)flags, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)requestdetails;
    (void)flags;
    (void)data;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginOperationComplete(JNIEnv* km_env, jclass km_clazz, jlong requestdetails, jint flags, jint errorcode, jlong extendedinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginOperationComplete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestdetails, (uint32_t)flags, (uint32_t)errorcode, (void*)(uintptr_t)extendedinformation);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)requestdetails;
    (void)flags;
    (void)errorcode;
    (void)extendedinformation;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginReceiveResult(JNIEnv* km_env, jclass km_clazz, jlong requestdetails, jint flags, jlong stream, jlong streamresult, jlong commandstate, jint exitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginReceiveResult");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestdetails, (uint32_t)flags, (void*)(uintptr_t)stream, (void*)(uintptr_t)streamresult, (void*)(uintptr_t)commandstate, (uint32_t)exitcode);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)requestdetails;
    (void)flags;
    (void)stream;
    (void)streamresult;
    (void)commandstate;
    (void)exitcode;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginReportCompletion(JNIEnv* km_env, jclass km_clazz, jlong plugincontext, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginReportCompletion");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plugincontext, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)plugincontext;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManPluginReportContext(JNIEnv* km_env, jclass km_clazz, jlong requestdetails, jint flags, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginReportContext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requestdetails, (uint32_t)flags, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)requestdetails;
    (void)flags;
    (void)context;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManReceiveShellOutput(JNIEnv* km_env, jclass km_clazz, jlong shell, jlong command, jint flags, jlong desiredstreamset, jlong async, jlong receiveoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManReceiveShellOutput");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (int64_t)command, (uint32_t)flags, (void*)(uintptr_t)desiredstreamset, (void*)(uintptr_t)async, (void*)(uintptr_t)receiveoperation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)desiredstreamset;
    (void)async;
    (void)receiveoperation;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManReconnectShell(JNIEnv* km_env, jclass km_clazz, jlong shell, jint flags, jlong async) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManReconnectShell");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (uint32_t)flags, (void*)(uintptr_t)async);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManReconnectShellCommand(JNIEnv* km_env, jclass km_clazz, jlong commandhandle, jint flags, jlong async) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManReconnectShellCommand");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)commandhandle, (uint32_t)flags, (void*)(uintptr_t)async);
    } else {
        errno = ENOSYS;
    }
#else
    (void)commandhandle;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommand(JNIEnv* km_env, jclass km_clazz, jlong shell, jint flags, jlong commandline, jlong args, jlong options, jlong async, jlong command) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManRunShellCommand");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (uint32_t)flags, (void*)(uintptr_t)commandline, (void*)(uintptr_t)args, (void*)(uintptr_t)options, (void*)(uintptr_t)async, (void*)(uintptr_t)command);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)flags;
    (void)commandline;
    (void)args;
    (void)options;
    (void)async;
    (void)command;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManRunShellCommandEx(JNIEnv* km_env, jclass km_clazz, jlong shell, jint flags, jlong commandid, jlong commandline, jlong args, jlong options, jlong async, jlong command) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManRunShellCommandEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (uint32_t)flags, (void*)(uintptr_t)commandid, (void*)(uintptr_t)commandline, (void*)(uintptr_t)args, (void*)(uintptr_t)options, (void*)(uintptr_t)async, (void*)(uintptr_t)command);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)flags;
    (void)commandid;
    (void)commandline;
    (void)args;
    (void)options;
    (void)async;
    (void)command;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManSendShellInput(JNIEnv* km_env, jclass km_clazz, jlong shell, jlong command, jint flags, jlong streamid, jlong streamdata, jint endofstream, jlong async, jlong sendoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManSendShellInput");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (int64_t)command, (uint32_t)flags, (void*)(uintptr_t)streamid, (void*)(uintptr_t)streamdata, (int32_t)endofstream, (void*)(uintptr_t)async, (void*)(uintptr_t)sendoperation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)streamid;
    (void)streamdata;
    (void)endofstream;
    (void)async;
    (void)sendoperation;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManSetSessionOption(JNIEnv* km_env, jclass km_clazz, jlong session, jint option, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManSetSessionOption");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)session, (int32_t)option, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)session;
    (void)option;
    (void)data;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_remotemanagement_WindowsWin32SystemRemotemanagementJniBridge_windowssysWindowsWin32SystemRemotemanagementWSManSignalShell(JNIEnv* km_env, jclass km_clazz, jlong shell, jlong command, jint flags, jlong code, jlong async, jlong signaloperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManSignalShell");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)shell, (int64_t)command, (uint32_t)flags, (void*)(uintptr_t)code, (void*)(uintptr_t)async, (void*)(uintptr_t)signaloperation);
    } else {
        errno = ENOSYS;
    }
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)code;
    (void)async;
    (void)signaloperation;
    errno = ENOSYS;
#endif
}

