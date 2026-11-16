#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_biometricframework_wrapper.h"
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

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioAcquireFocus(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAcquireFocus");
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

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumBiometricUnits(uint32_t frameworkhandle, uint32_t factor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncEnumBiometricUnits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(frameworkhandle, factor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)frameworkhandle;
    (void)factor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumDatabases(uint32_t frameworkhandle, uint32_t factor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncEnumDatabases");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(frameworkhandle, factor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)frameworkhandle;
    (void)factor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncEnumServiceProviders(uint32_t frameworkhandle, uint32_t factor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncEnumServiceProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(frameworkhandle, factor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)frameworkhandle;
    (void)factor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncMonitorFrameworkChanges(uint32_t frameworkhandle, uint32_t changetypes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncMonitorFrameworkChanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(frameworkhandle, changetypes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)frameworkhandle;
    (void)changetypes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenFramework(int32_t notificationmethod, void* targetwindow, uint32_t messagecode, void* callbackroutine, void* userdata, int32_t asynchronousopen, void* frameworkhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncOpenFramework");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notificationmethod, targetwindow, messagecode, callbackroutine, userdata, asynchronousopen, frameworkhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)notificationmethod;
    (void)targetwindow;
    (void)messagecode;
    (void)callbackroutine;
    (void)userdata;
    (void)asynchronousopen;
    (void)frameworkhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioAsyncOpenSession(uint32_t factor, uint32_t pooltype, uint32_t flags, void* unitarray, uint64_t unitcount, void* databaseid, int32_t notificationmethod, void* targetwindow, uint32_t messagecode, void* callbackroutine, void* userdata, int32_t asynchronousopen, void* sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, int32_t, void*, uint32_t, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioAsyncOpenSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(factor, pooltype, flags, unitarray, unitcount, databaseid, notificationmethod, targetwindow, messagecode, callbackroutine, userdata, asynchronousopen, sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)factor;
    (void)pooltype;
    (void)flags;
    (void)unitarray;
    (void)unitcount;
    (void)databaseid;
    (void)notificationmethod;
    (void)targetwindow;
    (void)messagecode;
    (void)callbackroutine;
    (void)userdata;
    (void)asynchronousopen;
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioCancel(uint32_t sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSample(uint32_t sessionhandle, uint8_t purpose, uint8_t flags, void* unitid, void* sample, void* samplesize, void* rejectdetail) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCaptureSample");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, purpose, flags, unitid, sample, samplesize, rejectdetail);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)purpose;
    (void)flags;
    (void)unitid;
    (void)sample;
    (void)samplesize;
    (void)rejectdetail;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioCaptureSampleWithCallback(uint32_t sessionhandle, uint8_t purpose, uint8_t flags, void* capturecallback, void* capturecallbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCaptureSampleWithCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, purpose, flags, capturecallback, capturecallbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)purpose;
    (void)flags;
    (void)capturecallback;
    (void)capturecallbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseFramework(uint32_t frameworkhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCloseFramework");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(frameworkhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)frameworkhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioCloseSession(uint32_t sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioCloseSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnit(uint32_t sessionhandle, uint32_t unitid, uint32_t component, uint32_t controlcode, void* sendbuffer, uint64_t sendbuffersize, void* receivebuffer, uint64_t receivebuffersize, void* receivedatasize, void* operationstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioControlUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid, component, controlcode, sendbuffer, sendbuffersize, receivebuffer, receivebuffersize, receivedatasize, operationstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)component;
    (void)controlcode;
    (void)sendbuffer;
    (void)sendbuffersize;
    (void)receivebuffer;
    (void)receivebuffersize;
    (void)receivedatasize;
    (void)operationstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioControlUnitPrivileged(uint32_t sessionhandle, uint32_t unitid, uint32_t component, uint32_t controlcode, void* sendbuffer, uint64_t sendbuffersize, void* receivebuffer, uint64_t receivebuffersize, void* receivedatasize, void* operationstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioControlUnitPrivileged");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid, component, controlcode, sendbuffer, sendbuffersize, receivebuffer, receivebuffersize, receivedatasize, operationstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)component;
    (void)controlcode;
    (void)sendbuffer;
    (void)sendbuffersize;
    (void)receivebuffer;
    (void)receivebuffersize;
    (void)receivedatasize;
    (void)operationstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioDeleteTemplate(uint32_t sessionhandle, uint32_t unitid, void* identity, uint8_t subfactor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioDeleteTemplate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid, identity, subfactor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollBegin(uint32_t sessionhandle, uint8_t subfactor, uint32_t unitid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollBegin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, subfactor, unitid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)subfactor;
    (void)unitid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCapture(uint32_t sessionhandle, void* rejectdetail) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollCapture");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, rejectdetail);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)rejectdetail;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCaptureWithCallback(uint32_t sessionhandle, void* enrollcallback, void* enrollcallbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollCaptureWithCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, enrollcallback, enrollcallbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)enrollcallback;
    (void)enrollcallbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollCommit(uint32_t sessionhandle, void* identity, void* isnewtemplate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollCommit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, identity, isnewtemplate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)isnewtemplate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollDiscard(uint32_t sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollDiscard");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnrollSelect(uint32_t sessionhandle, uint64_t selectorvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnrollSelect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, selectorvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)selectorvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumBiometricUnits(uint32_t factor, void* unitschemaarray, void* unitcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumBiometricUnits");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(factor, unitschemaarray, unitcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)factor;
    (void)unitschemaarray;
    (void)unitcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumDatabases(uint32_t factor, void* storageschemaarray, void* storagecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumDatabases");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(factor, storageschemaarray, storagecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)factor;
    (void)storageschemaarray;
    (void)storagecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumEnrollments(uint32_t sessionhandle, uint32_t unitid, void* identity, void* subfactorarray, void* subfactorcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumEnrollments");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid, identity, subfactorarray, subfactorcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactorarray;
    (void)subfactorcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioEnumServiceProviders(uint32_t factor, void* bspschemaarray, void* bspcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioEnumServiceProviders");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(factor, bspschemaarray, bspcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)factor;
    (void)bspschemaarray;
    (void)bspcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioFree(void* address) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioFree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32DevicesBiometricframeworkWinBioGetDomainLogonSetting(void* value, void* source) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetDomainLogonSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(value, source);
        return;
    }
    errno = ENOSYS;
#else
    (void)value;
    (void)source;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnabledSetting(void* value, void* source) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetEnabledSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(value, source);
        return;
    }
    errno = ENOSYS;
#else
    (void)value;
    (void)source;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioGetEnrolledFactors(void* accountowner, void* enrolledfactors) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetEnrolledFactors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accountowner, enrolledfactors);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)accountowner;
    (void)enrolledfactors;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32DevicesBiometricframeworkWinBioGetLogonSetting(void* value, void* source) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetLogonSetting");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(value, source);
        return;
    }
    errno = ENOSYS;
#else
    (void)value;
    (void)source;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioGetProperty(uint32_t sessionhandle, uint32_t propertytype, uint32_t propertyid, uint32_t unitid, void* identity, uint8_t subfactor, void* propertybuffer, void* propertybuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioGetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, propertytype, propertyid, unitid, identity, subfactor, propertybuffer, propertybuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)propertytype;
    (void)propertyid;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)propertybuffer;
    (void)propertybuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentify(uint32_t sessionhandle, void* unitid, void* identity, void* subfactor, void* rejectdetail) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioIdentify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid, identity, subfactor, rejectdetail);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)rejectdetail;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioIdentifyWithCallback(uint32_t sessionhandle, void* identifycallback, void* identifycallbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioIdentifyWithCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, identifycallback, identifycallbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)identifycallback;
    (void)identifycallbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveBegin(uint32_t sessionhandle, uint32_t unitid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioImproveBegin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioImproveEnd(uint32_t sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioImproveEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensor(uint32_t sessionhandle, void* unitid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLocateSensor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioLocateSensorWithCallback(uint32_t sessionhandle, void* locatecallback, void* locatecallbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLocateSensorWithCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, locatecallback, locatecallbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)locatecallback;
    (void)locatecallbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioLockUnit(uint32_t sessionhandle, uint32_t unitid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLockUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioLogonIdentifiedUser(uint32_t sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioLogonIdentifiedUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioMonitorPresence(uint32_t sessionhandle, uint32_t unitid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioMonitorPresence");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioOpenSession(uint32_t factor, uint32_t pooltype, uint32_t flags, void* unitarray, uint64_t unitcount, void* databaseid, void* sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioOpenSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(factor, pooltype, flags, unitarray, unitcount, databaseid, sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)factor;
    (void)pooltype;
    (void)flags;
    (void)unitarray;
    (void)unitcount;
    (void)databaseid;
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioRegisterEventMonitor(uint32_t sessionhandle, uint32_t eventmask, void* eventcallback, void* eventcallbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioRegisterEventMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, eventmask, eventcallback, eventcallbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)eventmask;
    (void)eventcallback;
    (void)eventcallbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioReleaseFocus(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioReleaseFocus");
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

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllCredentials(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioRemoveAllCredentials");
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

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioRemoveAllDomainCredentials(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioRemoveAllDomainCredentials");
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

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioSetCredential(int32_t type, void* credential, uint64_t credentialsize, int32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioSetCredential");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, credential, credentialsize, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)type;
    (void)credential;
    (void)credentialsize;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioSetProperty(uint32_t sessionhandle, uint32_t propertytype, uint32_t propertyid, uint32_t unitid, void* identity, uint8_t subfactor, void* propertybuffer, uint64_t propertybuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint8_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioSetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, propertytype, propertyid, unitid, identity, subfactor, propertybuffer, propertybuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)propertytype;
    (void)propertyid;
    (void)unitid;
    (void)identity;
    (void)subfactor;
    (void)propertybuffer;
    (void)propertybuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioUnlockUnit(uint32_t sessionhandle, uint32_t unitid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioUnlockUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, unitid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)unitid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioUnregisterEventMonitor(uint32_t sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioUnregisterEventMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioVerify(uint32_t sessionhandle, void* identity, uint8_t subfactor, void* unitid, void* match, void* rejectdetail) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint8_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioVerify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, identity, subfactor, unitid, match, rejectdetail);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)subfactor;
    (void)unitid;
    (void)match;
    (void)rejectdetail;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioVerifyWithCallback(uint32_t sessionhandle, void* identity, uint8_t subfactor, void* verifycallback, void* verifycallbackcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioVerifyWithCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle, identity, subfactor, verifycallback, verifycallbackcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    (void)identity;
    (void)subfactor;
    (void)verifycallback;
    (void)verifycallbackcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesBiometricframeworkWinBioWait(uint32_t sessionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winbio.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinBioWait");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sessionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sessionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

