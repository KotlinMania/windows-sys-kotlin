#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networkmanagement_webdav_wrapper.h"
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

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(void* connectionhandle, void* remotename, void* username, void* password, void* clientcert, uint32_t certsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavAddConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, remotename, username, password, clientcert, certsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connectionhandle;
    (void)remotename;
    (void)username;
    (void)password;
    (void)clientcert;
    (void)certsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(void* lpname, int32_t fforce) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavCancelConnectionsToServer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, fforce);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpname;
    (void)fforce;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(void* connectionhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavDeleteConnection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)connectionhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(void* hfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavFlushFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(void* hfile, void* exterror, void* exterrorstring, void* cchsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetExtendedError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, exterror, exterrorstring, cchsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)exterror;
    (void)exterrorstring;
    (void)cchsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(void* uncpath, void* url, void* lpsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetHTTPFromUNCPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncpath, url, lpsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncpath;
    (void)url;
    (void)lpsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(void* filename, void* lockownername, void* lockownernamelengthinbytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetTheLockOwnerOfTheFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, lockownername, lockownernamelengthinbytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filename;
    (void)lockownername;
    (void)lockownernamelengthinbytes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(void* url, void* uncpath, void* lpsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavGetUNCFromHTTPPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(url, uncpath, lpsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)url;
    (void)uncpath;
    (void)lpsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(void* urlname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavInvalidateCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(urlname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)urlname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(void* callback, uint32_t version) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavRegisterAuthCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, version);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)callback;
    (void)version;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(uint32_t hcallback) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("davclnt.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DavUnregisterAuthCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hcallback);
        return;
    }
    errno = ENOSYS;
#else
    (void)hcallback;
    errno = ENOSYS;
#endif
}

