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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1BackupEventLogA(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jlong lpbackupfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupEventLogA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (void*)(uintptr_t)lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1BackupEventLogW(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jlong lpbackupfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupEventLogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (void*)(uintptr_t)lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1ClearEventLogA(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jlong lpbackupfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearEventLogA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (void*)(uintptr_t)lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1ClearEventLogW(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jlong lpbackupfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearEventLogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (void*)(uintptr_t)lpbackupfilename) : -1;
#else
    (void)heventlog;
    (void)lpbackupfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1CloseEventLog(JNIEnv* km_env, jclass km_clazz, jlong heventlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseEventLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog) : -1;
#else
    (void)heventlog;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1DeregisterEventSource(JNIEnv* km_env, jclass km_clazz, jlong heventlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterEventSource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog) : -1;
#else
    (void)heventlog;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtArchiveExportedLog(JNIEnv* km_env, jclass km_clazz, jlong session, jlong logfilepath, jint locale, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtArchiveExportedLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)logfilepath, (uint32_t)locale, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)logfilepath;
    (void)locale;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtCancel(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)object) : -1;
#else
    (void)object;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtClearLog(JNIEnv* km_env, jclass km_clazz, jlong session, jlong channelpath, jlong targetfilepath, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtClearLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)channelpath, (void*)(uintptr_t)targetfilepath, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)channelpath;
    (void)targetfilepath;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtClose(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)object) : -1;
#else
    (void)object;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtCreateBookmark(JNIEnv* km_env, jclass km_clazz, jlong bookmarkxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtCreateBookmark");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bookmarkxml) : -1;
#else
    (void)bookmarkxml;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtCreateRenderContext(JNIEnv* km_env, jclass km_clazz, jint valuepathscount, jlong valuepaths, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtCreateRenderContext");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)valuepathscount, (void*)(uintptr_t)valuepaths, (uint32_t)flags) : -1;
#else
    (void)valuepathscount;
    (void)valuepaths;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtExportLog(JNIEnv* km_env, jclass km_clazz, jlong session, jlong path, jlong query, jlong targetfilepath, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtExportLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)path, (void*)(uintptr_t)query, (void*)(uintptr_t)targetfilepath, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)path;
    (void)query;
    (void)targetfilepath;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtFormatMessage(JNIEnv* km_env, jclass km_clazz, jlong publishermetadata, jlong event, jint messageid, jint valuecount, jlong values, jint flags, jint buffersize, jlong buffer, jlong bufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtFormatMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)publishermetadata, (int64_t)event, (uint32_t)messageid, (uint32_t)valuecount, (void*)(uintptr_t)values, (uint32_t)flags, (uint32_t)buffersize, (void*)(uintptr_t)buffer, (void*)(uintptr_t)bufferused) : -1;
#else
    (void)publishermetadata;
    (void)event;
    (void)messageid;
    (void)valuecount;
    (void)values;
    (void)flags;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetChannelConfigProperty(JNIEnv* km_env, jclass km_clazz, jlong channelconfig, jint propertyid, jint flags, jint propertyvaluebuffersize, jlong propertyvaluebuffer, jlong propertyvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetChannelConfigProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)channelconfig, (int32_t)propertyid, (uint32_t)flags, (uint32_t)propertyvaluebuffersize, (void*)(uintptr_t)propertyvaluebuffer, (void*)(uintptr_t)propertyvaluebufferused) : -1;
#else
    (void)channelconfig;
    (void)propertyid;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetEventInfo(JNIEnv* km_env, jclass km_clazz, jlong event, jint propertyid, jint propertyvaluebuffersize, jlong propertyvaluebuffer, jlong propertyvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetEventInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)event, (int32_t)propertyid, (uint32_t)propertyvaluebuffersize, (void*)(uintptr_t)propertyvaluebuffer, (void*)(uintptr_t)propertyvaluebufferused) : -1;
#else
    (void)event;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetEventMetadataProperty(JNIEnv* km_env, jclass km_clazz, jlong eventmetadata, jint propertyid, jint flags, jint eventmetadatapropertybuffersize, jlong eventmetadatapropertybuffer, jlong eventmetadatapropertybufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetEventMetadataProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)eventmetadata, (int32_t)propertyid, (uint32_t)flags, (uint32_t)eventmetadatapropertybuffersize, (void*)(uintptr_t)eventmetadatapropertybuffer, (void*)(uintptr_t)eventmetadatapropertybufferused) : -1;
#else
    (void)eventmetadata;
    (void)propertyid;
    (void)flags;
    (void)eventmetadatapropertybuffersize;
    (void)eventmetadatapropertybuffer;
    (void)eventmetadatapropertybufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetExtendedStatus(JNIEnv* km_env, jclass km_clazz, jint buffersize, jlong buffer, jlong bufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetExtendedStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)buffersize, (void*)(uintptr_t)buffer, (void*)(uintptr_t)bufferused) : 0;
#else
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetLogInfo(JNIEnv* km_env, jclass km_clazz, jlong arg_0_log, jint propertyid, jint propertyvaluebuffersize, jlong propertyvaluebuffer, jlong propertyvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetLogInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)arg_0_log, (int32_t)propertyid, (uint32_t)propertyvaluebuffersize, (void*)(uintptr_t)propertyvaluebuffer, (void*)(uintptr_t)propertyvaluebufferused) : -1;
#else
    (void)arg_0_log;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetObjectArrayProperty(JNIEnv* km_env, jclass km_clazz, jlong objectarray, jint propertyid, jint arrayindex, jint flags, jint propertyvaluebuffersize, jlong propertyvaluebuffer, jlong propertyvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetObjectArrayProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objectarray, (uint32_t)propertyid, (uint32_t)arrayindex, (uint32_t)flags, (uint32_t)propertyvaluebuffersize, (void*)(uintptr_t)propertyvaluebuffer, (void*)(uintptr_t)propertyvaluebufferused) : -1;
#else
    (void)objectarray;
    (void)propertyid;
    (void)arrayindex;
    (void)flags;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetObjectArraySize(JNIEnv* km_env, jclass km_clazz, jlong objectarray, jlong objectarraysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetObjectArraySize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objectarray, (void*)(uintptr_t)objectarraysize) : -1;
#else
    (void)objectarray;
    (void)objectarraysize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetPublisherMetadataProperty(JNIEnv* km_env, jclass km_clazz, jlong publishermetadata, jint propertyid, jint flags, jint publishermetadatapropertybuffersize, jlong publishermetadatapropertybuffer, jlong publishermetadatapropertybufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetPublisherMetadataProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)publishermetadata, (int32_t)propertyid, (uint32_t)flags, (uint32_t)publishermetadatapropertybuffersize, (void*)(uintptr_t)publishermetadatapropertybuffer, (void*)(uintptr_t)publishermetadatapropertybufferused) : -1;
#else
    (void)publishermetadata;
    (void)propertyid;
    (void)flags;
    (void)publishermetadatapropertybuffersize;
    (void)publishermetadatapropertybuffer;
    (void)publishermetadatapropertybufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtGetQueryInfo(JNIEnv* km_env, jclass km_clazz, jlong queryorsubscription, jint propertyid, jint propertyvaluebuffersize, jlong propertyvaluebuffer, jlong propertyvaluebufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtGetQueryInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)queryorsubscription, (int32_t)propertyid, (uint32_t)propertyvaluebuffersize, (void*)(uintptr_t)propertyvaluebuffer, (void*)(uintptr_t)propertyvaluebufferused) : -1;
#else
    (void)queryorsubscription;
    (void)propertyid;
    (void)propertyvaluebuffersize;
    (void)propertyvaluebuffer;
    (void)propertyvaluebufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtNext(JNIEnv* km_env, jclass km_clazz, jlong resultset, jint eventssize, jlong events, jint timeout, jint flags, jlong returned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)resultset, (uint32_t)eventssize, (void*)(uintptr_t)events, (uint32_t)timeout, (uint32_t)flags, (void*)(uintptr_t)returned) : -1;
#else
    (void)resultset;
    (void)eventssize;
    (void)events;
    (void)timeout;
    (void)flags;
    (void)returned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtNextChannelPath(JNIEnv* km_env, jclass km_clazz, jlong channelenum, jint channelpathbuffersize, jlong channelpathbuffer, jlong channelpathbufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNextChannelPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)channelenum, (uint32_t)channelpathbuffersize, (void*)(uintptr_t)channelpathbuffer, (void*)(uintptr_t)channelpathbufferused) : -1;
#else
    (void)channelenum;
    (void)channelpathbuffersize;
    (void)channelpathbuffer;
    (void)channelpathbufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtNextEventMetadata(JNIEnv* km_env, jclass km_clazz, jlong eventmetadataenum, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNextEventMetadata");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)eventmetadataenum, (uint32_t)flags) : -1;
#else
    (void)eventmetadataenum;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtNextPublisherId(JNIEnv* km_env, jclass km_clazz, jlong publisherenum, jint publisheridbuffersize, jlong publisheridbuffer, jlong publisheridbufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtNextPublisherId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)publisherenum, (uint32_t)publisheridbuffersize, (void*)(uintptr_t)publisheridbuffer, (void*)(uintptr_t)publisheridbufferused) : -1;
#else
    (void)publisherenum;
    (void)publisheridbuffersize;
    (void)publisheridbuffer;
    (void)publisheridbufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtOpenChannelConfig(JNIEnv* km_env, jclass km_clazz, jlong session, jlong channelpath, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenChannelConfig");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)channelpath, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)channelpath;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtOpenChannelEnum(JNIEnv* km_env, jclass km_clazz, jlong session, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenChannelEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtOpenEventMetadataEnum(JNIEnv* km_env, jclass km_clazz, jlong publishermetadata, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenEventMetadataEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)publishermetadata, (uint32_t)flags) : -1;
#else
    (void)publishermetadata;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtOpenLog(JNIEnv* km_env, jclass km_clazz, jlong session, jlong path, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenLog");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)path, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)path;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtOpenPublisherEnum(JNIEnv* km_env, jclass km_clazz, jlong session, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenPublisherEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtOpenPublisherMetadata(JNIEnv* km_env, jclass km_clazz, jlong session, jlong publisherid, jlong logfilepath, jint locale, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenPublisherMetadata");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)publisherid, (void*)(uintptr_t)logfilepath, (uint32_t)locale, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)publisherid;
    (void)logfilepath;
    (void)locale;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtOpenSession(JNIEnv* km_env, jclass km_clazz, jint loginclass, jlong login, jint timeout, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtOpenSession");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)loginclass, (void*)(uintptr_t)login, (uint32_t)timeout, (uint32_t)flags) : -1;
#else
    (void)loginclass;
    (void)login;
    (void)timeout;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtQuery(JNIEnv* km_env, jclass km_clazz, jlong session, jlong path, jlong query, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtQuery");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)path, (void*)(uintptr_t)query, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)path;
    (void)query;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtRender(JNIEnv* km_env, jclass km_clazz, jlong context, jlong fragment, jint flags, jint buffersize, jlong buffer, jlong bufferused, jlong propertycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtRender");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)context, (int64_t)fragment, (uint32_t)flags, (uint32_t)buffersize, (void*)(uintptr_t)buffer, (void*)(uintptr_t)bufferused, (void*)(uintptr_t)propertycount) : -1;
#else
    (void)context;
    (void)fragment;
    (void)flags;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    (void)propertycount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtSaveChannelConfig(JNIEnv* km_env, jclass km_clazz, jlong channelconfig, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSaveChannelConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)channelconfig, (uint32_t)flags) : -1;
#else
    (void)channelconfig;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtSeek(JNIEnv* km_env, jclass km_clazz, jlong resultset, jlong position, jlong bookmark, jint timeout, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSeek");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)resultset, (int64_t)position, (int64_t)bookmark, (uint32_t)timeout, (uint32_t)flags) : -1;
#else
    (void)resultset;
    (void)position;
    (void)bookmark;
    (void)timeout;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtSetChannelConfigProperty(JNIEnv* km_env, jclass km_clazz, jlong channelconfig, jint propertyid, jint flags, jlong propertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSetChannelConfigProperty");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)channelconfig, (int32_t)propertyid, (uint32_t)flags, (void*)(uintptr_t)propertyvalue) : -1;
#else
    (void)channelconfig;
    (void)propertyid;
    (void)flags;
    (void)propertyvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtSubscribe(JNIEnv* km_env, jclass km_clazz, jlong session, jlong signalevent, jlong channelpath, jlong query, jlong bookmark, jlong context, jlong callback, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtSubscribe");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)session, (void*)(uintptr_t)signalevent, (void*)(uintptr_t)channelpath, (void*)(uintptr_t)query, (int64_t)bookmark, (void*)(uintptr_t)context, (void*)(uintptr_t)callback, (uint32_t)flags) : -1;
#else
    (void)session;
    (void)signalevent;
    (void)channelpath;
    (void)query;
    (void)bookmark;
    (void)context;
    (void)callback;
    (void)flags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1EvtUpdateBookmark(JNIEnv* km_env, jclass km_clazz, jlong bookmark, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wevtapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvtUpdateBookmark");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)bookmark, (int64_t)event) : -1;
#else
    (void)bookmark;
    (void)event;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1GetEventLogInformation(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jint dwinfolevel, jlong lpbuffer, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEventLogInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)heventlog;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1GetNumberOfEventLogRecords(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jlong numberofrecords) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfEventLogRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (void*)(uintptr_t)numberofrecords) : -1;
#else
    (void)heventlog;
    (void)numberofrecords;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1GetOldestEventLogRecord(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jlong oldestrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOldestEventLogRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (void*)(uintptr_t)oldestrecord) : -1;
#else
    (void)heventlog;
    (void)oldestrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1NotifyChangeEventLog(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyChangeEventLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (void*)(uintptr_t)hevent) : -1;
#else
    (void)heventlog;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1OpenBackupEventLogA(JNIEnv* km_env, jclass km_clazz, jlong lpuncservername, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenBackupEventLogA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpuncservername, (void*)(uintptr_t)lpfilename) : NULL;
#else
    (void)lpuncservername;
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1OpenBackupEventLogW(JNIEnv* km_env, jclass km_clazz, jlong lpuncservername, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenBackupEventLogW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpuncservername, (void*)(uintptr_t)lpfilename) : NULL;
#else
    (void)lpuncservername;
    (void)lpfilename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1OpenEventLogA(JNIEnv* km_env, jclass km_clazz, jlong lpuncservername, jlong lpsourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventLogA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpuncservername, (void*)(uintptr_t)lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1OpenEventLogW(JNIEnv* km_env, jclass km_clazz, jlong lpuncservername, jlong lpsourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventLogW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpuncservername, (void*)(uintptr_t)lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1ReadEventLogA(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jint dwreadflags, jint dwrecordoffset, jlong lpbuffer, jint nnumberofbytestoread, jlong pnbytesread, jlong pnminnumberofbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadEventLogA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (uint32_t)dwreadflags, (uint32_t)dwrecordoffset, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestoread, (void*)(uintptr_t)pnbytesread, (void*)(uintptr_t)pnminnumberofbytesneeded) : -1;
#else
    (void)heventlog;
    (void)dwreadflags;
    (void)dwrecordoffset;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)pnbytesread;
    (void)pnminnumberofbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1ReadEventLogW(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jint dwreadflags, jint dwrecordoffset, jlong lpbuffer, jint nnumberofbytestoread, jlong pnbytesread, jlong pnminnumberofbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadEventLogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (uint32_t)dwreadflags, (uint32_t)dwrecordoffset, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestoread, (void*)(uintptr_t)pnbytesread, (void*)(uintptr_t)pnminnumberofbytesneeded) : -1;
#else
    (void)heventlog;
    (void)dwreadflags;
    (void)dwrecordoffset;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)pnbytesread;
    (void)pnminnumberofbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1RegisterEventSourceA(JNIEnv* km_env, jclass km_clazz, jlong lpuncservername, jlong lpsourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterEventSourceA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpuncservername, (void*)(uintptr_t)lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1RegisterEventSourceW(JNIEnv* km_env, jclass km_clazz, jlong lpuncservername, jlong lpsourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterEventSourceW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpuncservername, (void*)(uintptr_t)lpsourcename) : NULL;
#else
    (void)lpuncservername;
    (void)lpsourcename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1ReportEventA(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jshort wtype, jshort wcategory, jint dweventid, jlong lpusersid, jshort wnumstrings, jint dwdatasize, jlong lpstrings, jlong lprawdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportEventA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (uint16_t)wtype, (uint16_t)wcategory, (uint32_t)dweventid, (void*)(uintptr_t)lpusersid, (uint16_t)wnumstrings, (uint32_t)dwdatasize, (void*)(uintptr_t)lpstrings, (void*)(uintptr_t)lprawdata) : -1;
#else
    (void)heventlog;
    (void)wtype;
    (void)wcategory;
    (void)dweventid;
    (void)lpusersid;
    (void)wnumstrings;
    (void)dwdatasize;
    (void)lpstrings;
    (void)lprawdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_eventlog_WindowsWin32SystemEventlogJniBridge_windowssys_1windows_1win32_1system_1eventlog_1ReportEventW(JNIEnv* km_env, jclass km_clazz, jlong heventlog, jshort wtype, jshort wcategory, jint dweventid, jlong lpusersid, jshort wnumstrings, jint dwdatasize, jlong lpstrings, jlong lprawdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, uint32_t, void*, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportEventW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heventlog, (uint16_t)wtype, (uint16_t)wcategory, (uint32_t)dweventid, (void*)(uintptr_t)lpusersid, (uint16_t)wnumstrings, (uint32_t)dwdatasize, (void*)(uintptr_t)lpstrings, (void*)(uintptr_t)lprawdata) : -1;
#else
    (void)heventlog;
    (void)wtype;
    (void)wcategory;
    (void)dweventid;
    (void)lpusersid;
    (void)wnumstrings;
    (void)dwdatasize;
    (void)lpstrings;
    (void)lprawdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

