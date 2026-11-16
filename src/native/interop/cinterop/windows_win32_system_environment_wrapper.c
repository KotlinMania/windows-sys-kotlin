#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_environment_wrapper.h"
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

int32_t windowssysWindowsWin32SystemEnvironmentCallEnclave(int64_t lproutine, void* lpparameter, int32_t fwaitforthread, void* lpreturnvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallEnclave");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lproutine, lpparameter, fwaitforthread, lpreturnvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lproutine;
    (void)lpparameter;
    (void)fwaitforthread;
    (void)lpreturnvalue;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemEnvironmentCreateEnclave(void* hprocess, void* lpaddress, uint64_t dwsize, uint64_t dwinitialcommitment, uint32_t flenclavetype, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnclave");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, dwsize, dwinitialcommitment, flenclavetype, lpenclaveinformation, dwinfolength, lpenclaveerror);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)dwsize;
    (void)dwinitialcommitment;
    (void)flenclavetype;
    (void)lpenclaveinformation;
    (void)dwinfolength;
    (void)lpenclaveerror;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentCreateEnvironmentBlock(void* lpenvironment, void* htoken, int32_t binherit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnvironmentBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenvironment, htoken, binherit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpenvironment;
    (void)htoken;
    (void)binherit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentDeleteEnclave(void* lpaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-enclave-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteEnclave");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentDestroyEnvironmentBlock(void* lpenvironment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyEnvironmentBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenvironment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpenvironment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentEnclaveGetAttestationReport(void* enclavedata, void* report, uint32_t buffersize, void* outputsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveGetAttestationReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enclavedata, report, buffersize, outputsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enclavedata;
    (void)report;
    (void)buffersize;
    (void)outputsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentEnclaveGetEnclaveInformation(uint32_t informationsize, void* enclaveinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveGetEnclaveInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(informationsize, enclaveinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)informationsize;
    (void)enclaveinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentEnclaveSealData(void* datatoencrypt, uint32_t datatoencryptsize, int32_t identitypolicy, uint32_t runtimepolicy, void* protectedblob, uint32_t buffersize, void* protectedblobsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveSealData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(datatoencrypt, datatoencryptsize, identitypolicy, runtimepolicy, protectedblob, buffersize, protectedblobsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)datatoencrypt;
    (void)datatoencryptsize;
    (void)identitypolicy;
    (void)runtimepolicy;
    (void)protectedblob;
    (void)buffersize;
    (void)protectedblobsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentEnclaveUnsealData(void* protectedblob, uint32_t protectedblobsize, void* decrypteddata, uint32_t buffersize, void* decrypteddatasize, void* sealingidentity, void* unsealingflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveUnsealData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(protectedblob, protectedblobsize, decrypteddata, buffersize, decrypteddatasize, sealingidentity, unsealingflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)protectedblob;
    (void)protectedblobsize;
    (void)decrypteddata;
    (void)buffersize;
    (void)decrypteddatasize;
    (void)sealingidentity;
    (void)unsealingflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentEnclaveVerifyAttestationReport(uint32_t enclavetype, void* report, uint32_t reportsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnclaveVerifyAttestationReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enclavetype, report, reportsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enclavetype;
    (void)report;
    (void)reportsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsA(void* lpsrc, void* lpdst, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsrc, lpdst, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsrc;
    (void)lpdst;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserA(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsForUserA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpsrc, lpdest, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpsrc;
    (void)lpdest;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsForUserW(void* htoken, void* lpsrc, void* lpdest, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsForUserW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, lpsrc, lpdest, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    (void)lpsrc;
    (void)lpdest;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemEnvironmentExpandEnvironmentStringsW(void* lpsrc, void* lpdst, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandEnvironmentStringsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsrc, lpdst, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsrc;
    (void)lpdst;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsA(void* penv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEnvironmentStringsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(penv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)penv;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentFreeEnvironmentStringsW(void* penv) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEnvironmentStringsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(penv);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)penv;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemEnvironmentGetCommandLineA(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommandLineA");
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

void* windowssysWindowsWin32SystemEnvironmentGetCommandLineW(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCommandLineW");
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

uint32_t windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryA(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemEnvironmentGetCurrentDirectoryW(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemEnvironmentGetEnvironmentStrings(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentStrings");
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

void* windowssysWindowsWin32SystemEnvironmentGetEnvironmentStringsW(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentStringsW");
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

uint32_t windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableA(void* lpname, void* lpbuffer, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentVariableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemEnvironmentGetEnvironmentVariableW(void* lpname, void* lpbuffer, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnvironmentVariableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentInitializeEnclave(void* hprocess, void* lpaddress, void* lpenclaveinformation, uint32_t dwinfolength, void* lpenclaveerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeEnclave");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, lpenclaveinformation, dwinfolength, lpenclaveerror);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpaddress;
    (void)lpenclaveinformation;
    (void)dwinfolength;
    (void)lpenclaveerror;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentIsEnclaveTypeSupported(uint32_t flenclavetype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsEnclaveTypeSupported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flenclavetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flenclavetype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentLoadEnclaveData(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t nsize, uint32_t flprotect, void* lppageinformation, uint32_t dwinfolength, void* lpnumberofbyteswritten, void* lpenclaveerror) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadEnclaveData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpaddress, lpbuffer, nsize, flprotect, lppageinformation, dwinfolength, lpnumberofbyteswritten, lpenclaveerror);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageA(void* lpenclaveaddress, void* lpimagename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-enclave-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadEnclaveImageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenclaveaddress, lpimagename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpenclaveaddress;
    (void)lpimagename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentLoadEnclaveImageW(void* lpenclaveaddress, void* lpimagename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-enclave-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadEnclaveImageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenclaveaddress, lpimagename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpenclaveaddress;
    (void)lpimagename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathA(void* exename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedCurrentDirectoryForExePathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentNeedCurrentDirectoryForExePathW(void* exename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NeedCurrentDirectoryForExePathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryA(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentSetCurrentDirectoryW(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentSetEnvironmentStringsW(void* newenvironment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentStringsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(newenvironment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)newenvironment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableA(void* lpname, void* lpvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentVariableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentSetEnvironmentVariableW(void* lpname, void* lpvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnvironmentVariableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemEnvironmentTerminateEnclave(void* lpaddress, int32_t fwait) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("vertdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateEnclave");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpaddress, fwait);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpaddress;
    (void)fwait;
    errno = ENOSYS;
    return -1;
#endif
}

