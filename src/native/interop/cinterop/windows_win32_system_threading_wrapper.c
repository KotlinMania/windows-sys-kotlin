#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_threading_wrapper.h"
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

void windowssys_windows_win32_system_threading_AcquireSRWLockExclusive(void* srwlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireSRWLockExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(srwlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_AcquireSRWLockShared(void* srwlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireSRWLockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(srwlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_AddIntegrityLabelToBoundaryDescriptor(void* boundarydescriptor, void* integritylabel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIntegrityLabelToBoundaryDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boundarydescriptor, integritylabel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boundarydescriptor;
    (void)integritylabel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AddSIDToBoundaryDescriptor(void* boundarydescriptor, void* requiredsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSIDToBoundaryDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(boundarydescriptor, requiredsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)boundarydescriptor;
    (void)requiredsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AttachThreadInput(uint32_t idattach, uint32_t idattachto, int32_t fattach) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AttachThreadInput");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idattach, idattachto, fattach);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idattach;
    (void)idattachto;
    (void)fattach;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvQuerySystemResponsiveness(void* avrthandle, void* systemresponsivenessvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvQuerySystemResponsiveness");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(avrthandle, systemresponsivenessvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)avrthandle;
    (void)systemresponsivenessvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRevertMmThreadCharacteristics(void* avrthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRevertMmThreadCharacteristics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(avrthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)avrthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroup(void* context, void* period, void* threadorderingguid, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, period, threadorderingguid, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExA(void* context, void* period, void* threadorderingguid, void* timeout, void* taskname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroupExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, period, threadorderingguid, timeout, taskname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRtCreateThreadOrderingGroupExW(void* context, void* period, void* threadorderingguid, void* timeout, void* taskname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroupExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, period, threadorderingguid, timeout, taskname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRtDeleteThreadOrderingGroup(void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtDeleteThreadOrderingGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRtJoinThreadOrderingGroup(void* context, void* threadorderingguid, int32_t before) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtJoinThreadOrderingGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, threadorderingguid, before);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)threadorderingguid;
    (void)before;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRtLeaveThreadOrderingGroup(void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtLeaveThreadOrderingGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvRtWaitOnThreadOrderingGroup(void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtWaitOnThreadOrderingGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsA(void* firsttask, void* secondtask, void* taskindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmMaxThreadCharacteristicsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(firsttask, secondtask, taskindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_AvSetMmMaxThreadCharacteristicsW(void* firsttask, void* secondtask, void* taskindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmMaxThreadCharacteristicsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(firsttask, secondtask, taskindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsA(void* taskname, void* taskindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmThreadCharacteristicsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(taskname, taskindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)taskname;
    (void)taskindex;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_AvSetMmThreadCharacteristicsW(void* taskname, void* taskindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmThreadCharacteristicsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(taskname, taskindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)taskname;
    (void)taskindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_AvSetMmThreadPriority(void* avrthandle, int32_t priority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmThreadPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(avrthandle, priority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)avrthandle;
    (void)priority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CallbackMayRunLong(int64_t pci) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallbackMayRunLong");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pci);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pci;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_CancelThreadpoolIo(int64_t pio) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelThreadpoolIo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pio);
        return;
    }
    errno = ENOSYS;
#else
    (void)pio;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_CancelTimerQueueTimer(void* timerqueue, void* timer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelTimerQueueTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerqueue, timer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerqueue;
    (void)timer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CancelWaitableTimer(void* htimer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelWaitableTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htimer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htimer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_ChangeTimerQueueTimer(void* timerqueue, void* timer, uint32_t duetime, uint32_t period) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeTimerQueueTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerqueue, timer, duetime, period);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerqueue;
    (void)timer;
    (void)duetime;
    (void)period;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_system_threading_ClosePrivateNamespace(void* handle, uint32_t flags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePrivateNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, flags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)handle;
    (void)flags;
    errno = ENOSYS;
    return false;
#endif
}

void windowssys_windows_win32_system_threading_CloseThreadpool(int64_t ptpp) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpool");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptpp);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptpp;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroup(int64_t ptpcg) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolCleanupGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptpcg);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptpcg;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_CloseThreadpoolCleanupGroupMembers(int64_t ptpcg, int32_t fcancelpendingcallbacks, void* pvcleanupcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolCleanupGroupMembers");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptpcg, fcancelpendingcallbacks, pvcleanupcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptpcg;
    (void)fcancelpendingcallbacks;
    (void)pvcleanupcontext;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_CloseThreadpoolIo(int64_t pio) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolIo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pio);
        return;
    }
    errno = ENOSYS;
#else
    (void)pio;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_CloseThreadpoolTimer(int64_t pti) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pti);
        return;
    }
    errno = ENOSYS;
#else
    (void)pti;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_CloseThreadpoolWait(int64_t pwa) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolWait");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwa);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwa;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_CloseThreadpoolWork(int64_t pwk) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolWork");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwk);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwk;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_ConvertFiberToThread(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertFiberToThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_ConvertThreadToFiber(void* lpparameter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertThreadToFiber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpparameter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpparameter;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_ConvertThreadToFiberEx(void* lpparameter, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertThreadToFiberEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpparameter, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpparameter;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateBoundaryDescriptorA(void* name, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBoundaryDescriptorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateBoundaryDescriptorW(void* name, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBoundaryDescriptorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateEventA(void* lpeventattributes, int32_t bmanualreset, int32_t binitialstate, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpeventattributes, bmanualreset, binitialstate, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateEventExA(void* lpeventattributes, void* lpname, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpeventattributes, lpname, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateEventExW(void* lpeventattributes, void* lpname, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpeventattributes, lpname, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateEventW(void* lpeventattributes, int32_t bmanualreset, int32_t binitialstate, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpeventattributes, bmanualreset, binitialstate, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateFiber(uint64_t dwstacksize, void* lpstartaddress, void* lpparameter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFiber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwstacksize, lpstartaddress, lpparameter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateFiberEx(uint64_t dwstackcommitsize, uint64_t dwstackreservesize, uint32_t dwflags, void* lpstartaddress, void* lpparameter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFiberEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwstackcommitsize, dwstackreservesize, dwflags, lpstartaddress, lpparameter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwstackcommitsize;
    (void)dwstackreservesize;
    (void)dwflags;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateMutexA(void* lpmutexattributes, int32_t binitialowner, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmutexattributes, binitialowner, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateMutexExA(void* lpmutexattributes, void* lpname, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmutexattributes, lpname, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateMutexExW(void* lpmutexattributes, void* lpname, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmutexattributes, lpname, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateMutexW(void* lpmutexattributes, int32_t binitialowner, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmutexattributes, binitialowner, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreatePrivateNamespaceA(void* lpprivatenamespaceattributes, void* lpboundarydescriptor, void* lpaliasprefix) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateNamespaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreatePrivateNamespaceW(void* lpprivatenamespaceattributes, void* lpboundarydescriptor, void* lpaliasprefix) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateNamespaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprivatenamespaceattributes, lpboundarydescriptor, lpaliasprefix);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateProcessA(void* lpapplicationname, void* lpcommandline, void* lpprocessattributes, void* lpthreadattributes, int32_t binherithandles, uint32_t dwcreationflags, void* lpenvironment, void* lpcurrentdirectory, void* lpstartupinfo, void* lpprocessinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateProcessAsUserA(void* htoken, void* lpapplicationname, void* lpcommandline, void* lpprocessattributes, void* lpthreadattributes, int32_t binherithandles, uint32_t dwcreationflags, void* lpenvironment, void* lpcurrentdirectory, void* lpstartupinfo, void* lpprocessinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessAsUserA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateProcessAsUserW(void* htoken, void* lpapplicationname, void* lpcommandline, void* lpprocessattributes, void* lpthreadattributes, int32_t binherithandles, uint32_t dwcreationflags, void* lpenvironment, void* lpcurrentdirectory, void* lpstartupinfo, void* lpprocessinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessAsUserW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateProcessW(void* lpapplicationname, void* lpcommandline, void* lpprocessattributes, void* lpthreadattributes, int32_t binherithandles, uint32_t dwcreationflags, void* lpenvironment, void* lpcurrentdirectory, void* lpstartupinfo, void* lpprocessinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpapplicationname, lpcommandline, lpprocessattributes, lpthreadattributes, binherithandles, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateProcessWithLogonW(void* lpusername, void* lpdomain, void* lppassword, uint32_t dwlogonflags, void* lpapplicationname, void* lpcommandline, uint32_t dwcreationflags, void* lpenvironment, void* lpcurrentdirectory, void* lpstartupinfo, void* lpprocessinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessWithLogonW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpusername, lpdomain, lppassword, dwlogonflags, lpapplicationname, lpcommandline, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpusername;
    (void)lpdomain;
    (void)lppassword;
    (void)dwlogonflags;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateProcessWithTokenW(void* htoken, uint32_t dwlogonflags, void* lpapplicationname, void* lpcommandline, uint32_t dwcreationflags, void* lpenvironment, void* lpcurrentdirectory, void* lpstartupinfo, void* lpprocessinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessWithTokenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, dwlogonflags, lpapplicationname, lpcommandline, dwcreationflags, lpenvironment, lpcurrentdirectory, lpstartupinfo, lpprocessinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)dwlogonflags;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_CreateRemoteThread(void* hprocess, void* lpthreadattributes, uint64_t dwstacksize, void* lpstartaddress, void* lpparameter, uint32_t dwcreationflags, void* lpthreadid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRemoteThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpthreadid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateRemoteThreadEx(void* hprocess, void* lpthreadattributes, uint64_t dwstacksize, void* lpstartaddress, void* lpparameter, uint32_t dwcreationflags, void* lpattributelist, void* lpthreadid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRemoteThreadEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpattributelist, lpthreadid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpattributelist;
    (void)lpthreadid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateSemaphoreA(void* lpsemaphoreattributes, int32_t linitialcount, int32_t lmaximumcount, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateSemaphoreExA(void* lpsemaphoreattributes, int32_t linitialcount, int32_t lmaximumcount, void* lpname, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateSemaphoreExW(void* lpsemaphoreattributes, int32_t linitialcount, int32_t lmaximumcount, void* lpname, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateSemaphoreW(void* lpsemaphoreattributes, int32_t linitialcount, int32_t lmaximumcount, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsemaphoreattributes, linitialcount, lmaximumcount, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateThread(void* lpthreadattributes, uint64_t dwstacksize, void* lpstartaddress, void* lpparameter, uint32_t dwcreationflags, void* lpthreadid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpthreadattributes, dwstacksize, lpstartaddress, lpparameter, dwcreationflags, lpthreadid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_system_threading_CreateThreadpool(void* reserved) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_threading_CreateThreadpoolCleanupGroup(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolCleanupGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_threading_CreateThreadpoolIo(void* fl, void* pfnio, void* pv, void* pcbe) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolIo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fl, pfnio, pv, pcbe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fl;
    (void)pfnio;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_threading_CreateThreadpoolTimer(void* pfnti, void* pv, void* pcbe) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfnti, pv, pcbe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfnti;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_threading_CreateThreadpoolWait(void* pfnwa, void* pv, void* pcbe) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolWait");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfnwa, pv, pcbe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfnwa;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_system_threading_CreateThreadpoolWork(void* pfnwk, void* pv, void* pcbe) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolWork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfnwk, pv, pcbe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfnwk;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_CreateTimerQueue(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTimerQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateTimerQueueTimer(void* phnewtimer, void* timerqueue, void* callback, void* parameter, uint32_t duetime, uint32_t period, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTimerQueueTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phnewtimer, timerqueue, callback, parameter, duetime, period, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phnewtimer;
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateUmsCompletionList(void* umscompletionlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUmsCompletionList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umscompletionlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umscompletionlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_CreateUmsThreadContext(void* lpumsthread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUmsThreadContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpumsthread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpumsthread;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_CreateWaitableTimerA(void* lptimerattributes, int32_t bmanualreset, void* lptimername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimerattributes, bmanualreset, lptimername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateWaitableTimerExA(void* lptimerattributes, void* lptimername, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimerattributes, lptimername, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateWaitableTimerExW(void* lptimerattributes, void* lptimername, uint32_t dwflags, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimerattributes, lptimername, dwflags, dwdesiredaccess);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_CreateWaitableTimerW(void* lptimerattributes, int32_t bmanualreset, void* lptimername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptimerattributes, bmanualreset, lptimername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssys_windows_win32_system_threading_DeleteBoundaryDescriptor(void* boundarydescriptor) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteBoundaryDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(boundarydescriptor);
        return;
    }
    errno = ENOSYS;
#else
    (void)boundarydescriptor;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_DeleteCriticalSection(void* lpcriticalsection) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteCriticalSection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpcriticalsection);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_DeleteFiber(void* lpfiber) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFiber");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpfiber);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpfiber;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_DeleteProcThreadAttributeList(void* lpattributelist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProcThreadAttributeList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpattributelist);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpattributelist;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_DeleteSynchronizationBarrier(void* lpbarrier) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSynchronizationBarrier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbarrier);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbarrier;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_DeleteTimerQueue(void* timerqueue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteTimerQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerqueue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerqueue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_DeleteTimerQueueEx(void* timerqueue, void* completionevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteTimerQueueEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerqueue, completionevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerqueue;
    (void)completionevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_DeleteTimerQueueTimer(void* timerqueue, void* timer, void* completionevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteTimerQueueTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerqueue, timer, completionevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerqueue;
    (void)timer;
    (void)completionevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_DeleteUmsCompletionList(void* umscompletionlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUmsCompletionList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umscompletionlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umscompletionlist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_DeleteUmsThreadContext(void* umsthread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUmsThreadContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umsthread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umsthread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_DequeueUmsCompletionListItems(void* umscompletionlist, uint32_t waittimeout, void* umsthreadlist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DequeueUmsCompletionListItems");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umscompletionlist, waittimeout, umsthreadlist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umscompletionlist;
    (void)waittimeout;
    (void)umsthreadlist;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_DisassociateCurrentThreadFromCallback(int64_t pci) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisassociateCurrentThreadFromCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pci);
        return;
    }
    errno = ENOSYS;
#else
    (void)pci;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_EnterCriticalSection(void* lpcriticalsection) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterCriticalSection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpcriticalsection);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_EnterSynchronizationBarrier(void* lpbarrier, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterSynchronizationBarrier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbarrier, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbarrier;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_EnterUmsSchedulingMode(void* schedulerstartupinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterUmsSchedulingMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(schedulerstartupinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)schedulerstartupinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_ExecuteUmsThread(void* umsthread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExecuteUmsThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umsthread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umsthread;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_ExitProcess(uint32_t uexitcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExitProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uexitcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)uexitcode;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_ExitThread(uint32_t dwexitcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExitThread");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwexitcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwexitcode;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_threading_FlsAlloc(void* lpcallback) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsAlloc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcallback);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcallback;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_FlsFree(uint32_t dwflsindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflsindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflsindex;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_FlsGetValue(uint32_t dwflsindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsGetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflsindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwflsindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_FlsSetValue(uint32_t dwflsindex, void* lpflsdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsSetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflsindex, lpflsdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflsindex;
    (void)lpflsdata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_FlushProcessWriteBuffers(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushProcessWriteBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_FreeLibraryWhenCallbackReturns(int64_t pci, void* mod) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeLibraryWhenCallbackReturns");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pci, mod);
        return;
    }
    errno = ENOSYS;
#else
    (void)pci;
    (void)mod;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetActiveProcessorCount(uint16_t groupnumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveProcessorCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)groupnumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_threading_GetActiveProcessorGroupCount(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveProcessorGroupCount");
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

void* windowssys_windows_win32_system_threading_GetCurrentProcess(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetCurrentProcessId(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessId");
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

uint32_t windowssys_windows_win32_system_threading_GetCurrentProcessorNumber(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessorNumber");
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

void windowssys_windows_win32_system_threading_GetCurrentProcessorNumberEx(void* procnumber) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessorNumberEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(procnumber);
        return;
    }
    errno = ENOSYS;
#else
    (void)procnumber;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_threading_GetCurrentThread(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetCurrentThreadId(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadId");
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

void windowssys_windows_win32_system_threading_GetCurrentThreadStackLimits(void* lowlimit, void* highlimit) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadStackLimits");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lowlimit, highlimit);
        return;
    }
    errno = ENOSYS;
#else
    (void)lowlimit;
    (void)highlimit;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_threading_GetCurrentUmsThread(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentUmsThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetExitCodeProcess(void* hprocess, void* lpexitcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExitCodeProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpexitcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpexitcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetExitCodeThread(void* hthread, void* lpexitcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExitCodeThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpexitcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpexitcode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetGuiResources(void* hprocess, uint32_t uiflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuiResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, uiflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)uiflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetMachineTypeAttributes(uint16_t machine, void* machinetypeattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMachineTypeAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machine, machinetypeattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)machine;
    (void)machinetypeattributes;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetMaximumProcessorCount(uint16_t groupnumber) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMaximumProcessorCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupnumber);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)groupnumber;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_threading_GetMaximumProcessorGroupCount(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMaximumProcessorGroupCount");
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

void* windowssys_windows_win32_system_threading_GetNextUmsListItem(void* umscontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextUmsListItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umscontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)umscontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNode(uint8_t node, void* availablebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaAvailableMemoryNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(node, availablebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)node;
    (void)availablebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaAvailableMemoryNodeEx(uint16_t node, void* availablebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaAvailableMemoryNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(node, availablebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)node;
    (void)availablebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaHighestNodeNumber(void* highestnodenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaHighestNodeNumber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(highestnodenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)highestnodenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaNodeNumberFromHandle(void* hfile, void* nodenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeNumberFromHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, nodenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)nodenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask(uint8_t node, void* processormask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeProcessorMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(node, processormask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)node;
    (void)processormask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaNodeProcessorMask2(uint16_t nodenumber, void* processormasks, uint16_t processormaskcount, void* requiredmaskcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeProcessorMask2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nodenumber, processormasks, processormaskcount, requiredmaskcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nodenumber;
    (void)processormasks;
    (void)processormaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaNodeProcessorMaskEx(uint16_t node, void* processormask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeProcessorMaskEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(node, processormask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)node;
    (void)processormask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaProcessorNode(uint8_t processor, void* nodenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProcessorNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processor, nodenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processor;
    (void)nodenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaProcessorNodeEx(void* processor, void* nodenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProcessorNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processor, nodenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processor;
    (void)nodenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaProximityNode(uint32_t proximityid, void* nodenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProximityNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proximityid, nodenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proximityid;
    (void)nodenumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetNumaProximityNodeEx(uint32_t proximityid, void* nodenumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProximityNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(proximityid, nodenumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)proximityid;
    (void)nodenumber;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetPriorityClass(void* hprocess) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPriorityClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessAffinityMask(void* hprocess, void* lpprocessaffinitymask, void* lpsystemaffinitymask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessAffinityMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpprocessaffinitymask, lpsystemaffinitymask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpprocessaffinitymask;
    (void)lpsystemaffinitymask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessDEPPolicy(void* hprocess, void* lpflags, void* lppermanent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDEPPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpflags, lppermanent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpflags;
    (void)lppermanent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessDefaultCpuSetMasks(void* process, void* cpusetmasks, uint16_t cpusetmaskcount, void* requiredmaskcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDefaultCpuSetMasks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, cpusetmasks, cpusetmaskcount, requiredmaskcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessDefaultCpuSets(void* process, void* cpusetids, uint32_t cpusetidcount, void* requiredidcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDefaultCpuSets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, cpusetids, cpusetidcount, requiredidcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessGroupAffinity(void* hprocess, void* groupcount, void* grouparray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessGroupAffinity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, groupcount, grouparray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)groupcount;
    (void)grouparray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessHandleCount(void* hprocess, void* pdwhandlecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHandleCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pdwhandlecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pdwhandlecount;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_GetProcessHandleFromHwnd(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHandleFromHwnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetProcessId(void* process) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)process;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetProcessIdOfThread(void* thread) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessIdOfThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)thread;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessInformation(void* hprocess, int32_t processinformationclass, void* processinformation, uint32_t processinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, processinformationclass, processinformation, processinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessIoCounters(void* hprocess, void* lpiocounters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessIoCounters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpiocounters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpiocounters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessMitigationPolicy(void* hprocess, int32_t mitigationpolicy, void* lpbuffer, uint64_t dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessMitigationPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, mitigationpolicy, lpbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessPriorityBoost(void* hprocess, void* pdisablepriorityboost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessPriorityBoost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pdisablepriorityboost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pdisablepriorityboost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessShutdownParameters(void* lpdwlevel, void* lpdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessShutdownParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwlevel, lpdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwlevel;
    (void)lpdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessTimes(void* hprocess, void* lpcreationtime, void* lpexittime, void* lpkerneltime, void* lpusertime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessTimes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpcreationtime, lpexittime, lpkerneltime, lpusertime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetProcessVersion(uint32_t processid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetProcessWorkingSetSize(void* hprocess, void* lpminimumworkingsetsize, void* lpmaximumworkingsetsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessWorkingSetSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpminimumworkingsetsize, lpmaximumworkingsetsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpminimumworkingsetsize;
    (void)lpmaximumworkingsetsize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_GetStartupInfoA(void* lpstartupinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStartupInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpstartupinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpstartupinfo;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_GetStartupInfoW(void* lpstartupinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStartupInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpstartupinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpstartupinfo;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetSystemTimes(void* lpidletime, void* lpkerneltime, void* lpusertime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpidletime, lpkerneltime, lpusertime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpidletime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadDescription(void* hthread, void* ppszthreaddescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, ppszthreaddescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)ppszthreaddescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadGroupAffinity(void* hthread, void* groupaffinity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadGroupAffinity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, groupaffinity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)groupaffinity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadIOPendingFlag(void* hthread, void* lpioispending) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadIOPendingFlag");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpioispending);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpioispending;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_GetThreadId(void* thread) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)thread;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadIdealProcessorEx(void* hthread, void* lpidealprocessor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadIdealProcessorEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpidealprocessor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpidealprocessor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadInformation(void* hthread, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, threadinformationclass, threadinformation, threadinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadPriority(void* hthread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadPriorityBoost(void* hthread, void* pdisablepriorityboost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadPriorityBoost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, pdisablepriorityboost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)pdisablepriorityboost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadSelectedCpuSetMasks(void* thread, void* cpusetmasks, uint16_t cpusetmaskcount, void* requiredmaskcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadSelectedCpuSetMasks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, cpusetmasks, cpusetmaskcount, requiredmaskcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadSelectedCpuSets(void* thread, void* cpusetids, uint32_t cpusetidcount, void* requiredidcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadSelectedCpuSets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, cpusetids, cpusetidcount, requiredidcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetThreadTimes(void* hthread, void* lpcreationtime, void* lpexittime, void* lpkerneltime, void* lpusertime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadTimes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpcreationtime, lpexittime, lpkerneltime, lpusertime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetUmsCompletionListEvent(void* umscompletionlist, void* umscompletionevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUmsCompletionListEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umscompletionlist, umscompletionevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umscompletionlist;
    (void)umscompletionevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_GetUmsSystemThreadInformation(void* threadhandle, void* systemthreadinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUmsSystemThreadInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, systemthreadinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)systemthreadinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_InitOnceBeginInitialize(void* lpinitonce, uint32_t dwflags, void* fpending, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceBeginInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpinitonce, dwflags, fpending, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)fpending;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_InitOnceComplete(void* lpinitonce, uint32_t dwflags, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpinitonce, dwflags, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_InitOnceExecuteOnce(void* initonce, void* initfn, void* parameter, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceExecuteOnce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(initonce, initfn, parameter, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)initonce;
    (void)initfn;
    (void)parameter;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_InitOnceInitialize(void* initonce) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(initonce);
        return;
    }
    errno = ENOSYS;
#else
    (void)initonce;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_InitializeConditionVariable(void* conditionvariable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeConditionVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(conditionvariable);
        return;
    }
    errno = ENOSYS;
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_InitializeCriticalSection(void* lpcriticalsection) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeCriticalSection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpcriticalsection);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_InitializeCriticalSectionAndSpinCount(void* lpcriticalsection, uint32_t dwspincount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeCriticalSectionAndSpinCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcriticalsection, dwspincount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_InitializeCriticalSectionEx(void* lpcriticalsection, uint32_t dwspincount, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeCriticalSectionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcriticalsection, dwspincount, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_InitializeProcThreadAttributeList(void* lpattributelist, uint32_t dwattributecount, uint32_t dwflags, void* lpsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeProcThreadAttributeList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpattributelist, dwattributecount, dwflags, lpsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpattributelist;
    (void)dwattributecount;
    (void)dwflags;
    (void)lpsize;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_InitializeSListHead(void* listhead) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSListHead");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(listhead);
        return;
    }
    errno = ENOSYS;
#else
    (void)listhead;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_InitializeSRWLock(void* srwlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSRWLock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(srwlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_InitializeSynchronizationBarrier(void* lpbarrier, int32_t ltotalthreads, int32_t lspincount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSynchronizationBarrier");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpbarrier, ltotalthreads, lspincount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpbarrier;
    (void)ltotalthreads;
    (void)lspincount;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_InterlockedFlushSList(void* listhead) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedFlushSList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_InterlockedPopEntrySList(void* listhead) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedPopEntrySList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_InterlockedPushEntrySList(void* listhead, void* listentry) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedPushEntrySList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead, listentry);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    (void)listentry;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_InterlockedPushListSListEx(void* listhead, void* list, void* listend, uint32_t count) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedPushListSListEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead, list, listend, count);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)listhead;
    (void)list;
    (void)listend;
    (void)count;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_IsImmersiveProcess(void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsImmersiveProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_IsProcessCritical(void* hprocess, void* critical) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessCritical");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, critical);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)critical;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_IsProcessorFeaturePresent(uint32_t processorfeature) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessorFeaturePresent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processorfeature);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processorfeature;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_IsThreadAFiber(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThreadAFiber");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_IsThreadpoolTimerSet(int64_t pti) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThreadpoolTimerSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pti);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pti;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_IsWow64Process(void* hprocess, void* wow64process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64Process");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, wow64process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)wow64process;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_IsWow64Process2(void* hprocess, void* pprocessmachine, void* pnativemachine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64Process2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pprocessmachine, pnativemachine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pprocessmachine;
    (void)pnativemachine;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_LeaveCriticalSection(void* lpcriticalsection) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LeaveCriticalSection");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpcriticalsection);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_LeaveCriticalSectionWhenCallbackReturns(int64_t pci, void* pcs) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LeaveCriticalSectionWhenCallbackReturns");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pci, pcs);
        return;
    }
    errno = ENOSYS;
#else
    (void)pci;
    (void)pcs;
    errno = ENOSYS;
#endif
}

void* windowssys_windows_win32_system_threading_OpenEventA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_OpenEventW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_OpenMutexW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenMutexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_OpenPrivateNamespaceA(void* lpboundarydescriptor, void* lpaliasprefix) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrivateNamespaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpboundarydescriptor, lpaliasprefix);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_OpenPrivateNamespaceW(void* lpboundarydescriptor, void* lpaliasprefix) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrivateNamespaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpboundarydescriptor, lpaliasprefix);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_OpenProcess(uint32_t dwdesiredaccess, int32_t binherithandle, uint32_t dwprocessid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, dwprocessid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwprocessid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_OpenProcessToken(void* processhandle, uint32_t desiredaccess, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenProcessToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, desiredaccess, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_OpenSemaphoreW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSemaphoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lpname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_OpenThread(uint32_t dwdesiredaccess, int32_t binherithandle, uint32_t dwthreadid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, dwthreadid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwthreadid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_OpenThreadToken(void* threadhandle, uint32_t desiredaccess, int32_t openasself, void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThreadToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, desiredaccess, openasself, tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_OpenWaitableTimerA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lptimername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWaitableTimerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lptimername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_threading_OpenWaitableTimerW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lptimername) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWaitableTimerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, binherithandle, lptimername);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_PulseEvent(void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PulseEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_system_threading_QueryDepthSList(void* listhead) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDepthSList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(listhead);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)listhead;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_QueryFullProcessImageNameA(void* hprocess, uint32_t dwflags, void* lpexename, void* lpdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryFullProcessImageNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwflags, lpexename, lpdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_QueryFullProcessImageNameW(void* hprocess, uint32_t dwflags, void* lpexename, void* lpdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryFullProcessImageNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwflags, lpexename, lpdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_QueryProcessAffinityUpdateMode(void* hprocess, void* lpdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryProcessAffinityUpdateMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_QueryProtectedPolicy(void* policyguid, void* policyvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryProtectedPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyguid, policyvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyguid;
    (void)policyvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_QueryThreadpoolStackInformation(int64_t ptpp, void* ptpsi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryThreadpoolStackInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptpp, ptpsi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptpp;
    (void)ptpsi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_QueryUmsThreadInformation(void* umsthread, int32_t umsthreadinfoclass, void* umsthreadinformation, uint32_t umsthreadinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUmsThreadInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_QueueUserWorkItem(void* function, void* context, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueueUserWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(function, context, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)function;
    (void)context;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RegisterWaitForSingleObject(void* phnewwaitobject, void* hobject, void* callback, void* context, uint32_t dwmilliseconds, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWaitForSingleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phnewwaitobject, hobject, callback, context, dwmilliseconds, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phnewwaitobject;
    (void)hobject;
    (void)callback;
    (void)context;
    (void)dwmilliseconds;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_ReleaseMutex(void* hmutex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseMutex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmutex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmutex;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_ReleaseMutexWhenCallbackReturns(int64_t pci, void* mut) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseMutexWhenCallbackReturns");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pci, mut);
        return;
    }
    errno = ENOSYS;
#else
    (void)pci;
    (void)mut;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_ReleaseSRWLockExclusive(void* srwlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSRWLockExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(srwlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_ReleaseSRWLockShared(void* srwlock) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSRWLockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(srwlock);
        return;
    }
    errno = ENOSYS;
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_ReleaseSemaphore(void* hsemaphore, int32_t lreleasecount, void* lppreviouscount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSemaphore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsemaphore, lreleasecount, lppreviouscount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsemaphore;
    (void)lreleasecount;
    (void)lppreviouscount;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_ReleaseSemaphoreWhenCallbackReturns(int64_t pci, void* sem, uint32_t crel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSemaphoreWhenCallbackReturns");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pci, sem, crel);
        return;
    }
    errno = ENOSYS;
#else
    (void)pci;
    (void)sem;
    (void)crel;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_ResetEvent(void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_ResumeThread(void* hthread) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hthread;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqAddPeriodicCallback(void* callback, void* context, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqAddPeriodicCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, context, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)context;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqAllocateSerialWorkQueue(uint32_t workqueueidin, void* workqueueidout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqAllocateSerialWorkQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueidin, workqueueidout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueidin;
    (void)workqueueidout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqAllocateWorkQueue(int32_t workqueuetype, void* workqueueid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqAllocateWorkQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueuetype, workqueueid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueuetype;
    (void)workqueueid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqBeginRegisterWorkQueueWithMMCSS(uint32_t workqueueid, void* usageclass, uint32_t dwtaskid, int32_t lpriority, void* donecallback, void* donestate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqBeginRegisterWorkQueueWithMMCSS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, usageclass, dwtaskid, lpriority, donecallback, donestate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)usageclass;
    (void)dwtaskid;
    (void)lpriority;
    (void)donecallback;
    (void)donestate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqBeginUnregisterWorkQueueWithMMCSS(uint32_t workqueueid, void* donecallback, void* donestate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqBeginUnregisterWorkQueueWithMMCSS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, donecallback, donestate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)donecallback;
    (void)donestate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqCancelDeadline(void* prequest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqCancelDeadline");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prequest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqCancelWorkItem(uint64_t key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqCancelWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqCreateAsyncResult(void* appobject, void* callback, void* appstate, void* asyncresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqCreateAsyncResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(appobject, callback, appstate, asyncresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)appobject;
    (void)callback;
    (void)appstate;
    (void)asyncresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqEndRegisterWorkQueueWithMMCSS(void* result, void* taskid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqEndRegisterWorkQueueWithMMCSS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result, taskid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    (void)taskid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSClass(uint32_t workqueueid, void* usageclass, void* usageclasslength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, usageclass, usageclasslength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)usageclass;
    (void)usageclasslength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSPriority(uint32_t workqueueid, void* priority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, priority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)priority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqGetWorkQueueMMCSSTaskId(uint32_t workqueueid, void* taskid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSTaskId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, taskid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)taskid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqInvokeCallback(void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqInvokeCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqJoinWorkQueue(uint32_t workqueueid, void* hfile, void* out) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqJoinWorkQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, hfile, out);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)hfile;
    (void)out;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqLockPlatform(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqLockPlatform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqLockSharedWorkQueue(void* usageclass, int32_t basepriority, void* taskid, void* id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqLockSharedWorkQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(usageclass, basepriority, taskid, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)usageclass;
    (void)basepriority;
    (void)taskid;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqLockWorkQueue(uint32_t workqueueid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqLockWorkQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqPutWaitingWorkItem(void* hevent, int32_t lpriority, void* result, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqPutWaitingWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent, lpriority, result, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    (void)lpriority;
    (void)result;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqPutWorkItem(uint32_t dwqueue, int32_t lpriority, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqPutWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwqueue, lpriority, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwqueue;
    (void)lpriority;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqRegisterPlatformEvents(void* platformevents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqRegisterPlatformEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(platformevents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)platformevents;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqRegisterPlatformWithMMCSS(void* usageclass, void* taskid, int32_t lpriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqRegisterPlatformWithMMCSS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(usageclass, taskid, lpriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)usageclass;
    (void)taskid;
    (void)lpriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqRemovePeriodicCallback(uint32_t dwkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqRemovePeriodicCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqScheduleWorkItem(void* result, int64_t timeout, void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqScheduleWorkItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(result, timeout, key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)result;
    (void)timeout;
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqSetDeadline(uint32_t workqueueid, int64_t deadlineinhns, void* prequest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqSetDeadline");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, deadlineinhns, prequest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)prequest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqSetDeadline2(uint32_t workqueueid, int64_t deadlineinhns, int64_t predeadlineinhns, void* prequest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqSetDeadline2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, deadlineinhns, predeadlineinhns, prequest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)predeadlineinhns;
    (void)prequest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqSetLongRunning(uint32_t workqueueid, int32_t enable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqSetLongRunning");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, enable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)enable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqShutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqStartup(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqStartup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqUnjoinWorkQueue(uint32_t workqueueid, void* hfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnjoinWorkQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid, hfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    (void)hfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqUnlockPlatform(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnlockPlatform");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqUnlockWorkQueue(uint32_t workqueueid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnlockWorkQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(workqueueid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)workqueueid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqUnregisterPlatformEvents(void* platformevents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnregisterPlatformEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(platformevents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)platformevents;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_RtwqUnregisterPlatformFromMMCSS(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnregisterPlatformFromMMCSS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_SetCriticalSectionSpinCount(void* lpcriticalsection, uint32_t dwspincount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCriticalSectionSpinCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcriticalsection, dwspincount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetEvent(void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_SetEventWhenCallbackReturns(int64_t pci, void* evt) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEventWhenCallbackReturns");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pci, evt);
        return;
    }
    errno = ENOSYS;
#else
    (void)pci;
    (void)evt;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetPriorityClass(void* hprocess, uint32_t dwpriorityclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPriorityClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwpriorityclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwpriorityclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessAffinityMask(void* hprocess, uint64_t dwprocessaffinitymask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessAffinityMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwprocessaffinitymask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwprocessaffinitymask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessAffinityUpdateMode(void* hprocess, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessAffinityUpdateMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessDEPPolicy(uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDEPPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessDefaultCpuSetMasks(void* process, void* cpusetmasks, uint16_t cpusetmaskcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDefaultCpuSetMasks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, cpusetmasks, cpusetmaskcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessDefaultCpuSets(void* process, void* cpusetids, uint32_t cpusetidcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDefaultCpuSets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, cpusetids, cpusetidcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessDynamicEHContinuationTargets(void* process, uint16_t numberoftargets, void* targets) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDynamicEHContinuationTargets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, numberoftargets, targets);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)numberoftargets;
    (void)targets;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessDynamicEnforcedCetCompatibleRanges(void* process, uint16_t numberofranges, void* ranges) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDynamicEnforcedCetCompatibleRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, numberofranges, ranges);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)numberofranges;
    (void)ranges;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessInformation(void* hprocess, int32_t processinformationclass, void* processinformation, uint32_t processinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, processinformationclass, processinformation, processinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessMitigationPolicy(int32_t mitigationpolicy, void* lpbuffer, uint64_t dwlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessMitigationPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mitigationpolicy, lpbuffer, dwlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessPriorityBoost(void* hprocess, int32_t bdisablepriorityboost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessPriorityBoost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, bdisablepriorityboost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)bdisablepriorityboost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessRestrictionExemption(int32_t fenableexemption) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessRestrictionExemption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fenableexemption);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fenableexemption;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessShutdownParameters(uint32_t dwlevel, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessShutdownParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwlevel, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwlevel;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProcessWorkingSetSize(void* hprocess, uint64_t dwminimumworkingsetsize, uint64_t dwmaximumworkingsetsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessWorkingSetSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwminimumworkingsetsize, dwmaximumworkingsetsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwminimumworkingsetsize;
    (void)dwmaximumworkingsetsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetProtectedPolicy(void* policyguid, uint64_t policyvalue, void* oldpolicyvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProtectedPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(policyguid, policyvalue, oldpolicyvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)policyguid;
    (void)policyvalue;
    (void)oldpolicyvalue;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_system_threading_SetThreadAffinityMask(void* hthread, uint64_t dwthreadaffinitymask) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadAffinityMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, dwthreadaffinitymask);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hthread;
    (void)dwthreadaffinitymask;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadDescription(void* hthread, void* lpthreaddescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpthreaddescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpthreaddescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadGroupAffinity(void* hthread, void* groupaffinity, void* previousgroupaffinity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadGroupAffinity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, groupaffinity, previousgroupaffinity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)groupaffinity;
    (void)previousgroupaffinity;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_SetThreadIdealProcessor(void* hthread, uint32_t dwidealprocessor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadIdealProcessor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, dwidealprocessor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hthread;
    (void)dwidealprocessor;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadIdealProcessorEx(void* hthread, void* lpidealprocessor, void* lppreviousidealprocessor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadIdealProcessorEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpidealprocessor, lppreviousidealprocessor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpidealprocessor;
    (void)lppreviousidealprocessor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadInformation(void* hthread, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, threadinformationclass, threadinformation, threadinformationsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadPriority(void* hthread, int32_t npriority) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadPriority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, npriority);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)npriority;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadPriorityBoost(void* hthread, int32_t bdisablepriorityboost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadPriorityBoost");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, bdisablepriorityboost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)bdisablepriorityboost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadSelectedCpuSetMasks(void* thread, void* cpusetmasks, uint16_t cpusetmaskcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadSelectedCpuSetMasks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, cpusetmasks, cpusetmaskcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadSelectedCpuSets(void* thread, void* cpusetids, uint32_t cpusetidcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadSelectedCpuSets");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, cpusetids, cpusetidcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadStackGuarantee(void* stacksizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadStackGuarantee");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(stacksizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)stacksizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadToken(void* thread, void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thread, token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thread;
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadpoolStackInformation(int64_t ptpp, void* ptpsi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolStackInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptpp, ptpsi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptpp;
    (void)ptpsi;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_SetThreadpoolThreadMaximum(int64_t ptpp, uint32_t cthrdmost) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolThreadMaximum");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(ptpp, cthrdmost);
        return;
    }
    errno = ENOSYS;
#else
    (void)ptpp;
    (void)cthrdmost;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadpoolThreadMinimum(int64_t ptpp, uint32_t cthrdmic) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolThreadMinimum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptpp, cthrdmic);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptpp;
    (void)cthrdmic;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_SetThreadpoolTimer(int64_t pti, void* pftduetime, uint32_t msperiod, uint32_t mswindowlength) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pti, pftduetime, msperiod, mswindowlength);
        return;
    }
    errno = ENOSYS;
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadpoolTimerEx(int64_t pti, void* pftduetime, uint32_t msperiod, uint32_t mswindowlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolTimerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pti, pftduetime, msperiod, mswindowlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_SetThreadpoolWait(int64_t pwa, void* h, void* pfttimeout) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolWait");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwa, h, pfttimeout);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetThreadpoolWaitEx(int64_t pwa, void* h, void* pfttimeout, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolWaitEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwa, h, pfttimeout, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_SetTimerQueueTimer(void* timerqueue, void* callback, void* parameter, uint32_t duetime, uint32_t period, int32_t preferio) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTimerQueueTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerqueue, callback, parameter, duetime, period, preferio);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)preferio;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetUmsThreadInformation(void* umsthread, int32_t umsthreadinfoclass, void* umsthreadinformation, uint32_t umsthreadinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUmsThreadInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umsthread, umsthreadinfoclass, umsthreadinformation, umsthreadinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetWaitableTimer(void* htimer, void* lpduetime, int32_t lperiod, void* pfncompletionroutine, void* lpargtocompletionroutine, int32_t fresume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWaitableTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htimer, lpduetime, lperiod, pfncompletionroutine, lpargtocompletionroutine, fresume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)fresume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SetWaitableTimerEx(void* htimer, void* lpduetime, int32_t lperiod, void* pfncompletionroutine, void* lpargtocompletionroutine, void* wakecontext, uint32_t tolerabledelay) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWaitableTimerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htimer, lpduetime, lperiod, pfncompletionroutine, lpargtocompletionroutine, wakecontext, tolerabledelay);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)wakecontext;
    (void)tolerabledelay;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_SignalObjectAndWait(void* hobjecttosignal, void* hobjecttowaiton, uint32_t dwmilliseconds, int32_t balertable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignalObjectAndWait");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobjecttosignal, hobjecttowaiton, dwmilliseconds, balertable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hobjecttosignal;
    (void)hobjecttowaiton;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_threading_Sleep(uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Sleep");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwmilliseconds);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwmilliseconds;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_SleepConditionVariableCS(void* conditionvariable, void* criticalsection, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SleepConditionVariableCS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(conditionvariable, criticalsection, dwmilliseconds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)conditionvariable;
    (void)criticalsection;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_SleepConditionVariableSRW(void* conditionvariable, void* srwlock, uint32_t dwmilliseconds, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SleepConditionVariableSRW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(conditionvariable, srwlock, dwmilliseconds, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)conditionvariable;
    (void)srwlock;
    (void)dwmilliseconds;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_SleepEx(uint32_t dwmilliseconds, int32_t balertable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SleepEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwmilliseconds, balertable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_threading_StartThreadpoolIo(int64_t pio) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartThreadpoolIo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pio);
        return;
    }
    errno = ENOSYS;
#else
    (void)pio;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_SubmitThreadpoolWork(int64_t pwk) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubmitThreadpoolWork");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwk);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwk;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_threading_SuspendThread(void* hthread) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SuspendThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hthread;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_threading_SwitchToFiber(void* lpfiber) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchToFiber");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpfiber);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpfiber;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_SwitchToThread(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchToThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_TerminateProcess(void* hprocess, uint32_t uexitcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, uexitcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)uexitcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_TerminateThread(void* hthread, uint32_t dwexitcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, dwexitcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)dwexitcode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_TlsAlloc(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsAlloc");
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

int32_t windowssys_windows_win32_system_threading_TlsFree(uint32_t dwtlsindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtlsindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtlsindex;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_threading_TlsGetValue(uint32_t dwtlsindex) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsGetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtlsindex);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwtlsindex;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_threading_TlsSetValue(uint32_t dwtlsindex, void* lptlsvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsSetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtlsindex, lptlsvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwtlsindex;
    (void)lptlsvalue;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_system_threading_TryAcquireSRWLockExclusive(void* srwlock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryAcquireSRWLockExclusive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(srwlock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)srwlock;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_system_threading_TryAcquireSRWLockShared(void* srwlock) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryAcquireSRWLockShared");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(srwlock);
    }
    errno = ENOSYS;
    return false;
#else
    (void)srwlock;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_system_threading_TryEnterCriticalSection(void* lpcriticalsection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryEnterCriticalSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcriticalsection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_TrySubmitThreadpoolCallback(void* pfns, void* pv, void* pcbe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrySubmitThreadpoolCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfns, pv, pcbe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfns;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_UmsThreadYield(void* schedulerparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UmsThreadYield");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(schedulerparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)schedulerparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_UnregisterWait(void* waithandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterWait");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(waithandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)waithandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_UnregisterWaitEx(void* waithandle, void* completionevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterWaitEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(waithandle, completionevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)waithandle;
    (void)completionevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_threading_UpdateProcThreadAttribute(void* lpattributelist, uint32_t dwflags, uint64_t attribute, void* lpvalue, uint64_t cbsize, void* lppreviousvalue, void* lpreturnsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateProcThreadAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpattributelist, dwflags, attribute, lpvalue, cbsize, lppreviousvalue, lpreturnsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpattributelist;
    (void)dwflags;
    (void)attribute;
    (void)lpvalue;
    (void)cbsize;
    (void)lppreviousvalue;
    (void)lpreturnsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_threading_WaitForInputIdle(void* hprocess, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForInputIdle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwmilliseconds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_threading_WaitForMultipleObjects(uint32_t ncount, void* lphandles, int32_t bwaitall, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForMultipleObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ncount, lphandles, bwaitall, dwmilliseconds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_threading_WaitForMultipleObjectsEx(uint32_t ncount, void* lphandles, int32_t bwaitall, uint32_t dwmilliseconds, int32_t balertable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForMultipleObjectsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ncount, lphandles, bwaitall, dwmilliseconds, balertable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_threading_WaitForSingleObject(void* hhandle, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForSingleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhandle, dwmilliseconds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hhandle;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_threading_WaitForSingleObjectEx(void* hhandle, uint32_t dwmilliseconds, int32_t balertable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForSingleObjectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhandle, dwmilliseconds, balertable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hhandle;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_threading_WaitForThreadpoolIoCallbacks(int64_t pio, int32_t fcancelpendingcallbacks) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolIoCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pio, fcancelpendingcallbacks);
        return;
    }
    errno = ENOSYS;
#else
    (void)pio;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_WaitForThreadpoolTimerCallbacks(int64_t pti, int32_t fcancelpendingcallbacks) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolTimerCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pti, fcancelpendingcallbacks);
        return;
    }
    errno = ENOSYS;
#else
    (void)pti;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_WaitForThreadpoolWaitCallbacks(int64_t pwa, int32_t fcancelpendingcallbacks) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolWaitCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwa, fcancelpendingcallbacks);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwa;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_WaitForThreadpoolWorkCallbacks(int64_t pwk, int32_t fcancelpendingcallbacks) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolWorkCallbacks");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwk, fcancelpendingcallbacks);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwk;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_threading_WaitOnAddress(void* address, void* compareaddress, uint64_t addresssize, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitOnAddress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, compareaddress, addresssize, dwmilliseconds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    (void)compareaddress;
    (void)addresssize;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_threading_WakeAllConditionVariable(void* conditionvariable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeAllConditionVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(conditionvariable);
        return;
    }
    errno = ENOSYS;
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_WakeByAddressAll(void* address) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeByAddressAll");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(address);
        return;
    }
    errno = ENOSYS;
#else
    (void)address;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_WakeByAddressSingle(void* address) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeByAddressSingle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(address);
        return;
    }
    errno = ENOSYS;
#else
    (void)address;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_threading_WakeConditionVariable(void* conditionvariable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeConditionVariable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(conditionvariable);
        return;
    }
    errno = ENOSYS;
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_threading_WinExec(void* lpcmdline, uint32_t ucmdshow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinExec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcmdline, ucmdshow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcmdline;
    (void)ucmdshow;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_system_threading_Wow64SetThreadDefaultGuestMachine(uint16_t machine) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64SetThreadDefaultGuestMachine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)machine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_threading_Wow64SuspendThread(void* hthread) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64SuspendThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hthread;
    errno = ENOSYS;
    return 0;
#endif
}

