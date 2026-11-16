#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_system_threading_wrapper.h"
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

int32_t windowssysWindowsWdkSystemThreadingNtCancelTimer(void* timerhandle, void* currentstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCancelTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, currentstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)currentstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, desiredaccess, objectattributes, timertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)timertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, desiredaccess, objectattributes, clientid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)clientid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, processinformationclass, processinformation, processinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, threadinformationclass, threadinformation, threadinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, threadinformationclass, threadinformation, threadinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtSetTimer(void* timerhandle, void* duetime, void* timerapcroutine, void* timercontext, bool resumetimer, int32_t period, void* previousstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, duetime, timerapcroutine, timercontext, resumetimer, period, previousstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)duetime;
    (void)timerapcroutine;
    (void)timercontext;
    (void)resumetimer;
    (void)period;
    (void)previousstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetTimerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, timersetinformationclass, timersetinformation, timersetinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)timersetinformationclass;
    (void)timersetinformation;
    (void)timersetinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtTerminateProcess(void* processhandle, int32_t exitstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtTerminateProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, exitstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)exitstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(void* handle, bool alertable, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtWaitForSingleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, alertable, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)alertable;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwCancelTimer(void* timerhandle, void* currentstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCancelTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, currentstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)currentstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, desiredaccess, objectattributes, timertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)timertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, desiredaccess, objectattributes, clientid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)clientid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, processinformationclass, processinformation, processinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, threadinformationclass, threadinformation, threadinformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle, threadinformationclass, threadinformation, threadinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwSetTimer(void* timerhandle, void* duetime, void* timerapcroutine, void* timercontext, bool resumetimer, int32_t period, void* previousstate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, duetime, timerapcroutine, timercontext, resumetimer, period, previousstate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)duetime;
    (void)timerapcroutine;
    (void)timercontext;
    (void)resumetimer;
    (void)period;
    (void)previousstate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetTimerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timerhandle, timersetinformationclass, timersetinformation, timersetinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timerhandle;
    (void)timersetinformationclass;
    (void)timersetinformation;
    (void)timersetinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwTerminateProcess(void* processhandle, int32_t exitstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwTerminateProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, exitstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)exitstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(void* handle, bool alertable, void* timeout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwWaitForSingleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, alertable, timeout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)alertable;
    (void)timeout;
    errno = ENOSYS;
    return -1;
#endif
}

