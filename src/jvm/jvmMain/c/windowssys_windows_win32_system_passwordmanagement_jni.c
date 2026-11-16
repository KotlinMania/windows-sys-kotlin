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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_passwordmanagement_WindowsWin32SystemPasswordmanagementJniBridge_windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jboolean lmoldpresent, jlong lmoldowfpassword, jlong lmnewowfpassword, jlong ntoldowfpassword, jlong ntnewowfpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MSChapSrvChangePassword");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (bool)lmoldpresent, (void*)(uintptr_t)lmoldowfpassword, (void*)(uintptr_t)lmnewowfpassword, (void*)(uintptr_t)ntoldowfpassword, (void*)(uintptr_t)ntnewowfpassword);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    (void)lmoldpresent;
    (void)lmoldowfpassword;
    (void)lmnewowfpassword;
    (void)ntoldowfpassword;
    (void)ntnewowfpassword;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_passwordmanagement_WindowsWin32SystemPasswordmanagementJniBridge_windowssysWindowsWin32SystemPasswordmanagementMSChapSrvChangePassword2(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong username, jlong newpasswordencryptedwitholdnt, jlong oldntowfpasswordencryptedwithnewnt, jboolean lmpresent, jlong newpasswordencryptedwitholdlm, jlong oldlmowfpasswordencryptedwithnewlmornt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MSChapSrvChangePassword2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)username, (void*)(uintptr_t)newpasswordencryptedwitholdnt, (void*)(uintptr_t)oldntowfpasswordencryptedwithnewnt, (bool)lmpresent, (void*)(uintptr_t)newpasswordencryptedwitholdlm, (void*)(uintptr_t)oldlmowfpasswordencryptedwithnewlmornt);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servername;
    (void)username;
    (void)newpasswordencryptedwitholdnt;
    (void)oldntowfpasswordencryptedwithnewnt;
    (void)lmpresent;
    (void)newpasswordencryptedwitholdlm;
    (void)oldlmowfpasswordencryptedwithnewlmornt;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

