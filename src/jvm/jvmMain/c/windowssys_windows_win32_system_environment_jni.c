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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1CallEnclave(JNIEnv* km_env, jclass km_clazz, jlong lproutine, jlong lpparameter, jint fwaitforthread, jlong lpreturnvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallEnclave");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)lproutine, (void*)(uintptr_t)lpparameter, (int32_t)fwaitforthread, (void*)(uintptr_t)lpreturnvalue) : -1;
#else
    (void)lproutine;
    (void)lpparameter;
    (void)fwaitforthread;
    (void)lpreturnvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1CreateEnclave(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong dwsize, jlong dwinitialcommitment, jint flenclavetype, jlong lpenclaveinformation, jint dwinfolength, jlong lpenclaveerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnclave");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (uint64_t)dwsize, (uint64_t)dwinitialcommitment, (uint32_t)flenclavetype, (void*)(uintptr_t)lpenclaveinformation, (uint32_t)dwinfolength, (void*)(uintptr_t)lpenclaveerror) : NULL;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)dwinitialcommitment;
    (void)flenclavetype;
    (void)lpenclaveinformation;
    (void)dwinfolength;
    (void)lpenclaveerror;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1CreateEnvironmentBlock(JNIEnv* km_env, jclass km_clazz, jlong lpenvironment, jlong htoken, jint binherit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnvironmentBlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenvironment, (void*)(uintptr_t)htoken, (int32_t)binherit) : -1;
#else
    (void)lpenvironment;
    (void)htoken;
    (void)binherit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1DeleteEnclave(JNIEnv* km_env, jclass km_clazz, jlong lpaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-enclave-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteEnclave");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress) : -1;
#else
    (void)lpaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1DestroyEnvironmentBlock(JNIEnv* km_env, jclass km_clazz, jlong lpenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyEnvironmentBlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenvironment) : -1;
#else
    (void)lpenvironment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1EnclaveGetAttestationReport(JNIEnv* km_env, jclass km_clazz, jlong enclavedata, jlong report, jint buffersize, jlong outputsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveGetAttestationReport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enclavedata, (void*)(uintptr_t)report, (uint32_t)buffersize, (void*)(uintptr_t)outputsize) : -1;
#else
    (void)enclavedata;
    (void)report;
    (void)buffersize;
    (void)outputsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1EnclaveGetEnclaveInformation(JNIEnv* km_env, jclass km_clazz, jint informationsize, jlong enclaveinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveGetEnclaveInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)informationsize, (void*)(uintptr_t)enclaveinformation) : -1;
#else
    (void)informationsize;
    (void)enclaveinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1EnclaveSealData(JNIEnv* km_env, jclass km_clazz, jlong datatoencrypt, jint datatoencryptsize, jint identitypolicy, jint runtimepolicy, jlong protectedblob, jint buffersize, jlong protectedblobsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveSealData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)datatoencrypt, (uint32_t)datatoencryptsize, (int32_t)identitypolicy, (uint32_t)runtimepolicy, (void*)(uintptr_t)protectedblob, (uint32_t)buffersize, (void*)(uintptr_t)protectedblobsize) : -1;
#else
    (void)datatoencrypt;
    (void)datatoencryptsize;
    (void)identitypolicy;
    (void)runtimepolicy;
    (void)protectedblob;
    (void)buffersize;
    (void)protectedblobsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1EnclaveUnsealData(JNIEnv* km_env, jclass km_clazz, jlong protectedblob, jint protectedblobsize, jlong decrypteddata, jint buffersize, jlong decrypteddatasize, jlong sealingidentity, jlong unsealingflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveUnsealData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protectedblob, (uint32_t)protectedblobsize, (void*)(uintptr_t)decrypteddata, (uint32_t)buffersize, (void*)(uintptr_t)decrypteddatasize, (void*)(uintptr_t)sealingidentity, (void*)(uintptr_t)unsealingflags) : -1;
#else
    (void)protectedblob;
    (void)protectedblobsize;
    (void)decrypteddata;
    (void)buffersize;
    (void)decrypteddatasize;
    (void)sealingidentity;
    (void)unsealingflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1EnclaveVerifyAttestationReport(JNIEnv* km_env, jclass km_clazz, jint enclavetype, jlong report, jint reportsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveVerifyAttestationReport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)enclavetype, (void*)(uintptr_t)report, (uint32_t)reportsize) : -1;
#else
    (void)enclavetype;
    (void)report;
    (void)reportsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1ExpandEnvironmentStringsA(JNIEnv* km_env, jclass km_clazz, jlong lpsrc, jlong lpdst, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsrc, (void*)(uintptr_t)lpdst, (uint32_t)nsize) : 0;
#else
    (void)lpsrc;
    (void)lpdst;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1ExpandEnvironmentStringsForUserA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpsrc, jlong lpdest, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsForUserA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpsrc, (void*)(uintptr_t)lpdest, (uint32_t)dwsize) : -1;
#else
    (void)htoken;
    (void)lpsrc;
    (void)lpdest;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1ExpandEnvironmentStringsForUserW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpsrc, jlong lpdest, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsForUserW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpsrc, (void*)(uintptr_t)lpdest, (uint32_t)dwsize) : -1;
#else
    (void)htoken;
    (void)lpsrc;
    (void)lpdest;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1ExpandEnvironmentStringsW(JNIEnv* km_env, jclass km_clazz, jlong lpsrc, jlong lpdst, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsrc, (void*)(uintptr_t)lpdst, (uint32_t)nsize) : 0;
#else
    (void)lpsrc;
    (void)lpdst;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1FreeEnvironmentStringsA(JNIEnv* km_env, jclass km_clazz, jlong penv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEnvironmentStringsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)penv) : -1;
#else
    (void)penv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1FreeEnvironmentStringsW(JNIEnv* km_env, jclass km_clazz, jlong penv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEnvironmentStringsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)penv) : -1;
#else
    (void)penv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetCommandLineA(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommandLineA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetCommandLineW(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommandLineW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetCurrentDirectoryA(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentDirectoryA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetCurrentDirectoryW(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentDirectoryW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetEnvironmentStrings(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentStrings");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetEnvironmentStringsW(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentStringsW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetEnvironmentVariableA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentVariableA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize) : 0;
#else
    (void)lpname;
    (void)lpbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1GetEnvironmentVariableW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpbuffer, jint nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentVariableW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpbuffer, (uint32_t)nsize) : 0;
#else
    (void)lpname;
    (void)lpbuffer;
    (void)nsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1InitializeEnclave(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong lpenclaveinformation, jint dwinfolength, jlong lpenclaveerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeEnclave");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpenclaveinformation, (uint32_t)dwinfolength, (void*)(uintptr_t)lpenclaveerror) : -1;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)lpenclaveinformation;
    (void)dwinfolength;
    (void)lpenclaveerror;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1IsEnclaveTypeSupported(JNIEnv* km_env, jclass km_clazz, jint flenclavetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsEnclaveTypeSupported");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flenclavetype) : -1;
#else
    (void)flenclavetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1LoadEnclaveData(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpaddress, jlong lpbuffer, jlong nsize, jint flprotect, jlong lppageinformation, jint dwinfolength, jlong lpnumberofbyteswritten, jlong lpenclaveerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadEnclaveData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpaddress, (void*)(uintptr_t)lpbuffer, (uint64_t)nsize, (uint32_t)flprotect, (void*)(uintptr_t)lppageinformation, (uint32_t)dwinfolength, (void*)(uintptr_t)lpnumberofbyteswritten, (void*)(uintptr_t)lpenclaveerror) : -1;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)flprotect;
    (void)lppageinformation;
    (void)dwinfolength;
    (void)lpnumberofbyteswritten;
    (void)lpenclaveerror;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1LoadEnclaveImageA(JNIEnv* km_env, jclass km_clazz, jlong lpenclaveaddress, jlong lpimagename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-enclave-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadEnclaveImageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenclaveaddress, (void*)(uintptr_t)lpimagename) : -1;
#else
    (void)lpenclaveaddress;
    (void)lpimagename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1LoadEnclaveImageW(JNIEnv* km_env, jclass km_clazz, jlong lpenclaveaddress, jlong lpimagename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-enclave-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadEnclaveImageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenclaveaddress, (void*)(uintptr_t)lpimagename) : -1;
#else
    (void)lpenclaveaddress;
    (void)lpimagename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1NeedCurrentDirectoryForExePathA(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedCurrentDirectoryForExePathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exename) : -1;
#else
    (void)exename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1NeedCurrentDirectoryForExePathW(JNIEnv* km_env, jclass km_clazz, jlong exename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedCurrentDirectoryForExePathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)exename) : -1;
#else
    (void)exename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1SetCurrentDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname) : -1;
#else
    (void)lppathname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1SetCurrentDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname) : -1;
#else
    (void)lppathname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1SetEnvironmentStringsW(JNIEnv* km_env, jclass km_clazz, jlong newenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentStringsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)newenvironment) : -1;
#else
    (void)newenvironment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1SetEnvironmentVariableA(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentVariableA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpvalue) : -1;
#else
    (void)lpname;
    (void)lpvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1SetEnvironmentVariableW(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentVariableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpvalue) : -1;
#else
    (void)lpname;
    (void)lpvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_environment_WindowsWin32SystemEnvironmentJniBridge_windowssys_1windows_1win32_1system_1environment_1TerminateEnclave(JNIEnv* km_env, jclass km_clazz, jlong lpaddress, jint fwait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateEnclave");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaddress, (int32_t)fwait) : -1;
#else
    (void)lpaddress;
    (void)fwait;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

