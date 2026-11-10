#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpAddFragmentToCache(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong urlprefix, jlong datachunk, jlong cachepolicy, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddFragmentToCache");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)urlprefix, (void*)(uintptr_t)datachunk, (void*)(uintptr_t)cachepolicy, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)datachunk;
    (void)cachepolicy;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpAddUrl(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong fullyqualifiedurl, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddUrl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)fullyqualifiedurl, (void*)(uintptr_t)reserved) : 0;
#else
    (void)requestqueuehandle;
    (void)fullyqualifiedurl;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpAddUrlToUrlGroup(JNIEnv* km_env, jclass km_clazz, jlong urlgroupid, jlong pfullyqualifiedurl, jlong urlcontext, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpAddUrlToUrlGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)urlgroupid, (void*)(uintptr_t)pfullyqualifiedurl, (uint64_t)urlcontext, (uint32_t)reserved) : 0;
#else
    (void)urlgroupid;
    (void)pfullyqualifiedurl;
    (void)urlcontext;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpCancelHttpRequest(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong requestid, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCancelHttpRequest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)requestid, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpCloseRequestQueue(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseRequestQueue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle) : 0;
#else
    (void)requestqueuehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpCloseServerSession(JNIEnv* km_env, jclass km_clazz, jlong serversessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseServerSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)serversessionid) : 0;
#else
    (void)serversessionid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpCloseUrlGroup(JNIEnv* km_env, jclass km_clazz, jlong urlgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCloseUrlGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)urlgroupid) : 0;
#else
    (void)urlgroupid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpCreateHttpHandle(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCreateHttpHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint32_t)reserved) : 0;
#else
    (void)requestqueuehandle;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpCreateUrlGroup(JNIEnv* km_env, jclass km_clazz, jlong serversessionid, jlong purlgroupid, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpCreateUrlGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)serversessionid, (void*)(uintptr_t)purlgroupid, (uint32_t)reserved) : 0;
#else
    (void)serversessionid;
    (void)purlgroupid;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpDeclarePush(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong requestid, jint verb, jlong path, jlong query, jlong headers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDeclarePush");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)requestid, (int32_t)verb, (void*)(uintptr_t)path, (void*)(uintptr_t)query, (void*)(uintptr_t)headers) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)verb;
    (void)path;
    (void)query;
    (void)headers;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpDelegateRequestEx(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong delegatequeuehandle, jlong requestid, jlong delegateurlgroupid, jint propertyinfosetsize, jlong propertyinfoset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDelegateRequestEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)delegatequeuehandle, (uint64_t)requestid, (uint64_t)delegateurlgroupid, (uint32_t)propertyinfosetsize, (void*)(uintptr_t)propertyinfoset) : 0;
#else
    (void)requestqueuehandle;
    (void)delegatequeuehandle;
    (void)requestid;
    (void)delegateurlgroupid;
    (void)propertyinfosetsize;
    (void)propertyinfoset;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpDeleteServiceConfiguration(JNIEnv* km_env, jclass km_clazz, jlong servicehandle, jint configid, jlong pconfiginformation, jint configinformationlength, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpDeleteServiceConfiguration");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servicehandle, (int32_t)configid, (void*)(uintptr_t)pconfiginformation, (uint32_t)configinformationlength, (void*)(uintptr_t)poverlapped) : 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pconfiginformation;
    (void)configinformationlength;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpFindUrlGroupId(JNIEnv* km_env, jclass km_clazz, jlong fullyqualifiedurl, jlong requestqueuehandle, jlong urlgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpFindUrlGroupId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fullyqualifiedurl, (void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)urlgroupid) : 0;
#else
    (void)fullyqualifiedurl;
    (void)requestqueuehandle;
    (void)urlgroupid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpFlushResponseCache(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong urlprefix, jint flags, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpFlushResponseCache");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)urlprefix, (uint32_t)flags, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)flags;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpIsFeatureSupported(JNIEnv* km_env, jclass km_clazz, jint featureid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpIsFeatureSupported");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)featureid) : -1;
#else
    (void)featureid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpPrepareUrl(JNIEnv* km_env, jclass km_clazz, jlong reserved, jint flags, jlong url, jlong preparedurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpPrepareUrl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)reserved, (uint32_t)flags, (void*)(uintptr_t)url, (void*)(uintptr_t)preparedurl) : 0;
#else
    (void)reserved;
    (void)flags;
    (void)url;
    (void)preparedurl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpQueryRequestQueueProperty(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jint property, jlong propertyinformation, jint propertyinformationlength, jint reserved1, jlong returnlength, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryRequestQueueProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (int32_t)property, (void*)(uintptr_t)propertyinformation, (uint32_t)propertyinformationlength, (uint32_t)reserved1, (void*)(uintptr_t)returnlength, (void*)(uintptr_t)reserved2) : 0;
#else
    (void)requestqueuehandle;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)reserved1;
    (void)returnlength;
    (void)reserved2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpQueryServerSessionProperty(JNIEnv* km_env, jclass km_clazz, jlong serversessionid, jint property, jlong propertyinformation, jint propertyinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryServerSessionProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)serversessionid, (int32_t)property, (void*)(uintptr_t)propertyinformation, (uint32_t)propertyinformationlength, (void*)(uintptr_t)returnlength) : 0;
#else
    (void)serversessionid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)returnlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpQueryServiceConfiguration(JNIEnv* km_env, jclass km_clazz, jlong servicehandle, jint configid, jlong pinput, jint inputlength, jlong poutput, jint outputlength, jlong preturnlength, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryServiceConfiguration");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servicehandle, (int32_t)configid, (void*)(uintptr_t)pinput, (uint32_t)inputlength, (void*)(uintptr_t)poutput, (uint32_t)outputlength, (void*)(uintptr_t)preturnlength, (void*)(uintptr_t)poverlapped) : 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pinput;
    (void)inputlength;
    (void)poutput;
    (void)outputlength;
    (void)preturnlength;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpQueryUrlGroupProperty(JNIEnv* km_env, jclass km_clazz, jlong urlgroupid, jint property, jlong propertyinformation, jint propertyinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpQueryUrlGroupProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)urlgroupid, (int32_t)property, (void*)(uintptr_t)propertyinformation, (uint32_t)propertyinformationlength, (void*)(uintptr_t)returnlength) : 0;
#else
    (void)urlgroupid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)returnlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpReadFragmentFromCache(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong urlprefix, jlong byterange, jlong buffer, jint bufferlength, jlong bytesread, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReadFragmentFromCache");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)urlprefix, (void*)(uintptr_t)byterange, (void*)(uintptr_t)buffer, (uint32_t)bufferlength, (void*)(uintptr_t)bytesread, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)urlprefix;
    (void)byterange;
    (void)buffer;
    (void)bufferlength;
    (void)bytesread;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpReceiveClientCertificate(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong connectionid, jint flags, jlong sslclientcertinfo, jint sslclientcertinfosize, jlong bytesreceived, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReceiveClientCertificate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)connectionid, (uint32_t)flags, (void*)(uintptr_t)sslclientcertinfo, (uint32_t)sslclientcertinfosize, (void*)(uintptr_t)bytesreceived, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)flags;
    (void)sslclientcertinfo;
    (void)sslclientcertinfosize;
    (void)bytesreceived;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpReceiveHttpRequest(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong requestid, jint flags, jlong requestbuffer, jint requestbufferlength, jlong bytesreturned, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReceiveHttpRequest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)requestid, (uint32_t)flags, (void*)(uintptr_t)requestbuffer, (uint32_t)requestbufferlength, (void*)(uintptr_t)bytesreturned, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)requestbuffer;
    (void)requestbufferlength;
    (void)bytesreturned;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpReceiveRequestEntityBody(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong requestid, jint flags, jlong entitybuffer, jint entitybufferlength, jlong bytesreturned, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpReceiveRequestEntityBody");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)requestid, (uint32_t)flags, (void*)(uintptr_t)entitybuffer, (uint32_t)entitybufferlength, (void*)(uintptr_t)bytesreturned, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)requestid;
    (void)flags;
    (void)entitybuffer;
    (void)entitybufferlength;
    (void)bytesreturned;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpRemoveUrl(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong fullyqualifiedurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpRemoveUrl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)fullyqualifiedurl) : 0;
#else
    (void)requestqueuehandle;
    (void)fullyqualifiedurl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpRemoveUrlFromUrlGroup(JNIEnv* km_env, jclass km_clazz, jlong urlgroupid, jlong pfullyqualifiedurl, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpRemoveUrlFromUrlGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)urlgroupid, (void*)(uintptr_t)pfullyqualifiedurl, (uint32_t)flags) : 0;
#else
    (void)urlgroupid;
    (void)pfullyqualifiedurl;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpSendHttpResponse(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong requestid, jint flags, jlong httpresponse, jlong cachepolicy, jlong bytessent, jlong reserved1, jint reserved2, jlong overlapped, jlong logdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendHttpResponse");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)requestid, (uint32_t)flags, (void*)(uintptr_t)httpresponse, (void*)(uintptr_t)cachepolicy, (void*)(uintptr_t)bytessent, (void*)(uintptr_t)reserved1, (uint32_t)reserved2, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)logdata) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpSendResponseEntityBody(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong requestid, jint flags, jshort entitychunkcount, jlong entitychunks, jlong bytessent, jlong reserved1, jint reserved2, jlong overlapped, jlong logdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint16_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSendResponseEntityBody");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)requestid, (uint32_t)flags, (uint16_t)entitychunkcount, (void*)(uintptr_t)entitychunks, (void*)(uintptr_t)bytessent, (void*)(uintptr_t)reserved1, (uint32_t)reserved2, (void*)(uintptr_t)overlapped, (void*)(uintptr_t)logdata) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpSetRequestProperty(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong id, jint propertyid, jlong input, jint inputpropertysize, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetRequestProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)id, (int32_t)propertyid, (void*)(uintptr_t)input, (uint32_t)inputpropertysize, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)id;
    (void)propertyid;
    (void)input;
    (void)inputpropertysize;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpSetRequestQueueProperty(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jint property, jlong propertyinformation, jint propertyinformationlength, jint reserved1, jlong reserved2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetRequestQueueProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (int32_t)property, (void*)(uintptr_t)propertyinformation, (uint32_t)propertyinformationlength, (uint32_t)reserved1, (void*)(uintptr_t)reserved2) : 0;
#else
    (void)requestqueuehandle;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    (void)reserved1;
    (void)reserved2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpSetServerSessionProperty(JNIEnv* km_env, jclass km_clazz, jlong serversessionid, jint property, jlong propertyinformation, jint propertyinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetServerSessionProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)serversessionid, (int32_t)property, (void*)(uintptr_t)propertyinformation, (uint32_t)propertyinformationlength) : 0;
#else
    (void)serversessionid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpSetServiceConfiguration(JNIEnv* km_env, jclass km_clazz, jlong servicehandle, jint configid, jlong pconfiginformation, jint configinformationlength, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetServiceConfiguration");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servicehandle, (int32_t)configid, (void*)(uintptr_t)pconfiginformation, (uint32_t)configinformationlength, (void*)(uintptr_t)poverlapped) : 0;
#else
    (void)servicehandle;
    (void)configid;
    (void)pconfiginformation;
    (void)configinformationlength;
    (void)poverlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpSetUrlGroupProperty(JNIEnv* km_env, jclass km_clazz, jlong urlgroupid, jint property, jlong propertyinformation, jint propertyinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpSetUrlGroupProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)urlgroupid, (int32_t)property, (void*)(uintptr_t)propertyinformation, (uint32_t)propertyinformationlength) : 0;
#else
    (void)urlgroupid;
    (void)property;
    (void)propertyinformation;
    (void)propertyinformationlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpShutdownRequestQueue(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpShutdownRequestQueue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle) : 0;
#else
    (void)requestqueuehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpTerminate(JNIEnv* km_env, jclass km_clazz, jint flags, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpTerminate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)preserved) : 0;
#else
    (void)flags;
    (void)preserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpUpdateServiceConfiguration(JNIEnv* km_env, jclass km_clazz, jlong handle, jint configid, jlong configinfo, jint configinfolength, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpUpdateServiceConfiguration");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (int32_t)configid, (void*)(uintptr_t)configinfo, (uint32_t)configinfolength, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)handle;
    (void)configid;
    (void)configinfo;
    (void)configinfolength;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpWaitForDemandStart(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWaitForDemandStart");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpWaitForDisconnect(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong connectionid, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWaitForDisconnect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)connectionid, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_httpserver_WindowsWin32NetworkingHttpserverJniBridge_windowssys_1windows_1win32_1networking_1httpserver_1httpWaitForDisconnectEx(JNIEnv* km_env, jclass km_clazz, jlong requestqueuehandle, jlong connectionid, jint reserved, jlong overlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("httpapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HttpWaitForDisconnectEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestqueuehandle, (uint64_t)connectionid, (uint32_t)reserved, (void*)(uintptr_t)overlapped) : 0;
#else
    (void)requestqueuehandle;
    (void)connectionid;
    (void)reserved;
    (void)overlapped;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

