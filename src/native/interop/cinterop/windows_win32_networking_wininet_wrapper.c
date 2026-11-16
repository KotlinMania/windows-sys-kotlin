#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_wininet_wrapper.h"
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

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(void* pwszmasterurl, void* pwszmanifesturl, void* pbmanifestdata, uint32_t dwmanifestdatasize, void* pbmanifestresponseheaders, uint32_t dwmanifestresponseheaderssize, void* pestate, void* phnewappcache) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCheckManifest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszmasterurl, pwszmanifesturl, pbmanifestdata, dwmanifestdatasize, pbmanifestresponseheaders, dwmanifestresponseheaderssize, pestate, phnewappcache);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszmasterurl;
    (void)pwszmanifesturl;
    (void)pbmanifestdata;
    (void)dwmanifestdatasize;
    (void)pbmanifestresponseheaders;
    (void)dwmanifestresponseheaderssize;
    (void)pestate;
    (void)phnewappcache;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(void* happcache) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(happcache);
        return;
    }
    errno = ENOSYS;
#else
    (void)happcache;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(void* happcache, void* pwszsourcefilepath, void* pwszurl, void* pbresponseheaders, uint32_t dwresponseheaderssize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheCreateAndCommitFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pwszsourcefilepath, pwszurl, pbresponseheaders, dwresponseheaderssize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pwszsourcefilepath;
    (void)pwszurl;
    (void)pbresponseheaders;
    (void)dwresponseheaderssize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(void* pwszmanifesturl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDeleteGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszmanifesturl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszmanifesturl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(void* pwszmanifesturl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDeleteIEGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszmanifesturl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszmanifesturl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(void* happcache, void* phduplicatedappcache) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheDuplicateHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, phduplicatedappcache);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)phduplicatedappcache;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheFinalize(void* happcache, void* pbmanifestdata, uint32_t dwmanifestdatasize, void* pestate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFinalize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pbmanifestdata, dwmanifestdatasize, pestate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pbmanifestdata;
    (void)dwmanifestdatasize;
    (void)pestate;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(void* pdownloadlist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFreeDownloadList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pdownloadlist);
        return;
    }
    errno = ENOSYS;
#else
    (void)pdownloadlist;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(void* pappcachegrouplist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheFreeGroupList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pappcachegrouplist);
        return;
    }
    errno = ENOSYS;
#else
    (void)pappcachegrouplist;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(void* happcache, void* pdownloadlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetDownloadList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pdownloadlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pdownloadlist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(void* happcache, void* pwszurl, void* ppwszfallbackurl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetFallbackUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pwszurl, ppwszfallbackurl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pwszurl;
    (void)ppwszfallbackurl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(void* pappcachegrouplist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetGroupList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pappcachegrouplist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pappcachegrouplist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(void* pappcachegrouplist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetIEGroupList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pappcachegrouplist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pappcachegrouplist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheGetInfo(void* happcache, void* pappcacheinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pappcacheinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pappcacheinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(void* happcache, void* ppwszmanifesturl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheGetManifestUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, ppwszmanifesturl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)ppwszmanifesturl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetAppCacheLookup(void* pwszurl, uint32_t dwflags, void* phappcache) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppCacheLookup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszurl, dwflags, phappcache);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszurl;
    (void)dwflags;
    (void)phappcache;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(void* pszchallengeinfo, void* pwszrealm, void* pwsztarget, void* pbhexhash) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMD5SSOHash");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszchallengeinfo, pwszrealm, pwsztarget, pbhexhash);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszchallengeinfo;
    (void)pwszrealm;
    (void)pwsztarget;
    (void)pbhexhash;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(void* name, void* lpcacheprefix, void* lpszcachepath, uint32_t kbcachelimit, uint32_t dwcontainertype, uint32_t dwoptions, void* pvbuffer, void* cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheContainerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, lpcacheprefix, lpszcachepath, kbcachelimit, dwcontainertype, dwoptions, pvbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)lpcacheprefix;
    (void)lpszcachepath;
    (void)kbcachelimit;
    (void)dwcontainertype;
    (void)dwoptions;
    (void)pvbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(void* name, void* lpcacheprefix, void* lpszcachepath, uint32_t kbcachelimit, uint32_t dwcontainertype, uint32_t dwoptions, void* pvbuffer, void* cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheContainerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, lpcacheprefix, lpszcachepath, kbcachelimit, dwcontainertype, dwoptions, pvbuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)lpcacheprefix;
    (void)lpszcachepath;
    (void)kbcachelimit;
    (void)dwcontainertype;
    (void)dwoptions;
    (void)pvbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(void* lpszurlname, uint32_t dwexpectedfilesize, void* lpszfileextension, void* lpszfilename, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwexpectedfilesize, lpszfileextension, lpszfilename, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(void* lpszurlname, uint32_t dwexpectedfilesize, void* lpszfileextension, void* lpszfilename, uint32_t dwreserved, int32_t fpreserveincomingfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwexpectedfilesize, lpszfileextension, lpszfilename, dwreserved, fpreserveincomingfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    (void)fpreserveincomingfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(void* lpszurlname, uint32_t dwexpectedfilesize, void* lpszfileextension, void* lpszfilename, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwexpectedfilesize, lpszfileextension, lpszfilename, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwexpectedfilesize;
    (void)lpszfileextension;
    (void)lpszfilename;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(uint32_t dwflags, void* lpreserved) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUrlCacheGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetDeleteIE3Cache(void* hwnd, void* hinst, void* lpszcmd, int32_t ncmdshow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteIE3Cache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinst, lpszcmd, ncmdshow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmd;
    (void)ncmdshow;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(void* name, uint32_t dwoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheContainerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, dwoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)dwoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(void* name, uint32_t dwoptions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheContainerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, dwoptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)name;
    (void)dwoptions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(void* lpszurlname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(void* lpszurlname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(void* lpszurlname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(int64_t groupid, uint32_t dwflags, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUrlCacheGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(groupid, dwflags, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)groupid;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(int32_t param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteWpadCacheForNetworks");
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

int32_t windowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(void* pszautoproxyurl, uint32_t cchautoproxyurl, uint32_t dwdetectflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetectAutoProxyUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszautoproxyurl, cchautoproxyurl, dwdetectflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszautoproxyurl;
    (void)cchautoproxyurl;
    (void)dwdetectflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetDoConnectoidsExist(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoConnectoidsExist");
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

int32_t windowssysWindowsWin32NetworkingWininetExportCookieFileA(void* szfilename, int32_t fappend) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportCookieFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, fappend);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    (void)fappend;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetExportCookieFileW(void* szfilename, int32_t fappend) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportCookieFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, fappend);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    (void)fappend;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindCloseUrlCache(void* henumhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindCloseUrlCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(void* pdwmodified, void* lpcontainerinfo, void* lpcbcontainerinfo, uint32_t dwoptions) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheContainerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwmodified, lpcontainerinfo, lpcbcontainerinfo, dwoptions);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pdwmodified;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    (void)dwoptions;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(void* pdwmodified, void* lpcontainerinfo, void* lpcbcontainerinfo, uint32_t dwoptions) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheContainerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwmodified, lpcontainerinfo, lpcbcontainerinfo, dwoptions);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pdwmodified;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    (void)dwoptions;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(void* lpszurlsearchpattern, void* lpfirstcacheentryinfo, void* lpcbcacheentryinfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlsearchpattern, lpfirstcacheentryinfo, lpcbcacheentryinfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszurlsearchpattern;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(void* lpszurlsearchpattern, uint32_t dwflags, uint32_t dwfilter, int64_t groupid, void* lpfirstcacheentryinfo, void* lpcbcacheentryinfo, void* lpgroupattributes, void* lpcbgroupattributes, void* lpreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlsearchpattern, dwflags, dwfilter, groupid, lpfirstcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszurlsearchpattern;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(void* lpszurlsearchpattern, uint32_t dwflags, uint32_t dwfilter, int64_t groupid, void* lpfirstcacheentryinfo, void* lpcbcacheentryinfo, void* lpgroupattributes, void* lpcbgroupattributes, void* lpreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlsearchpattern, dwflags, dwfilter, groupid, lpfirstcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszurlsearchpattern;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(void* lpszurlsearchpattern, void* lpfirstcacheentryinfo, void* lpcbcacheentryinfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlsearchpattern, lpfirstcacheentryinfo, lpcbcacheentryinfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszurlsearchpattern;
    (void)lpfirstcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(uint32_t dwflags, uint32_t dwfilter, void* lpsearchcondition, uint32_t dwsearchcondition, void* lpgroupid, void* lpreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstUrlCacheGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, dwfilter, lpsearchcondition, dwsearchcondition, lpgroupid, lpreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwflags;
    (void)dwfilter;
    (void)lpsearchcondition;
    (void)dwsearchcondition;
    (void)lpgroupid;
    (void)lpreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(void* henumhandle, void* lpcontainerinfo, void* lpcbcontainerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheContainerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle, lpcontainerinfo, lpcbcontainerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(void* henumhandle, void* lpcontainerinfo, void* lpcbcontainerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheContainerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle, lpcontainerinfo, lpcbcontainerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    (void)lpcontainerinfo;
    (void)lpcbcontainerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(void* henumhandle, void* lpnextcacheentryinfo, void* lpcbcacheentryinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(void* henumhandle, void* lpnextcacheentryinfo, void* lpcbcacheentryinfo, void* lpgroupattributes, void* lpcbgroupattributes, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(void* henumhandle, void* lpnextcacheentryinfo, void* lpcbcacheentryinfo, void* lpgroupattributes, void* lpcbgroupattributes, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo, lpgroupattributes, lpcbgroupattributes, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpgroupattributes;
    (void)lpcbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(void* henumhandle, void* lpnextcacheentryinfo, void* lpcbcacheentryinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle, lpnextcacheentryinfo, lpcbcacheentryinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    (void)lpnextcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(void* hfind, void* lpgroupid, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextUrlCacheGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind, lpgroupid, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfind;
    (void)lpgroupid;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(void* pszsymbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindP3PPolicySymbol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsymbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsymbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(void* lpszcachepath, uint32_t dwsize, uint32_t dwfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUrlCacheSpaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszcachepath, dwsize, dwfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszcachepath;
    (void)dwsize;
    (void)dwfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(void* lpszcachepath, uint32_t dwsize, uint32_t dwfilter) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeUrlCacheSpaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszcachepath, dwsize, dwfilter);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszcachepath;
    (void)dwsize;
    (void)dwfilter;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpCommandA(void* hconnect, int32_t fexpectresponse, uint32_t dwflags, void* lpszcommand, uint64_t dwcontext, void* phftpcommand) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCommandA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, fexpectresponse, dwflags, lpszcommand, dwcontext, phftpcommand);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)fexpectresponse;
    (void)dwflags;
    (void)lpszcommand;
    (void)dwcontext;
    (void)phftpcommand;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpCommandW(void* hconnect, int32_t fexpectresponse, uint32_t dwflags, void* lpszcommand, uint64_t dwcontext, void* phftpcommand) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCommandW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, fexpectresponse, dwflags, lpszcommand, dwcontext, phftpcommand);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)fexpectresponse;
    (void)dwflags;
    (void)lpszcommand;
    (void)dwcontext;
    (void)phftpcommand;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(void* hconnect, void* lpszdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCreateDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(void* hconnect, void* lpszdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpCreateDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpDeleteFileA(void* hconnect, void* lpszfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpDeleteFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpDeleteFileW(void* hconnect, void* lpszfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpDeleteFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszfilename;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(void* hconnect, void* lpszsearchfile, void* lpfindfiledata, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpFindFirstFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszsearchfile, lpfindfiledata, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszsearchfile;
    (void)lpfindfiledata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(void* hconnect, void* lpszsearchfile, void* lpfindfiledata, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpFindFirstFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszsearchfile, lpfindfiledata, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszsearchfile;
    (void)lpfindfiledata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(void* hconnect, void* lpszcurrentdirectory, void* lpdwcurrentdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetCurrentDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszcurrentdirectory, lpdwcurrentdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszcurrentdirectory;
    (void)lpdwcurrentdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(void* hconnect, void* lpszcurrentdirectory, void* lpdwcurrentdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetCurrentDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszcurrentdirectory, lpdwcurrentdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszcurrentdirectory;
    (void)lpdwcurrentdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpGetFileA(void* hconnect, void* lpszremotefile, void* lpsznewfile, int32_t ffailifexists, uint32_t dwflagsandattributes, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszremotefile, lpsznewfile, ffailifexists, dwflagsandattributes, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpGetFileEx(void* hftpsession, void* lpszremotefile, void* lpsznewfile, int32_t ffailifexists, uint32_t dwflagsandattributes, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hftpsession, lpszremotefile, lpsznewfile, ffailifexists, dwflagsandattributes, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hftpsession;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetFtpGetFileSize(void* hfile, void* lpdwfilesizehigh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpdwfilesizehigh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)lpdwfilesizehigh;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpGetFileW(void* hconnect, void* lpszremotefile, void* lpsznewfile, int32_t ffailifexists, uint32_t dwflagsandattributes, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpGetFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszremotefile, lpsznewfile, ffailifexists, dwflagsandattributes, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszremotefile;
    (void)lpsznewfile;
    (void)ffailifexists;
    (void)dwflagsandattributes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFtpOpenFileA(void* hconnect, void* lpszfilename, uint32_t dwaccess, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpOpenFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszfilename, dwaccess, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszfilename;
    (void)dwaccess;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetFtpOpenFileW(void* hconnect, void* lpszfilename, uint32_t dwaccess, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpOpenFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszfilename, dwaccess, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszfilename;
    (void)dwaccess;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpPutFileA(void* hconnect, void* lpszlocalfile, void* lpsznewremotefile, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocalfile, lpsznewremotefile, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpPutFileEx(void* hftpsession, void* lpszlocalfile, void* lpsznewremotefile, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hftpsession, lpszlocalfile, lpsznewremotefile, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hftpsession;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpPutFileW(void* hconnect, void* lpszlocalfile, void* lpsznewremotefile, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpPutFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocalfile, lpsznewremotefile, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszlocalfile;
    (void)lpsznewremotefile;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(void* hconnect, void* lpszdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRemoveDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(void* hconnect, void* lpszdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRemoveDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpRenameFileA(void* hconnect, void* lpszexisting, void* lpsznew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRenameFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszexisting, lpsznew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszexisting;
    (void)lpsznew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpRenameFileW(void* hconnect, void* lpszexisting, void* lpsznew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpRenameFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszexisting, lpsznew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszexisting;
    (void)lpsznew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(void* hconnect, void* lpszdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpSetCurrentDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(void* hconnect, void* lpszdirectory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FtpSetCurrentDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszdirectory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszdirectory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetDiskInfoA(void* pszpath, void* pdwclustersize, void* pdlavail, void* pdltotal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath, pdwclustersize, pdlavail, pdltotal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    (void)pdwclustersize;
    (void)pdlavail;
    (void)pdltotal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(void* lpcacheconfiginfo, void* lpcbcacheconfiginfo, uint32_t dwfieldcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheConfigInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcacheconfiginfo, lpcbcacheconfiginfo, dwfieldcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcacheconfiginfo;
    (void)lpcbcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(void* lpcacheconfiginfo, void* lpcbcacheconfiginfo, uint32_t dwfieldcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheConfigInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcacheconfiginfo, lpcbcacheconfiginfo, dwfieldcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcacheconfiginfo;
    (void)lpcbcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(void* pwszurlname, void* dwtype, void* pftexpiretime, void* pftaccesstime, void* pftmodifiedtime, void* ppbblob, void* pcbblob) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryBinaryBlob");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszurlname, dwtype, pftexpiretime, pftaccesstime, pftmodifiedtime, ppbblob, pcbblob);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszurlname;
    (void)dwtype;
    (void)pftexpiretime;
    (void)pftaccesstime;
    (void)pftmodifiedtime;
    (void)ppbblob;
    (void)pcbblob;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(void* lpszurlname, void* lpcacheentryinfo, void* lpcbcacheentryinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(void* lpszurl, void* lpcacheentryinfo, void* lpcbcacheentryinfo, void* lpszredirecturl, void* lpcbredirecturl, void* lpreserved, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpcacheentryinfo, lpcbcacheentryinfo, lpszredirecturl, lpcbredirecturl, lpreserved, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpszredirecturl;
    (void)lpcbredirecturl;
    (void)lpreserved;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(void* lpszurl, void* lpcacheentryinfo, void* lpcbcacheentryinfo, void* lpszredirecturl, void* lpcbredirecturl, void* lpreserved, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpcacheentryinfo, lpcbcacheentryinfo, lpszredirecturl, lpcbredirecturl, lpreserved, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)lpszredirecturl;
    (void)lpcbredirecturl;
    (void)lpreserved;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(void* lpszurlname, void* lpcacheentryinfo, void* lpcbcacheentryinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheEntryInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(int64_t gid, uint32_t dwflags, uint32_t dwattributes, void* lpgroupinfo, void* lpcbgroupinfo, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheGroupAttributeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gid, dwflags, dwattributes, lpgroupinfo, lpcbgroupinfo, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpcbgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(int64_t gid, uint32_t dwflags, uint32_t dwattributes, void* lpgroupinfo, void* lpcbgroupinfo, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheGroupAttributeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gid, dwflags, dwattributes, lpgroupinfo, lpcbgroupinfo, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpcbgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(uint32_t nidx, void* lpdwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUrlCacheHeaderData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nidx, lpdwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nidx;
    (void)lpdwdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(void* lpszhost, uint16_t nserverport, void* lpszdisplaystring, void* lpszselectorstring, uint32_t dwgophertype, void* lpszlocator, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherCreateLocatorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszhost, nserverport, lpszdisplaystring, lpszselectorstring, dwgophertype, lpszlocator, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszhost;
    (void)nserverport;
    (void)lpszdisplaystring;
    (void)lpszselectorstring;
    (void)dwgophertype;
    (void)lpszlocator;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(void* lpszhost, uint16_t nserverport, void* lpszdisplaystring, void* lpszselectorstring, uint32_t dwgophertype, void* lpszlocator, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherCreateLocatorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszhost, nserverport, lpszdisplaystring, lpszselectorstring, dwgophertype, lpszlocator, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszhost;
    (void)nserverport;
    (void)lpszdisplaystring;
    (void)lpszselectorstring;
    (void)dwgophertype;
    (void)lpszlocator;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(void* hconnect, void* lpszlocator, void* lpszsearchstring, void* lpfinddata, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherFindFirstFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocator, lpszsearchstring, lpfinddata, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszsearchstring;
    (void)lpfinddata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(void* hconnect, void* lpszlocator, void* lpszsearchstring, void* lpfinddata, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherFindFirstFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocator, lpszsearchstring, lpfinddata, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszsearchstring;
    (void)lpfinddata;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGopherGetAttributeA(void* hconnect, void* lpszlocator, void* lpszattributename, void* lpbuffer, uint32_t dwbufferlength, void* lpdwcharactersreturned, void* lpfnenumerator, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetAttributeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocator, lpszattributename, lpbuffer, dwbufferlength, lpdwcharactersreturned, lpfnenumerator, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszattributename;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)lpdwcharactersreturned;
    (void)lpfnenumerator;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGopherGetAttributeW(void* hconnect, void* lpszlocator, void* lpszattributename, void* lpbuffer, uint32_t dwbufferlength, void* lpdwcharactersreturned, void* lpfnenumerator, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetAttributeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocator, lpszattributename, lpbuffer, dwbufferlength, lpdwcharactersreturned, lpfnenumerator, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszattributename;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)lpdwcharactersreturned;
    (void)lpfnenumerator;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(void* lpszlocator, void* lpdwgophertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetLocatorTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszlocator, lpdwgophertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszlocator;
    (void)lpdwgophertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(void* lpszlocator, void* lpdwgophertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherGetLocatorTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszlocator, lpdwgophertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszlocator;
    (void)lpdwgophertype;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetGopherOpenFileA(void* hconnect, void* lpszlocator, void* lpszview, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherOpenFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocator, lpszview, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszview;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetGopherOpenFileW(void* hconnect, void* lpszlocator, void* lpszview, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GopherOpenFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszlocator, lpszview, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszlocator;
    (void)lpszview;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwmodifiers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddRequestHeadersA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpszheaders, dwheaderslength, dwmodifiers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwmodifiers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwmodifiers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddRequestHeadersW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpszheaders, dwheaderslength, dwmodifiers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwmodifiers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(void* lpszurl, void* lpszcompliancetoken, void* lpffound, void* hwnd, void* lpvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCheckDavComplianceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcompliancetoken, lpffound, hwnd, lpvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcompliancetoken;
    (void)lpffound;
    (void)hwnd;
    (void)lpvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(void* lpszurl, void* lpszcompliancetoken, void* lpffound, void* hwnd, void* lpvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCheckDavComplianceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcompliancetoken, lpffound, hwnd, lpvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcompliancetoken;
    (void)lpffound;
    (void)hwnd;
    (void)lpvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(void* hdependencyhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseDependencyHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hdependencyhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)hdependencyhandle;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(void* hdependencyhandle, void* phduplicateddependencyhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDuplicateDependencyHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependencyhandle, phduplicateddependencyhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependencyhandle;
    (void)phduplicateddependencyhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpEndRequestA(void* hrequest, void* lpbuffersout, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpEndRequestA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpbuffersout, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpEndRequestW(void* hrequest, void* lpbuffersout, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpEndRequestW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpbuffersout, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(void* pwszurl, void* ppwszusername, void* ppwszpassword) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpGetServerCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszurl, ppwszusername, ppwszpassword);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszurl;
    (void)ppwszusername;
    (void)ppwszpassword;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(void* hdependencyhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIndicatePageLoadComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependencyhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependencyhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(void* pcwszurl, void* pfishsts) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIsHostHstsEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcwszurl, pfishsts);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcwszurl;
    (void)pfishsts;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(void* hrequesthandle, int32_t fbackground, void* phdependencyhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenDependencyHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequesthandle, fbackground, phdependencyhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrequesthandle;
    (void)fbackground;
    (void)phdependencyhandle;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32NetworkingWininetHttpOpenRequestA(void* hconnect, void* lpszverb, void* lpszobjectname, void* lpszversion, void* lpszreferrer, void* lplpszaccepttypes, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenRequestA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszverb, lpszobjectname, lpszversion, lpszreferrer, lplpszaccepttypes, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszverb;
    (void)lpszobjectname;
    (void)lpszversion;
    (void)lpszreferrer;
    (void)lplpszaccepttypes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetHttpOpenRequestW(void* hconnect, void* lpszverb, void* lpszobjectname, void* lpszversion, void* lpszreferrer, void* lplpszaccepttypes, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpOpenRequestW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconnect, lpszverb, lpszobjectname, lpszversion, lpszreferrer, lplpszaccepttypes, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hconnect;
    (void)lpszverb;
    (void)lpszobjectname;
    (void)lpszversion;
    (void)lpszreferrer;
    (void)lplpszaccepttypes;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32NetworkingWininetHttpPushClose(void* hwait) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushClose");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hwait);
        return;
    }
    errno = ENOSYS;
#else
    (void)hwait;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetHttpPushEnable(void* hrequest, void* ptransportsetting, void* phwait) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushEnable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, ptransportsetting, phwait);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrequest;
    (void)ptransportsetting;
    (void)phwait;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetHttpPushWait(void* hwait, int32_t etype, void* pnotificationstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPushWait");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwait, etype, pnotificationstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwait;
    (void)etype;
    (void)pnotificationstatus;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpQueryInfoA(void* hrequest, uint32_t dwinfolevel, void* lpbuffer, void* lpdwbufferlength, void* lpdwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, dwinfolevel, lpbuffer, lpdwbufferlength, lpdwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpQueryInfoW(void* hrequest, uint32_t dwinfolevel, void* lpbuffer, void* lpdwbufferlength, void* lpdwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, dwinfolevel, lpbuffer, lpdwbufferlength, lpdwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    (void)lpdwindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpSendRequestA(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, void* lpoptional, uint32_t dwoptionallength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpszheaders, dwheaderslength, lpoptional, dwoptionallength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpSendRequestExA(void* hrequest, void* lpbuffersin, void* lpbuffersout, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpbuffersin, lpbuffersout, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpbuffersin;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpSendRequestExW(void* hrequest, void* lpbuffersin, void* lpbuffersout, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpbuffersin, lpbuffersout, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpbuffersin;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpSendRequestW(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, void* lpoptional, uint32_t dwoptionallength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendRequestW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, lpszheaders, dwheaderslength, lpoptional, dwoptionallength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)lpoptional;
    (void)dwoptionallength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpWebSocketClose(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, usstatus, pvreason, dwreasonlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(void* hrequest, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketCompleteUpgrade");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hrequest;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(void* hwebsocket, void* pusstatus, void* pvreason, uint32_t dwreasonlength, void* pdwreasonlengthconsumed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketQueryCloseStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, pusstatus, pvreason, dwreasonlength, pdwreasonlengthconsumed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)pusstatus;
    (void)pvreason;
    (void)dwreasonlength;
    (void)pdwreasonlengthconsumed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(void* hwebsocket, void* pvbuffer, uint32_t dwbufferlength, void* pdwbytesread, void* pbuffertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketReceive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, pvbuffer, dwbufferlength, pdwbytesread, pbuffertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)pvbuffer;
    (void)dwbufferlength;
    (void)pdwbytesread;
    (void)pbuffertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpWebSocketSend(void* hwebsocket, int32_t buffertype, void* pvbuffer, uint32_t dwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketSend");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, buffertype, pvbuffer, dwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)buffertype;
    (void)pvbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWebSocketShutdown");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwebsocket, usstatus, pvreason, dwreasonlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwebsocket;
    (void)usstatus;
    (void)pvreason;
    (void)dwreasonlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetImportCookieFileA(void* szfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportCookieFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetImportCookieFileW(void* szfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportCookieFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(uint32_t nidx, void* lpdwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IncrementUrlCacheHeaderData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nidx, lpdwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nidx;
    (void)lpdwdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(void* lpszurl, void* lpszcookiedata, void* lpdwdatasize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternalInternetGetCookie");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiedata, lpdwdatasize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszurl;
    (void)lpszcookiedata;
    (void)lpdwdatasize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(uint32_t ai, void* lpstr, void* lpdwstrlength, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAlgIdToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ai, lpstr, lpdwstrlength, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ai;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(uint32_t ai, void* lpstr, void* lpdwstrlength, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAlgIdToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ai, lpstr, lpdwstrlength, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ai;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetAttemptConnect(uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAttemptConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetAutodial(uint32_t dwflags, void* hwndparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAutodial");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, hwndparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)hwndparent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetAutodialHangup(uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetAutodialHangup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(void* lpszurl, void* lpszbuffer, void* lpdwbufferlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCanonicalizeUrlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszbuffer, lpdwbufferlength, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(void* lpszurl, void* lpszbuffer, void* lpdwbufferlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCanonicalizeUrlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszbuffer, lpdwbufferlength, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(void* lpszurl, uint32_t dwflags, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCheckConnectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, dwflags, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(void* lpszurl, uint32_t dwflags, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCheckConnectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, dwflags, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetClearAllPerSiteCookieDecisions");
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

int32_t windowssysWindowsWin32NetworkingWininetInternetCloseHandle(void* hinternet) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCombineUrlA(void* lpszbaseurl, void* lpszrelativeurl, void* lpszbuffer, void* lpdwbufferlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCombineUrlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszbaseurl, lpszrelativeurl, lpszbuffer, lpdwbufferlength, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszbaseurl;
    (void)lpszrelativeurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCombineUrlW(void* lpszbaseurl, void* lpszrelativeurl, void* lpszbuffer, void* lpdwbufferlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCombineUrlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszbaseurl, lpszrelativeurl, lpszbuffer, lpdwbufferlength, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszbaseurl;
    (void)lpszrelativeurl;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(void* hwnd, void* szurlprev, void* szurlnew, int32_t bpost) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, szurlprev, szurlnew, bpost);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(void* hwnd, void* szurlprev, void* szurlnew, int32_t bpost) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossingA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, szurlprev, szurlnew, bpost);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(void* hwnd, void* szurlprev, void* szurlnew, int32_t bpost) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConfirmZoneCrossingW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, szurlprev, szurlnew, bpost);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)szurlprev;
    (void)szurlnew;
    (void)bpost;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetConnectA(void* hinternet, void* lpszservername, uint16_t nserverport, void* lpszusername, void* lpszpassword, uint32_t dwservice, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConnectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpszservername, nserverport, lpszusername, lpszpassword, dwservice, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpszservername;
    (void)nserverport;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwservice;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetConnectW(void* hinternet, void* lpszservername, uint16_t nserverport, void* lpszusername, void* lpszpassword, uint32_t dwservice, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConnectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpszservername, nserverport, lpszusername, lpszpassword, dwservice, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpszservername;
    (void)nserverport;
    (void)lpszusername;
    (void)lpszpassword;
    (void)dwservice;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(void* pcszurl, uint32_t cchurl, void* pcwszbaseurl, uint32_t dwcodepagehost, uint32_t dwcodepagepath, int32_t fencodepathextra, uint32_t dwcodepageextra, void* ppwszconvertedurl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetConvertUrlFromWireToWideChar");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcszurl, cchurl, pcwszbaseurl, dwcodepagehost, dwcodepagepath, fencodepathextra, dwcodepageextra, ppwszconvertedurl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcszurl;
    (void)cchurl;
    (void)pcwszbaseurl;
    (void)dwcodepagehost;
    (void)dwcodepagepath;
    (void)fencodepathextra;
    (void)dwcodepageextra;
    (void)ppwszconvertedurl;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCrackUrlA(void* lpszurl, uint32_t dwurllength, uint32_t dwflags, void* lpurlcomponents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCrackUrlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, dwurllength, dwflags, lpurlcomponents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCrackUrlW(void* lpszurl, uint32_t dwurllength, uint32_t dwflags, void* lpurlcomponents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCrackUrlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, dwurllength, dwflags, lpurlcomponents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)dwurllength;
    (void)dwflags;
    (void)lpurlcomponents;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCreateUrlA(void* lpurlcomponents, uint32_t dwflags, void* lpszurl, void* lpdwurllength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCreateUrlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpurlcomponents, dwflags, lpszurl, lpdwurllength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)lpszurl;
    (void)lpdwurllength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetCreateUrlW(void* lpurlcomponents, uint32_t dwflags, void* lpszurl, void* lpdwurllength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetCreateUrlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpurlcomponents, dwflags, lpszurl, lpdwurllength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpurlcomponents;
    (void)dwflags;
    (void)lpszurl;
    (void)lpdwurllength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetDial(void* hwndparent, void* lpszconnectoid, uint32_t dwflags, void* lpdwconnection, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDial");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, lpszconnectoid, dwflags, lpdwconnection, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetDialA(void* hwndparent, void* lpszconnectoid, uint32_t dwflags, void* lpdwconnection, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDialA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, lpszconnectoid, dwflags, lpdwconnection, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetDialW(void* hwndparent, void* lpszconnectoid, uint32_t dwflags, void* lpdwconnection, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetDialW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, lpszconnectoid, dwflags, lpdwconnection, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)lpszconnectoid;
    (void)dwflags;
    (void)lpdwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(void* pszsitename, void* pcsitenamesize, void* pdwdecision, uint32_t dwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetEnumPerSiteCookieDecisionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsitename, pcsitenamesize, pdwdecision, dwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsitename;
    (void)pcsitenamesize;
    (void)pdwdecision;
    (void)dwindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(void* pszsitename, void* pcsitenamesize, void* pdwdecision, uint32_t dwindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetEnumPerSiteCookieDecisionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsitename, pcsitenamesize, pdwdecision, dwindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszsitename;
    (void)pcsitenamesize;
    (void)pdwdecision;
    (void)dwindex;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetErrorDlg(void* hwnd, void* hrequest, uint32_t dwerror, uint32_t dwflags, void* lppvdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetErrorDlg");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hrequest, dwerror, dwflags, lppvdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)hrequest;
    (void)dwerror;
    (void)dwflags;
    (void)lppvdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetFindNextFileA(void* hfind, void* lpvfinddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFindNextFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind, lpvfinddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfind;
    (void)lpvfinddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetFindNextFileW(void* hfind, void* lpvfinddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFindNextFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind, lpvfinddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfind;
    (void)lpvfinddata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(uint32_t dwcommand, void* hwnd, uint64_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFortezzaCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwcommand, hwnd, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwcommand;
    (void)hwnd;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32NetworkingWininetInternetFreeCookies(void* pcookies, uint32_t dwcookiecount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFreeCookies");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcookies, dwcookiecount);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcookies;
    (void)dwcookiecount;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(void* pproxyinfolist) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetFreeProxyInfoList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pproxyinfolist);
        return;
    }
    errno = ENOSYS;
#else
    (void)pproxyinfolist;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetConnectedState(void* lpdwflags, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwflags, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(void* lpdwflags, void* lpszconnectionname, uint32_t dwnamelen, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwflags, lpszconnectionname, dwnamelen, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)dwnamelen;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(void* lpdwflags, void* lpszconnectionname, uint32_t cchnamelen, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwflags, lpszconnectionname, cchnamelen, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)cchnamelen;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(void* lpdwflags, void* lpszconnectionname, uint32_t cchnamelen, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetConnectedStateExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwflags, lpszconnectionname, cchnamelen, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwflags;
    (void)lpszconnectionname;
    (void)cchnamelen;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetCookieA(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* lpdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(void* pcwszurl, void* pcwszcookiename, uint32_t dwflags, void* ppcookies, void* pdwcookiecount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcwszurl, pcwszcookiename, dwflags, ppcookies, pdwcookiecount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcwszurl;
    (void)pcwszcookiename;
    (void)dwflags;
    (void)ppcookies;
    (void)pdwcookiecount;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetCookieExA(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* lpdwsize, uint32_t dwflags, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize, dwflags, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetCookieExW(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* lpdwsize, uint32_t dwflags, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize, dwflags, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    (void)dwflags;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetCookieW(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, void* lpdwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetCookieW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, lpdwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)lpdwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(void* lpdwerror, void* lpszbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetLastResponseInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwerror, lpszbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwerror;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(void* lpdwerror, void* lpszbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetLastResponseInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwerror, lpszbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdwerror;
    (void)lpszbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(void* pchhostname, void* presult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetPerSiteCookieDecisionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchhostname, presult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pchhostname;
    (void)presult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(void* pchhostname, void* presult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetPerSiteCookieDecisionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchhostname, presult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pchhostname;
    (void)presult;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(void* hinternet, void* pcwszurl, void* pproxyinfolist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetProxyForUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, pcwszurl, pproxyinfolist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hinternet;
    (void)pcwszurl;
    (void)pproxyinfolist;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(void* lpszurl, void* ppcertchain, void* pdwsecureflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, ppcertchain, pdwsecureflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(void* lpszurl, void* ppcertchain, void* pdwsecureflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURLA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, ppcertchain, pdwsecureflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(void* lpszurl, void* ppcertchain, void* pdwsecureflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGetSecurityInfoByURLW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, ppcertchain, pdwsecureflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)ppcertchain;
    (void)pdwsecureflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGoOnline(void* lpszurl, void* hwndparent, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnline");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, hwndparent, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGoOnlineA(void* lpszurl, void* hwndparent, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnlineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, hwndparent, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetGoOnlineW(void* lpszurl, void* hwndparent, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetGoOnlineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, hwndparent, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetHangUp(uint64_t dwconnection, uint32_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetHangUp");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwconnection, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwconnection;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetInitializeAutoProxyDll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetLockRequestFile(void* hinternet, void* lphlockrequestinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetLockRequestFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lphlockrequestinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)lphlockrequestinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetOpenA(void* lpszagent, uint32_t dwaccesstype, void* lpszproxy, void* lpszproxybypass, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszagent, dwaccesstype, lpszproxy, lpszproxybypass, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszagent;
    (void)dwaccesstype;
    (void)lpszproxy;
    (void)lpszproxybypass;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetOpenUrlA(void* hinternet, void* lpszurl, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenUrlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpszurl, lpszheaders, dwheaderslength, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpszurl;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetOpenUrlW(void* hinternet, void* lpszurl, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenUrlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpszurl, lpszheaders, dwheaderslength, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpszurl;
    (void)lpszheaders;
    (void)dwheaderslength;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetOpenW(void* lpszagent, uint32_t dwaccesstype, void* lpszproxy, void* lpszproxybypass, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetOpenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszagent, dwaccesstype, lpszproxy, lpszproxybypass, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszagent;
    (void)dwaccesstype;
    (void)lpszproxy;
    (void)lpszproxybypass;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(void* hfile, void* lpdwnumberofbytesavailable, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryDataAvailable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpdwnumberofbytesavailable, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpdwnumberofbytesavailable;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(void* pdwstatus, uint64_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryFortezzaStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwstatus, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdwstatus;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetQueryOptionA(void* hinternet, uint32_t dwoption, void* lpbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryOptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetQueryOptionW(void* hinternet, uint32_t dwoption, void* lpbuffer, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetQueryOptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetReadFile(void* hfile, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, dwnumberofbytestoread, lpdwnumberofbytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)dwnumberofbytestoread;
    (void)lpdwnumberofbytesread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetReadFileExA(void* hfile, void* lpbuffersout, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffersout, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetReadFileExW(void* hfile, void* lpbuffersout, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetReadFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffersout, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffersout;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(uint32_t dwprotocol, void* lpstr, void* lpdwstrlength, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSecurityProtocolToStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwprotocol, lpstr, lpdwstrlength, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwprotocol;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(uint32_t dwprotocol, void* lpstr, void* lpdwstrlength, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSecurityProtocolToStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwprotocol, lpstr, lpdwstrlength, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwprotocol;
    (void)lpstr;
    (void)lpdwstrlength;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetCookieA(void* lpszurl, void* lpszcookiename, void* lpszcookiedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(void* pcwszurl, void* pcookie, void* pcwszp3ppolicy, uint32_t dwflags, void* pdwcookiestate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcwszurl, pcookie, pcwszp3ppolicy, dwflags, pdwcookiestate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcwszurl;
    (void)pcookie;
    (void)pcwszp3ppolicy;
    (void)dwflags;
    (void)pdwcookiestate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetSetCookieExA(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, uint32_t dwflags, uint64_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, dwflags, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetSetCookieExW(void* lpszurl, void* lpszcookiename, void* lpszcookiedata, uint32_t dwflags, uint64_t dwreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata, dwflags, dwreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    (void)dwflags;
    (void)dwreserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetCookieW(void* lpszurl, void* lpszcookiename, void* lpszcookiedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetCookieW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, lpszcookiename, lpszcookiedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)lpszcookiename;
    (void)lpszcookiedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetDialState(void* lpszconnectoid, uint32_t dwstate, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszconnectoid, dwstate, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetDialStateA(void* lpszconnectoid, uint32_t dwstate, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialStateA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszconnectoid, dwstate, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetDialStateW(void* lpszconnectoid, uint32_t dwstate, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetDialStateW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszconnectoid, dwstate, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszconnectoid;
    (void)dwstate;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetInternetSetFilePointer(void* hfile, int32_t ldistancetomove, void* lpdistancetomovehigh, uint32_t dwmovemethod, uint64_t dwcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetFilePointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, ldistancetomove, lpdistancetomovehigh, dwmovemethod, dwcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)ldistancetomove;
    (void)lpdistancetomovehigh;
    (void)dwmovemethod;
    (void)dwcontext;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetOptionA(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, dwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetOptionExA(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, dwbufferlength, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetOptionExW(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, dwbufferlength, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetOptionW(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetOptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, dwoption, lpbuffer, dwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinternet;
    (void)dwoption;
    (void)lpbuffer;
    (void)dwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(void* pchhostname, uint32_t dwdecision) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetPerSiteCookieDecisionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchhostname, dwdecision);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pchhostname;
    (void)dwdecision;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(void* pchhostname, uint32_t dwdecision) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetPerSiteCookieDecisionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchhostname, dwdecision);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pchhostname;
    (void)dwdecision;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetSetStatusCallback(void* hinternet, void* lpfninternetcallback) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpfninternetcallback);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackA(void* hinternet, void* lpfninternetcallback) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallbackA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpfninternetcallback);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackW(void* hinternet, void* lpfninternetcallback) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetSetStatusCallbackW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinternet, lpfninternetcallback);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinternet;
    (void)lpfninternetcallback;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(void* lpszurl, void* hwndparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURL");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, hwndparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(void* lpszurl, void* hwndparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURLA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, hwndparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(void* lpszurl, void* hwndparent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetShowSecurityInfoByURLW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurl, hwndparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurl;
    (void)hwndparent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(void* pst, uint32_t dwrfc, void* lpsztime, uint32_t cbtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pst, dwrfc, lpsztime, cbtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(void* pst, uint32_t dwrfc, void* lpsztime, uint32_t cbtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTimeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pst, dwrfc, lpsztime, cbtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(void* pst, uint32_t dwrfc, void* lpsztime, uint32_t cbtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeFromSystemTimeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pst, dwrfc, lpsztime, cbtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pst;
    (void)dwrfc;
    (void)lpsztime;
    (void)cbtime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(void* lpsztime, void* pst, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsztime, pst, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(void* lpsztime, void* pst, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTimeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsztime, pst, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(void* lpsztime, void* pst, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetTimeToSystemTimeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsztime, pst, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsztime;
    (void)pst;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(void* hlockrequestinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetUnlockRequestFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlockrequestinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlockrequestinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetWriteFile(void* hfile, void* lpbuffer, uint32_t dwnumberofbytestowrite, void* lpdwnumberofbyteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, dwnumberofbytestowrite, lpdwnumberofbyteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)dwnumberofbytestowrite;
    (void)lpdwnumberofbyteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetWriteFileExA(void* hfile, void* lpbuffersin, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffersin, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffersin;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetInternetWriteFileExW(void* hfile, void* lpbuffersin, uint32_t dwflags, uint64_t dwcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternetWriteFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffersin, dwflags, dwcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffersin;
    (void)dwflags;
    (void)dwcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(void* pchdomain, void* pchfulldomain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDomainLegalCookieDomainA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchdomain, pchfulldomain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pchdomain;
    (void)pchfulldomain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(void* pchdomain, void* pchfulldomain) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDomainLegalCookieDomainW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pchdomain, pchfulldomain);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pchdomain;
    (void)pchfulldomain;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(int32_t tscheme, void* lpszhost, uint32_t cchhost) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsHostInProxyBypassList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tscheme, lpszhost, cchhost);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tscheme;
    (void)lpszhost;
    (void)cchhost;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetIsProfilesEnabled(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProfilesEnabled");
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

int32_t windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(void* lpszurlname, uint32_t dwflags, void* pftlastmodified) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUrlCacheEntryExpiredA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwflags, pftlastmodified);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)pftlastmodified;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(void* lpszurlname, uint32_t dwflags, void* pftlastmodified) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUrlCacheEntryExpiredW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwflags, pftlastmodified);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)pftlastmodified;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetLoadUrlCacheContent(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadUrlCacheContent");
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

uint32_t windowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(void* lpcert, uint32_t cbcert, void* lpszlistboxentry, void* lpdwlistboxentry) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseX509EncodedCertificateForListBoxEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcert, cbcert, lpszlistboxentry, lpdwlistboxentry);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpcert;
    (void)cbcert;
    (void)lpszlistboxentry;
    (void)lpdwlistboxentry;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(void* pszurlsearchpattern, uint32_t dwflags, uint32_t dwfilter, int64_t groupid, void* preserved1, void* pdwreserved2, void* preserved3, void* op, void* poperatordata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PerformOperationOverUrlCacheA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszurlsearchpattern, dwflags, dwfilter, groupid, preserved1, pdwreserved2, preserved3, op, poperatordata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszurlsearchpattern;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)preserved1;
    (void)pdwreserved2;
    (void)preserved3;
    (void)op;
    (void)poperatordata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(uint32_t dwzone, uint32_t dwtype, void* pdwtemplate, void* pszbuffer, void* pdwbufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivacyGetZonePreferenceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwzone, dwtype, pdwtemplate, pszbuffer, pdwbufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwzone;
    (void)dwtype;
    (void)pdwtemplate;
    (void)pszbuffer;
    (void)pdwbufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(uint32_t dwzone, uint32_t dwtype, uint32_t dwtemplate, void* pszpreference) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivacySetZonePreferenceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwzone, dwtype, dwtemplate, pszpreference);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwzone;
    (void)dwtype;
    (void)dwtemplate;
    (void)pszpreference;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(void* pcnetworks, void* pppwsznetworkguids, void* pppbstrnetworknames, void* pppwszgwmacs, void* pcgatewaymacs, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadGuidsForConnectedNetworks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcnetworks, pppwsznetworkguids, pppbstrnetworknames, pppwszgwmacs, pcgatewaymacs, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcnetworks;
    (void)pppwsznetworkguids;
    (void)pppbstrnetworknames;
    (void)pppwszgwmacs;
    (void)pcgatewaymacs;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(void* hurlcachestream, uint32_t dwlocation, void* lpbuffer, void* lpdwlen, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadUrlCacheEntryStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hurlcachestream, dwlocation, lpbuffer, lpdwlen, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hurlcachestream;
    (void)dwlocation;
    (void)lpbuffer;
    (void)lpdwlen;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(void* hurlcachestream, uint64_t qwlocation, void* lpbuffer, void* lpdwlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadUrlCacheEntryStreamEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hurlcachestream, qwlocation, lpbuffer, lpdwlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hurlcachestream;
    (void)qwlocation;
    (void)lpbuffer;
    (void)lpdwlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(void* hwnd, uint32_t umsg, int64_t gid, uint32_t dwopsfilter, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterUrlCacheNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, umsg, gid, dwopsfilter, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)gid;
    (void)dwopsfilter;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(void* hrequest, uint32_t dwresultcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeSuspendedDownload");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrequest, dwresultcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrequest;
    (void)dwresultcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(void* lpszurlname, void* lpcacheentryinfo, void* lpcbcacheentryinfo, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(void* lpszurlname, void* lpcacheentryinfo, void* lpcbcacheentryinfo, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(void* lpszurlname, void* lpcacheentryinfo, void* lpcbcacheentryinfo, int32_t frandomread, uint32_t dwreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, frandomread, dwreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)frandomread;
    (void)dwreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(void* lpszurlname, void* lpcacheentryinfo, void* lpcbcacheentryinfo, int32_t frandomread, uint32_t dwreserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RetrieveUrlCacheEntryStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, lpcbcacheentryinfo, frandomread, dwreserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)lpcbcacheentryinfo;
    (void)frandomread;
    (void)dwreserved;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetRunOnceUrlCache(void* hwnd, void* hinst, void* lpszcmd, int32_t ncmdshow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RunOnceUrlCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hinst, lpszcmd, ncmdshow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)hinst;
    (void)lpszcmd;
    (void)ncmdshow;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(void* lpcacheconfiginfo, uint32_t dwfieldcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheConfigInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcacheconfiginfo, dwfieldcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(void* lpcacheconfiginfo, uint32_t dwfieldcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheConfigInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpcacheconfiginfo, dwfieldcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpcacheconfiginfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(void* lpszurlname, uint32_t dwflags, int64_t groupid, void* pbgroupattributes, uint32_t cbgroupattributes, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwflags, groupid, pbgroupattributes, cbgroupattributes, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(void* lpszurlname, uint32_t dwflags, int64_t groupid, void* pbgroupattributes, uint32_t cbgroupattributes, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwflags, groupid, pbgroupattributes, cbgroupattributes, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(void* lpszurlname, uint32_t dwflags, int64_t groupid, void* pbgroupattributes, uint32_t cbgroupattributes, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryGroupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwflags, groupid, pbgroupattributes, cbgroupattributes, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwflags;
    (void)groupid;
    (void)pbgroupattributes;
    (void)cbgroupattributes;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(void* lpszurlname, void* lpcacheentryinfo, uint32_t dwfieldcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, dwfieldcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(void* lpszurlname, void* lpcacheentryinfo, uint32_t dwfieldcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheEntryInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, lpcacheentryinfo, dwfieldcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)lpcacheentryinfo;
    (void)dwfieldcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(int64_t gid, uint32_t dwflags, uint32_t dwattributes, void* lpgroupinfo, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheGroupAttributeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gid, dwflags, dwattributes, lpgroupinfo, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(int64_t gid, uint32_t dwflags, uint32_t dwattributes, void* lpgroupinfo, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheGroupAttributeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gid, dwflags, dwattributes, lpgroupinfo, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)gid;
    (void)dwflags;
    (void)dwattributes;
    (void)lpgroupinfo;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(uint32_t nidx, uint32_t dwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUrlCacheHeaderData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nidx, dwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nidx;
    (void)dwdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetShowClientAuthCerts(void* hwndparent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowClientAuthCerts");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetShowSecurityInfo(void* hwndparent, void* psecurityinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowSecurityInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, psecurityinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)psecurityinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(void* hwndparent, void* lpcert, uint32_t cbcert) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowX509EncodedCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, lpcert, cbcert);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)lpcert;
    (void)cbcert;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(void* lpszurlname, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(void* lpszurlname, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(void* lpszurlname, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszurlname, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszurlname;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(void* hurlcachestream, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockUrlCacheEntryStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hurlcachestream, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hurlcachestream;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(void* sznewpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateUrlCacheContentPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sznewpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sznewpath;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(void* rgpwszurls, uint32_t centries, void* rgfexist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCheckEntriesExist");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rgpwszurls, centries, rgfexist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rgpwszurls;
    (void)centries;
    (void)rgfexist;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(void* hentryfile) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCloseEntryHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hentryfile);
        return;
    }
    errno = ENOSYS;
#else
    (void)hentryfile;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(void* pwszprefix, uint32_t dwentrymaxage) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheContainerSetEntryMaximumAge");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszprefix, dwentrymaxage);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszprefix;
    (void)dwentrymaxage;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(void* pwszname, void* pwszprefix, void* pwszdirectory, uint64_t ulllimit, uint32_t dwoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheCreateContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszname, pwszprefix, pwszdirectory, ulllimit, dwoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszname;
    (void)pwszprefix;
    (void)pwszdirectory;
    (void)ulllimit;
    (void)dwoptions;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(void* pwszprefix, uint32_t dwflags, uint32_t dwfilter, int64_t groupid, void* pcacheentryinfo, void* phfind) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFindFirstEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszprefix, dwflags, dwfilter, groupid, pcacheentryinfo, phfind);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pwszprefix;
    (void)dwflags;
    (void)dwfilter;
    (void)groupid;
    (void)pcacheentryinfo;
    (void)phfind;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(void* hfind, void* pcacheentryinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFindNextEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfind, pcacheentryinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfind;
    (void)pcacheentryinfo;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(void* pcacheentryinfo) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFreeEntryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcacheentryinfo);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcacheentryinfo;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(uint64_t ulltargetsize, uint32_t dwfilter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheFreeGlobalSpace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulltargetsize, dwfilter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulltargetsize;
    (void)dwfilter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(void* pppwszdirectories, void* pcdirectories) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetContentPaths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pppwszdirectories, pcdirectories);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pppwszdirectories;
    (void)pcdirectories;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(void* happcache, void* pcwszurl, void* pcacheentryinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetEntryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pcwszurl, pcacheentryinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pcacheentryinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(uint32_t dwfilter, void* pullsize, void* pulllimit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetGlobalCacheSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwfilter, pullsize, pulllimit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwfilter;
    (void)pullsize;
    (void)pulllimit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(int32_t limittype, void* pulllimit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheGetGlobalLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(limittype, pulllimit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)limittype;
    (void)pulllimit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(void* hurlcachestream, uint64_t ulllocation, void* pbuffer, uint32_t dwbufferlen, void* pdwbufferlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheReadEntryStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hurlcachestream, ulllocation, pbuffer, dwbufferlen, pdwbufferlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hurlcachestream;
    (void)ulllocation;
    (void)pbuffer;
    (void)dwbufferlen;
    (void)pdwbufferlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheReloadSettings");
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

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(void* happcache, void* pcwszurl, void* pcacheentryinfo, void* phentryfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheRetrieveEntryFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pcwszurl, pcacheentryinfo, phentryfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pcacheentryinfo;
    (void)phentryfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(void* happcache, void* pcwszurl, int32_t frandomread, void* pcacheentryinfo, void* phentrystream) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheRetrieveEntryStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pcwszurl, frandomread, pcacheentryinfo, phentrystream);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)frandomread;
    (void)pcacheentryinfo;
    (void)phentrystream;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheServer(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheServer");
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

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(int32_t limittype, uint64_t ulllimit) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheSetGlobalLimit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(limittype, ulllimit);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)limittype;
    (void)ulllimit;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(void* happcache, void* pcwszurl, void* pbextradata, uint32_t cbextradata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wininet.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCacheUpdateEntryExtraData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(happcache, pcwszurl, pbextradata, cbextradata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)happcache;
    (void)pcwszurl;
    (void)pbextradata;
    (void)cbextradata;
    errno = ENOSYS;
    return 0;
#endif
}

