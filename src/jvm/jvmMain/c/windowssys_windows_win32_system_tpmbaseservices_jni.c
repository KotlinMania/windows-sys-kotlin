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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1getDeviceID(JNIEnv* km_env, jclass km_clazz, jlong pbwindowsaik, jint cbwindowsaik, jlong pcbresult, jlong pfprotectedbytpm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbwindowsaik, (uint32_t)cbwindowsaik, (void*)(uintptr_t)pcbresult, (void*)(uintptr_t)pfprotectedbytpm) : -1;
#else
    (void)pbwindowsaik;
    (void)cbwindowsaik;
    (void)pcbresult;
    (void)pfprotectedbytpm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1getDeviceIDString(JNIEnv* km_env, jclass km_clazz, jlong pszwindowsaik, jint cchwindowsaik, jlong pcchresult, jlong pfprotectedbytpm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceIDString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszwindowsaik, (uint32_t)cchwindowsaik, (void*)(uintptr_t)pcchresult, (void*)(uintptr_t)pfprotectedbytpm) : -1;
#else
    (void)pszwindowsaik;
    (void)cchwindowsaik;
    (void)pcchresult;
    (void)pfprotectedbytpm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiContextCreate(JNIEnv* km_env, jclass km_clazz, jlong pcontextparams, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Context_Create");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcontextparams, (void*)(uintptr_t)phcontext) : 0;
#else
    (void)pcontextparams;
    (void)phcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiCreateWindowsKey(JNIEnv* km_env, jclass km_clazz, jint keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Create_Windows_Key");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)keyhandle) : 0;
#else
    (void)keyhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiGetDeviceInfo(JNIEnv* km_env, jclass km_clazz, jint size, jlong info) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_GetDeviceInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)size, (void*)(uintptr_t)info) : 0;
#else
    (void)size;
    (void)info;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiGetOwnerAuth(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint ownerauthtype, jlong poutputbuf, jlong poutputbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Get_OwnerAuth");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcontext, (uint32_t)ownerauthtype, (void*)(uintptr_t)poutputbuf, (void*)(uintptr_t)poutputbuflen) : 0;
#else
    (void)hcontext;
    (void)ownerauthtype;
    (void)poutputbuf;
    (void)poutputbuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiGetTcgLog(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong poutputbuf, jlong poutputbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Get_TCG_Log");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcontext, (void*)(uintptr_t)poutputbuf, (void*)(uintptr_t)poutputbuflen) : 0;
#else
    (void)hcontext;
    (void)poutputbuf;
    (void)poutputbuflen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiGetTcgLogEx(JNIEnv* km_env, jclass km_clazz, jint logtype, jlong pboutput, jlong pcboutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Get_TCG_Log_Ex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)logtype, (void*)(uintptr_t)pboutput, (void*)(uintptr_t)pcboutput) : 0;
#else
    (void)logtype;
    (void)pboutput;
    (void)pcboutput;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiIsTpmPresent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Is_Tpm_Present");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiPhysicalPresenceCommand(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong pabinput, jint cbinput, jlong paboutput, jlong pcboutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Physical_Presence_Command");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcontext, (void*)(uintptr_t)pabinput, (uint32_t)cbinput, (void*)(uintptr_t)paboutput, (void*)(uintptr_t)pcboutput) : 0;
#else
    (void)hcontext;
    (void)pabinput;
    (void)cbinput;
    (void)paboutput;
    (void)pcboutput;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsiRevokeAttestation(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsi_Revoke_Attestation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsipCancelCommands(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsip_Cancel_Commands");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcontext) : 0;
#else
    (void)hcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsipContextClose(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsip_Context_Close");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcontext) : 0;
#else
    (void)hcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_tpmbaseservices_WindowsWin32SystemTpmbaseservicesJniBridge_windowssys_1windows_1win32_1system_1tpmbaseservices_1tbsipSubmitCommand(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint locality, jint priority, jlong pabcommand, jint cbcommand, jlong pabresult, jlong pcbresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tbs.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Tbsip_Submit_Command");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcontext, (uint32_t)locality, (uint32_t)priority, (void*)(uintptr_t)pabcommand, (uint32_t)cbcommand, (void*)(uintptr_t)pabresult, (void*)(uintptr_t)pcbresult) : 0;
#else
    (void)hcontext;
    (void)locality;
    (void)priority;
    (void)pabcommand;
    (void)cbcommand;
    (void)pabresult;
    (void)pcbresult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

