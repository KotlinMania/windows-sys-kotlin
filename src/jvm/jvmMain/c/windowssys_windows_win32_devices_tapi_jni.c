#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include <jni.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdlib.h>
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiGetTnefStreamCodepage(JNIEnv* km_env, jclass km_clazz, jlong lpstream, jlong lpulcodepage, jlong lpulsubcodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTnefStreamCodepage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpstream, (void*)(uintptr_t)lpulcodepage, (void*)(uintptr_t)lpulsubcodepage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpstream;
    (void)lpulcodepage;
    (void)lpulsubcodepage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiOpenTnefStream(JNIEnv* km_env, jclass km_clazz, jlong lpvsupport, jlong lpstream, jlong lpszstreamname, jint ulflags, jlong lpmessage, jshort wkeyval, jlong lpptnef) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTnefStream");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpvsupport, (void*)(uintptr_t)lpstream, (void*)(uintptr_t)lpszstreamname, (uint32_t)ulflags, (void*)(uintptr_t)lpmessage, (uint16_t)wkeyval, (void*)(uintptr_t)lpptnef);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpvsupport;
    (void)lpstream;
    (void)lpszstreamname;
    (void)ulflags;
    (void)lpmessage;
    (void)wkeyval;
    (void)lpptnef;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiOpenTnefStreamEx(JNIEnv* km_env, jclass km_clazz, jlong lpvsupport, jlong lpstream, jlong lpszstreamname, jint ulflags, jlong lpmessage, jshort wkeyval, jlong lpadressbook, jlong lpptnef) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTnefStreamEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpvsupport, (void*)(uintptr_t)lpstream, (void*)(uintptr_t)lpszstreamname, (uint32_t)ulflags, (void*)(uintptr_t)lpmessage, (uint16_t)wkeyval, (void*)(uintptr_t)lpadressbook, (void*)(uintptr_t)lpptnef);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpvsupport;
    (void)lpstream;
    (void)lpszstreamname;
    (void)ulflags;
    (void)lpmessage;
    (void)wkeyval;
    (void)lpadressbook;
    (void)lpptnef;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineAccept(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAccept");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineAddProvider(JNIEnv* km_env, jclass km_clazz, jlong lpszproviderfilename, jlong hwndowner, jlong lpdwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszproviderfilename, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpdwpermanentproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineAddProviderA(JNIEnv* km_env, jclass km_clazz, jlong lpszproviderfilename, jlong hwndowner, jlong lpdwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProviderA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszproviderfilename, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpdwpermanentproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineAddProviderW(JNIEnv* km_env, jclass km_clazz, jlong lpszproviderfilename, jlong hwndowner, jlong lpdwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProviderW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszproviderfilename, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpdwpermanentproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineAddToConference(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jint hconsultcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddToConference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hconfcall, (uint32_t)hconsultcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconfcall;
    (void)hconsultcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineAgentSpecific(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwagentextensionidindex, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAgentSpecific");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwagentextensionidindex, (void*)(uintptr_t)lpparams, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwagentextensionidindex;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineAnswer(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAnswer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineBlindTransfer(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransfer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineBlindTransferA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransferA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineBlindTransferW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddressw, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransferW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddressw, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddressw;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineClose(JNIEnv* km_env, jclass km_clazz, jint hline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineCompleteCall(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpdwcompletionid, jint dwcompletionmode, jint dwmessageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCompleteCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpdwcompletionid, (uint32_t)dwcompletionmode, (uint32_t)dwmessageid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpdwcompletionid;
    (void)dwcompletionmode;
    (void)dwmessageid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineCompleteTransfer(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hconsultcall, jlong lphconfcall, jint dwtransfermode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCompleteTransfer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)hconsultcall, (void*)(uintptr_t)lphconfcall, (uint32_t)dwtransfermode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)hconsultcall;
    (void)lphconfcall;
    (void)dwtransfermode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineConfigDialog(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineConfigDialogA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineConfigDialogEdit(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass, jlong lpdeviceconfigin, jint dwsize, jlong lpdeviceconfigout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEdit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceconfigin, (uint32_t)dwsize, (void*)(uintptr_t)lpdeviceconfigout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineConfigDialogEditA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass, jlong lpdeviceconfigin, jint dwsize, jlong lpdeviceconfigout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEditA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceconfigin, (uint32_t)dwsize, (void*)(uintptr_t)lpdeviceconfigout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineConfigDialogEditW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass, jlong lpdeviceconfigin, jint dwsize, jlong lpdeviceconfigout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEditW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceconfigin, (uint32_t)dwsize, (void*)(uintptr_t)lpdeviceconfigout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineConfigDialogW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineConfigProvider(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint dwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndowner, (uint32_t)dwpermanentproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndowner;
    (void)dwpermanentproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineCreateAgentA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpszagentid, jlong lpszagentpin, jlong lphagent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpszagentid, (void*)(uintptr_t)lpszagentpin, (void*)(uintptr_t)lphagent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpszagentid;
    (void)lpszagentpin;
    (void)lphagent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineCreateAgentSessionA(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpszagentpin, jint dwworkingaddressid, jlong lpgroupid, jlong lphagentsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentSessionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpszagentpin, (uint32_t)dwworkingaddressid, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lphagentsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagent;
    (void)lpszagentpin;
    (void)dwworkingaddressid;
    (void)lpgroupid;
    (void)lphagentsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineCreateAgentSessionW(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpszagentpin, jint dwworkingaddressid, jlong lpgroupid, jlong lphagentsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentSessionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpszagentpin, (uint32_t)dwworkingaddressid, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lphagentsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagent;
    (void)lpszagentpin;
    (void)dwworkingaddressid;
    (void)lpgroupid;
    (void)lphagentsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineCreateAgentW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpszagentid, jlong lpszagentpin, jlong lphagent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpszagentid, (void*)(uintptr_t)lpszagentpin, (void*)(uintptr_t)lphagent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpszagentid;
    (void)lpszagentpin;
    (void)lphagent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineDeallocateCall(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDeallocateCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineDevSpecific(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDevSpecific");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (void*)(uintptr_t)lpparams, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineDevSpecificFeature(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwfeature, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDevSpecificFeature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwfeature, (void*)(uintptr_t)lpparams, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwfeature;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineDial(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDial");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineDialA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDialA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineDialW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDialW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineDrop(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDrop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineForward(JNIEnv* km_env, jclass km_clazz, jint hline, jint balladdresses, jint dwaddressid, jlong lpforwardlist, jint dwnumringsnoanswer, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForward");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)balladdresses, (uint32_t)dwaddressid, (void*)(uintptr_t)lpforwardlist, (uint32_t)dwnumringsnoanswer, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineForwardA(JNIEnv* km_env, jclass km_clazz, jint hline, jint balladdresses, jint dwaddressid, jlong lpforwardlist, jint dwnumringsnoanswer, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForwardA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)balladdresses, (uint32_t)dwaddressid, (void*)(uintptr_t)lpforwardlist, (uint32_t)dwnumringsnoanswer, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineForwardW(JNIEnv* km_env, jclass km_clazz, jint hline, jint balladdresses, jint dwaddressid, jlong lpforwardlist, jint dwnumringsnoanswer, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForwardW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)balladdresses, (uint32_t)dwaddressid, (void*)(uintptr_t)lpforwardlist, (uint32_t)dwnumringsnoanswer, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGatherDigits(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes, jlong lpsdigits, jint dwnumdigits, jlong lpszterminationdigits, jint dwfirstdigittimeout, jint dwinterdigittimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes, (void*)(uintptr_t)lpsdigits, (uint32_t)dwnumdigits, (void*)(uintptr_t)lpszterminationdigits, (uint32_t)dwfirstdigittimeout, (uint32_t)dwinterdigittimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGatherDigitsA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes, jlong lpsdigits, jint dwnumdigits, jlong lpszterminationdigits, jint dwfirstdigittimeout, jint dwinterdigittimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigitsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes, (void*)(uintptr_t)lpsdigits, (uint32_t)dwnumdigits, (void*)(uintptr_t)lpszterminationdigits, (uint32_t)dwfirstdigittimeout, (uint32_t)dwinterdigittimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGatherDigitsW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes, jlong lpsdigits, jint dwnumdigits, jlong lpszterminationdigits, jint dwfirstdigittimeout, jint dwinterdigittimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigitsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes, (void*)(uintptr_t)lpsdigits, (uint32_t)dwnumdigits, (void*)(uintptr_t)lpszterminationdigits, (uint32_t)dwfirstdigittimeout, (uint32_t)dwinterdigittimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGenerateDigits(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmode, jlong lpszdigits, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmode, (void*)(uintptr_t)lpszdigits, (uint32_t)dwduration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGenerateDigitsA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmode, jlong lpszdigits, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigitsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmode, (void*)(uintptr_t)lpszdigits, (uint32_t)dwduration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGenerateDigitsW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmode, jlong lpszdigits, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigitsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmode, (void*)(uintptr_t)lpszdigits, (uint32_t)dwduration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGenerateTone(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwtonemode, jint dwduration, jint dwnumtones, jlong lptones) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateTone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwtonemode, (uint32_t)dwduration, (uint32_t)dwnumtones, (void*)(uintptr_t)lptones);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwtonemode;
    (void)dwduration;
    (void)dwnumtones;
    (void)lptones;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressCaps(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwapiversion, jint dwextversion, jlong lpaddresscaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpaddresscaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwapiversion, jint dwextversion, jlong lpaddresscaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCapsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpaddresscaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwapiversion, jint dwextversion, jlong lpaddresscaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCapsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpaddresscaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressID(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwaddressid, jint dwaddressmode, jlong lpsaddress, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwaddressid, (uint32_t)dwaddressmode, (void*)(uintptr_t)lpsaddress, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressIDA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwaddressid, jint dwaddressmode, jlong lpsaddress, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressIDA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwaddressid, (uint32_t)dwaddressmode, (void*)(uintptr_t)lpsaddress, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressIDW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwaddressid, jint dwaddressmode, jlong lpsaddress, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressIDW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwaddressid, (uint32_t)dwaddressmode, (void*)(uintptr_t)lpsaddress, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressStatus(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpaddressstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpaddressstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressStatusA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpaddressstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpaddressstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAddressStatusW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpaddressstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpaddressstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentActivityListA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentactivitylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentActivityListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentactivitylist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentactivitylist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentActivityListW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentactivitylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentActivityListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentactivitylist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentactivitylist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwappapiversion, jlong lpagentcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentCapsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwappapiversion, (void*)(uintptr_t)lpagentcaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwappapiversion;
    (void)lpagentcaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwappapiversion, jlong lpagentcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentCapsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwappapiversion, (void*)(uintptr_t)lpagentcaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwappapiversion;
    (void)lpagentcaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentGroupListA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentGroupListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentgrouplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentGroupListW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentGroupListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentgrouplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentInfo(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpagentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpagentinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagent;
    (void)lpagentinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentSessionInfo(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagentsession, jlong lpagentsessioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentSessionInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagentsession, (void*)(uintptr_t)lpagentsessioninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagentsession;
    (void)lpagentsessioninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentSessionList(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpagentsessionlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentSessionList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpagentsessionlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagent;
    (void)lpagentsessionlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentStatusA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAgentStatusW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAppPriority(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpextensionname, jlong lpdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriority");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpextensionname, (void*)(uintptr_t)lpdwpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAppPriorityA(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpextensionname, jlong lpdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriorityA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpextensionname, (void*)(uintptr_t)lpdwpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetAppPriorityW(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpextensionname, jlong lpdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriorityW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpextensionname, (void*)(uintptr_t)lpdwpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetCallInfo(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpcallinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetCallInfoA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpcallinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetCallInfoW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpcallinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetCallStatus(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpcallstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetConfRelatedCalls(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcalllist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetConfRelatedCalls");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcalllist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpcalllist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetCountry(JNIEnv* km_env, jclass km_clazz, jint dwcountryid, jint dwapiversion, jlong lplinecountrylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcountryid, (uint32_t)dwapiversion, (void*)(uintptr_t)lplinecountrylist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetCountryA(JNIEnv* km_env, jclass km_clazz, jint dwcountryid, jint dwapiversion, jlong lplinecountrylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcountryid, (uint32_t)dwapiversion, (void*)(uintptr_t)lplinecountrylist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetCountryW(JNIEnv* km_env, jclass km_clazz, jint dwcountryid, jint dwapiversion, jlong lplinecountrylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcountryid, (uint32_t)dwapiversion, (void*)(uintptr_t)lplinecountrylist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetDevCaps(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lplinedevcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lplinedevcaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lplinedevcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCapsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lplinedevcaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lplinedevcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCapsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lplinedevcaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetDevConfig(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfig");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetDevConfigA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfigA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetDevConfigW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfigW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetGroupListA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetGroupListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgrouplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpgrouplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetGroupListW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetGroupListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgrouplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpgrouplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetID(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetIDA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIDA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetIDW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIDW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetIcon(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIcon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetIconA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIconA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetIconW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIconW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetLineDevStatus(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lplinedevstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lplinedevstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lplinedevstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetLineDevStatusA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lplinedevstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lplinedevstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lplinedevstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetLineDevStatusW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lplinedevstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lplinedevstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lplinedevstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetMessage(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jlong lpmessage, jint dwtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)lpmessage;
    (void)dwtimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetNewCalls(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwselect, jlong lpcalllist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetNewCalls");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwselect, (void*)(uintptr_t)lpcalllist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwselect;
    (void)lpcalllist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetNumRings(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpdwnumrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetNumRings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpdwnumrings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpdwnumrings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetProviderList(JNIEnv* km_env, jclass km_clazz, jint dwapiversion, jlong lpproviderlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwapiversion, (void*)(uintptr_t)lpproviderlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetProviderListA(JNIEnv* km_env, jclass km_clazz, jint dwapiversion, jlong lpproviderlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwapiversion, (void*)(uintptr_t)lpproviderlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetProviderListW(JNIEnv* km_env, jclass km_clazz, jint dwapiversion, jlong lpproviderlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwapiversion, (void*)(uintptr_t)lpproviderlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetProxyStatus(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwappapiversion, jlong lplineproxyreqestlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProxyStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwappapiversion, (void*)(uintptr_t)lplineproxyreqestlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwappapiversion;
    (void)lplineproxyreqestlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetQueueInfo(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwqueueid, jlong lplinequeueinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwqueueid, (void*)(uintptr_t)lplinequeueinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwqueueid;
    (void)lplinequeueinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetQueueListA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgroupid, jlong lpqueuelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpqueuelist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpgroupid;
    (void)lpqueuelist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetQueueListW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgroupid, jlong lpqueuelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpqueuelist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpgroupid;
    (void)lpqueuelist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetRequest(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwrequestmode, jlong lprequestbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwrequestmode, (void*)(uintptr_t)lprequestbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetRequestA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwrequestmode, jlong lprequestbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequestA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwrequestmode, (void*)(uintptr_t)lprequestbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetRequestW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwrequestmode, jlong lprequestbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequestW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwrequestmode, (void*)(uintptr_t)lprequestbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwlinestates, jlong lpdwaddressstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetStatusMessages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwlinestates, (void*)(uintptr_t)lpdwaddressstates);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpdwlinestates;
    (void)lpdwaddressstates;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetTranslateCaps(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwapiversion, jlong lptranslatecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwapiversion, (void*)(uintptr_t)lptranslatecaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetTranslateCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwapiversion, jlong lptranslatecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCapsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwapiversion, (void*)(uintptr_t)lptranslatecaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineGetTranslateCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwapiversion, jlong lptranslatecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCapsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwapiversion, (void*)(uintptr_t)lptranslatecaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineHandoff(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszfilename, jint dwmediamode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoff");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszfilename, (uint32_t)dwmediamode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineHandoffA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszfilename, jint dwmediamode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoffA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszfilename, (uint32_t)dwmediamode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineHandoffW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszfilename, jint dwmediamode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoffW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszfilename, (uint32_t)dwmediamode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineHold(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHold");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineInitialize(JNIEnv* km_env, jclass km_clazz, jlong lphlineapp, jlong hinstance, jlong lpfncallback, jlong lpszappname, jlong lpdwnumdevs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lphlineapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpdwnumdevs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszappname;
    (void)lpdwnumdevs;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineInitializeExA(JNIEnv* km_env, jclass km_clazz, jlong lphlineapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lplineinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitializeExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lphlineapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lplineinitializeexparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lplineinitializeexparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineInitializeExW(JNIEnv* km_env, jclass km_clazz, jlong lphlineapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lplineinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitializeExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lphlineapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lplineinitializeexparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lplineinitializeexparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineMakeCall(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lphcall, jlong lpszdestaddress, jint dwcountrycode, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineMakeCallA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lphcall, jlong lpszdestaddress, jint dwcountrycode, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCallA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineMakeCallW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lphcall, jlong lpszdestaddress, jint dwcountrycode, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCallW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineMonitorDigits(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorDigits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwdigitmodes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineMonitorMedia(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwmediamodes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorMedia");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwmediamodes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwmediamodes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineMonitorTones(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lptonelist, jint dwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorTones");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lptonelist, (uint32_t)dwnumentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lptonelist;
    (void)dwnumentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineNegotiateAPIVersion(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapilowversion, jint dwapihighversion, jlong lpdwapiversion, jlong lpextensionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineNegotiateAPIVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapilowversion, (uint32_t)dwapihighversion, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpextensionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapilowversion;
    (void)dwapihighversion;
    (void)lpdwapiversion;
    (void)lpextensionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineNegotiateExtVersion(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextlowversion, jint dwexthighversion, jlong lpdwextversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineNegotiateExtVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextlowversion, (uint32_t)dwexthighversion, (void*)(uintptr_t)lpdwextversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextlowversion;
    (void)dwexthighversion;
    (void)lpdwextversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineOpen(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lphline, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivileges, jint dwmediamodes, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphline, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivileges, (uint32_t)dwmediamodes, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lphline;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivileges;
    (void)dwmediamodes;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineOpenA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lphline, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivileges, jint dwmediamodes, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpenA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphline, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivileges, (uint32_t)dwmediamodes, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lphline;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivileges;
    (void)dwmediamodes;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineOpenW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lphline, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivileges, jint dwmediamodes, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpenW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphline, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivileges, (uint32_t)dwmediamodes, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lphline;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivileges;
    (void)dwmediamodes;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLinePark(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwparkmode, jlong lpszdiraddress, jlong lpnondiraddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePark");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwparkmode, (void*)(uintptr_t)lpszdiraddress, (void*)(uintptr_t)lpnondiraddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineParkA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwparkmode, jlong lpszdiraddress, jlong lpnondiraddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineParkA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwparkmode, (void*)(uintptr_t)lpszdiraddress, (void*)(uintptr_t)lpnondiraddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineParkW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwparkmode, jlong lpszdiraddress, jlong lpnondiraddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineParkW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwparkmode, (void*)(uintptr_t)lpszdiraddress, (void*)(uintptr_t)lpnondiraddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLinePickup(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress, jlong lpszgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszgroupid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLinePickupA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress, jlong lpszgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickupA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszgroupid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLinePickupW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress, jlong lpszgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickupW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszgroupid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLinePrepareAddToConference(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hconfcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceA(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConferenceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hconfcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLinePrepareAddToConferenceW(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConferenceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hconfcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineProxyMessage(JNIEnv* km_env, jclass km_clazz, jint hline, jint hcall, jint dwmsg, jint dwparam1, jint dwparam2, jint dwparam3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineProxyMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hcall, (uint32_t)dwmsg, (uint32_t)dwparam1, (uint32_t)dwparam2, (uint32_t)dwparam3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hcall;
    (void)dwmsg;
    (void)dwparam1;
    (void)dwparam2;
    (void)dwparam3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineProxyResponse(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpproxyrequest, jint dwresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineProxyResponse");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpproxyrequest, (uint32_t)dwresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)lpproxyrequest;
    (void)dwresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineRedirect(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineRedirectA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirectA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineRedirectW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirectW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineRegisterRequestRecipient(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwregistrationinstance, jint dwrequestmode, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRegisterRequestRecipient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwregistrationinstance, (uint32_t)dwrequestmode, (uint32_t)benable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwregistrationinstance;
    (void)dwrequestmode;
    (void)benable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineReleaseUserUserInfo(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineReleaseUserUserInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineRemoveFromConference(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRemoveFromConference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineRemoveProvider(JNIEnv* km_env, jclass km_clazz, jint dwpermanentproviderid, jlong hwndowner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRemoveProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwpermanentproviderid, (void*)(uintptr_t)hwndowner);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwpermanentproviderid;
    (void)hwndowner;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSecureCall(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSecureCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSendUserUserInfo(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSendUserUserInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAgentActivity(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwactivityid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentActivity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwactivityid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwactivityid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAgentGroup(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentgrouplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAgentMeasurementPeriod(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jint dwmeasurementperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentMeasurementPeriod");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (uint32_t)dwmeasurementperiod);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagent;
    (void)dwmeasurementperiod;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAgentSessionState(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagentsession, jint dwagentsessionstate, jint dwnextagentsessionstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentSessionState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagentsession, (uint32_t)dwagentsessionstate, (uint32_t)dwnextagentsessionstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagentsession;
    (void)dwagentsessionstate;
    (void)dwnextagentsessionstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAgentState(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwagentstate, jint dwnextagentstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwagentstate, (uint32_t)dwnextagentstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwagentstate;
    (void)dwnextagentstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAgentStateEx(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jint dwagentstate, jint dwnextagentstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentStateEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (uint32_t)dwagentstate, (uint32_t)dwnextagentstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)hagent;
    (void)dwagentstate;
    (void)dwnextagentstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAppPriority(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpszextensionname, jint dwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriority");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpszextensionname, (uint32_t)dwpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAppPriorityA(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpszextensionname, jint dwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriorityA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpszextensionname, (uint32_t)dwpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAppPriorityW(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpszextensionname, jint dwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriorityW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpszextensionname, (uint32_t)dwpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetAppSpecific(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwappspecific) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppSpecific");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwappspecific);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwappspecific;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetCallData(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcalldata, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcalldata, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpcalldata;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetCallParams(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwbearermode, jint dwminrate, jint dwmaxrate, jlong lpdialparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallParams");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwbearermode, (uint32_t)dwminrate, (uint32_t)dwmaxrate, (void*)(uintptr_t)lpdialparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwbearermode;
    (void)dwminrate;
    (void)dwmaxrate;
    (void)lpdialparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetCallPrivilege(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwcallprivilege) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallPrivilege");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwcallprivilege);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwcallprivilege;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetCallQualityOfService(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsendingflowspec, jint dwsendingflowspecsize, jlong lpreceivingflowspec, jint dwreceivingflowspecsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallQualityOfService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsendingflowspec, (uint32_t)dwsendingflowspecsize, (void*)(uintptr_t)lpreceivingflowspec, (uint32_t)dwreceivingflowspecsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lpsendingflowspec;
    (void)dwsendingflowspecsize;
    (void)lpreceivingflowspec;
    (void)dwreceivingflowspecsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetCallTreatment(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwtreatment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallTreatment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwtreatment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwtreatment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetCurrentLocation(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwlocation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCurrentLocation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwlocation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwlocation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetDevConfig(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jint dwsize, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfig");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (uint32_t)dwsize, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetDevConfigA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jint dwsize, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfigA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (uint32_t)dwsize, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetDevConfigW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jint dwsize, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfigW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (uint32_t)dwsize, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetLineDevStatus(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwstatustochange, jint fstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetLineDevStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwstatustochange, (uint32_t)fstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwstatustochange;
    (void)fstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetMediaControl(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdigitlist, jint dwdigitnumentries, jlong lpmedialist, jint dwmedianumentries, jlong lptonelist, jint dwtonenumentries, jlong lpcallstatelist, jint dwcallstatenumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetMediaControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdigitlist, (uint32_t)dwdigitnumentries, (void*)(uintptr_t)lpmedialist, (uint32_t)dwmedianumentries, (void*)(uintptr_t)lptonelist, (uint32_t)dwtonenumentries, (void*)(uintptr_t)lpcallstatelist, (uint32_t)dwcallstatenumentries);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdigitlist;
    (void)dwdigitnumentries;
    (void)lpmedialist;
    (void)dwmedianumentries;
    (void)lptonelist;
    (void)dwtonenumentries;
    (void)lpcallstatelist;
    (void)dwcallstatenumentries;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetMediaMode(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwmediamodes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetMediaMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)dwmediamodes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)dwmediamodes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetNumRings(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwnumrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetNumRings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwnumrings);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwnumrings;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetQueueMeasurementPeriod(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwqueueid, jint dwmeasurementperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetQueueMeasurementPeriod");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwqueueid, (uint32_t)dwmeasurementperiod);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwqueueid;
    (void)dwmeasurementperiod;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwlinestates, jint dwaddressstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetStatusMessages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwlinestates, (uint32_t)dwaddressstates);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwlinestates;
    (void)dwaddressstates;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetTerminal(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jint dwterminalmodes, jint dwterminalid, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTerminal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (uint32_t)dwterminalmodes, (uint32_t)dwterminalid, (uint32_t)benable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)dwterminalmodes;
    (void)dwterminalid;
    (void)benable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetTollList(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lpszaddressin, jint dwtolllistoption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwtolllistoption);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressin;
    (void)dwtolllistoption;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetTollListA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lpszaddressin, jint dwtolllistoption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollListA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwtolllistoption);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressin;
    (void)dwtolllistoption;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetTollListW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lpszaddressinw, jint dwtolllistoption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lpszaddressinw, (uint32_t)dwtolllistoption);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressinw;
    (void)dwtolllistoption;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetupConference(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hline, jlong lphconfcall, jlong lphconsultcall, jint dwnumparties, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)hline, (void*)(uintptr_t)lphconfcall, (void*)(uintptr_t)lphconsultcall, (uint32_t)dwnumparties, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetupConferenceA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hline, jlong lphconfcall, jlong lphconsultcall, jint dwnumparties, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConferenceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)hline, (void*)(uintptr_t)lphconfcall, (void*)(uintptr_t)lphconsultcall, (uint32_t)dwnumparties, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetupConferenceW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hline, jlong lphconfcall, jlong lphconsultcall, jint dwnumparties, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConferenceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (uint32_t)hline, (void*)(uintptr_t)lphconfcall, (void*)(uintptr_t)lphconsultcall, (uint32_t)dwnumparties, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetupTransfer(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransfer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetupTransferA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransferA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSetupTransferW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransferW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineShutdown(JNIEnv* km_env, jclass km_clazz, jint hlineapp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineShutdown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineSwapHold(JNIEnv* km_env, jclass km_clazz, jint hactivecall, jint hheldcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSwapHold");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hactivecall, (uint32_t)hheldcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hactivecall;
    (void)hheldcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineTranslateAddress(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong lpszaddressin, jint dwcard, jint dwtranslateoptions, jlong lptranslateoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwcard, (uint32_t)dwtranslateoptions, (void*)(uintptr_t)lptranslateoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineTranslateAddressA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong lpszaddressin, jint dwcard, jint dwtranslateoptions, jlong lptranslateoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddressA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwcard, (uint32_t)dwtranslateoptions, (void*)(uintptr_t)lptranslateoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineTranslateAddressW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong lpszaddressin, jint dwcard, jint dwtranslateoptions, jlong lptranslateoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddressW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwcard, (uint32_t)dwtranslateoptions, (void*)(uintptr_t)lptranslateoutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineTranslateDialog(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong hwndowner, jlong lpszaddressin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszaddressin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineTranslateDialogA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong hwndowner, jlong lpszaddressin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialogA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszaddressin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineTranslateDialogW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong hwndowner, jlong lpszaddressin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialogW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszaddressin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineUncompleteCall(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwcompletionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUncompleteCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwcompletionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwcompletionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineUnhold(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnhold");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcall);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcall;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineUnpark(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnpark");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineUnparkA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnparkA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiLineUnparkW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnparkW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneClose(JNIEnv* km_env, jclass km_clazz, jint hphone) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneConfigDialog(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneConfigDialogA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialogA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneConfigDialogW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialogW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneDevSpecific(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneDevSpecific");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpparams, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpparams;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetButtonInfo(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoA(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetButtonInfoW(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetData(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwdataid, jlong lpdata, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwdataid, (void*)(uintptr_t)lpdata, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwdataid;
    (void)lpdata;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetDevCaps(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lpphonecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpphonecaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lpphonecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCapsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpphonecaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lpphonecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCapsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpphonecaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetDisplay(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdisplay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDisplay");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdisplay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpdisplay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetGain(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jlong lpdwgain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetGain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (void*)(uintptr_t)lpdwgain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)lpdwgain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetHookSwitch(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdwhookswitchdevs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetHookSwitch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdwhookswitchdevs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpdwhookswitchdevs;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetID(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetIDA(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIDA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetIDW(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIDW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetIcon(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIcon");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetIconA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIconA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetIconW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIconW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetLamp(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpdwlampmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetLamp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpdwlampmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpdwlampmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetMessage(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jlong lpmessage, jint dwtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    (void)lpmessage;
    (void)dwtimeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetRing(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdwringmode, jlong lpdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetRing");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdwringmode, (void*)(uintptr_t)lpdwvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpdwringmode;
    (void)lpdwvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetStatus(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpphonestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpphonestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpphonestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetStatusA(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpphonestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpphonestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpphonestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdwphonestates, jlong lpdwbuttonmodes, jlong lpdwbuttonstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusMessages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdwphonestates, (void*)(uintptr_t)lpdwbuttonmodes, (void*)(uintptr_t)lpdwbuttonstates);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpdwphonestates;
    (void)lpdwbuttonmodes;
    (void)lpdwbuttonstates;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetStatusW(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpphonestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpphonestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)lpphonestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneGetVolume(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jlong lpdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (void*)(uintptr_t)lpdwvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)lpdwvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneInitialize(JNIEnv* km_env, jclass km_clazz, jlong lphphoneapp, jlong hinstance, jlong lpfncallback, jlong lpszappname, jlong lpdwnumdevs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lphphoneapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpdwnumdevs);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszappname;
    (void)lpdwnumdevs;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneInitializeExA(JNIEnv* km_env, jclass km_clazz, jlong lphphoneapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lpphoneinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitializeExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lphphoneapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpphoneinitializeexparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lpphoneinitializeexparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneInitializeExW(JNIEnv* km_env, jclass km_clazz, jlong lphphoneapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lpphoneinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitializeExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lphphoneapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpphoneinitializeexparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lpphoneinitializeexparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneNegotiateAPIVersion(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapilowversion, jint dwapihighversion, jlong lpdwapiversion, jlong lpextensionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneNegotiateAPIVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapilowversion, (uint32_t)dwapihighversion, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpextensionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapilowversion;
    (void)dwapihighversion;
    (void)lpdwapiversion;
    (void)lpextensionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneNegotiateExtVersion(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextlowversion, jint dwexthighversion, jlong lpdwextversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneNegotiateExtVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextlowversion, (uint32_t)dwexthighversion, (void*)(uintptr_t)lpdwextversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextlowversion;
    (void)dwexthighversion;
    (void)lpdwextversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneOpen(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jlong lphphone, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivilege) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneOpen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphphone, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivilege);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)lphphone;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivilege;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetButtonInfo(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoA(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetButtonInfoW(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetData(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwdataid, jlong lpdata, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwdataid, (void*)(uintptr_t)lpdata, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwdataid;
    (void)lpdata;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetDisplay(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwrow, jint dwcolumn, jlong lpsdisplay, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetDisplay");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwrow, (uint32_t)dwcolumn, (void*)(uintptr_t)lpsdisplay, (uint32_t)dwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwrow;
    (void)dwcolumn;
    (void)lpsdisplay;
    (void)dwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetGain(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jint dwgain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetGain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (uint32_t)dwgain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)dwgain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetHookSwitch(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdevs, jint dwhookswitchmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetHookSwitch");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdevs, (uint32_t)dwhookswitchmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwhookswitchdevs;
    (void)dwhookswitchmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetLamp(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jint dwlampmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetLamp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (uint32_t)dwlampmode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)dwlampmode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetRing(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwringmode, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetRing");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwringmode, (uint32_t)dwvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwringmode;
    (void)dwvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwphonestates, jint dwbuttonmodes, jint dwbuttonstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetStatusMessages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwphonestates, (uint32_t)dwbuttonmodes, (uint32_t)dwbuttonstates);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwphonestates;
    (void)dwbuttonmodes;
    (void)dwbuttonstates;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneSetVolume(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (uint32_t)dwvolume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)dwvolume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiPhoneShutdown(JNIEnv* km_env, jclass km_clazz, jint hphoneapp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneShutdown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hphoneapp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hphoneapp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiGetLocationInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszcountrycode, jlong lpszcitycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszcountrycode, (void*)(uintptr_t)lpszcitycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszcountrycode;
    (void)lpszcitycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiGetLocationInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpszcountrycode, jlong lpszcitycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszcountrycode, (void*)(uintptr_t)lpszcitycode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszcountrycode;
    (void)lpszcitycode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiGetLocationInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpszcountrycodew, jlong lpszcitycodew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszcountrycodew, (void*)(uintptr_t)lpszcitycodew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszcountrycodew;
    (void)lpszcitycodew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiRequestDrop(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestDrop");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wrequestid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiRequestMakeCall(JNIEnv* km_env, jclass km_clazz, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiRequestMakeCallA(JNIEnv* km_env, jclass km_clazz, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCallA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiRequestMakeCallW(JNIEnv* km_env, jclass km_clazz, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCallW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiRequestMediaCall(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid, jlong lpszdeviceclass, jlong lpdeviceid, jint dwsize, jint dwsecure, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceid, (uint32_t)dwsize, (uint32_t)dwsecure, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wrequestid;
    (void)lpszdeviceclass;
    (void)lpdeviceid;
    (void)dwsize;
    (void)dwsecure;
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiRequestMediaCallA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid, jlong lpszdeviceclass, jlong lpdeviceid, jint dwsize, jint dwsecure, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCallA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceid, (uint32_t)dwsize, (uint32_t)dwsecure, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wrequestid;
    (void)lpszdeviceclass;
    (void)lpdeviceid;
    (void)dwsize;
    (void)dwsecure;
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssysWindowsWin32DevicesTapiTapiRequestMediaCallW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid, jlong lpszdeviceclass, jlong lpdeviceid, jint dwsize, jint dwsecure, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCallW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceid, (uint32_t)dwsize, (uint32_t)dwsecure, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)wrequestid;
    (void)lpszdeviceclass;
    (void)lpdeviceid;
    (void)dwsize;
    (void)dwsecure;
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

