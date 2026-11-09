#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_credentials_wrapper.h"
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

int32_t windowssys_windows_win32_security_credentials_CredDeleteA(void* targetname, uint32_t type, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredDeleteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, type, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredDeleteW(void* targetname, uint32_t type, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredDeleteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, type, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredEnumerateA(void* filter, uint32_t flags, void* count, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredEnumerateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, flags, count, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredEnumerateW(void* filter, uint32_t flags, void* count, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredEnumerateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filter, flags, count, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredFindBestCredentialA(void* targetname, uint32_t type, uint32_t flags, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFindBestCredentialA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, type, flags, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredFindBestCredentialW(void* targetname, uint32_t type, uint32_t flags, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFindBestCredentialW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, type, flags, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_credentials_CredFree(void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredGetSessionTypes(uint32_t maximumpersistcount, void* maximumpersist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetSessionTypes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(maximumpersistcount, maximumpersist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)maximumpersistcount;
    (void)maximumpersist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredGetTargetInfoA(void* targetname, uint32_t flags, void* targetinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetTargetInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, flags, targetinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredGetTargetInfoW(void* targetname, uint32_t flags, void* targetinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetTargetInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, flags, targetinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialA(void* marshaledcredential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsMarshaledCredentialA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(marshaledcredential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)marshaledcredential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredIsMarshaledCredentialW(void* marshaledcredential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsMarshaledCredentialW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(marshaledcredential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)marshaledcredential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredIsProtectedA(void* pszprotectedcredentials, void* pprotectiontype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsProtectedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprotectedcredentials, pprotectiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredIsProtectedW(void* pszprotectedcredentials, void* pprotectiontype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsProtectedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszprotectedcredentials, pprotectiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredMarshalCredentialA(int32_t credtype, void* credential, void* marshaledcredential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalCredentialA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(credtype, credential, marshaledcredential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredMarshalCredentialW(int32_t credtype, void* credential, void* marshaledcredential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalCredentialW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(credtype, credential, marshaledcredential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferA(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredPackAuthenticationBufferA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredPackAuthenticationBufferW(uint32_t dwflags, void* pszusername, void* pszpassword, void* ppackedcredentials, void* pcbpackedcredentials) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredPackAuthenticationBufferW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pszusername, pszpassword, ppackedcredentials, pcbpackedcredentials);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredProtectA(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredProtectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fasself, pszcredentials, cchcredentials, pszprotectedcredentials, pcchmaxchars, protectiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredProtectW(int32_t fasself, void* pszcredentials, uint32_t cchcredentials, void* pszprotectedcredentials, void* pcchmaxchars, void* protectiontype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredProtectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fasself, pszcredentials, cchcredentials, pszprotectedcredentials, pcchmaxchars, protectiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredReadA(void* targetname, uint32_t type, uint32_t flags, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, type, flags, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredReadDomainCredentialsA(void* targetinfo, uint32_t flags, void* count, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadDomainCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetinfo, flags, count, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredReadDomainCredentialsW(void* targetinfo, uint32_t flags, void* count, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadDomainCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetinfo, flags, count, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredReadW(void* targetname, uint32_t type, uint32_t flags, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetname, type, flags, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredRenameA(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredRenameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldtargetname, newtargetname, type, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredRenameW(void* oldtargetname, void* newtargetname, uint32_t type, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredRenameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldtargetname, newtargetname, type, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsA(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, pcontext, dwautherror, username, uluserbuffersize, pszpassword, ulpasswordbuffersize, pfsave, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)username;
    (void)uluserbuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUICmdLinePromptForCredentialsW(void* psztargetname, void* pcontext, uint32_t dwautherror, void* username, uint32_t uluserbuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* pfsave, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, pcontext, dwautherror, username, uluserbuffersize, pszpassword, ulpasswordbuffersize, pfsave, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)username;
    (void)uluserbuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsA(void* psztargetname, int32_t bconfirm) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIConfirmCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, bconfirm);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psztargetname;
    (void)bconfirm;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIConfirmCredentialsW(void* psztargetname, int32_t bconfirm) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIConfirmCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psztargetname, bconfirm);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psztargetname;
    (void)bconfirm;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIParseUserNameA(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIParseUserNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(username, user, userbuffersize, domain, domainbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIParseUserNameW(void* username, void* user, uint32_t userbuffersize, void* domain, uint32_t domainbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIParseUserNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(username, user, userbuffersize, domain, domainbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsA(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puiinfo, psztargetname, pcontext, dwautherror, pszusername, ulusernamebuffersize, pszpassword, ulpasswordbuffersize, save, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puiinfo;
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)pszusername;
    (void)ulusernamebuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)save;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForCredentialsW(void* puiinfo, void* psztargetname, void* pcontext, uint32_t dwautherror, void* pszusername, uint32_t ulusernamebuffersize, void* pszpassword, uint32_t ulpasswordbuffersize, void* save, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puiinfo, psztargetname, pcontext, dwautherror, pszusername, ulusernamebuffersize, pszpassword, ulpasswordbuffersize, save, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puiinfo;
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)pszusername;
    (void)ulusernamebuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)save;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsA(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puiinfo, dwautherror, pulauthpackage, pvinauthbuffer, ulinauthbuffersize, ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puiinfo;
    (void)dwautherror;
    (void)pulauthpackage;
    (void)pvinauthbuffer;
    (void)ulinauthbuffersize;
    (void)ppvoutauthbuffer;
    (void)puloutauthbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIPromptForWindowsCredentialsW(void* puiinfo, uint32_t dwautherror, void* pulauthpackage, void* pvinauthbuffer, uint32_t ulinauthbuffersize, void* ppvoutauthbuffer, void* puloutauthbuffersize, void* pfsave, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puiinfo, dwautherror, pulauthpackage, pvinauthbuffer, ulinauthbuffersize, ppvoutauthbuffer, puloutauthbuffersize, pfsave, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puiinfo;
    (void)dwautherror;
    (void)pulauthpackage;
    (void)pvinauthbuffer;
    (void)ulinauthbuffersize;
    (void)ppvoutauthbuffer;
    (void)puloutauthbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIReadSSOCredW(void* pszrealm, void* ppszusername) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIReadSSOCredW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrealm, ppszusername);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszrealm;
    (void)ppszusername;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_security_credentials_CredUIStoreSSOCredW(void* pszrealm, void* pszusername, void* pszpassword, int32_t bpersist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIStoreSSOCredW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszrealm, pszusername, pszpassword, bpersist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszrealm;
    (void)pszusername;
    (void)pszpassword;
    (void)bpersist;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferA(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchlmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pauthbuffer, cbauthbuffer, pszusername, pcchlmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)pszusername;
    (void)pcchlmaxusername;
    (void)pszdomainname;
    (void)pcchmaxdomainname;
    (void)pszpassword;
    (void)pcchmaxpassword;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredUnPackAuthenticationBufferW(uint32_t dwflags, void* pauthbuffer, uint32_t cbauthbuffer, void* pszusername, void* pcchmaxusername, void* pszdomainname, void* pcchmaxdomainname, void* pszpassword, void* pcchmaxpassword) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, pauthbuffer, cbauthbuffer, pszusername, pcchmaxusername, pszdomainname, pcchmaxdomainname, pszpassword, pcchmaxpassword);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)pszusername;
    (void)pcchmaxusername;
    (void)pszdomainname;
    (void)pcchmaxdomainname;
    (void)pszpassword;
    (void)pcchmaxpassword;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredUnmarshalCredentialA(void* marshaledcredential, void* credtype, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalCredentialA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(marshaledcredential, credtype, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredUnmarshalCredentialW(void* marshaledcredential, void* credtype, void* credential) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalCredentialW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(marshaledcredential, credtype, credential);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredUnprotectA(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnprotectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fasself, pszprotectedcredentials, cchprotectedcredentials, pszcredentials, pcchmaxchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredUnprotectW(int32_t fasself, void* pszprotectedcredentials, uint32_t cchprotectedcredentials, void* pszcredentials, void* pcchmaxchars) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnprotectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fasself, pszprotectedcredentials, cchprotectedcredentials, pszcredentials, pcchmaxchars);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredWriteA(void* credential, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(credential, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsA(void* targetinfo, void* credential, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteDomainCredentialsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetinfo, credential, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredWriteDomainCredentialsW(void* targetinfo, void* credential, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteDomainCredentialsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(targetinfo, credential, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_CredWriteW(void* credential, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(credential, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_GetOpenCardNameA(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenCardNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_GetOpenCardNameW(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenCardNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_credentials_KeyCredentialManagerFreeInformation(void* keycredentialmanagerinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerFreeInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(keycredentialmanagerinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)keycredentialmanagerinfo;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_credentials_KeyCredentialManagerGetInformation(void* keycredentialmanagerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerGetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keycredentialmanagerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keycredentialmanagerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_KeyCredentialManagerGetOperationErrorStates(int32_t keycredentialmanageroperationtype, void* isready, void* keycredentialmanageroperationerrorstates) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerGetOperationErrorStates");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(keycredentialmanageroperationtype, isready, keycredentialmanageroperationerrorstates);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)keycredentialmanageroperationtype;
    (void)isready;
    (void)keycredentialmanageroperationerrorstates;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_KeyCredentialManagerShowUIOperation(void* hwndowner, int32_t keycredentialmanageroperationtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerShowUIOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndowner, keycredentialmanageroperationtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndowner;
    (void)keycredentialmanageroperationtype;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_credentials_SCardAccessStartedEvent(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAccessStartedEvent");
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

int32_t windowssys_windows_win32_security_credentials_SCardAddReaderToGroupA(uint64_t hcontext, void* szreadername, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAddReaderToGroupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardAddReaderToGroupW(uint64_t hcontext, void* szreadername, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAddReaderToGroupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardAudit(uint64_t hcontext, uint32_t dwevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAudit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, dwevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)dwevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardBeginTransaction(uint64_t hcard) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardBeginTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardCancel(uint64_t hcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardConnectA(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardConnectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreader, dwsharemode, dwpreferredprotocols, phcard, pdwactiveprotocol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardConnectW(uint64_t hcontext, void* szreader, uint32_t dwsharemode, uint32_t dwpreferredprotocols, void* phcard, void* pdwactiveprotocol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardConnectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreader, dwsharemode, dwpreferredprotocols, phcard, pdwactiveprotocol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardControl(uint64_t hcard, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardDisconnect(uint64_t hcard, uint32_t dwdisposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, dwdisposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)dwdisposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardDlgExtendedError(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardDlgExtendedError");
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

int32_t windowssys_windows_win32_security_credentials_SCardEndTransaction(uint64_t hcard, uint32_t dwdisposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardEndTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, dwdisposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)dwdisposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardEstablishContext(uint32_t dwscope, void* pvreserved1, void* pvreserved2, void* phcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardEstablishContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwscope, pvreserved1, pvreserved2, phcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwscope;
    (void)pvreserved1;
    (void)pvreserved2;
    (void)phcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardForgetCardTypeA(uint64_t hcontext, void* szcardname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetCardTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardForgetCardTypeW(uint64_t hcontext, void* szcardname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetCardTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderA(uint64_t hcontext, void* szreadername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderGroupA(uint64_t hcontext, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderGroupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderGroupW(uint64_t hcontext, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderGroupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardForgetReaderW(uint64_t hcontext, void* szreadername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardFreeMemory(uint64_t hcontext, void* pvmem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, pvmem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)pvmem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, void* pcbattrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetAttrib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, dwattrid, pbattr, pcbattrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)pcbattrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider, pcchprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider, void* pcchprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider, pcchprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdA(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, pdwdevicetypeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetDeviceTypeIdW(uint64_t hcontext, void* szreadername, void* pdwdevicetypeid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, pdwdevicetypeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetProviderIdA(uint64_t hcontext, void* szcard, void* pguidproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetProviderIdA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcard, pguidproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetProviderIdW(uint64_t hcontext, void* szcard, void* pguidproviderid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetProviderIdW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcard, pguidproviderid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdA(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szdeviceinstanceid, pcchdeviceinstanceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetReaderDeviceInstanceIdW(uint64_t hcontext, void* szreadername, void* szdeviceinstanceid, void* pcchdeviceinstanceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szdeviceinstanceid, pcchdeviceinstanceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetReaderIconA(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, pbicon, pcbicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetReaderIconW(uint64_t hcontext, void* szreadername, void* pbicon, void* pcbicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, pbicon, pcbicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetStatusChangeA(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetStatusChangeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, dwtimeout, rgreaderstates, creaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetStatusChangeW(uint64_t hcontext, uint32_t dwtimeout, void* rgreaderstates, uint32_t creaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetStatusChangeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, dwtimeout, rgreaderstates, creaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardGetTransmitCount(uint64_t hcard, void* pctransmitcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetTransmitCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, pctransmitcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)pctransmitcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeA(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceCardTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount, pbatr, pbatrmask, cbatrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardIntroduceCardTypeW(uint64_t hcontext, void* szcardname, void* pguidprimaryprovider, void* rgguidinterfaces, uint32_t dwinterfacecount, void* pbatr, void* pbatrmask, uint32_t cbatrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceCardTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname, pguidprimaryprovider, rgguidinterfaces, dwinterfacecount, pbatr, pbatrmask, cbatrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderA(uint64_t hcontext, void* szreadername, void* szdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupA(uint64_t hcontext, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderGroupW(uint64_t hcontext, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardIntroduceReaderW(uint64_t hcontext, void* szreadername, void* szdevicename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szdevicename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardIsValidContext(uint64_t hcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIsValidContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListCardsA(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListCardsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, pbatr, rgquidinterfaces, cguidinterfacecount, mszcards, pcchcards);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListCardsW(uint64_t hcontext, void* pbatr, void* rgquidinterfaces, uint32_t cguidinterfacecount, void* mszcards, void* pcchcards) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListCardsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, pbatr, rgquidinterfaces, cguidinterfacecount, mszcards, pcchcards);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListInterfacesA(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListInterfacesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcard, pguidinterfaces, pcguidinterfaces);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListInterfacesW(uint64_t hcontext, void* szcard, void* pguidinterfaces, void* pcguidinterfaces) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListInterfacesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcard, pguidinterfaces, pcguidinterfaces);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListReaderGroupsA(uint64_t hcontext, void* mszgroups, void* pcchgroups) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReaderGroupsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, mszgroups, pcchgroups);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListReaderGroupsW(uint64_t hcontext, void* mszgroups, void* pcchgroups) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReaderGroupsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, mszgroups, pcchgroups);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListReadersA(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, mszgroups, mszreaders, pcchreaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListReadersW(uint64_t hcontext, void* mszgroups, void* mszreaders, void* pcchreaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, mszgroups, mszreaders, pcchreaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdA(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szdeviceinstanceid, mszreaders, pcchreaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardListReadersWithDeviceInstanceIdW(uint64_t hcontext, void* szdeviceinstanceid, void* mszreaders, void* pcchreaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szdeviceinstanceid, mszreaders, pcchreaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsA(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, mszcards, rgreaderstates, creaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsByATRA(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsByATRA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, rgatrmasks, catrs, rgreaderstates, creaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsByATRW(uint64_t hcontext, void* rgatrmasks, uint32_t catrs, void* rgreaderstates, uint32_t creaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsByATRW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, rgatrmasks, catrs, rgreaderstates, creaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardLocateCardsW(uint64_t hcontext, void* mszcards, void* rgreaderstates, uint32_t creaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, mszcards, rgreaderstates, creaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardReadCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReadCacheA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardReadCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, void* datalen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReadCacheW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardReconnect(uint64_t hcard, uint32_t dwsharemode, uint32_t dwpreferredprotocols, uint32_t dwinitialization, void* pdwactiveprotocol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, dwsharemode, dwpreferredprotocols, dwinitialization, pdwactiveprotocol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)dwinitialization;
    (void)pdwactiveprotocol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardReleaseContext(uint64_t hcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReleaseContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_credentials_SCardReleaseStartedEvent(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReleaseStartedEvent");
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

int32_t windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupA(uint64_t hcontext, void* szreadername, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardRemoveReaderFromGroupW(uint64_t hcontext, void* szreadername, void* szgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szreadername, szgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardSetAttrib(uint64_t hcard, uint32_t dwattrid, void* pbattr, uint32_t cbattrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetAttrib");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, dwattrid, pbattr, cbattrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)cbattrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameA(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardSetCardTypeProviderNameW(uint64_t hcontext, void* szcardname, uint32_t dwproviderid, void* szprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, szcardname, dwproviderid, szprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardState(uint64_t hcard, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, pdwstate, pdwprotocol, pbatr, pcbatrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardStatusA(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardStatusW(uint64_t hcard, void* mszreadernames, void* pcchreaderlen, void* pdwstate, void* pdwprotocol, void* pbatr, void* pcbatrlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, mszreadernames, pcchreaderlen, pdwstate, pdwprotocol, pbatr, pcbatrlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardTransmit(uint64_t hcard, void* piosendpci, void* pbsendbuffer, uint32_t cbsendlength, void* piorecvpci, void* pbrecvbuffer, void* pcbrecvlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardTransmit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcard, piosendpci, pbsendbuffer, cbsendlength, piorecvpci, pbrecvbuffer, pcbrecvlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcard;
    (void)piosendpci;
    (void)pbsendbuffer;
    (void)cbsendlength;
    (void)piorecvpci;
    (void)pbrecvbuffer;
    (void)pcbrecvlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardA(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardUIDlgSelectCardA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardUIDlgSelectCardW(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardUIDlgSelectCardW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardWriteCacheA(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardWriteCacheA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_credentials_SCardWriteCacheW(uint64_t hcontext, void* cardidentifier, uint32_t freshnesscounter, void* lookupname, void* data, uint32_t datalen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardWriteCacheW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcontext, cardidentifier, freshnesscounter, lookupname, data, datalen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    return -1;
#endif
}

