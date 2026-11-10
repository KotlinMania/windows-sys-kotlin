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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1createTraceInstanceId(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jlong instinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTraceInstanceId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)reghandle, (void*)(uintptr_t)instinfo) : 0;
#else
    (void)reghandle;
    (void)instinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1cveEventWrite(JNIEnv* km_env, jclass km_clazz, jlong cveid, jlong additionaldetails) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CveEventWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cveid, (void*)(uintptr_t)additionaldetails) : -1;
#else
    (void)cveid;
    (void)additionaldetails;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1enumerateTraceGuids(JNIEnv* km_env, jclass km_clazz, jlong guidpropertiesarray, jint propertyarraycount, jlong guidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateTraceGuids");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guidpropertiesarray, (uint32_t)propertyarraycount, (void*)(uintptr_t)guidcount) : 0;
#else
    (void)guidpropertiesarray;
    (void)propertyarraycount;
    (void)guidcount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1enumerateTraceGuidsEx(JNIEnv* km_env, jclass km_clazz, jint tracequeryinfoclass, jlong inbuffer, jint inbuffersize, jlong outbuffer, jint outbuffersize, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateTraceGuidsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)tracequeryinfoclass, (void*)(uintptr_t)inbuffer, (uint32_t)inbuffersize, (void*)(uintptr_t)outbuffer, (uint32_t)outbuffersize, (void*)(uintptr_t)returnlength) : 0;
#else
    (void)tracequeryinfoclass;
    (void)inbuffer;
    (void)inbuffersize;
    (void)outbuffer;
    (void)outbuffersize;
    (void)returnlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventAccessControl(JNIEnv* km_env, jclass km_clazz, jlong guid, jint operation, jlong sid, jint rights, jboolean allowordeny) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventAccessControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guid, (uint32_t)operation, (void*)(uintptr_t)sid, (uint32_t)rights, (bool)allowordeny) : 0;
#else
    (void)guid;
    (void)operation;
    (void)sid;
    (void)rights;
    (void)allowordeny;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventAccessQuery(JNIEnv* km_env, jclass km_clazz, jlong guid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventAccessQuery");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)guid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventAccessRemove(JNIEnv* km_env, jclass km_clazz, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventAccessRemove");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guid) : 0;
#else
    (void)guid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventActivityIdControl(JNIEnv* km_env, jclass km_clazz, jint controlcode, jlong activityid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventActivityIdControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)controlcode, (void*)(uintptr_t)activityid) : 0;
#else
    (void)controlcode;
    (void)activityid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventEnabled(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jlong eventdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventEnabled");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle, (void*)(uintptr_t)eventdescriptor) : false;
#else
    (void)reghandle;
    (void)eventdescriptor;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventProviderEnabled(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jbyte level, jlong keyword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventProviderEnabled");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle, (uint8_t)level, (uint64_t)keyword) : false;
#else
    (void)reghandle;
    (void)level;
    (void)keyword;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventRegister(JNIEnv* km_env, jclass km_clazz, jlong providerid, jlong enablecallback, jlong callbackcontext, jlong reghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventRegister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerid, (void*)(uintptr_t)enablecallback, (void*)(uintptr_t)callbackcontext, (void*)(uintptr_t)reghandle) : 0;
#else
    (void)providerid;
    (void)enablecallback;
    (void)callbackcontext;
    (void)reghandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventSetInformation(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jint informationclass, jlong eventinformation, jint informationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventSetInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle, (int32_t)informationclass, (void*)(uintptr_t)eventinformation, (uint32_t)informationlength) : 0;
#else
    (void)reghandle;
    (void)informationclass;
    (void)eventinformation;
    (void)informationlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventUnregister(JNIEnv* km_env, jclass km_clazz, jlong reghandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventUnregister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle) : 0;
#else
    (void)reghandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventWrite(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jlong eventdescriptor, jint userdatacount, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWrite");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle, (void*)(uintptr_t)eventdescriptor, (uint32_t)userdatacount, (void*)(uintptr_t)userdata) : 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)userdatacount;
    (void)userdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventWriteEx(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jlong eventdescriptor, jlong filter, jint flags, jlong activityid, jlong relatedactivityid, jint userdatacount, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWriteEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle, (void*)(uintptr_t)eventdescriptor, (uint64_t)filter, (uint32_t)flags, (void*)(uintptr_t)activityid, (void*)(uintptr_t)relatedactivityid, (uint32_t)userdatacount, (void*)(uintptr_t)userdata) : 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)filter;
    (void)flags;
    (void)activityid;
    (void)relatedactivityid;
    (void)userdatacount;
    (void)userdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventWriteString(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jbyte level, jlong keyword, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint8_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWriteString");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle, (uint8_t)level, (uint64_t)keyword, (void*)(uintptr_t)string) : 0;
#else
    (void)reghandle;
    (void)level;
    (void)keyword;
    (void)string;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1eventWriteTransfer(JNIEnv* km_env, jclass km_clazz, jlong reghandle, jlong eventdescriptor, jlong activityid, jlong relatedactivityid, jint userdatacount, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EventWriteTransfer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)reghandle, (void*)(uintptr_t)eventdescriptor, (void*)(uintptr_t)activityid, (void*)(uintptr_t)relatedactivityid, (uint32_t)userdatacount, (void*)(uintptr_t)userdata) : 0;
#else
    (void)reghandle;
    (void)eventdescriptor;
    (void)activityid;
    (void)relatedactivityid;
    (void)userdatacount;
    (void)userdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1getTraceEnableFlags(JNIEnv* km_env, jclass km_clazz, jlong tracehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTraceEnableFlags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)tracehandle) : 0;
#else
    (void)tracehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1getTraceEnableLevel(JNIEnv* km_env, jclass km_clazz, jlong tracehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTraceEnableLevel");
    }
    uint8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)tracehandle) : 0;
#else
    (void)tracehandle;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1getTraceLoggerHandle(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTraceLoggerHandle");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer) : 0;
#else
    (void)buffer;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1openTraceFromBufferStream(JNIEnv* km_env, jclass km_clazz, jlong options, jlong buffercompletioncallback, jlong buffercompletioncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromBufferStream");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)options, (void*)(uintptr_t)buffercompletioncallback, (void*)(uintptr_t)buffercompletioncontext) : 0;
#else
    (void)options;
    (void)buffercompletioncallback;
    (void)buffercompletioncontext;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1openTraceFromFile(JNIEnv* km_env, jclass km_clazz, jlong logfilename, jlong options, jlong logfileheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromFile");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logfilename, (void*)(uintptr_t)options, (void*)(uintptr_t)logfileheader) : 0;
#else
    (void)logfilename;
    (void)options;
    (void)logfileheader;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1openTraceFromRealTimeLogger(JNIEnv* km_env, jclass km_clazz, jlong loggername, jlong options, jlong logfileheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromRealTimeLogger");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loggername, (void*)(uintptr_t)options, (void*)(uintptr_t)logfileheader) : 0;
#else
    (void)loggername;
    (void)options;
    (void)logfileheader;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1openTraceFromRealTimeLoggerWithAllocationOptions(JNIEnv* km_env, jclass km_clazz, jlong loggername, jlong options, jlong allocationsize, jlong memorypartitionhandle, jlong logfileheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTraceFromRealTimeLoggerWithAllocationOptions");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loggername, (void*)(uintptr_t)options, (uint64_t)allocationsize, (void*)(uintptr_t)memorypartitionhandle, (void*)(uintptr_t)logfileheader) : 0;
#else
    (void)loggername;
    (void)options;
    (void)allocationsize;
    (void)memorypartitionhandle;
    (void)logfileheader;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1processTrace(JNIEnv* km_env, jclass km_clazz, jlong handlearray, jint handlecount, jlong starttime, jlong endtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTrace");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handlearray, (uint32_t)handlecount, (void*)(uintptr_t)starttime, (void*)(uintptr_t)endtime) : 0;
#else
    (void)handlearray;
    (void)handlecount;
    (void)starttime;
    (void)endtime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1processTraceAddBufferToBufferStream(JNIEnv* km_env, jclass km_clazz, jlong tracehandle, jlong buffer, jint buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTraceAddBufferToBufferStream");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)tracehandle, (void*)(uintptr_t)buffer, (uint32_t)buffersize) : 0;
#else
    (void)tracehandle;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1processTraceBufferDecrementReference(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTraceBufferDecrementReference");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer) : 0;
#else
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1processTraceBufferIncrementReference(JNIEnv* km_env, jclass km_clazz, jlong tracehandle, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessTraceBufferIncrementReference");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)tracehandle, (void*)(uintptr_t)buffer) : 0;
#else
    (void)tracehandle;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1queryAllTracesA(JNIEnv* km_env, jclass km_clazz, jlong propertyarray, jint propertyarraycount, jlong loggercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAllTracesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propertyarray, (uint32_t)propertyarraycount, (void*)(uintptr_t)loggercount) : 0;
#else
    (void)propertyarray;
    (void)propertyarraycount;
    (void)loggercount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1queryAllTracesW(JNIEnv* km_env, jclass km_clazz, jlong propertyarray, jint propertyarraycount, jlong loggercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAllTracesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propertyarray, (uint32_t)propertyarraycount, (void*)(uintptr_t)loggercount) : 0;
#else
    (void)propertyarray;
    (void)propertyarraycount;
    (void)loggercount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1registerTraceGuidsA(JNIEnv* km_env, jclass km_clazz, jlong requestaddress, jlong requestcontext, jlong controlguid, jint guidcount, jlong traceguidreg, jlong mofimagepath, jlong mofresourcename, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTraceGuidsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestaddress, (void*)(uintptr_t)requestcontext, (void*)(uintptr_t)controlguid, (uint32_t)guidcount, (void*)(uintptr_t)traceguidreg, (void*)(uintptr_t)mofimagepath, (void*)(uintptr_t)mofresourcename, (void*)(uintptr_t)registrationhandle) : 0;
#else
    (void)requestaddress;
    (void)requestcontext;
    (void)controlguid;
    (void)guidcount;
    (void)traceguidreg;
    (void)mofimagepath;
    (void)mofresourcename;
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1registerTraceGuidsW(JNIEnv* km_env, jclass km_clazz, jlong requestaddress, jlong requestcontext, jlong controlguid, jint guidcount, jlong traceguidreg, jlong mofimagepath, jlong mofresourcename, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterTraceGuidsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requestaddress, (void*)(uintptr_t)requestcontext, (void*)(uintptr_t)controlguid, (uint32_t)guidcount, (void*)(uintptr_t)traceguidreg, (void*)(uintptr_t)mofimagepath, (void*)(uintptr_t)mofresourcename, (void*)(uintptr_t)registrationhandle) : 0;
#else
    (void)requestaddress;
    (void)requestcontext;
    (void)controlguid;
    (void)guidcount;
    (void)traceguidreg;
    (void)mofimagepath;
    (void)mofresourcename;
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1removeTraceCallback(JNIEnv* km_env, jclass km_clazz, jlong pguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveTraceCallback");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pguid) : 0;
#else
    (void)pguid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1setTraceCallback(JNIEnv* km_env, jclass km_clazz, jlong pguid, jlong eventcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTraceCallback");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pguid, (void*)(uintptr_t)eventcallback) : 0;
#else
    (void)pguid;
    (void)eventcallback;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1startTraceA(JNIEnv* km_env, jclass km_clazz, jlong tracehandle, jlong instancename, jlong properties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartTraceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tracehandle, (void*)(uintptr_t)instancename, (void*)(uintptr_t)properties) : 0;
#else
    (void)tracehandle;
    (void)instancename;
    (void)properties;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1startTraceW(JNIEnv* km_env, jclass km_clazz, jlong tracehandle, jlong instancename, jlong properties) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartTraceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tracehandle, (void*)(uintptr_t)instancename, (void*)(uintptr_t)properties) : 0;
#else
    (void)tracehandle;
    (void)instancename;
    (void)properties;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhAggregatePayloadFilters(JNIEnv* km_env, jclass km_clazz, jint payloadfiltercount, jlong payloadfilterptrs, jlong eventmatchallflags, jlong eventfilterdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhAggregatePayloadFilters");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)payloadfiltercount, (void*)(uintptr_t)payloadfilterptrs, (void*)(uintptr_t)eventmatchallflags, (void*)(uintptr_t)eventfilterdescriptor) : 0;
#else
    (void)payloadfiltercount;
    (void)payloadfilterptrs;
    (void)eventmatchallflags;
    (void)eventfilterdescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhCleanupPayloadEventFilterDescriptor(JNIEnv* km_env, jclass km_clazz, jlong eventfilterdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhCleanupPayloadEventFilterDescriptor");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventfilterdescriptor) : 0;
#else
    (void)eventfilterdescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhCloseDecodingHandle(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhCloseDecodingHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhCreatePayloadFilter(JNIEnv* km_env, jclass km_clazz, jlong providerguid, jlong eventdescriptor, jboolean eventmatchany, jint payloadpredicatecount, jlong payloadpredicates, jlong payloadfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, bool, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhCreatePayloadFilter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerguid, (void*)(uintptr_t)eventdescriptor, (bool)eventmatchany, (uint32_t)payloadpredicatecount, (void*)(uintptr_t)payloadpredicates, (void*)(uintptr_t)payloadfilter) : 0;
#else
    (void)providerguid;
    (void)eventdescriptor;
    (void)eventmatchany;
    (void)payloadpredicatecount;
    (void)payloadpredicates;
    (void)payloadfilter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhDeletePayloadFilter(JNIEnv* km_env, jclass km_clazz, jlong payloadfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhDeletePayloadFilter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)payloadfilter) : 0;
#else
    (void)payloadfilter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhEnumerateManifestProviderEvents(JNIEnv* km_env, jclass km_clazz, jlong providerguid, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateManifestProviderEvents");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerguid, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)providerguid;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhEnumerateProviderFieldInformation(JNIEnv* km_env, jclass km_clazz, jlong pguid, jint eventfieldtype, jlong pbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProviderFieldInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pguid, (int32_t)eventfieldtype, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pbuffersize) : 0;
#else
    (void)pguid;
    (void)eventfieldtype;
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhEnumerateProviderFilters(JNIEnv* km_env, jclass km_clazz, jlong guid, jint tdhcontextcount, jlong tdhcontext, jlong filtercount, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProviderFilters");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guid, (uint32_t)tdhcontextcount, (void*)(uintptr_t)tdhcontext, (void*)(uintptr_t)filtercount, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)guid;
    (void)tdhcontextcount;
    (void)tdhcontext;
    (void)filtercount;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhEnumerateProviders(JNIEnv* km_env, jclass km_clazz, jlong pbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProviders");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pbuffersize) : 0;
#else
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhEnumerateProvidersForDecodingSource(JNIEnv* km_env, jclass km_clazz, jint filter, jlong buffer, jint buffersize, jlong bufferrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhEnumerateProvidersForDecodingSource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)filter, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)bufferrequired) : 0;
#else
    (void)filter;
    (void)buffer;
    (void)buffersize;
    (void)bufferrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhFormatProperty(JNIEnv* km_env, jclass km_clazz, jlong eventinfo, jlong mapinfo, jint pointersize, jshort propertyintype, jshort propertyouttype, jshort propertylength, jshort userdatalength, jlong userdata, jlong buffersize, jlong buffer, jlong userdataconsumed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint16_t, uint16_t, uint16_t, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhFormatProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventinfo, (void*)(uintptr_t)mapinfo, (uint32_t)pointersize, (uint16_t)propertyintype, (uint16_t)propertyouttype, (uint16_t)propertylength, (uint16_t)userdatalength, (void*)(uintptr_t)userdata, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer, (void*)(uintptr_t)userdataconsumed) : 0;
#else
    (void)eventinfo;
    (void)mapinfo;
    (void)pointersize;
    (void)propertyintype;
    (void)propertyouttype;
    (void)propertylength;
    (void)userdatalength;
    (void)userdata;
    (void)buffersize;
    (void)buffer;
    (void)userdataconsumed;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetDecodingParameter(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong tdhcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetDecodingParameter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)handle, (void*)(uintptr_t)tdhcontext) : 0;
#else
    (void)handle;
    (void)tdhcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetEventInformation(JNIEnv* km_env, jclass km_clazz, jlong event, jint tdhcontextcount, jlong tdhcontext, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetEventInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)event, (uint32_t)tdhcontextcount, (void*)(uintptr_t)tdhcontext, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)event;
    (void)tdhcontextcount;
    (void)tdhcontext;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetEventMapInformation(JNIEnv* km_env, jclass km_clazz, jlong pevent, jlong pmapname, jlong pbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetEventMapInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pevent, (void*)(uintptr_t)pmapname, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pbuffersize) : 0;
#else
    (void)pevent;
    (void)pmapname;
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetManifestEventInformation(JNIEnv* km_env, jclass km_clazz, jlong providerguid, jlong eventdescriptor, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetManifestEventInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)providerguid, (void*)(uintptr_t)eventdescriptor, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : 0;
#else
    (void)providerguid;
    (void)eventdescriptor;
    (void)buffer;
    (void)buffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetProperty(JNIEnv* km_env, jclass km_clazz, jlong pevent, jint tdhcontextcount, jlong ptdhcontext, jint propertydatacount, jlong ppropertydata, jint buffersize, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pevent, (uint32_t)tdhcontextcount, (void*)(uintptr_t)ptdhcontext, (uint32_t)propertydatacount, (void*)(uintptr_t)ppropertydata, (uint32_t)buffersize, (void*)(uintptr_t)pbuffer) : 0;
#else
    (void)pevent;
    (void)tdhcontextcount;
    (void)ptdhcontext;
    (void)propertydatacount;
    (void)ppropertydata;
    (void)buffersize;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetPropertySize(JNIEnv* km_env, jclass km_clazz, jlong pevent, jint tdhcontextcount, jlong ptdhcontext, jint propertydatacount, jlong ppropertydata, jlong ppropertysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetPropertySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pevent, (uint32_t)tdhcontextcount, (void*)(uintptr_t)ptdhcontext, (uint32_t)propertydatacount, (void*)(uintptr_t)ppropertydata, (void*)(uintptr_t)ppropertysize) : 0;
#else
    (void)pevent;
    (void)tdhcontextcount;
    (void)ptdhcontext;
    (void)propertydatacount;
    (void)ppropertydata;
    (void)ppropertysize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetWppMessage(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong eventrecord, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetWppMessage");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)handle, (void*)(uintptr_t)eventrecord, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer) : 0;
#else
    (void)handle;
    (void)eventrecord;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhGetWppProperty(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong eventrecord, jlong propertyname, jlong buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhGetWppProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)handle, (void*)(uintptr_t)eventrecord, (void*)(uintptr_t)propertyname, (void*)(uintptr_t)buffersize, (void*)(uintptr_t)buffer) : 0;
#else
    (void)handle;
    (void)eventrecord;
    (void)propertyname;
    (void)buffersize;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhLoadManifest(JNIEnv* km_env, jclass km_clazz, jlong manifest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhLoadManifest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)manifest) : 0;
#else
    (void)manifest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhLoadManifestFromBinary(JNIEnv* km_env, jclass km_clazz, jlong binarypath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhLoadManifestFromBinary");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)binarypath) : 0;
#else
    (void)binarypath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhLoadManifestFromMemory(JNIEnv* km_env, jclass km_clazz, jlong pdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhLoadManifestFromMemory");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdata, (uint32_t)cbdata) : 0;
#else
    (void)pdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhOpenDecodingHandle(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhOpenDecodingHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : 0;
#else
    (void)handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhQueryProviderFieldInformation(JNIEnv* km_env, jclass km_clazz, jlong pguid, jlong eventfieldvalue, jint eventfieldtype, jlong pbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhQueryProviderFieldInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pguid, (uint64_t)eventfieldvalue, (int32_t)eventfieldtype, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pbuffersize) : 0;
#else
    (void)pguid;
    (void)eventfieldvalue;
    (void)eventfieldtype;
    (void)pbuffer;
    (void)pbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhSetDecodingParameter(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong tdhcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhSetDecodingParameter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)handle, (void*)(uintptr_t)tdhcontext) : 0;
#else
    (void)handle;
    (void)tdhcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhUnloadManifest(JNIEnv* km_env, jclass km_clazz, jlong manifest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhUnloadManifest");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)manifest) : 0;
#else
    (void)manifest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1tdhUnloadManifestFromMemory(JNIEnv* km_env, jclass km_clazz, jlong pdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tdh.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TdhUnloadManifestFromMemory");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdata, (uint32_t)cbdata) : 0;
#else
    (void)pdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1traceEvent(JNIEnv* km_env, jclass km_clazz, jlong tracehandle, jlong eventtrace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceEvent");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)tracehandle, (void*)(uintptr_t)eventtrace) : 0;
#else
    (void)tracehandle;
    (void)eventtrace;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1traceEventInstance(JNIEnv* km_env, jclass km_clazz, jlong tracehandle, jlong eventtrace, jlong instinfo, jlong parentinstinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceEventInstance");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)tracehandle, (void*)(uintptr_t)eventtrace, (void*)(uintptr_t)instinfo, (void*)(uintptr_t)parentinstinfo) : 0;
#else
    (void)tracehandle;
    (void)eventtrace;
    (void)instinfo;
    (void)parentinstinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1traceMessage(JNIEnv* km_env, jclass km_clazz, jlong loggerhandle, jint messageflags, jlong messageguid, jshort messagenumber, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(uint64_t, uint32_t, void*, uint16_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceMessage");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint64_t)loggerhandle, (uint32_t)messageflags, (void*)(uintptr_t)messageguid, (uint16_t)messagenumber); break;
            case 1: km_res = km_fn_ptr((uint64_t)loggerhandle, (uint32_t)messageflags, (void*)(uintptr_t)messageguid, (uint16_t)messagenumber, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint64_t)loggerhandle, (uint32_t)messageflags, (void*)(uintptr_t)messageguid, (uint16_t)messagenumber, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint64_t)loggerhandle, (uint32_t)messageflags, (void*)(uintptr_t)messageguid, (uint16_t)messagenumber, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint64_t)loggerhandle, (uint32_t)messageflags, (void*)(uintptr_t)messageguid, (uint16_t)messagenumber, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)loggerhandle;
    (void)messageflags;
    (void)messageguid;
    (void)messagenumber;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1traceMessageVa(JNIEnv* km_env, jclass km_clazz, jlong loggerhandle, jint messageflags, jlong messageguid, jshort messagenumber, jlong messagearglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TraceMessageVa");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)loggerhandle, (uint32_t)messageflags, (void*)(uintptr_t)messageguid, (uint16_t)messagenumber, (void*)(uintptr_t)messagearglist) : 0;
#else
    (void)loggerhandle;
    (void)messageflags;
    (void)messageguid;
    (void)messagenumber;
    (void)messagearglist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_diagnostics_etw_WindowsWin32SystemDiagnosticsEtwJniBridge_windowssys_1windows_1win32_1system_1diagnostics_1etw_1unregisterTraceGuids(JNIEnv* km_env, jclass km_clazz, jlong registrationhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterTraceGuids");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)registrationhandle) : 0;
#else
    (void)registrationhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

