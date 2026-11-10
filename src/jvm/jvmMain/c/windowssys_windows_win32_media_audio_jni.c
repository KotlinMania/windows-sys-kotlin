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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1activateAudioInterfaceAsync(JNIEnv* km_env, jclass km_clazz, jlong deviceinterfacepath, jlong riid, jlong activationparams, jlong completionhandler, jlong activationoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mmdevapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivateAudioInterfaceAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceinterfacepath, (void*)(uintptr_t)riid, (void*)(uintptr_t)activationparams, (void*)(uintptr_t)completionhandler, (void*)(uintptr_t)activationoperation) : -1;
#else
    (void)deviceinterfacepath;
    (void)riid;
    (void)activationparams;
    (void)completionhandler;
    (void)activationoperation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1coRegisterMessageFilter(JNIEnv* km_env, jclass km_clazz, jlong lpmessagefilter, jlong lplpmessagefilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterMessageFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmessagefilter, (void*)(uintptr_t)lplpmessagefilter) : -1;
#else
    (void)lpmessagefilter;
    (void)lplpmessagefilter;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createCaptureAudioStateMonitor(JNIEnv* km_env, jclass km_clazz, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createCaptureAudioStateMonitorForCategory(JNIEnv* km_env, jclass km_clazz, jint category, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)category, (void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)category;
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createCaptureAudioStateMonitorForCategoryAndDeviceId(JNIEnv* km_env, jclass km_clazz, jint category, jlong deviceid, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategoryAndDeviceId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)category, (void*)(uintptr_t)deviceid, (void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)category;
    (void)deviceid;
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createCaptureAudioStateMonitorForCategoryAndDeviceRole(JNIEnv* km_env, jclass km_clazz, jint category, jint role, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategoryAndDeviceRole");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)category, (int32_t)role, (void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)category;
    (void)role;
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createRenderAudioStateMonitor(JNIEnv* km_env, jclass km_clazz, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createRenderAudioStateMonitorForCategory(JNIEnv* km_env, jclass km_clazz, jint category, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)category, (void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)category;
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createRenderAudioStateMonitorForCategoryAndDeviceId(JNIEnv* km_env, jclass km_clazz, jint category, jlong deviceid, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategoryAndDeviceId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)category, (void*)(uintptr_t)deviceid, (void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)category;
    (void)deviceid;
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1createRenderAudioStateMonitorForCategoryAndDeviceRole(JNIEnv* km_env, jclass km_clazz, jint category, jint role, jlong audiostatemonitor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategoryAndDeviceRole");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)category, (int32_t)role, (void*)(uintptr_t)audiostatemonitor) : -1;
#else
    (void)category;
    (void)role;
    (void)audiostatemonitor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1playSoundA(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jlong hmod, jint fdwsound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlaySoundA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsound, (void*)(uintptr_t)hmod, (uint32_t)fdwsound) : -1;
#else
    (void)pszsound;
    (void)hmod;
    (void)fdwsound;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1playSoundW(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jlong hmod, jint fdwsound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlaySoundW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsound, (void*)(uintptr_t)hmod, (uint32_t)fdwsound) : -1;
#else
    (void)pszsound;
    (void)hmod;
    (void)fdwsound;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverAddA(JNIEnv* km_env, jclass km_clazz, jlong phadid, jlong hinstmodule, jlong lparam, jint dwpriority, jint fdwadd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverAddA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phadid, (void*)(uintptr_t)hinstmodule, (int64_t)lparam, (uint32_t)dwpriority, (uint32_t)fdwadd) : 0;
#else
    (void)phadid;
    (void)hinstmodule;
    (void)lparam;
    (void)dwpriority;
    (void)fdwadd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverAddW(JNIEnv* km_env, jclass km_clazz, jlong phadid, jlong hinstmodule, jlong lparam, jint dwpriority, jint fdwadd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverAddW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phadid, (void*)(uintptr_t)hinstmodule, (int64_t)lparam, (uint32_t)dwpriority, (uint32_t)fdwadd) : 0;
#else
    (void)phadid;
    (void)hinstmodule;
    (void)lparam;
    (void)dwpriority;
    (void)fdwadd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverClose(JNIEnv* km_env, jclass km_clazz, jlong had, jint fdwclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (uint32_t)fdwclose) : 0;
#else
    (void)had;
    (void)fdwclose;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverDetailsA(JNIEnv* km_env, jclass km_clazz, jlong hadid, jlong padd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverDetailsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hadid, (void*)(uintptr_t)padd, (uint32_t)fdwdetails) : 0;
#else
    (void)hadid;
    (void)padd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverDetailsW(JNIEnv* km_env, jclass km_clazz, jlong hadid, jlong padd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverDetailsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hadid, (void*)(uintptr_t)padd, (uint32_t)fdwdetails) : 0;
#else
    (void)hadid;
    (void)padd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverEnum(JNIEnv* km_env, jclass km_clazz, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverID(JNIEnv* km_env, jclass km_clazz, jlong hao, jlong phadid, jint fdwdriverid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hao, (void*)(uintptr_t)phadid, (uint32_t)fdwdriverid) : 0;
#else
    (void)hao;
    (void)phadid;
    (void)fdwdriverid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverMessage(JNIEnv* km_env, jclass km_clazz, jlong had, jint umsg, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverMessage");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (uint32_t)umsg, (int64_t)lparam1, (int64_t)lparam2) : -1;
#else
    (void)had;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverOpen(JNIEnv* km_env, jclass km_clazz, jlong phad, jlong hadid, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phad, (void*)(uintptr_t)hadid, (uint32_t)fdwopen) : 0;
#else
    (void)phad;
    (void)hadid;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverPriority(JNIEnv* km_env, jclass km_clazz, jlong hadid, jint dwpriority, jint fdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverPriority");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hadid, (uint32_t)dwpriority, (uint32_t)fdwpriority) : 0;
#else
    (void)hadid;
    (void)dwpriority;
    (void)fdwpriority;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmDriverRemove(JNIEnv* km_env, jclass km_clazz, jlong hadid, jint fdwremove) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverRemove");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hadid, (uint32_t)fdwremove) : 0;
#else
    (void)hadid;
    (void)fdwremove;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterChooseA(JNIEnv* km_env, jclass km_clazz, jlong pafltrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterChooseA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pafltrc) : 0;
#else
    (void)pafltrc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterChooseW(JNIEnv* km_env, jclass km_clazz, jlong pafltrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterChooseW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pafltrc) : 0;
#else
    (void)pafltrc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterDetailsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterDetailsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterEnumA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterEnumW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterTagDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagDetailsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterTagDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagDetailsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterTagEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagEnumA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFilterTagEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagEnumW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatChooseA(JNIEnv* km_env, jclass km_clazz, jlong pafmtc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatChooseA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pafmtc) : 0;
#else
    (void)pafmtc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatChooseW(JNIEnv* km_env, jclass km_clazz, jlong pafmtc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatChooseW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pafmtc) : 0;
#else
    (void)pafmtc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatDetailsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatDetailsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatEnumA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pafd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatEnumW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pafd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatSuggest(JNIEnv* km_env, jclass km_clazz, jlong had, jlong pwfxsrc, jlong pwfxdst, jint cbwfxdst, jint fdwsuggest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatSuggest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)pwfxsrc, (void*)(uintptr_t)pwfxdst, (uint32_t)cbwfxdst, (uint32_t)fdwsuggest) : 0;
#else
    (void)had;
    (void)pwfxsrc;
    (void)pwfxdst;
    (void)cbwfxdst;
    (void)fdwsuggest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatTagDetailsA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagDetailsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatTagDetailsW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagDetailsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (uint32_t)fdwdetails) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatTagEnumA(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagEnumA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmFormatTagEnumW(JNIEnv* km_env, jclass km_clazz, jlong had, jlong paftd, jlong fncallback, jlong dwinstance, jint fdwenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagEnumW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)had, (void*)(uintptr_t)paftd, (void*)(uintptr_t)fncallback, (uint64_t)dwinstance, (uint32_t)fdwenum) : 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmGetVersion(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmGetVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmMetrics(JNIEnv* km_env, jclass km_clazz, jlong hao, jint umetric, jlong pmetric) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmMetrics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hao, (uint32_t)umetric, (void*)(uintptr_t)pmetric) : 0;
#else
    (void)hao;
    (void)umetric;
    (void)pmetric;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamClose(JNIEnv* km_env, jclass km_clazz, jlong has, jint fdwclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)has, (uint32_t)fdwclose) : 0;
#else
    (void)has;
    (void)fdwclose;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamConvert(JNIEnv* km_env, jclass km_clazz, jlong has, jlong pash, jint fdwconvert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamConvert");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)has, (void*)(uintptr_t)pash, (uint32_t)fdwconvert) : 0;
#else
    (void)has;
    (void)pash;
    (void)fdwconvert;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamMessage(JNIEnv* km_env, jclass km_clazz, jlong has, jint umsg, jlong lparam1, jlong lparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)has, (uint32_t)umsg, (int64_t)lparam1, (int64_t)lparam2) : 0;
#else
    (void)has;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamOpen(JNIEnv* km_env, jclass km_clazz, jlong phas, jlong had, jlong pwfxsrc, jlong pwfxdst, jlong pwfltr, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phas, (void*)(uintptr_t)had, (void*)(uintptr_t)pwfxsrc, (void*)(uintptr_t)pwfxdst, (void*)(uintptr_t)pwfltr, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen) : 0;
#else
    (void)phas;
    (void)had;
    (void)pwfxsrc;
    (void)pwfxdst;
    (void)pwfltr;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong has, jlong pash, jint fdwprepare) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamPrepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)has, (void*)(uintptr_t)pash, (uint32_t)fdwprepare) : 0;
#else
    (void)has;
    (void)pash;
    (void)fdwprepare;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamReset(JNIEnv* km_env, jclass km_clazz, jlong has, jint fdwreset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamReset");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)has, (uint32_t)fdwreset) : 0;
#else
    (void)has;
    (void)fdwreset;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamSize(JNIEnv* km_env, jclass km_clazz, jlong has, jint cbinput, jlong pdwoutputbytes, jint fdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)has, (uint32_t)cbinput, (void*)(uintptr_t)pdwoutputbytes, (uint32_t)fdwsize) : 0;
#else
    (void)has;
    (void)cbinput;
    (void)pdwoutputbytes;
    (void)fdwsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1acmStreamUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong has, jlong pash, jint fdwunprepare) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamUnprepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)has, (void*)(uintptr_t)pash, (uint32_t)fdwunprepare) : 0;
#else
    (void)has;
    (void)pash;
    (void)fdwunprepare;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1auxGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pac, jint cbac) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetDevCapsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pac, (uint32_t)cbac) : 0;
#else
    (void)udeviceid;
    (void)pac;
    (void)cbac;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1auxGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pac, jint cbac) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetDevCapsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pac, (uint32_t)cbac) : 0;
#else
    (void)udeviceid;
    (void)pac;
    (void)cbac;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1auxGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetNumDevs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1auxGetVolume(JNIEnv* km_env, jclass km_clazz, jint udeviceid, jlong pdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)udeviceid, (void*)(uintptr_t)pdwvolume) : 0;
#else
    (void)udeviceid;
    (void)pdwvolume;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1auxOutMessage(JNIEnv* km_env, jclass km_clazz, jint udeviceid, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxOutMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)udeviceid, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2) : 0;
#else
    (void)udeviceid;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1auxSetVolume(JNIEnv* km_env, jclass km_clazz, jint udeviceid, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxSetVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)udeviceid, (uint32_t)dwvolume) : 0;
#else
    (void)udeviceid;
    (void)dwvolume;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiConnect(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong hmo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiConnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)hmo, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hmi;
    (void)hmo;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong hmo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiDisconnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)hmo, (void*)(uintptr_t)preserved) : 0;
#else
    (void)hmi;
    (void)hmo;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInAddBuffer(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInAddBuffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pmh, (uint32_t)cbmh) : 0;
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInClose(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi) : 0;
#else
    (void)hmi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmic, jint cbmic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetDevCapsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmic, (uint32_t)cbmic) : 0;
#else
    (void)udeviceid;
    (void)pmic;
    (void)cbmic;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmic, jint cbmic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetDevCapsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmic, (uint32_t)cbmic) : 0;
#else
    (void)udeviceid;
    (void)pmic;
    (void)cbmic;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetErrorTextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetErrorTextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInGetID(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pudeviceid) : 0;
#else
    (void)hmi;
    (void)pudeviceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetNumDevs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInMessage(JNIEnv* km_env, jclass km_clazz, jlong hmi, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2) : 0;
#else
    (void)hmi;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInOpen(JNIEnv* km_env, jclass km_clazz, jlong phmi, jint udeviceid, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phmi, (uint32_t)udeviceid, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen) : 0;
#else
    (void)phmi;
    (void)udeviceid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInPrepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pmh, (uint32_t)cbmh) : 0;
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInReset(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInReset");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi) : 0;
#else
    (void)hmi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInStart(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInStart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi) : 0;
#else
    (void)hmi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInStop(JNIEnv* km_env, jclass km_clazz, jlong hmi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInStop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi) : 0;
#else
    (void)hmi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiInUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmi, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInUnprepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmi, (void*)(uintptr_t)pmh, (uint32_t)cbmh) : 0;
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutCacheDrumPatches(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint upatch, jlong pwkya, jint fucache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutCacheDrumPatches");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)upatch, (void*)(uintptr_t)pwkya, (uint32_t)fucache) : 0;
#else
    (void)hmo;
    (void)upatch;
    (void)pwkya;
    (void)fucache;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutCachePatches(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint ubank, jlong pwpa, jint fucache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutCachePatches");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)ubank, (void*)(uintptr_t)pwpa, (uint32_t)fucache) : 0;
#else
    (void)hmo;
    (void)ubank;
    (void)pwpa;
    (void)fucache;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutClose(JNIEnv* km_env, jclass km_clazz, jlong hmo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo) : 0;
#else
    (void)hmo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmoc, jint cbmoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetDevCapsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmoc, (uint32_t)cbmoc) : 0;
#else
    (void)udeviceid;
    (void)pmoc;
    (void)cbmoc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pmoc, jint cbmoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetDevCapsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pmoc, (uint32_t)cbmoc) : 0;
#else
    (void)udeviceid;
    (void)pmoc;
    (void)cbmoc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetErrorTextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetErrorTextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutGetID(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pudeviceid) : 0;
#else
    (void)hmo;
    (void)pudeviceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetNumDevs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutGetVolume(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pdwvolume) : 0;
#else
    (void)hmo;
    (void)pdwvolume;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutLongMsg(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutLongMsg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pmh, (uint32_t)cbmh) : 0;
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutMessage(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2) : 0;
#else
    (void)hmo;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutOpen(JNIEnv* km_env, jclass km_clazz, jlong phmo, jint udeviceid, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phmo, (uint32_t)udeviceid, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen) : 0;
#else
    (void)phmo;
    (void)udeviceid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutPrepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pmh, (uint32_t)cbmh) : 0;
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutReset(JNIEnv* km_env, jclass km_clazz, jlong hmo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutReset");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo) : 0;
#else
    (void)hmo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutSetVolume(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutSetVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)dwvolume) : 0;
#else
    (void)hmo;
    (void)dwvolume;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutShortMsg(JNIEnv* km_env, jclass km_clazz, jlong hmo, jint dwmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutShortMsg");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (uint32_t)dwmsg) : 0;
#else
    (void)hmo;
    (void)dwmsg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiOutUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hmo, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutUnprepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmo, (void*)(uintptr_t)pmh, (uint32_t)cbmh) : 0;
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamClose(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hms) : 0;
#else
    (void)hms;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamOpen(JNIEnv* km_env, jclass km_clazz, jlong phms, jlong pudeviceid, jint cmidi, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phms, (void*)(uintptr_t)pudeviceid, (uint32_t)cmidi, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen) : 0;
#else
    (void)phms;
    (void)pudeviceid;
    (void)cmidi;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamOut(JNIEnv* km_env, jclass km_clazz, jlong hms, jlong pmh, jint cbmh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamOut");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hms, (void*)(uintptr_t)pmh, (uint32_t)cbmh) : 0;
#else
    (void)hms;
    (void)pmh;
    (void)cbmh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamPause(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamPause");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hms) : 0;
#else
    (void)hms;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamPosition(JNIEnv* km_env, jclass km_clazz, jlong hms, jlong lpmmt, jint cbmmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamPosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hms, (void*)(uintptr_t)lpmmt, (uint32_t)cbmmt) : 0;
#else
    (void)hms;
    (void)lpmmt;
    (void)cbmmt;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamProperty(JNIEnv* km_env, jclass km_clazz, jlong hms, jlong lppropdata, jint dwproperty) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hms, (void*)(uintptr_t)lppropdata, (uint32_t)dwproperty) : 0;
#else
    (void)hms;
    (void)lppropdata;
    (void)dwproperty;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamRestart(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamRestart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hms) : 0;
#else
    (void)hms;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1midiStreamStop(JNIEnv* km_env, jclass km_clazz, jlong hms) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamStop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hms) : 0;
#else
    (void)hms;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerClose(JNIEnv* km_env, jclass km_clazz, jlong hmx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmx) : 0;
#else
    (void)hmx;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetControlDetailsA(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxcd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetControlDetailsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxcd, (uint32_t)fdwdetails) : 0;
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetControlDetailsW(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxcd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetControlDetailsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxcd, (uint32_t)fdwdetails) : 0;
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong umxid, jlong pmxcaps, jint cbmxcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetDevCapsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)umxid, (void*)(uintptr_t)pmxcaps, (uint32_t)cbmxcaps) : 0;
#else
    (void)umxid;
    (void)pmxcaps;
    (void)cbmxcaps;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong umxid, jlong pmxcaps, jint cbmxcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetDevCapsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)umxid, (void*)(uintptr_t)pmxcaps, (uint32_t)cbmxcaps) : 0;
#else
    (void)umxid;
    (void)pmxcaps;
    (void)cbmxcaps;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetID(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pumxid, jint fdwid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pumxid, (uint32_t)fdwid) : 0;
#else
    (void)hmxobj;
    (void)pumxid;
    (void)fdwid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetLineControlsA(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxlc, jint fdwcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineControlsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxlc, (uint32_t)fdwcontrols) : 0;
#else
    (void)hmxobj;
    (void)pmxlc;
    (void)fdwcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetLineControlsW(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxlc, jint fdwcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineControlsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxlc, (uint32_t)fdwcontrols) : 0;
#else
    (void)hmxobj;
    (void)pmxlc;
    (void)fdwcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetLineInfoA(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxl, jint fdwinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxl, (uint32_t)fdwinfo) : 0;
#else
    (void)hmxobj;
    (void)pmxl;
    (void)fdwinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetLineInfoW(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxl, jint fdwinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxl, (uint32_t)fdwinfo) : 0;
#else
    (void)hmxobj;
    (void)pmxl;
    (void)fdwinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetNumDevs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerMessage(JNIEnv* km_env, jclass km_clazz, jlong hmx, jint umsg, jlong dwparam1, jlong dwparam2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmx, (uint32_t)umsg, (uint64_t)dwparam1, (uint64_t)dwparam2) : 0;
#else
    (void)hmx;
    (void)umsg;
    (void)dwparam1;
    (void)dwparam2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerOpen(JNIEnv* km_env, jclass km_clazz, jlong phmx, jint umxid, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phmx, (uint32_t)umxid, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen) : 0;
#else
    (void)phmx;
    (void)umxid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1mixerSetControlDetails(JNIEnv* km_env, jclass km_clazz, jlong hmxobj, jlong pmxcd, jint fdwdetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerSetControlDetails");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmxobj, (void*)(uintptr_t)pmxcd, (uint32_t)fdwdetails) : 0;
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1sndPlaySoundA(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jint fusound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndPlaySoundA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsound, (uint32_t)fusound) : -1;
#else
    (void)pszsound;
    (void)fusound;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1sndPlaySoundW(JNIEnv* km_env, jclass km_clazz, jlong pszsound, jint fusound) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndPlaySoundW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsound, (uint32_t)fusound) : -1;
#else
    (void)pszsound;
    (void)fusound;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInAddBuffer(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInAddBuffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pwh, (uint32_t)cbwh) : 0;
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInClose(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi) : 0;
#else
    (void)hwi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwic, jint cbwic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetDevCapsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwic, (uint32_t)cbwic) : 0;
#else
    (void)udeviceid;
    (void)pwic;
    (void)cbwic;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwic, jint cbwic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetDevCapsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwic, (uint32_t)cbwic) : 0;
#else
    (void)udeviceid;
    (void)pwic;
    (void)cbwic;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetErrorTextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetErrorTextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInGetID(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pudeviceid) : 0;
#else
    (void)hwi;
    (void)pudeviceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetNumDevs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInGetPosition(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pmmt, jint cbmmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetPosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pmmt, (uint32_t)cbmmt) : 0;
#else
    (void)hwi;
    (void)pmmt;
    (void)cbmmt;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInMessage(JNIEnv* km_env, jclass km_clazz, jlong hwi, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2) : 0;
#else
    (void)hwi;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInOpen(JNIEnv* km_env, jclass km_clazz, jlong phwi, jint udeviceid, jlong pwfx, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phwi, (uint32_t)udeviceid, (void*)(uintptr_t)pwfx, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen) : 0;
#else
    (void)phwi;
    (void)udeviceid;
    (void)pwfx;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInPrepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pwh, (uint32_t)cbwh) : 0;
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInReset(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInReset");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi) : 0;
#else
    (void)hwi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInStart(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInStart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi) : 0;
#else
    (void)hwi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInStop(JNIEnv* km_env, jclass km_clazz, jlong hwi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInStop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi) : 0;
#else
    (void)hwi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveInUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwi, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInUnprepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwi, (void*)(uintptr_t)pwh, (uint32_t)cbwh) : 0;
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutBreakLoop(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutBreakLoop");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo) : 0;
#else
    (void)hwo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutClose(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo) : 0;
#else
    (void)hwo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwoc, jint cbwoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetDevCapsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwoc, (uint32_t)cbwoc) : 0;
#else
    (void)udeviceid;
    (void)pwoc;
    (void)cbwoc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jlong udeviceid, jlong pwoc, jint cbwoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetDevCapsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)udeviceid, (void*)(uintptr_t)pwoc, (uint32_t)cbwoc) : 0;
#else
    (void)udeviceid;
    (void)pwoc;
    (void)cbwoc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetErrorTextA(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetErrorTextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetErrorTextW(JNIEnv* km_env, jclass km_clazz, jint mmrerror, jlong psztext, jint cchtext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetErrorTextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)mmrerror, (void*)(uintptr_t)psztext, (uint32_t)cchtext) : 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetID(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pudeviceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetID");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pudeviceid) : 0;
#else
    (void)hwo;
    (void)pudeviceid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetNumDevs(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetNumDevs");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetPitch(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pdwpitch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPitch");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pdwpitch) : 0;
#else
    (void)hwo;
    (void)pdwpitch;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetPlaybackRate(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pdwrate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPlaybackRate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pdwrate) : 0;
#else
    (void)hwo;
    (void)pdwrate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetPosition(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pmmt, jint cbmmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pmmt, (uint32_t)cbmmt) : 0;
#else
    (void)hwo;
    (void)pmmt;
    (void)cbmmt;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutGetVolume(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pdwvolume) : 0;
#else
    (void)hwo;
    (void)pdwvolume;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutMessage(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint umsg, jlong dw1, jlong dw2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)umsg, (uint64_t)dw1, (uint64_t)dw2) : 0;
#else
    (void)hwo;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutOpen(JNIEnv* km_env, jclass km_clazz, jlong phwo, jint udeviceid, jlong pwfx, jlong dwcallback, jlong dwinstance, jint fdwopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutOpen");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phwo, (uint32_t)udeviceid, (void*)(uintptr_t)pwfx, (uint64_t)dwcallback, (uint64_t)dwinstance, (uint32_t)fdwopen) : 0;
#else
    (void)phwo;
    (void)udeviceid;
    (void)pwfx;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutPause(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutPause");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo) : 0;
#else
    (void)hwo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutPrepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutPrepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pwh, (uint32_t)cbwh) : 0;
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutReset(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutReset");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo) : 0;
#else
    (void)hwo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutRestart(JNIEnv* km_env, jclass km_clazz, jlong hwo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutRestart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo) : 0;
#else
    (void)hwo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutSetPitch(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint dwpitch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetPitch");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)dwpitch) : 0;
#else
    (void)hwo;
    (void)dwpitch;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutSetPlaybackRate(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint dwrate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetPlaybackRate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)dwrate) : 0;
#else
    (void)hwo;
    (void)dwrate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutSetVolume(JNIEnv* km_env, jclass km_clazz, jlong hwo, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (uint32_t)dwvolume) : 0;
#else
    (void)hwo;
    (void)dwvolume;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutUnprepareHeader(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutUnprepareHeader");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pwh, (uint32_t)cbwh) : 0;
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_media_audio_WindowsWin32MediaAudioJniBridge_windowssys_1windows_1win32_1media_1audio_1waveOutWrite(JNIEnv* km_env, jclass km_clazz, jlong hwo, jlong pwh, jint cbwh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutWrite");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwo, (void*)(uintptr_t)pwh, (uint32_t)cbwh) : 0;
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

