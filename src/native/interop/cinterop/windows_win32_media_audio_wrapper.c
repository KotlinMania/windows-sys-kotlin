#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_media_audio_wrapper.h"
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

int32_t windowssys_windows_win32_media_audio_activateAudioInterfaceAsync(void* deviceinterfacepath, void* riid, void* activationparams, void* completionhandler, void* activationoperation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mmdevapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivateAudioInterfaceAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinterfacepath, riid, activationparams, completionhandler, activationoperation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinterfacepath;
    (void)riid;
    (void)activationparams;
    (void)completionhandler;
    (void)activationoperation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_coRegisterMessageFilter(void* lpmessagefilter, void* lplpmessagefilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoRegisterMessageFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmessagefilter, lplpmessagefilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmessagefilter;
    (void)lplpmessagefilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitor(void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategory(int32_t category, void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(category, audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)category;
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceId(int32_t category, void* deviceid, void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategoryAndDeviceId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(category, deviceid, audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)category;
    (void)deviceid;
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createCaptureAudioStateMonitorForCategoryAndDeviceRole(int32_t category, int32_t role, void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaptureAudioStateMonitorForCategoryAndDeviceRole");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(category, role, audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)category;
    (void)role;
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitor(void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategory(int32_t category, void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(category, audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)category;
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceId(int32_t category, void* deviceid, void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategoryAndDeviceId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(category, deviceid, audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)category;
    (void)deviceid;
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_createRenderAudioStateMonitorForCategoryAndDeviceRole(int32_t category, int32_t role, void* audiostatemonitor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("windows.media.mediacontrol.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRenderAudioStateMonitorForCategoryAndDeviceRole");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(category, role, audiostatemonitor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)category;
    (void)role;
    (void)audiostatemonitor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_playSoundA(void* pszsound, void* hmod, uint32_t fdwsound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlaySoundA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsound, hmod, fdwsound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsound;
    (void)hmod;
    (void)fdwsound;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_playSoundW(void* pszsound, void* hmod, uint32_t fdwsound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PlaySoundW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsound, hmod, fdwsound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsound;
    (void)hmod;
    (void)fdwsound;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverAddA(void* phadid, void* hinstmodule, int64_t lparam, uint32_t dwpriority, uint32_t fdwadd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverAddA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phadid, hinstmodule, lparam, dwpriority, fdwadd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phadid;
    (void)hinstmodule;
    (void)lparam;
    (void)dwpriority;
    (void)fdwadd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverAddW(void* phadid, void* hinstmodule, int64_t lparam, uint32_t dwpriority, uint32_t fdwadd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverAddW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phadid, hinstmodule, lparam, dwpriority, fdwadd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phadid;
    (void)hinstmodule;
    (void)lparam;
    (void)dwpriority;
    (void)fdwadd;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverClose(void* had, uint32_t fdwclose) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, fdwclose);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)fdwclose;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverDetailsA(void* hadid, void* padd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverDetailsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hadid, padd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hadid;
    (void)padd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverDetailsW(void* hadid, void* padd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverDetailsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hadid, padd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hadid;
    (void)padd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverEnum(void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverID(void* hao, void* phadid, uint32_t fdwdriverid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hao, phadid, fdwdriverid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hao;
    (void)phadid;
    (void)fdwdriverid;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_media_audio_acmDriverMessage(void* had, uint32_t umsg, int64_t lparam1, int64_t lparam2) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, umsg, lparam1, lparam2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)had;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverOpen(void* phad, void* hadid, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phad, hadid, fdwopen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phad;
    (void)hadid;
    (void)fdwopen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverPriority(void* hadid, uint32_t dwpriority, uint32_t fdwpriority) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hadid, dwpriority, fdwpriority);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hadid;
    (void)dwpriority;
    (void)fdwpriority;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmDriverRemove(void* hadid, uint32_t fdwremove) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmDriverRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hadid, fdwremove);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hadid;
    (void)fdwremove;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterChooseA(void* pafltrc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterChooseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pafltrc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pafltrc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterChooseW(void* pafltrc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterChooseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pafltrc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pafltrc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterDetailsA(void* had, void* pafd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterDetailsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterDetailsW(void* had, void* pafd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterDetailsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterEnumA(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterEnumA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterEnumW(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterEnumW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterTagDetailsA(void* had, void* paftd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagDetailsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterTagDetailsW(void* had, void* paftd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagDetailsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterTagEnumA(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagEnumA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFilterTagEnumW(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFilterTagEnumW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatChooseA(void* pafmtc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatChooseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pafmtc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pafmtc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatChooseW(void* pafmtc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatChooseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pafmtc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pafmtc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatDetailsA(void* had, void* pafd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatDetailsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatDetailsW(void* had, void* pafd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatDetailsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatEnumA(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatEnumA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatEnumW(void* had, void* pafd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatEnumW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pafd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pafd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatSuggest(void* had, void* pwfxsrc, void* pwfxdst, uint32_t cbwfxdst, uint32_t fdwsuggest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatSuggest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, pwfxsrc, pwfxdst, cbwfxdst, fdwsuggest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)pwfxsrc;
    (void)pwfxdst;
    (void)cbwfxdst;
    (void)fdwsuggest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatTagDetailsA(void* had, void* paftd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagDetailsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatTagDetailsW(void* had, void* paftd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagDetailsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatTagEnumA(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagEnumA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmFormatTagEnumW(void* had, void* paftd, void* fncallback, uint64_t dwinstance, uint32_t fdwenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmFormatTagEnumW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(had, paftd, fncallback, dwinstance, fdwenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)had;
    (void)paftd;
    (void)fncallback;
    (void)dwinstance;
    (void)fdwenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmGetVersion(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmGetVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmMetrics(void* hao, uint32_t umetric, void* pmetric) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmMetrics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hao, umetric, pmetric);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hao;
    (void)umetric;
    (void)pmetric;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamClose(void* has, uint32_t fdwclose) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(has, fdwclose);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)has;
    (void)fdwclose;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamConvert(void* has, void* pash, uint32_t fdwconvert) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamConvert");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(has, pash, fdwconvert);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)has;
    (void)pash;
    (void)fdwconvert;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamMessage(void* has, uint32_t umsg, int64_t lparam1, int64_t lparam2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(has, umsg, lparam1, lparam2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)has;
    (void)umsg;
    (void)lparam1;
    (void)lparam2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamOpen(void* phas, void* had, void* pwfxsrc, void* pwfxdst, void* pwfltr, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phas, had, pwfxsrc, pwfxdst, pwfltr, dwcallback, dwinstance, fdwopen);
    }
    errno = ENOSYS;
    return 0;
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
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamPrepareHeader(void* has, void* pash, uint32_t fdwprepare) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamPrepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(has, pash, fdwprepare);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)has;
    (void)pash;
    (void)fdwprepare;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamReset(void* has, uint32_t fdwreset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(has, fdwreset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)has;
    (void)fdwreset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamSize(void* has, uint32_t cbinput, void* pdwoutputbytes, uint32_t fdwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(has, cbinput, pdwoutputbytes, fdwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)has;
    (void)cbinput;
    (void)pdwoutputbytes;
    (void)fdwsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_acmStreamUnprepareHeader(void* has, void* pash, uint32_t fdwunprepare) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msacm32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "acmStreamUnprepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(has, pash, fdwunprepare);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)has;
    (void)pash;
    (void)fdwunprepare;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_auxGetDevCapsA(uint64_t udeviceid, void* pac, uint32_t cbac) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pac, cbac);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pac;
    (void)cbac;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_auxGetDevCapsW(uint64_t udeviceid, void* pac, uint32_t cbac) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pac, cbac);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pac;
    (void)cbac;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_auxGetNumDevs(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetNumDevs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_auxGetVolume(uint32_t udeviceid, void* pdwvolume) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxGetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pdwvolume);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pdwvolume;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_auxOutMessage(uint32_t udeviceid, uint32_t umsg, uint64_t dw1, uint64_t dw2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxOutMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, umsg, dw1, dw2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_auxSetVolume(uint32_t udeviceid, uint32_t dwvolume) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "auxSetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, dwvolume);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)dwvolume;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiConnect(void* hmi, void* hmo, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi, hmo, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    (void)hmo;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiDisconnect(void* hmi, void* hmo, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi, hmo, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    (void)hmo;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInAddBuffer(void* hmi, void* pmh, uint32_t cbmh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInAddBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi, pmh, cbmh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInClose(void* hmi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInGetDevCapsA(uint64_t udeviceid, void* pmic, uint32_t cbmic) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pmic, cbmic);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pmic;
    (void)cbmic;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInGetDevCapsW(uint64_t udeviceid, void* pmic, uint32_t cbmic) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pmic, cbmic);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pmic;
    (void)cbmic;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetErrorTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetErrorTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInGetID(void* hmi, void* pudeviceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi, pudeviceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    (void)pudeviceid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInGetNumDevs(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInGetNumDevs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInMessage(void* hmi, uint32_t umsg, uint64_t dw1, uint64_t dw2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi, umsg, dw1, dw2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInOpen(void* phmi, uint32_t udeviceid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phmi, udeviceid, dwcallback, dwinstance, fdwopen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phmi;
    (void)udeviceid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInPrepareHeader(void* hmi, void* pmh, uint32_t cbmh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInPrepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi, pmh, cbmh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInReset(void* hmi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInStart(void* hmi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInStop(void* hmi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInStop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiInUnprepareHeader(void* hmi, void* pmh, uint32_t cbmh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiInUnprepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmi, pmh, cbmh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmi;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutCacheDrumPatches(void* hmo, uint32_t upatch, void* pwkya, uint32_t fucache) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutCacheDrumPatches");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, upatch, pwkya, fucache);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)upatch;
    (void)pwkya;
    (void)fucache;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutCachePatches(void* hmo, uint32_t ubank, void* pwpa, uint32_t fucache) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutCachePatches");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, ubank, pwpa, fucache);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)ubank;
    (void)pwpa;
    (void)fucache;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutClose(void* hmo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutGetDevCapsA(uint64_t udeviceid, void* pmoc, uint32_t cbmoc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pmoc, cbmoc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pmoc;
    (void)cbmoc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutGetDevCapsW(uint64_t udeviceid, void* pmoc, uint32_t cbmoc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pmoc, cbmoc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pmoc;
    (void)cbmoc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetErrorTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetErrorTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutGetID(void* hmo, void* pudeviceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, pudeviceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)pudeviceid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutGetNumDevs(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetNumDevs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutGetVolume(void* hmo, void* pdwvolume) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutGetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, pdwvolume);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)pdwvolume;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutLongMsg(void* hmo, void* pmh, uint32_t cbmh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutLongMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, pmh, cbmh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutMessage(void* hmo, uint32_t umsg, uint64_t dw1, uint64_t dw2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, umsg, dw1, dw2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutOpen(void* phmo, uint32_t udeviceid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phmo, udeviceid, dwcallback, dwinstance, fdwopen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phmo;
    (void)udeviceid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutPrepareHeader(void* hmo, void* pmh, uint32_t cbmh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutPrepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, pmh, cbmh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutReset(void* hmo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutSetVolume(void* hmo, uint32_t dwvolume) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutSetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, dwvolume);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)dwvolume;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutShortMsg(void* hmo, uint32_t dwmsg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutShortMsg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, dwmsg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)dwmsg;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiOutUnprepareHeader(void* hmo, void* pmh, uint32_t cbmh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiOutUnprepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmo, pmh, cbmh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmo;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamClose(void* hms) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hms);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hms;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamOpen(void* phms, void* pudeviceid, uint32_t cmidi, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phms, pudeviceid, cmidi, dwcallback, dwinstance, fdwopen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phms;
    (void)pudeviceid;
    (void)cmidi;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamOut(void* hms, void* pmh, uint32_t cbmh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamOut");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hms, pmh, cbmh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hms;
    (void)pmh;
    (void)cbmh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamPause(void* hms) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamPause");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hms);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hms;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamPosition(void* hms, void* lpmmt, uint32_t cbmmt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hms, lpmmt, cbmmt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hms;
    (void)lpmmt;
    (void)cbmmt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamProperty(void* hms, void* lppropdata, uint32_t dwproperty) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hms, lppropdata, dwproperty);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hms;
    (void)lppropdata;
    (void)dwproperty;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamRestart(void* hms) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamRestart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hms);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hms;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_midiStreamStop(void* hms) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "midiStreamStop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hms);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hms;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerClose(void* hmx) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmx);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmx;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetControlDetailsA(void* hmxobj, void* pmxcd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetControlDetailsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pmxcd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetControlDetailsW(void* hmxobj, void* pmxcd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetControlDetailsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pmxcd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetDevCapsA(uint64_t umxid, void* pmxcaps, uint32_t cbmxcaps) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umxid, pmxcaps, cbmxcaps);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)umxid;
    (void)pmxcaps;
    (void)cbmxcaps;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetDevCapsW(uint64_t umxid, void* pmxcaps, uint32_t cbmxcaps) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umxid, pmxcaps, cbmxcaps);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)umxid;
    (void)pmxcaps;
    (void)cbmxcaps;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetID(void* hmxobj, void* pumxid, uint32_t fdwid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pumxid, fdwid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pumxid;
    (void)fdwid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetLineControlsA(void* hmxobj, void* pmxlc, uint32_t fdwcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineControlsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pmxlc, fdwcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pmxlc;
    (void)fdwcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetLineControlsW(void* hmxobj, void* pmxlc, uint32_t fdwcontrols) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineControlsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pmxlc, fdwcontrols);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pmxlc;
    (void)fdwcontrols;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetLineInfoA(void* hmxobj, void* pmxl, uint32_t fdwinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pmxl, fdwinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pmxl;
    (void)fdwinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetLineInfoW(void* hmxobj, void* pmxl, uint32_t fdwinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetLineInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pmxl, fdwinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pmxl;
    (void)fdwinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerGetNumDevs(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerGetNumDevs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerMessage(void* hmx, uint32_t umsg, uint64_t dwparam1, uint64_t dwparam2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmx, umsg, dwparam1, dwparam2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmx;
    (void)umsg;
    (void)dwparam1;
    (void)dwparam2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerOpen(void* phmx, uint32_t umxid, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phmx, umxid, dwcallback, dwinstance, fdwopen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phmx;
    (void)umxid;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_mixerSetControlDetails(void* hmxobj, void* pmxcd, uint32_t fdwdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "mixerSetControlDetails");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmxobj, pmxcd, fdwdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmxobj;
    (void)pmxcd;
    (void)fdwdetails;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_media_audio_sndPlaySoundA(void* pszsound, uint32_t fusound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndPlaySoundA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsound, fusound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsound;
    (void)fusound;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_media_audio_sndPlaySoundW(void* pszsound, uint32_t fusound) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "sndPlaySoundW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsound, fusound);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsound;
    (void)fusound;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInAddBuffer(void* hwi, void* pwh, uint32_t cbwh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInAddBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi, pwh, cbwh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInClose(void* hwi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInGetDevCapsA(uint64_t udeviceid, void* pwic, uint32_t cbwic) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pwic, cbwic);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pwic;
    (void)cbwic;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInGetDevCapsW(uint64_t udeviceid, void* pwic, uint32_t cbwic) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pwic, cbwic);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pwic;
    (void)cbwic;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetErrorTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetErrorTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInGetID(void* hwi, void* pudeviceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi, pudeviceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    (void)pudeviceid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInGetNumDevs(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetNumDevs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInGetPosition(void* hwi, void* pmmt, uint32_t cbmmt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInGetPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi, pmmt, cbmmt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    (void)pmmt;
    (void)cbmmt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInMessage(void* hwi, uint32_t umsg, uint64_t dw1, uint64_t dw2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi, umsg, dw1, dw2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInOpen(void* phwi, uint32_t udeviceid, void* pwfx, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phwi, udeviceid, pwfx, dwcallback, dwinstance, fdwopen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phwi;
    (void)udeviceid;
    (void)pwfx;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInPrepareHeader(void* hwi, void* pwh, uint32_t cbwh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInPrepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi, pwh, cbwh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInReset(void* hwi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInStart(void* hwi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInStop(void* hwi) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInStop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveInUnprepareHeader(void* hwi, void* pwh, uint32_t cbwh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveInUnprepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwi, pwh, cbwh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwi;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutBreakLoop(void* hwo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutBreakLoop");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutClose(void* hwo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetDevCapsA(uint64_t udeviceid, void* pwoc, uint32_t cbwoc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetDevCapsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pwoc, cbwoc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pwoc;
    (void)cbwoc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetDevCapsW(uint64_t udeviceid, void* pwoc, uint32_t cbwoc) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetDevCapsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(udeviceid, pwoc, cbwoc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)udeviceid;
    (void)pwoc;
    (void)cbwoc;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetErrorTextA(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetErrorTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetErrorTextW(uint32_t mmrerror, void* psztext, uint32_t cchtext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetErrorTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mmrerror, psztext, cchtext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)mmrerror;
    (void)psztext;
    (void)cchtext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetID(void* hwo, void* pudeviceid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pudeviceid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pudeviceid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetNumDevs(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetNumDevs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetPitch(void* hwo, void* pdwpitch) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPitch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pdwpitch);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pdwpitch;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetPlaybackRate(void* hwo, void* pdwrate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPlaybackRate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pdwrate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pdwrate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetPosition(void* hwo, void* pmmt, uint32_t cbmmt) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pmmt, cbmmt);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pmmt;
    (void)cbmmt;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutGetVolume(void* hwo, void* pdwvolume) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutGetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pdwvolume);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pdwvolume;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutMessage(void* hwo, uint32_t umsg, uint64_t dw1, uint64_t dw2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, umsg, dw1, dw2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)umsg;
    (void)dw1;
    (void)dw2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutOpen(void* phwo, uint32_t udeviceid, void* pwfx, uint64_t dwcallback, uint64_t dwinstance, uint32_t fdwopen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phwo, udeviceid, pwfx, dwcallback, dwinstance, fdwopen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)phwo;
    (void)udeviceid;
    (void)pwfx;
    (void)dwcallback;
    (void)dwinstance;
    (void)fdwopen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutPause(void* hwo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutPause");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutPrepareHeader(void* hwo, void* pwh, uint32_t cbwh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutPrepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pwh, cbwh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutReset(void* hwo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutReset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutRestart(void* hwo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutRestart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutSetPitch(void* hwo, uint32_t dwpitch) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetPitch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, dwpitch);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)dwpitch;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutSetPlaybackRate(void* hwo, uint32_t dwrate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetPlaybackRate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, dwrate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)dwrate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutSetVolume(void* hwo, uint32_t dwvolume) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutSetVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, dwvolume);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)dwvolume;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutUnprepareHeader(void* hwo, void* pwh, uint32_t cbwh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutUnprepareHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pwh, cbwh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_media_audio_waveOutWrite(void* hwo, void* pwh, uint32_t cbwh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winmm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "waveOutWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwo, pwh, cbwh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwo;
    (void)pwh;
    (void)cbwh;
    errno = ENOSYS;
    return 0;
#endif
}

