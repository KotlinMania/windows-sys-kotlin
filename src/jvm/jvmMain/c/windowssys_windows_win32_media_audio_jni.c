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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioActivateAudioInterfaceAsync(JNIEnv* km_env, jclass km_clazz, jlong deviceinterfacepath, jlong riid, jlong activationparams, jlong completionhandler, jlong activationoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mmdevapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivateAudioInterfaceAsync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceinterfacepath, (void*)(uintptr_t)riid, (void*)(uintptr_t)activationparams, (void*)(uintptr_t)completionhandler, (void*)(uintptr_t)activationoperation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceinterfacepath;
    (void)riid;
    (void)activationparams;
    (void)completionhandler;
    (void)activationoperation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCoRegisterMessageFilter(JNIEnv* km_env, jclass km_clazz, jlong lpmessagefilter, jlong lplpmessagefilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterMessageFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmessagefilter, (void*)(uintptr_t)lplpmessagefilter);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpmessagefilter;
    (void)lplpmessagefilter;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitor(JNIEnv* km_env, jclass km_clazz, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategory(JNIEnv* km_env, jclass km_clazz, jint category, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)category, (void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)category;
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceId(JNIEnv* km_env, jclass km_clazz, jint category, jlong deviceid, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategoryAndDeviceId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)category, (void*)(uintptr_t)deviceid, (void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)category;
    (void)deviceid;
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateCaptureAudioStateMonitorForCategoryAndDeviceRole(JNIEnv* km_env, jclass km_clazz, jint category, jint role, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategoryAndDeviceRole");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)category, (int32_t)role, (void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)category;
    (void)role;
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitor(JNIEnv* km_env, jclass km_clazz, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategory(JNIEnv* km_env, jclass km_clazz, jint category, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)category, (void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)category;
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceId(JNIEnv* km_env, jclass km_clazz, jint category, jlong deviceid, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategoryAndDeviceId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)category, (void*)(uintptr_t)deviceid, (void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)category;
    (void)deviceid;
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioCreateRenderAudioStateMonitorForCategoryAndDeviceRole(JNIEnv* km_env, jclass km_clazz, jint category, jint role, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategoryAndDeviceRole");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)category, (int32_t)role, (void*)(uintptr_t)audiostatemonitor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)category;
    (void)role;
    (void)audiostatemonitor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioPlaySoundA(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jlong hmod, jint fdwsound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlaySoundA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszsound, (void*)(uintptr_t)hmod, (uint32_t)fdwsound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszsound;
    (void)hmod;
    (void)fdwsound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioPlaySoundW(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jlong hmod, jint fdwsound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlaySoundW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszsound, (void*)(uintptr_t)hmod, (uint32_t)fdwsound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszsound;
    (void)hmod;
    (void)fdwsound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverAddA(JNIEnv* km_env, jclass km_clazz, jlong phadid, jlong hinstmodule, jlong lparam, jint dwpriority, jint fdwadd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverAddA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phadid, (void*)(uintptr_t)hinstmodule, (int64_t)lparam, (uint32_t)dwpriority, (uint32_t)fdwadd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phadid;
    (void)hinstmodule;
    (void)lparam;
    (void)dwpriority;
    (void)fdwadd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverAddW(JNIEnv* km_env, jclass km_clazz, jlong phadid, jlong hinstmodule, jlong lparam, jint dwpriority, jint fdwadd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverAddW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phadid, (void*)(uintptr_t)hinstmodule, (int64_t)lparam, (uint32_t)dwpriority, (uint32_t)fdwadd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phadid;
    (void)hinstmodule;
    (void)lparam;
    (void)dwpriority;
    (void)fdwadd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverClose(JNIEnv* km_env, jclass km_clazz, jlong had, jint fdwclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (uint32_t)fdwclose);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)fdwclose;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverDetailsA(JNIEnv* km_env, jclass km_clazz, jlong hadid, jlong padd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverDetailsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hadid, (void*)(uintptr_t)padd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hadid;
    (void)padd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverDetailsW(JNIEnv* km_env, jclass km_clazz, jlong hadid, jlong padd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverDetailsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hadid, (void*)(uintptr_t)padd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hadid;
    (void)padd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverEnum(JNIEnv* km_env, jclass km_clazz, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverEnum");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverID(JNIEnv* km_env, jclass km_clazz, jlong hao, jlong phadid, jint fdwdriverid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hao, (void*)(uintptr_t)phadid, (uint32_t)fdwdriverid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hao;
    (void)phadid;
    (void)fdwdriverid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverMessage(JNIEnv* km_env, jclass km_clazz, jlong had, jint umsg, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverMessage");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (uint32_t)umsg, (int64_t)lparam1, (int64_t)lparam2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)had;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverOpen(JNIEnv* km_env, jclass km_clazz, jlong phad, jlong hadid, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phad, (void*)(uintptr_t)hadid, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phad;
    (void)hadid;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverPriority(JNIEnv* km_env, jclass km_clazz, jlong hadid, jint dwpriority, jint fdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverPriority");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hadid, (uint32_t)dwpriority, (uint32_t)fdwpriority);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hadid;
    (void)dwpriority;
    (void)fdwpriority;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmDriverRemove(JNIEnv* km_env, jclass km_clazz, jlong hadid, jint fdwremove) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverRemove");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hadid, (uint32_t)fdwremove);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hadid;
    (void)fdwremove;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterChooseA(JNIEnv* km_env, jclass km_clazz, jlong pafltrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterChooseA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pafltrc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pafltrc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterChooseW(JNIEnv* km_env, jclass km_clazz, jlong pafltrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterChooseW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pafltrc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pafltrc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterDetailsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterDetailsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterEnumA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterEnumW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterTagDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagDetailsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterTagDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagDetailsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterTagEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagEnumA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFilterTagEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagEnumW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatChooseA(JNIEnv* km_env, jclass km_clazz, jlong pafmtc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatChooseA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pafmtc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pafmtc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatChooseW(JNIEnv* km_env, jclass km_clazz, jlong pafmtc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatChooseW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pafmtc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pafmtc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatDetailsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatDetailsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatEnumA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatEnumW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatSuggest(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pwfxsrc, jlong pwfxdst, jint cbwfxdst, jint fdwsuggest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatSuggest");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pwfxsrc, (void*)(uintptr_t)pwfxdst, (uint32_t)cbwfxdst, (uint32_t)fdwsuggest);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)pwfxsrc;
    (void)pwfxdst;
    (void)cbwfxdst;
    (void)fdwsuggest;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatTagDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagDetailsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatTagDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagDetailsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatTagEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagEnumA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmFormatTagEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagEnumW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmGetVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmGetVersion");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmMetrics(JNIEnv* km_env, jclass km_clazz, jlong hao, jint umetric, jlong pmetric) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmMetrics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hao, (uint32_t)umetric, (void*)(uintptr_t)pmetric);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hao;
    (void)umetric;
    (void)pmetric;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamClose(JNIEnv* km_env, jclass km_clazz, jlong has, jint fdwclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)has, (uint32_t)fdwclose);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)has;
    (void)fdwclose;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamConvert(JNIEnv* km_env, jclass km_clazz, jlong has, jlong pash, jint fdwconvert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamConvert");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)has, (void*)(uintptr_t)pash, (uint32_t)fdwconvert);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)has;
    (void)pash;
    (void)fdwconvert;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamMessage(JNIEnv* km_env, jclass km_clazz, jlong has, jint umsg, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)has, (uint32_t)umsg, (int64_t)lparam1, (int64_t)lparam2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)has;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamOpen(JNIEnv* km_env, jclass km_clazz, jlong phas, jlong had, jlong pwfxsrc, jlong pwfxdst, jlong pwfltr, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phas, (void*)(uintptr_t)had, (void*)(uintptr_t)pwfxsrc, (void*)(uintptr_t)pwfxdst, (void*)(uintptr_t)pwfltr, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phas;
    (void)had;
    (void)pwfxsrc;
    (void)pwfxdst;
    (void)pwfltr;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong has, jlong pash, jint fdwprepare) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamPrepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)has, (void*)(uintptr_t)pash, (uint32_t)fdwprepare);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)has;
    (void)pash;
    (void)fdwprepare;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamReset(JNIEnv* km_env, jclass km_clazz, jlong has, jint fdwreset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamReset");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)has, (uint32_t)fdwreset);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)has;
    (void)fdwreset;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamSize(JNIEnv* km_env, jclass km_clazz, jlong has, jint cbinput, jlong pdwoutputbytes, jint fdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)has, (uint32_t)cbinput, (void*)(uintptr_t)pdwoutputbytes, (uint32_t)fdwsize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)has;
    (void)cbinput;
    (void)pdwoutputbytes;
    (void)fdwsize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAcmStreamUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong has, jlong pash, jint fdwunprepare) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamUnprepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)has, (void*)(uintptr_t)pash, (uint32_t)fdwunprepare);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)has;
    (void)pash;
    (void)fdwunprepare;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAuxGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pac, jint cbac) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetDevCapsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pac, (uint32_t)cbac);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pac;
    (void)cbac;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAuxGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pac, jint cbac) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetDevCapsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pac, (uint32_t)cbac);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pac;
    (void)cbac;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAuxGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetNumDevs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAuxGetVolume(JNIEnv* km_env, jclass km_clazz, jint udeviceid, jlong pdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetVolume");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)udeviceid, (void*)(uintptr_t)pdwvolume);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pdwvolume;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAuxOutMessage(JNIEnv* km_env, jclass km_clazz, jint udeviceid, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxOutMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)udeviceid, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioAuxSetVolume(JNIEnv* km_env, jclass km_clazz, jint udeviceid, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxSetVolume");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)udeviceid, (uint32_t)dwvolume);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)dwvolume;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiConnect(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong hmo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiConnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)hmo, (void*)(uintptr_t)preserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    (void)hmo;
    (void)preserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong hmo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiDisconnect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)hmo, (void*)(uintptr_t)preserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    (void)hmo;
    (void)preserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInAddBuffer(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInAddBuffer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pmh, (uint32_t)cbmh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInClose(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmic, jint cbmic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetDevCapsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmic, (uint32_t)cbmic);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pmic;
    (void)cbmic;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmic, jint cbmic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetDevCapsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmic, (uint32_t)cbmic);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pmic;
    (void)cbmic;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetErrorTextA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetErrorTextW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInGetID(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pudeviceid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    (void)pudeviceid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetNumDevs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInMessage(JNIEnv* km_env, jclass km_clazz, jlong hmi, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInOpen(JNIEnv* km_env, jclass km_clazz, jlong phmi, jint udeviceid, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phmi, (uint32_t)udeviceid, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phmi;
    (void)udeviceid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInPrepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pmh, (uint32_t)cbmh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInReset(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInReset");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInStart(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInStart");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInStop(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInStop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiInUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInUnprepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pmh, (uint32_t)cbmh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutCacheDrumPatches(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint upatch, jlong pwkya, jint fucache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutCacheDrumPatches");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)upatch, (void*)(uintptr_t)pwkya, (uint32_t)fucache);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)upatch;
    (void)pwkya;
    (void)fucache;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutCachePatches(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint ubank, jlong pwpa, jint fucache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutCachePatches");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)ubank, (void*)(uintptr_t)pwpa, (uint32_t)fucache);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)ubank;
    (void)pwpa;
    (void)fucache;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutClose(JNIEnv* km_env, jclass km_clazz, jlong hmo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmoc, jint cbmoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetDevCapsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmoc, (uint32_t)cbmoc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pmoc;
    (void)cbmoc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmoc, jint cbmoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetDevCapsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmoc, (uint32_t)cbmoc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pmoc;
    (void)cbmoc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetErrorTextA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetErrorTextW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutGetID(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pudeviceid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)pudeviceid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetNumDevs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutGetVolume(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetVolume");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pdwvolume);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)pdwvolume;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutLongMsg(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutLongMsg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pmh, (uint32_t)cbmh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutMessage(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutOpen(JNIEnv* km_env, jclass km_clazz, jlong phmo, jint udeviceid, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phmo, (uint32_t)udeviceid, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phmo;
    (void)udeviceid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutPrepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pmh, (uint32_t)cbmh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutReset(JNIEnv* km_env, jclass km_clazz, jlong hmo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutReset");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutSetVolume(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutSetVolume");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)dwvolume);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)dwvolume;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutShortMsg(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint dwmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutShortMsg");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)dwmsg);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)dwmsg;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiOutUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutUnprepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pmh, (uint32_t)cbmh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamClose(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hms);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hms;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamOpen(JNIEnv* km_env, jclass km_clazz, jlong phms, jlong pudeviceid, jint cmidi, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phms, (void*)(uintptr_t)pudeviceid, (uint32_t)cmidi, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phms;
    (void)pudeviceid;
    (void)cmidi;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamOut(JNIEnv* km_env, jclass km_clazz, jlong hms, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamOut");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hms, (void*)(uintptr_t)pmh, (uint32_t)cbmh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hms;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamPause(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamPause");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hms);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hms;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamPosition(JNIEnv* km_env, jclass km_clazz, jlong hms, jlong lpmmt, jint cbmmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamPosition");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hms, (void*)(uintptr_t)lpmmt, (uint32_t)cbmmt);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hms;
    (void)lpmmt;
    (void)cbmmt;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamProperty(JNIEnv* km_env, jclass km_clazz, jlong hms, jlong lppropdata, jint dwproperty) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamProperty");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hms, (void*)(uintptr_t)lppropdata, (uint32_t)dwproperty);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hms;
    (void)lppropdata;
    (void)dwproperty;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamRestart(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamRestart");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hms);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hms;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMidiStreamStop(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamStop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hms);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hms;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerClose(JNIEnv* km_env, jclass km_clazz, jlong hmx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmx);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmx;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetControlDetailsA(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxcd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetControlDetailsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxcd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetControlDetailsW(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxcd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetControlDetailsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxcd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong umxid, jlong pmxcaps, jint cbmxcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetDevCapsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)umxid, (void*)(uintptr_t)pmxcaps, (uint32_t)cbmxcaps);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)umxid;
    (void)pmxcaps;
    (void)cbmxcaps;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong umxid, jlong pmxcaps, jint cbmxcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetDevCapsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)umxid, (void*)(uintptr_t)pmxcaps, (uint32_t)cbmxcaps);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)umxid;
    (void)pmxcaps;
    (void)cbmxcaps;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetID(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pumxid, jint fdwid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pumxid, (uint32_t)fdwid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pumxid;
    (void)fdwid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetLineControlsA(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxlc, jint fdwcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineControlsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxlc, (uint32_t)fdwcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pmxlc;
    (void)fdwcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetLineControlsW(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxlc, jint fdwcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineControlsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxlc, (uint32_t)fdwcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pmxlc;
    (void)fdwcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetLineInfoA(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxl, jint fdwinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxl, (uint32_t)fdwinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pmxl;
    (void)fdwinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetLineInfoW(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxl, jint fdwinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxl, (uint32_t)fdwinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pmxl;
    (void)fdwinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetNumDevs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerMessage(JNIEnv* km_env, jclass km_clazz, jlong hmx, jint umsg, jlong dwparam1, jlong dwparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmx, (uint32_t)umsg, (uint64_t)dwparam1, (uint64_t)dwparam2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmx;
    (void)umsg;
    (void)dwparam1;
    (void)dwparam2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerOpen(JNIEnv* km_env, jclass km_clazz, jlong phmx, jint umxid, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phmx, (uint32_t)umxid, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phmx;
    (void)umxid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioMixerSetControlDetails(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxcd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerSetControlDetails");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxcd, (uint32_t)fdwdetails);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioSndPlaySoundA(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jint fusound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndPlaySoundA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszsound, (uint32_t)fusound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszsound;
    (void)fusound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioSndPlaySoundW(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jint fusound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndPlaySoundW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszsound, (uint32_t)fusound);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszsound;
    (void)fusound;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInAddBuffer(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInAddBuffer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pwh, (uint32_t)cbwh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInClose(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwic, jint cbwic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetDevCapsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwic, (uint32_t)cbwic);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pwic;
    (void)cbwic;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwic, jint cbwic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetDevCapsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwic, (uint32_t)cbwic);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pwic;
    (void)cbwic;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetErrorTextA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetErrorTextW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInGetID(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pudeviceid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    (void)pudeviceid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetNumDevs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInGetPosition(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pmmt, jint cbmmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetPosition");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pmmt, (uint32_t)cbmmt);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    (void)pmmt;
    (void)cbmmt;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInMessage(JNIEnv* km_env, jclass km_clazz, jlong hwi, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInOpen(JNIEnv* km_env, jclass km_clazz, jlong phwi, jint udeviceid, jlong pwfx, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phwi, (uint32_t)udeviceid, (void*)(uintptr_t)pwfx, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phwi;
    (void)udeviceid;
    (void)pwfx;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInPrepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pwh, (uint32_t)cbwh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInReset(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInReset");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInStart(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInStart");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInStop(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInStop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveInUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInUnprepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pwh, (uint32_t)cbwh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutBreakLoop(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutBreakLoop");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutClose(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutClose");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwoc, jint cbwoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetDevCapsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwoc, (uint32_t)cbwoc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pwoc;
    (void)cbwoc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwoc, jint cbwoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetDevCapsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwoc, (uint32_t)cbwoc);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)udeviceid;
    (void)pwoc;
    (void)cbwoc;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetErrorTextA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetErrorTextW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetID(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetID");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pudeviceid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pudeviceid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetNumDevs");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetPitch(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pdwpitch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPitch");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pdwpitch);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pdwpitch;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetPlaybackRate(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pdwrate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPlaybackRate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pdwrate);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pdwrate;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetPosition(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pmmt, jint cbmmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPosition");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pmmt, (uint32_t)cbmmt);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pmmt;
    (void)cbmmt;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutGetVolume(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetVolume");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pdwvolume);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pdwvolume;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutMessage(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutMessage");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutOpen(JNIEnv* km_env, jclass km_clazz, jlong phwo, jint udeviceid, jlong pwfx, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutOpen");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phwo, (uint32_t)udeviceid, (void*)(uintptr_t)pwfx, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)phwo;
    (void)udeviceid;
    (void)pwfx;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutPause(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutPause");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutPrepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pwh, (uint32_t)cbwh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutReset(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutReset");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutRestart(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutRestart");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutSetPitch(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint dwpitch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetPitch");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)dwpitch);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)dwpitch;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutSetPlaybackRate(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint dwrate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetPlaybackRate");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)dwrate);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)dwrate;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutSetVolume(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetVolume");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)dwvolume);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)dwvolume;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutUnprepareHeader");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pwh, (uint32_t)cbwh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssysWindowsWin32MediaAudioWaveOutWrite(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutWrite");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pwh, (uint32_t)cbwh);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

