#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_httpserver_wrapper.h"
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

uint32_t windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache(void* requestqueuehandle, void* urlprefix, void* datachunk, void* cachepolicy, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddFragmentToCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, urlprefix, datachunk, cachepolicy, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)datachunk;
    (void)cachepolicy;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpAddUrl(void* requestqueuehandle, void* fullyqualifiedurl, void* reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, fullyqualifiedurl, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)fullyqualifiedurl;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint64_t urlcontext, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddUrlToUrlGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(urlgroupid, pfullyqualifiedurl, urlcontext, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)urlgroupid;
    (void)pfullyqualifiedurl;
    (void)urlcontext;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest(void* requestqueuehandle, uint64_t requestid, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCancelHttpRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, requestid, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue(void* requestqueuehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseRequestQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpCloseServerSession(uint64_t serversessionid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseServerSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serversessionid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serversessionid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup(uint64_t urlgroupid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseUrlGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(urlgroupid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)urlgroupid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle(void* requestqueuehandle, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCreateHttpHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup(uint64_t serversessionid, void* purlgroupid, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCreateUrlGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serversessionid, purlgroupid, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serversessionid;
    (void)purlgroupid;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpDeclarePush(void* requestqueuehandle, uint64_t requestid, int32_t verb, void* path, void* query, void* headers) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDeclarePush");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, requestid, verb, path, query, headers);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)verb;
    (void)path;
    (void)query;
    (void)headers;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx(void* requestqueuehandle, void* delegatequeuehandle, uint64_t requestid, uint64_t delegateurlgroupid, uint32_t propertyinfosetsize, void* propertyinfoset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDelegateRequestEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, delegatequeuehandle, requestid, delegateurlgroupid, propertyinfosetsize, propertyinfoset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)delegatequeuehandle;
    (void)requestid;
    (void)delegateurlgroupid;
    (void)propertyinfosetsize;
    (void)propertyinfoset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDeleteServiceConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehandle, configid, pconfiginformation, configinformationlength, poverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pconfiginformation;
    (void)configinformationlength;
    (void)poverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId(void* fullyqualifiedurl, void* requestqueuehandle, void* urlgroupid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpFindUrlGroupId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fullyqualifiedurl, requestqueuehandle, urlgroupid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)fullyqualifiedurl;
    (void)requestqueuehandle;
    (void)urlgroupid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache(void* requestqueuehandle, void* urlprefix, uint32_t flags, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpFlushResponseCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, urlprefix, flags, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)flags;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported(int32_t featureid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIsFeatureSupported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(featureid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)featureid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpPrepareUrl(void* reserved, uint32_t flags, void* url, void* preparedurl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPrepareUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved, flags, url, preparedurl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)reserved;
    (void)flags;
    (void)url;
    (void)preparedurl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* returnlength, void* reserved2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryRequestQueueProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, property, propertyinformation, propertyinformationlength, reserved1, returnlength, reserved2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)reserved1;
    (void)returnlength;
    (void)reserved2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryServerSessionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serversessionid, property, propertyinformation, propertyinformationlength, returnlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serversessionid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration(void* servicehandle, int32_t configid, void* pinput, uint32_t inputlength, void* poutput, uint32_t outputlength, void* preturnlength, void* poverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryServiceConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehandle, configid, pinput, inputlength, poutput, outputlength, preturnlength, poverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pinput;
    (void)inputlength;
    (void)poutput;
    (void)outputlength;
    (void)preturnlength;
    (void)poverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, void* returnlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryUrlGroupProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(urlgroupid, property, propertyinformation, propertyinformationlength, returnlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)urlgroupid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache(void* requestqueuehandle, void* urlprefix, void* byterange, void* buffer, uint32_t bufferlength, void* bytesread, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReadFragmentFromCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, urlprefix, byterange, buffer, bufferlength, bytesread, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)byterange;
    (void)buffer;
    (void)bufferlength;
    (void)bytesread;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate(void* requestqueuehandle, uint64_t connectionid, uint32_t flags, void* sslclientcertinfo, uint32_t sslclientcertinfosize, void* bytesreceived, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReceiveClientCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, connectionid, flags, sslclientcertinfo, sslclientcertinfosize, bytesreceived, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)flags;
    (void)sslclientcertinfo;
    (void)sslclientcertinfosize;
    (void)bytesreceived;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* requestbuffer, uint32_t requestbufferlength, void* bytesreturned, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReceiveHttpRequest");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, requestid, flags, requestbuffer, requestbufferlength, bytesreturned, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)requestbuffer;
    (void)requestbufferlength;
    (void)bytesreturned;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* entitybuffer, uint32_t entitybufferlength, void* bytesreturned, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReceiveRequestEntityBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, requestid, flags, entitybuffer, entitybufferlength, bytesreturned, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)entitybuffer;
    (void)entitybufferlength;
    (void)bytesreturned;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpRemoveUrl(void* requestqueuehandle, void* fullyqualifiedurl) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpRemoveUrl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, fullyqualifiedurl);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)fullyqualifiedurl;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup(uint64_t urlgroupid, void* pfullyqualifiedurl, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpRemoveUrlFromUrlGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(urlgroupid, pfullyqualifiedurl, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)urlgroupid;
    (void)pfullyqualifiedurl;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse(void* requestqueuehandle, uint64_t requestid, uint32_t flags, void* httpresponse, void* cachepolicy, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendHttpResponse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, requestid, flags, httpresponse, cachepolicy, bytessent, reserved1, reserved2, overlapped, logdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)httpresponse;
    (void)cachepolicy;
    (void)bytessent;
    (void)reserved1;
    (void)reserved2;
    (void)overlapped;
    (void)logdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody(void* requestqueuehandle, uint64_t requestid, uint32_t flags, uint16_t entitychunkcount, void* entitychunks, void* bytessent, void* reserved1, uint32_t reserved2, void* overlapped, void* logdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint16_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendResponseEntityBody");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, requestid, flags, entitychunkcount, entitychunks, bytessent, reserved1, reserved2, overlapped, logdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)entitychunkcount;
    (void)entitychunks;
    (void)bytessent;
    (void)reserved1;
    (void)reserved2;
    (void)overlapped;
    (void)logdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty(void* requestqueuehandle, uint64_t id, int32_t propertyid, void* input, uint32_t inputpropertysize, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetRequestProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, id, propertyid, input, inputpropertysize, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)id;
    (void)propertyid;
    (void)input;
    (void)inputpropertysize;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty(void* requestqueuehandle, int32_t property, void* propertyinformation, uint32_t propertyinformationlength, uint32_t reserved1, void* reserved2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetRequestQueueProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, property, propertyinformation, propertyinformationlength, reserved1, reserved2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty(uint64_t serversessionid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetServerSessionProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(serversessionid, property, propertyinformation, propertyinformationlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)serversessionid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration(void* servicehandle, int32_t configid, void* pconfiginformation, uint32_t configinformationlength, void* poverlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetServiceConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servicehandle, configid, pconfiginformation, configinformationlength, poverlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pconfiginformation;
    (void)configinformationlength;
    (void)poverlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty(uint64_t urlgroupid, int32_t property, void* propertyinformation, uint32_t propertyinformationlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetUrlGroupProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(urlgroupid, property, propertyinformation, propertyinformationlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)urlgroupid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue(void* requestqueuehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpShutdownRequestQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpTerminate(uint32_t flags, void* preserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpTerminate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, preserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)preserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration(void* handle, int32_t configid, void* configinfo, uint32_t configinfolength, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpUpdateServiceConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, configid, configinfo, configinfolength, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    (void)configid;
    (void)configinfo;
    (void)configinfolength;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart(void* requestqueuehandle, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWaitForDemandStart");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect(void* requestqueuehandle, uint64_t connectionid, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWaitForDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, connectionid, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx(void* requestqueuehandle, uint64_t connectionid, uint32_t reserved, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWaitForDisconnectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestqueuehandle, connectionid, reserved, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)reserved;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

