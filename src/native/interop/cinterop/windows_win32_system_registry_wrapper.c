#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_registry_wrapper.h"
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

uint32_t windowssys_windows_win32_system_registry_GetRegistryValueWithFallbackW(void* hkeyprimary, void* pwszprimarysubkey, void* hkeyfallback, void* pwszfallbacksubkey, void* pwszvalue, uint32_t dwflags, void* pdwtype, void* pvdata, uint32_t cbdatain, void* pcbdataout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-state-helpers-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegistryValueWithFallbackW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyprimary, pwszprimarysubkey, hkeyfallback, pwszfallbacksubkey, pwszvalue, dwflags, pdwtype, pvdata, cbdatain, pcbdataout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyprimary;
    (void)pwszprimarysubkey;
    (void)hkeyfallback;
    (void)pwszfallbacksubkey;
    (void)pwszvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)cbdatain;
    (void)pcbdataout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCloseKey(void* hkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCloseKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegConnectRegistryA(void* lpmachinename, void* hkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_registry_RegConnectRegistryExA(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, flags, phkresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)flags;
    (void)phkresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_registry_RegConnectRegistryExW(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, flags, phkresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)flags;
    (void)phkresult;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegConnectRegistryW(void* lpmachinename, void* hkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCopyTreeA(void* hkeysrc, void* lpsubkey, void* hkeydest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCopyTreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeysrc, lpsubkey, hkeydest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeysrc;
    (void)lpsubkey;
    (void)hkeydest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCopyTreeW(void* hkeysrc, void* lpsubkey, void* hkeydest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCopyTreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeysrc, lpsubkey, hkeydest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeysrc;
    (void)lpsubkey;
    (void)hkeydest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCreateKeyA(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCreateKeyExA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCreateKeyExW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCreateKeyTransactedA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCreateKeyTransactedW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegCreateKeyW(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyA(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyExA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyExW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyTransactedA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved, htransaction, pextendedparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    (void)htransaction;
    (void)pextendedparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyTransactedW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved, htransaction, pextendedparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    (void)htransaction;
    (void)pextendedparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteKeyW(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteTreeA(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteTreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteTreeW(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteTreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteValueA(void* hkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDeleteValueW(void* hkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegDisablePredefinedCache(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisablePredefinedCache");
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

uint32_t windowssys_windows_win32_system_registry_RegDisablePredefinedCacheEx(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisablePredefinedCacheEx");
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

uint32_t windowssys_windows_win32_system_registry_RegDisableReflectionKey(void* hbase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisableReflectionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hbase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegEnableReflectionKey(void* hbase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnableReflectionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hbase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegEnumKeyA(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, cchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegEnumKeyExA(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)lpcchname;
    (void)lpreserved;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegEnumKeyExW(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)lpcchname;
    (void)lpreserved;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegEnumKeyW(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, cchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegEnumValueA(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcchvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegEnumValueW(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcchvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegFlushKey(void* hkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegFlushKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegGetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, securityinformation, psecuritydescriptor, lpcbsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegGetValueA(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvalue, dwflags, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegGetValueW(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvalue, dwflags, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegLoadAppKeyA(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadAppKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfile, phkresult, samdesired, dwoptions, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfile;
    (void)phkresult;
    (void)samdesired;
    (void)dwoptions;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegLoadAppKeyW(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadAppKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfile, phkresult, samdesired, dwoptions, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfile;
    (void)phkresult;
    (void)samdesired;
    (void)dwoptions;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegLoadKeyA(void* hkey, void* lpsubkey, void* lpfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegLoadKeyW(void* hkey, void* lpsubkey, void* lpfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegLoadMUIStringA(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadMUIStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszvalue, pszoutbuf, cboutbuf, pcbdata, flags, pszdirectory);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pszoutbuf;
    (void)cboutbuf;
    (void)pcbdata;
    (void)flags;
    (void)pszdirectory;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegLoadMUIStringW(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadMUIStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszvalue, pszoutbuf, cboutbuf, pcbdata, flags, pszdirectory);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pszoutbuf;
    (void)cboutbuf;
    (void)pcbdata;
    (void)flags;
    (void)pszdirectory;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegNotifyChangeKeyValue(void* hkey, int32_t bwatchsubtree, uint32_t dwnotifyfilter, void* hevent, int32_t fasynchronous) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegNotifyChangeKeyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, bwatchsubtree, dwnotifyfilter, hevent, fasynchronous);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    (void)hevent;
    (void)fasynchronous;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenCurrentUser(uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenCurrentUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenKeyA(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenKeyExA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenKeyExW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenKeyTransactedA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenKeyTransactedW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenKeyW(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOpenUserClassesRoot(void* htoken, uint32_t dwoptions, uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenUserClassesRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, dwoptions, samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htoken;
    (void)dwoptions;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegOverridePredefKey(void* hkey, void* hnewhkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOverridePredefKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, hnewhkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)hnewhkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryInfoKeyA(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryInfoKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpreserved;
    (void)lpcsubkeys;
    (void)lpcbmaxsubkeylen;
    (void)lpcbmaxclasslen;
    (void)lpcvalues;
    (void)lpcbmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryInfoKeyW(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryInfoKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpreserved;
    (void)lpcsubkeys;
    (void)lpcbmaxsubkeylen;
    (void)lpcbmaxclasslen;
    (void)lpcvalues;
    (void)lpcbmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryMultipleValuesA(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryMultipleValuesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, val_list, num_vals, lpvaluebuf, ldwtotsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)val_list;
    (void)num_vals;
    (void)lpvaluebuf;
    (void)ldwtotsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryMultipleValuesW(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryMultipleValuesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, val_list, num_vals, lpvaluebuf, ldwtotsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)val_list;
    (void)num_vals;
    (void)lpvaluebuf;
    (void)ldwtotsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryReflectionKey(void* hbase, void* bisreflectiondisabled) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryReflectionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbase, bisreflectiondisabled);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hbase;
    (void)bisreflectiondisabled;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryValueA(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryValueExA(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryValueExW(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegQueryValueW(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegRenameKey(void* hkey, void* lpsubkeyname, void* lpnewkeyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRenameKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkeyname, lpnewkeyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkeyname;
    (void)lpnewkeyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegReplaceKeyA(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegReplaceKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpnewfile, lpoldfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpnewfile;
    (void)lpoldfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegReplaceKeyW(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegReplaceKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpnewfile, lpoldfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpnewfile;
    (void)lpoldfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegRestoreKeyA(void* hkey, void* lpfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegRestoreKeyW(void* hkey, void* lpfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSaveKeyA(void* hkey, void* lpfile, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSaveKeyExA(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSaveKeyExW(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSaveKeyW(void* hkey, void* lpfile, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSetKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeyValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSetKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeyValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSetValueA(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSetValueExA(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, reserved, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSetValueExW(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, reserved, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegSetValueW(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegUnLoadKeyA(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegUnLoadKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_RegUnLoadKeyW(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegUnLoadKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

