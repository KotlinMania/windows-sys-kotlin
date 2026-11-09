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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_htmlhelp_WindowsWin32DataHtmlhelpJniBridge_windowssys_1windows_1win32_1data_1htmlhelp_1HtmlHelpA(JNIEnv* km_env, jclass km_clazz, jlong hwndcaller, jlong pszfile, jint ucommand, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hhctrl.ocx");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HtmlHelpA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndcaller, (void*)(uintptr_t)pszfile, (uint32_t)ucommand, (uint64_t)dwdata) : NULL;
#else
    (void)hwndcaller;
    (void)pszfile;
    (void)ucommand;
    (void)dwdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_htmlhelp_WindowsWin32DataHtmlhelpJniBridge_windowssys_1windows_1win32_1data_1htmlhelp_1HtmlHelpW(JNIEnv* km_env, jclass km_clazz, jlong hwndcaller, jlong pszfile, jint ucommand, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hhctrl.ocx");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HtmlHelpW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndcaller, (void*)(uintptr_t)pszfile, (uint32_t)ucommand, (uint64_t)dwdata) : NULL;
#else
    (void)hwndcaller;
    (void)pszfile;
    (void)ucommand;
    (void)dwdata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

