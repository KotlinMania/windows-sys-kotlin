#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_wdk_system_registry_wrapper.h"
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

int32_t windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(void* transactionhandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCommitRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* disposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, titleindex, arg4Class, createoptions, disposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)disposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* transactionhandle, void* disposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateKeyTransacted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, titleindex, arg4Class, createoptions, transactionhandle, disposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)transactionhandle;
    (void)disposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes, createoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)createoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtDeleteKey(void* keyhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtDeleteValueKey(void* keyhandle, void* valuename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valuename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valuename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtEnumerateKey(void* keyhandle, uint32_t arg1Index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtEnumerateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, arg1Index, keyinformationclass, keyinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(void* keyhandle, uint32_t arg1Index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtEnumerateValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, arg1Index, keyvalueinformationclass, keyvalueinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtFlushKey(void* keyhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(void* masterkeyhandle, uint32_t count, void* subordinateobjects, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t completionfilter, bool watchtree, void* buffer, uint32_t buffersize, bool asynchronous) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtNotifyChangeMultipleKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(masterkeyhandle, count, subordinateobjects, event, apcroutine, apccontext, iostatusblock, completionfilter, watchtree, buffer, buffersize, asynchronous);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)masterkeyhandle;
    (void)count;
    (void)subordinateobjects;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)completionfilter;
    (void)watchtree;
    (void)buffer;
    (void)buffersize;
    (void)asynchronous;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, openoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKeyTransacted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKeyTransactedEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, openoptions, transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, keyinformationclass, keyinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryMultipleValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valueentries, entrycount, valuebuffer, bufferlength, requiredbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valueentries;
    (void)entrycount;
    (void)valuebuffer;
    (void)bufferlength;
    (void)requiredbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valuename, keyvalueinformationclass, keyvalueinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valuename;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtRenameKey(void* keyhandle, void* newname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRenameKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, newname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)newname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtRestoreKey(void* keyhandle, void* filehandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRestoreKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, filehandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)filehandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(void* transactionhandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRollbackRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtSaveKey(void* keyhandle, void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSaveKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSaveKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, filehandle, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)filehandle;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, keysetinformationclass, keysetinformation, keysetinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)keysetinformationclass;
    (void)keysetinformation;
    (void)keysetinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryNtSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valuename, titleindex, type, data, datasize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valuename;
    (void)titleindex;
    (void)type;
    (void)data;
    (void)datasize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(void* transactionhandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCommitRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwCreateKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* disposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, titleindex, arg4Class, createoptions, disposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)disposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t titleindex, void* arg4Class, uint32_t createoptions, void* transactionhandle, void* disposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateKeyTransacted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, titleindex, arg4Class, createoptions, transactionhandle, disposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)transactionhandle;
    (void)disposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes, uint32_t createoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes, createoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)createoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwDeleteKey(void* keyhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwDeleteValueKey(void* keyhandle, void* valuename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valuename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valuename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwEnumerateKey(void* keyhandle, uint32_t arg1Index, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwEnumerateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, arg1Index, keyinformationclass, keyinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(void* keyhandle, uint32_t arg1Index, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwEnumerateValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, arg1Index, keyvalueinformationclass, keyvalueinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwFlushKey(void* keyhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(void* masterkeyhandle, uint32_t count, void* subordinateobjects, void* event, void* apcroutine, void* apccontext, void* iostatusblock, uint32_t completionfilter, bool watchtree, void* buffer, uint32_t buffersize, bool asynchronous) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwNotifyChangeMultipleKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(masterkeyhandle, count, subordinateobjects, event, apcroutine, apccontext, iostatusblock, completionfilter, watchtree, buffer, buffersize, asynchronous);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)masterkeyhandle;
    (void)count;
    (void)subordinateobjects;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)completionfilter;
    (void)watchtree;
    (void)buffer;
    (void)buffersize;
    (void)asynchronous;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwOpenKey(void* keyhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwOpenKeyEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, openoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(void* keyhandle, uint32_t desiredaccess, void* objectattributes, void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKeyTransacted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(void* keyhandle, uint32_t desiredaccess, void* objectattributes, uint32_t openoptions, void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKeyTransactedEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, desiredaccess, objectattributes, openoptions, transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(void* transactionhandle, uint32_t desiredaccess, void* objectattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, desiredaccess, objectattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwQueryKey(void* keyhandle, int32_t keyinformationclass, void* keyinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, keyinformationclass, keyinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(void* keyhandle, void* valueentries, uint32_t entrycount, void* valuebuffer, void* bufferlength, void* requiredbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryMultipleValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valueentries, entrycount, valuebuffer, bufferlength, requiredbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valueentries;
    (void)entrycount;
    (void)valuebuffer;
    (void)bufferlength;
    (void)requiredbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwQueryValueKey(void* keyhandle, void* valuename, int32_t keyvalueinformationclass, void* keyvalueinformation, uint32_t length, void* resultlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valuename, keyvalueinformationclass, keyvalueinformation, length, resultlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valuename;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwRenameKey(void* keyhandle, void* newname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRenameKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, newname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)newname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwRestoreKey(void* keyhandle, void* filehandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRestoreKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, filehandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)filehandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(void* transactionhandle, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRollbackRegistryTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwSaveKey(void* keyhandle, void* filehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSaveKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, filehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)filehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwSaveKeyEx(void* keyhandle, void* filehandle, uint32_t format) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSaveKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, filehandle, format);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)filehandle;
    (void)format;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwSetInformationKey(void* keyhandle, int32_t keysetinformationclass, void* keysetinformation, uint32_t keysetinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, keysetinformationclass, keysetinformation, keysetinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)keysetinformationclass;
    (void)keysetinformation;
    (void)keysetinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWdkSystemRegistryZwSetValueKey(void* keyhandle, void* valuename, uint32_t titleindex, uint32_t type, void* data, uint32_t datasize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetValueKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keyhandle, valuename, titleindex, type, data, datasize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keyhandle;
    (void)valuename;
    (void)titleindex;
    (void)type;
    (void)data;
    (void)datasize;
    errno = ENOSYS;
    return -1;
#endif
}

