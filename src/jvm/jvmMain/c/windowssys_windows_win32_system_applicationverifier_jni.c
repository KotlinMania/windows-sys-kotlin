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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_applicationverifier_WindowsWin32SystemApplicationverifierJniBridge_windowssys_1windows_1win32_1system_1applicationverifier_1VerifierEnumerateResource(JNIEnv* km_env, jclass km_clazz, jlong process, jint flags, jint resourcetype, jlong resourcecallback, jlong enumerationcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("verifier.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifierEnumerateResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)process, (uint32_t)flags, (uint32_t)resourcetype, (void*)(uintptr_t)resourcecallback, (void*)(uintptr_t)enumerationcontext) : 0;
#else
    (void)process;
    (void)flags;
    (void)resourcetype;
    (void)resourcecallback;
    (void)enumerationcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

