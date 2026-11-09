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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1GetTnefStreamCodepage(JNIEnv* km_env, jclass km_clazz, jlong lpstream, jlong lpulcodepage, jlong lpulsubcodepage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTnefStreamCodepage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpstream, (void*)(uintptr_t)lpulcodepage, (void*)(uintptr_t)lpulsubcodepage) : -1;
#else
    (void)lpstream;
    (void)lpulcodepage;
    (void)lpulsubcodepage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1OpenTnefStream(JNIEnv* km_env, jclass km_clazz, jlong lpvsupport, jlong lpstream, jlong lpszstreamname, jint ulflags, jlong lpmessage, jshort wkeyval, jlong lpptnef) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTnefStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpvsupport, (void*)(uintptr_t)lpstream, (void*)(uintptr_t)lpszstreamname, (uint32_t)ulflags, (void*)(uintptr_t)lpmessage, (uint16_t)wkeyval, (void*)(uintptr_t)lpptnef) : -1;
#else
    (void)lpvsupport;
    (void)lpstream;
    (void)lpszstreamname;
    (void)ulflags;
    (void)lpmessage;
    (void)wkeyval;
    (void)lpptnef;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1OpenTnefStreamEx(JNIEnv* km_env, jclass km_clazz, jlong lpvsupport, jlong lpstream, jlong lpszstreamname, jint ulflags, jlong lpmessage, jshort wkeyval, jlong lpadressbook, jlong lpptnef) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTnefStreamEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpvsupport, (void*)(uintptr_t)lpstream, (void*)(uintptr_t)lpszstreamname, (uint32_t)ulflags, (void*)(uintptr_t)lpmessage, (uint16_t)wkeyval, (void*)(uintptr_t)lpadressbook, (void*)(uintptr_t)lpptnef) : -1;
#else
    (void)lpvsupport;
    (void)lpstream;
    (void)lpszstreamname;
    (void)ulflags;
    (void)lpmessage;
    (void)wkeyval;
    (void)lpadressbook;
    (void)lpptnef;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineAccept(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAccept");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize) : -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineAddProvider(JNIEnv* km_env, jclass km_clazz, jlong lpszproviderfilename, jlong hwndowner, jlong lpdwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszproviderfilename, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpdwpermanentproviderid) : -1;
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineAddProviderA(JNIEnv* km_env, jclass km_clazz, jlong lpszproviderfilename, jlong hwndowner, jlong lpdwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProviderA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszproviderfilename, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpdwpermanentproviderid) : -1;
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineAddProviderW(JNIEnv* km_env, jclass km_clazz, jlong lpszproviderfilename, jlong hwndowner, jlong lpdwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddProviderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszproviderfilename, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpdwpermanentproviderid) : -1;
#else
    (void)lpszproviderfilename;
    (void)hwndowner;
    (void)lpdwpermanentproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineAddToConference(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jint hconsultcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAddToConference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hconfcall, (uint32_t)hconsultcall) : -1;
#else
    (void)hconfcall;
    (void)hconsultcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineAgentSpecific(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwagentextensionidindex, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAgentSpecific");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwagentextensionidindex, (void*)(uintptr_t)lpparams, (uint32_t)dwsize) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwagentextensionidindex;
    (void)lpparams;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineAnswer(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineAnswer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize) : -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineBlindTransfer(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransfer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineBlindTransferA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransferA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineBlindTransferW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddressw, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineBlindTransferW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddressw, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddressw;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineClose(JNIEnv* km_env, jclass km_clazz, jint hline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline) : -1;
#else
    (void)hline;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineCompleteCall(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpdwcompletionid, jint dwcompletionmode, jint dwmessageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCompleteCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpdwcompletionid, (uint32_t)dwcompletionmode, (uint32_t)dwmessageid) : -1;
#else
    (void)hcall;
    (void)lpdwcompletionid;
    (void)dwcompletionmode;
    (void)dwmessageid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineCompleteTransfer(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hconsultcall, jlong lphconfcall, jint dwtransfermode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCompleteTransfer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)hconsultcall, (void*)(uintptr_t)lphconfcall, (uint32_t)dwtransfermode) : -1;
#else
    (void)hcall;
    (void)hconsultcall;
    (void)lphconfcall;
    (void)dwtransfermode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineConfigDialog(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineConfigDialogA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineConfigDialogEdit(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass, jlong lpdeviceconfigin, jint dwsize, jlong lpdeviceconfigout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEdit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceconfigin, (uint32_t)dwsize, (void*)(uintptr_t)lpdeviceconfigout) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineConfigDialogEditA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass, jlong lpdeviceconfigin, jint dwsize, jlong lpdeviceconfigout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEditA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceconfigin, (uint32_t)dwsize, (void*)(uintptr_t)lpdeviceconfigout) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineConfigDialogEditW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass, jlong lpdeviceconfigin, jint dwsize, jlong lpdeviceconfigout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogEditW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceconfigin, (uint32_t)dwsize, (void*)(uintptr_t)lpdeviceconfigout) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    (void)lpdeviceconfigin;
    (void)dwsize;
    (void)lpdeviceconfigout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineConfigDialogW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigDialogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineConfigProvider(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint dwpermanentproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineConfigProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (uint32_t)dwpermanentproviderid) : -1;
#else
    (void)hwndowner;
    (void)dwpermanentproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineCreateAgentA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpszagentid, jlong lpszagentpin, jlong lphagent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpszagentid, (void*)(uintptr_t)lpszagentpin, (void*)(uintptr_t)lphagent) : -1;
#else
    (void)hline;
    (void)lpszagentid;
    (void)lpszagentpin;
    (void)lphagent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineCreateAgentSessionA(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpszagentpin, jint dwworkingaddressid, jlong lpgroupid, jlong lphagentsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentSessionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpszagentpin, (uint32_t)dwworkingaddressid, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lphagentsession) : -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpszagentpin;
    (void)dwworkingaddressid;
    (void)lpgroupid;
    (void)lphagentsession;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineCreateAgentSessionW(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpszagentpin, jint dwworkingaddressid, jlong lpgroupid, jlong lphagentsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentSessionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpszagentpin, (uint32_t)dwworkingaddressid, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lphagentsession) : -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpszagentpin;
    (void)dwworkingaddressid;
    (void)lpgroupid;
    (void)lphagentsession;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineCreateAgentW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpszagentid, jlong lpszagentpin, jlong lphagent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineCreateAgentW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpszagentid, (void*)(uintptr_t)lpszagentpin, (void*)(uintptr_t)lphagent) : -1;
#else
    (void)hline;
    (void)lpszagentid;
    (void)lpszagentpin;
    (void)lphagent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineDeallocateCall(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDeallocateCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall) : -1;
#else
    (void)hcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineDevSpecific(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDevSpecific");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (void*)(uintptr_t)lpparams, (uint32_t)dwsize) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)lpparams;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineDevSpecificFeature(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwfeature, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDevSpecificFeature");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwfeature, (void*)(uintptr_t)lpparams, (uint32_t)dwsize) : -1;
#else
    (void)hline;
    (void)dwfeature;
    (void)lpparams;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineDial(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDial");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineDialA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDialA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineDialW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDialW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineDrop(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineDrop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize) : -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineForward(JNIEnv* km_env, jclass km_clazz, jint hline, jint balladdresses, jint dwaddressid, jlong lpforwardlist, jint dwnumringsnoanswer, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForward");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)balladdresses, (uint32_t)dwaddressid, (void*)(uintptr_t)lpforwardlist, (uint32_t)dwnumringsnoanswer, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineForwardA(JNIEnv* km_env, jclass km_clazz, jint hline, jint balladdresses, jint dwaddressid, jlong lpforwardlist, jint dwnumringsnoanswer, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForwardA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)balladdresses, (uint32_t)dwaddressid, (void*)(uintptr_t)lpforwardlist, (uint32_t)dwnumringsnoanswer, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineForwardW(JNIEnv* km_env, jclass km_clazz, jint hline, jint balladdresses, jint dwaddressid, jlong lpforwardlist, jint dwnumringsnoanswer, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineForwardW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)balladdresses, (uint32_t)dwaddressid, (void*)(uintptr_t)lpforwardlist, (uint32_t)dwnumringsnoanswer, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hline;
    (void)balladdresses;
    (void)dwaddressid;
    (void)lpforwardlist;
    (void)dwnumringsnoanswer;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGatherDigits(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes, jlong lpsdigits, jint dwnumdigits, jlong lpszterminationdigits, jint dwfirstdigittimeout, jint dwinterdigittimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes, (void*)(uintptr_t)lpsdigits, (uint32_t)dwnumdigits, (void*)(uintptr_t)lpszterminationdigits, (uint32_t)dwfirstdigittimeout, (uint32_t)dwinterdigittimeout) : -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGatherDigitsA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes, jlong lpsdigits, jint dwnumdigits, jlong lpszterminationdigits, jint dwfirstdigittimeout, jint dwinterdigittimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigitsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes, (void*)(uintptr_t)lpsdigits, (uint32_t)dwnumdigits, (void*)(uintptr_t)lpszterminationdigits, (uint32_t)dwfirstdigittimeout, (uint32_t)dwinterdigittimeout) : -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGatherDigitsW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes, jlong lpsdigits, jint dwnumdigits, jlong lpszterminationdigits, jint dwfirstdigittimeout, jint dwinterdigittimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGatherDigitsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes, (void*)(uintptr_t)lpsdigits, (uint32_t)dwnumdigits, (void*)(uintptr_t)lpszterminationdigits, (uint32_t)dwfirstdigittimeout, (uint32_t)dwinterdigittimeout) : -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    (void)lpsdigits;
    (void)dwnumdigits;
    (void)lpszterminationdigits;
    (void)dwfirstdigittimeout;
    (void)dwinterdigittimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGenerateDigits(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmode, jlong lpszdigits, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmode, (void*)(uintptr_t)lpszdigits, (uint32_t)dwduration) : -1;
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGenerateDigitsA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmode, jlong lpszdigits, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigitsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmode, (void*)(uintptr_t)lpszdigits, (uint32_t)dwduration) : -1;
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGenerateDigitsW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmode, jlong lpszdigits, jint dwduration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateDigitsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmode, (void*)(uintptr_t)lpszdigits, (uint32_t)dwduration) : -1;
#else
    (void)hcall;
    (void)dwdigitmode;
    (void)lpszdigits;
    (void)dwduration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGenerateTone(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwtonemode, jint dwduration, jint dwnumtones, jlong lptones) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGenerateTone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwtonemode, (uint32_t)dwduration, (uint32_t)dwnumtones, (void*)(uintptr_t)lptones) : -1;
#else
    (void)hcall;
    (void)dwtonemode;
    (void)dwduration;
    (void)dwnumtones;
    (void)lptones;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressCaps(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwapiversion, jint dwextversion, jlong lpaddresscaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpaddresscaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwapiversion, jint dwextversion, jlong lpaddresscaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCapsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpaddresscaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwapiversion, jint dwextversion, jlong lpaddresscaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressCapsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpaddresscaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpaddresscaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressID(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwaddressid, jint dwaddressmode, jlong lpsaddress, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwaddressid, (uint32_t)dwaddressmode, (void*)(uintptr_t)lpsaddress, (uint32_t)dwsize) : -1;
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressIDA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwaddressid, jint dwaddressmode, jlong lpsaddress, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressIDA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwaddressid, (uint32_t)dwaddressmode, (void*)(uintptr_t)lpsaddress, (uint32_t)dwsize) : -1;
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressIDW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwaddressid, jint dwaddressmode, jlong lpsaddress, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressIDW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwaddressid, (uint32_t)dwaddressmode, (void*)(uintptr_t)lpsaddress, (uint32_t)dwsize) : -1;
#else
    (void)hline;
    (void)lpdwaddressid;
    (void)dwaddressmode;
    (void)lpsaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressStatus(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpaddressstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpaddressstatus) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressStatusA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpaddressstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpaddressstatus) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAddressStatusW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpaddressstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAddressStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpaddressstatus) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpaddressstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentActivityListA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentactivitylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentActivityListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentactivitylist) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentactivitylist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentActivityListW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentactivitylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentActivityListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentactivitylist) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentactivitylist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwappapiversion, jlong lpagentcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentCapsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwappapiversion, (void*)(uintptr_t)lpagentcaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwappapiversion;
    (void)lpagentcaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwaddressid, jint dwappapiversion, jlong lpagentcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentCapsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwaddressid, (uint32_t)dwappapiversion, (void*)(uintptr_t)lpagentcaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwaddressid;
    (void)dwappapiversion;
    (void)lpagentcaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentGroupListA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentGroupListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentgrouplist) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentGroupListW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentGroupListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentgrouplist) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentInfo(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpagentinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpagentinfo) : -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpagentinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentSessionInfo(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagentsession, jlong lpagentsessioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentSessionInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagentsession, (void*)(uintptr_t)lpagentsessioninfo) : -1;
#else
    (void)hline;
    (void)hagentsession;
    (void)lpagentsessioninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentSessionList(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jlong lpagentsessionlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentSessionList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (void*)(uintptr_t)lpagentsessionlist) : -1;
#else
    (void)hline;
    (void)hagent;
    (void)lpagentsessionlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentStatusA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentstatus) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAgentStatusW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAgentStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentstatus) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAppPriority(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpextensionname, jlong lpdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriority");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpextensionname, (void*)(uintptr_t)lpdwpriority) : -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAppPriorityA(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpextensionname, jlong lpdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriorityA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpextensionname, (void*)(uintptr_t)lpdwpriority) : -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetAppPriorityW(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpextensionname, jlong lpdwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetAppPriorityW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpextensionname, (void*)(uintptr_t)lpdwpriority) : -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpextensionname;
    (void)lpdwpriority;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetCallInfo(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallinfo) : -1;
#else
    (void)hcall;
    (void)lpcallinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetCallInfoA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallinfo) : -1;
#else
    (void)hcall;
    (void)lpcallinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetCallInfoW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallinfo) : -1;
#else
    (void)hcall;
    (void)lpcallinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetCallStatus(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcallstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCallStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcallstatus) : -1;
#else
    (void)hcall;
    (void)lpcallstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetConfRelatedCalls(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcalllist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetConfRelatedCalls");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcalllist) : -1;
#else
    (void)hcall;
    (void)lpcalllist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetCountry(JNIEnv* km_env, jclass km_clazz, jint dwcountryid, jint dwapiversion, jlong lplinecountrylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwcountryid, (uint32_t)dwapiversion, (void*)(uintptr_t)lplinecountrylist) : -1;
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetCountryA(JNIEnv* km_env, jclass km_clazz, jint dwcountryid, jint dwapiversion, jlong lplinecountrylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwcountryid, (uint32_t)dwapiversion, (void*)(uintptr_t)lplinecountrylist) : -1;
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetCountryW(JNIEnv* km_env, jclass km_clazz, jint dwcountryid, jint dwapiversion, jlong lplinecountrylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetCountryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwcountryid, (uint32_t)dwapiversion, (void*)(uintptr_t)lplinecountrylist) : -1;
#else
    (void)dwcountryid;
    (void)dwapiversion;
    (void)lplinecountrylist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetDevCaps(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lplinedevcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lplinedevcaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lplinedevcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCapsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lplinedevcaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lplinedevcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevCapsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lplinedevcaps) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lplinedevcaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetDevConfig(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetDevConfigA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfigA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetDevConfigW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetDevConfigW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetGroupListA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetGroupListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgrouplist) : -1;
#else
    (void)hline;
    (void)lpgrouplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetGroupListW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetGroupListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgrouplist) : -1;
#else
    (void)hline;
    (void)lpgrouplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetID(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetIDA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIDA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetIDW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIDW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetIcon(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon) : -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetIconA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIconA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon) : -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetIconW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetIconW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon) : -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetLineDevStatus(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lplinedevstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lplinedevstatus) : -1;
#else
    (void)hline;
    (void)lplinedevstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetLineDevStatusA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lplinedevstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lplinedevstatus) : -1;
#else
    (void)hline;
    (void)lplinedevstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetLineDevStatusW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lplinedevstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetLineDevStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lplinedevstatus) : -1;
#else
    (void)hline;
    (void)lplinedevstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetMessage(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jlong lpmessage, jint dwtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout) : -1;
#else
    (void)hlineapp;
    (void)lpmessage;
    (void)dwtimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetNewCalls(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwselect, jlong lpcalllist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetNewCalls");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwselect, (void*)(uintptr_t)lpcalllist) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwselect;
    (void)lpcalllist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetNumRings(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpdwnumrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetNumRings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpdwnumrings) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpdwnumrings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetProviderList(JNIEnv* km_env, jclass km_clazz, jint dwapiversion, jlong lpproviderlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwapiversion, (void*)(uintptr_t)lpproviderlist) : -1;
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetProviderListA(JNIEnv* km_env, jclass km_clazz, jint dwapiversion, jlong lpproviderlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwapiversion, (void*)(uintptr_t)lpproviderlist) : -1;
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetProviderListW(JNIEnv* km_env, jclass km_clazz, jint dwapiversion, jlong lpproviderlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProviderListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwapiversion, (void*)(uintptr_t)lpproviderlist) : -1;
#else
    (void)dwapiversion;
    (void)lpproviderlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetProxyStatus(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwappapiversion, jlong lplineproxyreqestlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetProxyStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwappapiversion, (void*)(uintptr_t)lplineproxyreqestlist) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwappapiversion;
    (void)lplineproxyreqestlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetQueueInfo(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwqueueid, jlong lplinequeueinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwqueueid, (void*)(uintptr_t)lplinequeueinfo) : -1;
#else
    (void)hline;
    (void)dwqueueid;
    (void)lplinequeueinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetQueueListA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgroupid, jlong lpqueuelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpqueuelist) : -1;
#else
    (void)hline;
    (void)lpgroupid;
    (void)lpqueuelist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetQueueListW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpgroupid, jlong lpqueuelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetQueueListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpgroupid, (void*)(uintptr_t)lpqueuelist) : -1;
#else
    (void)hline;
    (void)lpgroupid;
    (void)lpqueuelist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetRequest(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwrequestmode, jlong lprequestbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequest");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwrequestmode, (void*)(uintptr_t)lprequestbuffer) : -1;
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetRequestA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwrequestmode, jlong lprequestbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequestA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwrequestmode, (void*)(uintptr_t)lprequestbuffer) : -1;
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetRequestW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwrequestmode, jlong lprequestbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetRequestW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwrequestmode, (void*)(uintptr_t)lprequestbuffer) : -1;
#else
    (void)hlineapp;
    (void)dwrequestmode;
    (void)lprequestbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpdwlinestates, jlong lpdwaddressstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetStatusMessages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpdwlinestates, (void*)(uintptr_t)lpdwaddressstates) : -1;
#else
    (void)hline;
    (void)lpdwlinestates;
    (void)lpdwaddressstates;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetTranslateCaps(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwapiversion, jlong lptranslatecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwapiversion, (void*)(uintptr_t)lptranslatecaps) : -1;
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetTranslateCapsA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwapiversion, jlong lptranslatecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCapsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwapiversion, (void*)(uintptr_t)lptranslatecaps) : -1;
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineGetTranslateCapsW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwapiversion, jlong lptranslatecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineGetTranslateCapsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwapiversion, (void*)(uintptr_t)lptranslatecaps) : -1;
#else
    (void)hlineapp;
    (void)dwapiversion;
    (void)lptranslatecaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineHandoff(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszfilename, jint dwmediamode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoff");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszfilename, (uint32_t)dwmediamode) : -1;
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineHandoffA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszfilename, jint dwmediamode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoffA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszfilename, (uint32_t)dwmediamode) : -1;
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineHandoffW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszfilename, jint dwmediamode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHandoffW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszfilename, (uint32_t)dwmediamode) : -1;
#else
    (void)hcall;
    (void)lpszfilename;
    (void)dwmediamode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineHold(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineHold");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall) : -1;
#else
    (void)hcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineInitialize(JNIEnv* km_env, jclass km_clazz, jlong lphlineapp, jlong hinstance, jlong lpfncallback, jlong lpszappname, jlong lpdwnumdevs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphlineapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpdwnumdevs) : -1;
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszappname;
    (void)lpdwnumdevs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineInitializeExA(JNIEnv* km_env, jclass km_clazz, jlong lphlineapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lplineinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitializeExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphlineapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lplineinitializeexparams) : -1;
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lplineinitializeexparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineInitializeExW(JNIEnv* km_env, jclass km_clazz, jlong lphlineapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lplineinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineInitializeExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphlineapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lplineinitializeexparams) : -1;
#else
    (void)lphlineapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lplineinitializeexparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineMakeCall(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lphcall, jlong lpszdestaddress, jint dwcountrycode, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineMakeCallA(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lphcall, jlong lpszdestaddress, jint dwcountrycode, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCallA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineMakeCallW(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lphcall, jlong lpszdestaddress, jint dwcountrycode, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMakeCallW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hline;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineMonitorDigits(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwdigitmodes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorDigits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwdigitmodes) : -1;
#else
    (void)hcall;
    (void)dwdigitmodes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineMonitorMedia(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwmediamodes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorMedia");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwmediamodes) : -1;
#else
    (void)hcall;
    (void)dwmediamodes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineMonitorTones(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lptonelist, jint dwnumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineMonitorTones");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lptonelist, (uint32_t)dwnumentries) : -1;
#else
    (void)hcall;
    (void)lptonelist;
    (void)dwnumentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineNegotiateAPIVersion(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapilowversion, jint dwapihighversion, jlong lpdwapiversion, jlong lpextensionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineNegotiateAPIVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapilowversion, (uint32_t)dwapihighversion, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpextensionid) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapilowversion;
    (void)dwapihighversion;
    (void)lpdwapiversion;
    (void)lpextensionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineNegotiateExtVersion(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jint dwextlowversion, jint dwexthighversion, jlong lpdwextversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineNegotiateExtVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextlowversion, (uint32_t)dwexthighversion, (void*)(uintptr_t)lpdwextversion) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextlowversion;
    (void)dwexthighversion;
    (void)lpdwextversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineOpen(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lphline, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivileges, jint dwmediamodes, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphline, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivileges, (uint32_t)dwmediamodes, (void*)(uintptr_t)lpcallparams) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineOpenA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lphline, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivileges, jint dwmediamodes, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpenA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphline, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivileges, (uint32_t)dwmediamodes, (void*)(uintptr_t)lpcallparams) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineOpenW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lphline, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivileges, jint dwmediamodes, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineOpenW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphline, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivileges, (uint32_t)dwmediamodes, (void*)(uintptr_t)lpcallparams) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1linePark(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwparkmode, jlong lpszdiraddress, jlong lpnondiraddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePark");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwparkmode, (void*)(uintptr_t)lpszdiraddress, (void*)(uintptr_t)lpnondiraddress) : -1;
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineParkA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwparkmode, jlong lpszdiraddress, jlong lpnondiraddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineParkA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwparkmode, (void*)(uintptr_t)lpszdiraddress, (void*)(uintptr_t)lpnondiraddress) : -1;
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineParkW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwparkmode, jlong lpszdiraddress, jlong lpnondiraddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineParkW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwparkmode, (void*)(uintptr_t)lpszdiraddress, (void*)(uintptr_t)lpnondiraddress) : -1;
#else
    (void)hcall;
    (void)dwparkmode;
    (void)lpszdiraddress;
    (void)lpnondiraddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1linePickup(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress, jlong lpszgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszgroupid) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1linePickupA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress, jlong lpszgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszgroupid) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1linePickupW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress, jlong lpszgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePickupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszgroupid) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    (void)lpszgroupid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1linePrepareAddToConference(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hconfcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1linePrepareAddToConferenceA(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConferenceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hconfcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1linePrepareAddToConferenceW(JNIEnv* km_env, jclass km_clazz, jint hconfcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "linePrepareAddToConferenceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hconfcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hconfcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineProxyMessage(JNIEnv* km_env, jclass km_clazz, jint hline, jint hcall, jint dwmsg, jint dwparam1, jint dwparam2, jint dwparam3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineProxyMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hcall, (uint32_t)dwmsg, (uint32_t)dwparam1, (uint32_t)dwparam2, (uint32_t)dwparam3) : -1;
#else
    (void)hline;
    (void)hcall;
    (void)dwmsg;
    (void)dwparam1;
    (void)dwparam2;
    (void)dwparam3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineProxyResponse(JNIEnv* km_env, jclass km_clazz, jint hline, jlong lpproxyrequest, jint dwresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineProxyResponse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (void*)(uintptr_t)lpproxyrequest, (uint32_t)dwresult) : -1;
#else
    (void)hline;
    (void)lpproxyrequest;
    (void)dwresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineRedirect(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineRedirectA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirectA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineRedirectW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpszdestaddress, jint dwcountrycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRedirectW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpszdestaddress, (uint32_t)dwcountrycode) : -1;
#else
    (void)hcall;
    (void)lpszdestaddress;
    (void)dwcountrycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineRegisterRequestRecipient(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwregistrationinstance, jint dwrequestmode, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRegisterRequestRecipient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwregistrationinstance, (uint32_t)dwrequestmode, (uint32_t)benable) : -1;
#else
    (void)hlineapp;
    (void)dwregistrationinstance;
    (void)dwrequestmode;
    (void)benable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineReleaseUserUserInfo(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineReleaseUserUserInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall) : -1;
#else
    (void)hcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineRemoveFromConference(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRemoveFromConference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall) : -1;
#else
    (void)hcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineRemoveProvider(JNIEnv* km_env, jclass km_clazz, jint dwpermanentproviderid, jlong hwndowner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineRemoveProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwpermanentproviderid, (void*)(uintptr_t)hwndowner) : -1;
#else
    (void)dwpermanentproviderid;
    (void)hwndowner;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSecureCall(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSecureCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall) : -1;
#else
    (void)hcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSendUserUserInfo(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsuseruserinfo, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSendUserUserInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsuseruserinfo, (uint32_t)dwsize) : -1;
#else
    (void)hcall;
    (void)lpsuseruserinfo;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAgentActivity(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwactivityid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentActivity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwactivityid) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwactivityid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAgentGroup(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lpagentgrouplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lpagentgrouplist) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lpagentgrouplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAgentMeasurementPeriod(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jint dwmeasurementperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentMeasurementPeriod");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (uint32_t)dwmeasurementperiod) : -1;
#else
    (void)hline;
    (void)hagent;
    (void)dwmeasurementperiod;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAgentSessionState(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagentsession, jint dwagentsessionstate, jint dwnextagentsessionstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentSessionState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagentsession, (uint32_t)dwagentsessionstate, (uint32_t)dwnextagentsessionstate) : -1;
#else
    (void)hline;
    (void)hagentsession;
    (void)dwagentsessionstate;
    (void)dwnextagentsessionstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAgentState(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwagentstate, jint dwnextagentstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwagentstate, (uint32_t)dwnextagentstate) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwagentstate;
    (void)dwnextagentstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAgentStateEx(JNIEnv* km_env, jclass km_clazz, jint hline, jint hagent, jint dwagentstate, jint dwnextagentstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAgentStateEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)hagent, (uint32_t)dwagentstate, (uint32_t)dwnextagentstate) : -1;
#else
    (void)hline;
    (void)hagent;
    (void)dwagentstate;
    (void)dwnextagentstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAppPriority(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpszextensionname, jint dwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriority");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpszextensionname, (uint32_t)dwpriority) : -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAppPriorityA(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpszextensionname, jint dwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriorityA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpszextensionname, (uint32_t)dwpriority) : -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAppPriorityW(JNIEnv* km_env, jclass km_clazz, jlong lpszappfilename, jint dwmediamode, jlong lpextensionid, jint dwrequestmode, jlong lpszextensionname, jint dwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppPriorityW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszappfilename, (uint32_t)dwmediamode, (void*)(uintptr_t)lpextensionid, (uint32_t)dwrequestmode, (void*)(uintptr_t)lpszextensionname, (uint32_t)dwpriority) : -1;
#else
    (void)lpszappfilename;
    (void)dwmediamode;
    (void)lpextensionid;
    (void)dwrequestmode;
    (void)lpszextensionname;
    (void)dwpriority;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetAppSpecific(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwappspecific) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetAppSpecific");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwappspecific) : -1;
#else
    (void)hcall;
    (void)dwappspecific;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetCallData(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpcalldata, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpcalldata, (uint32_t)dwsize) : -1;
#else
    (void)hcall;
    (void)lpcalldata;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetCallParams(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwbearermode, jint dwminrate, jint dwmaxrate, jlong lpdialparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallParams");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwbearermode, (uint32_t)dwminrate, (uint32_t)dwmaxrate, (void*)(uintptr_t)lpdialparams) : -1;
#else
    (void)hcall;
    (void)dwbearermode;
    (void)dwminrate;
    (void)dwmaxrate;
    (void)lpdialparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetCallPrivilege(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwcallprivilege) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallPrivilege");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwcallprivilege) : -1;
#else
    (void)hcall;
    (void)dwcallprivilege;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetCallQualityOfService(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lpsendingflowspec, jint dwsendingflowspecsize, jlong lpreceivingflowspec, jint dwreceivingflowspecsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallQualityOfService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lpsendingflowspec, (uint32_t)dwsendingflowspecsize, (void*)(uintptr_t)lpreceivingflowspec, (uint32_t)dwreceivingflowspecsize) : -1;
#else
    (void)hcall;
    (void)lpsendingflowspec;
    (void)dwsendingflowspecsize;
    (void)lpreceivingflowspec;
    (void)dwreceivingflowspecsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetCallTreatment(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwtreatment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCallTreatment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwtreatment) : -1;
#else
    (void)hcall;
    (void)dwtreatment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetCurrentLocation(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwlocation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetCurrentLocation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwlocation) : -1;
#else
    (void)hlineapp;
    (void)dwlocation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetDevConfig(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jint dwsize, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfig");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (uint32_t)dwsize, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetDevConfigA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jint dwsize, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfigA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (uint32_t)dwsize, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetDevConfigW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpdeviceconfig, jint dwsize, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetDevConfigW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpdeviceconfig, (uint32_t)dwsize, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)lpdeviceconfig;
    (void)dwsize;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetLineDevStatus(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwstatustochange, jint fstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetLineDevStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwstatustochange, (uint32_t)fstatus) : -1;
#else
    (void)hline;
    (void)dwstatustochange;
    (void)fstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetMediaControl(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jlong lpdigitlist, jint dwdigitnumentries, jlong lpmedialist, jint dwmedianumentries, jlong lptonelist, jint dwtonenumentries, jlong lpcallstatelist, jint dwcallstatenumentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetMediaControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (void*)(uintptr_t)lpdigitlist, (uint32_t)dwdigitnumentries, (void*)(uintptr_t)lpmedialist, (uint32_t)dwmedianumentries, (void*)(uintptr_t)lptonelist, (uint32_t)dwtonenumentries, (void*)(uintptr_t)lpcallstatelist, (uint32_t)dwcallstatenumentries) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetMediaMode(JNIEnv* km_env, jclass km_clazz, jint hcall, jint dwmediamodes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetMediaMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)dwmediamodes) : -1;
#else
    (void)hcall;
    (void)dwmediamodes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetNumRings(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint dwnumrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetNumRings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)dwnumrings) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)dwnumrings;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetQueueMeasurementPeriod(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwqueueid, jint dwmeasurementperiod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetQueueMeasurementPeriod");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwqueueid, (uint32_t)dwmeasurementperiod) : -1;
#else
    (void)hline;
    (void)dwqueueid;
    (void)dwmeasurementperiod;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwlinestates, jint dwaddressstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetStatusMessages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwlinestates, (uint32_t)dwaddressstates) : -1;
#else
    (void)hline;
    (void)dwlinestates;
    (void)dwaddressstates;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetTerminal(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jint hcall, jint dwselect, jint dwterminalmodes, jint dwterminalid, jint benable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTerminal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (uint32_t)hcall, (uint32_t)dwselect, (uint32_t)dwterminalmodes, (uint32_t)dwterminalid, (uint32_t)benable) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)hcall;
    (void)dwselect;
    (void)dwterminalmodes;
    (void)dwterminalid;
    (void)benable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetTollList(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lpszaddressin, jint dwtolllistoption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwtolllistoption) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressin;
    (void)dwtolllistoption;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetTollListA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lpszaddressin, jint dwtolllistoption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwtolllistoption) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressin;
    (void)dwtolllistoption;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetTollListW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jlong lpszaddressinw, jint dwtolllistoption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetTollListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lpszaddressinw, (uint32_t)dwtolllistoption) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)lpszaddressinw;
    (void)dwtolllistoption;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetupConference(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hline, jlong lphconfcall, jlong lphconsultcall, jint dwnumparties, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)hline, (void*)(uintptr_t)lphconfcall, (void*)(uintptr_t)lphconsultcall, (uint32_t)dwnumparties, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetupConferenceA(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hline, jlong lphconfcall, jlong lphconsultcall, jint dwnumparties, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConferenceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)hline, (void*)(uintptr_t)lphconfcall, (void*)(uintptr_t)lphconsultcall, (uint32_t)dwnumparties, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetupConferenceW(JNIEnv* km_env, jclass km_clazz, jint hcall, jint hline, jlong lphconfcall, jlong lphconsultcall, jint dwnumparties, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupConferenceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (uint32_t)hline, (void*)(uintptr_t)lphconfcall, (void*)(uintptr_t)lphconsultcall, (uint32_t)dwnumparties, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hcall;
    (void)hline;
    (void)lphconfcall;
    (void)lphconsultcall;
    (void)dwnumparties;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetupTransfer(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransfer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetupTransferA(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransferA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSetupTransferW(JNIEnv* km_env, jclass km_clazz, jint hcall, jlong lphconsultcall, jlong lpcallparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSetupTransferW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall, (void*)(uintptr_t)lphconsultcall, (void*)(uintptr_t)lpcallparams) : -1;
#else
    (void)hcall;
    (void)lphconsultcall;
    (void)lpcallparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineShutdown(JNIEnv* km_env, jclass km_clazz, jint hlineapp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp) : -1;
#else
    (void)hlineapp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineSwapHold(JNIEnv* km_env, jclass km_clazz, jint hactivecall, jint hheldcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineSwapHold");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hactivecall, (uint32_t)hheldcall) : -1;
#else
    (void)hactivecall;
    (void)hheldcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineTranslateAddress(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong lpszaddressin, jint dwcard, jint dwtranslateoptions, jlong lptranslateoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddress");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwcard, (uint32_t)dwtranslateoptions, (void*)(uintptr_t)lptranslateoutput) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineTranslateAddressA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong lpszaddressin, jint dwcard, jint dwtranslateoptions, jlong lptranslateoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddressA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwcard, (uint32_t)dwtranslateoptions, (void*)(uintptr_t)lptranslateoutput) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineTranslateAddressW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong lpszaddressin, jint dwcard, jint dwtranslateoptions, jlong lptranslateoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateAddressW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)lpszaddressin, (uint32_t)dwcard, (uint32_t)dwtranslateoptions, (void*)(uintptr_t)lptranslateoutput) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)lpszaddressin;
    (void)dwcard;
    (void)dwtranslateoptions;
    (void)lptranslateoutput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineTranslateDialog(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong hwndowner, jlong lpszaddressin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszaddressin) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineTranslateDialogA(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong hwndowner, jlong lpszaddressin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialogA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszaddressin) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineTranslateDialogW(JNIEnv* km_env, jclass km_clazz, jint hlineapp, jint dwdeviceid, jint dwapiversion, jlong hwndowner, jlong lpszaddressin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineTranslateDialogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hlineapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszaddressin) : -1;
#else
    (void)hlineapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)hwndowner;
    (void)lpszaddressin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineUncompleteCall(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwcompletionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUncompleteCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwcompletionid) : -1;
#else
    (void)hline;
    (void)dwcompletionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineUnhold(JNIEnv* km_env, jclass km_clazz, jint hcall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnhold");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hcall) : -1;
#else
    (void)hcall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineUnpark(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnpark");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineUnparkA(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnparkA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1lineUnparkW(JNIEnv* km_env, jclass km_clazz, jint hline, jint dwaddressid, jlong lphcall, jlong lpszdestaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "lineUnparkW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hline, (uint32_t)dwaddressid, (void*)(uintptr_t)lphcall, (void*)(uintptr_t)lpszdestaddress) : -1;
#else
    (void)hline;
    (void)dwaddressid;
    (void)lphcall;
    (void)lpszdestaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneClose(JNIEnv* km_env, jclass km_clazz, jint hphone) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone) : -1;
#else
    (void)hphone;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneConfigDialog(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneConfigDialogA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialogA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneConfigDialogW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong hwndowner, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneConfigDialogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)dwdeviceid;
    (void)hwndowner;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneDevSpecific(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpparams, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneDevSpecific");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpparams, (uint32_t)dwsize) : -1;
#else
    (void)hphone;
    (void)lpparams;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetButtonInfo(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetButtonInfoA(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetButtonInfoW(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetButtonInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetData(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwdataid, jlong lpdata, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwdataid, (void*)(uintptr_t)lpdata, (uint32_t)dwsize) : -1;
#else
    (void)hphone;
    (void)dwdataid;
    (void)lpdata;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetDevCaps(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lpphonecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCaps");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpphonecaps) : -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetDevCapsA(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lpphonecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCapsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpphonecaps) : -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetDevCapsW(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextversion, jlong lpphonecaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDevCapsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextversion, (void*)(uintptr_t)lpphonecaps) : -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextversion;
    (void)lpphonecaps;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetDisplay(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdisplay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetDisplay");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdisplay) : -1;
#else
    (void)hphone;
    (void)lpdisplay;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetGain(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jlong lpdwgain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetGain");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (void*)(uintptr_t)lpdwgain) : -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)lpdwgain;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetHookSwitch(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdwhookswitchdevs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetHookSwitch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdwhookswitchdevs) : -1;
#else
    (void)hphone;
    (void)lpdwhookswitchdevs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetID(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetIDA(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIDA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetIDW(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdeviceid, jlong lpszdeviceclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIDW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdeviceid, (void*)(uintptr_t)lpszdeviceclass) : -1;
#else
    (void)hphone;
    (void)lpdeviceid;
    (void)lpszdeviceclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetIcon(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon) : -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetIconA(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIconA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon) : -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetIconW(JNIEnv* km_env, jclass km_clazz, jint dwdeviceid, jlong lpszdeviceclass, jlong lphicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetIconW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdeviceid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lphicon) : -1;
#else
    (void)dwdeviceid;
    (void)lpszdeviceclass;
    (void)lphicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetLamp(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpdwlampmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetLamp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpdwlampmode) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpdwlampmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetMessage(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jlong lpmessage, jint dwtimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp, (void*)(uintptr_t)lpmessage, (uint32_t)dwtimeout) : -1;
#else
    (void)hphoneapp;
    (void)lpmessage;
    (void)dwtimeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetRing(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdwringmode, jlong lpdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetRing");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdwringmode, (void*)(uintptr_t)lpdwvolume) : -1;
#else
    (void)hphone;
    (void)lpdwringmode;
    (void)lpdwvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetStatus(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpphonestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpphonestatus) : -1;
#else
    (void)hphone;
    (void)lpphonestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetStatusA(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpphonestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpphonestatus) : -1;
#else
    (void)hphone;
    (void)lpphonestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpdwphonestates, jlong lpdwbuttonmodes, jlong lpdwbuttonstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusMessages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpdwphonestates, (void*)(uintptr_t)lpdwbuttonmodes, (void*)(uintptr_t)lpdwbuttonstates) : -1;
#else
    (void)hphone;
    (void)lpdwphonestates;
    (void)lpdwbuttonmodes;
    (void)lpdwbuttonstates;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetStatusW(JNIEnv* km_env, jclass km_clazz, jint hphone, jlong lpphonestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (void*)(uintptr_t)lpphonestatus) : -1;
#else
    (void)hphone;
    (void)lpphonestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneGetVolume(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jlong lpdwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneGetVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (void*)(uintptr_t)lpdwvolume) : -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)lpdwvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneInitialize(JNIEnv* km_env, jclass km_clazz, jlong lphphoneapp, jlong hinstance, jlong lpfncallback, jlong lpszappname, jlong lpdwnumdevs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphphoneapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpdwnumdevs) : -1;
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszappname;
    (void)lpdwnumdevs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneInitializeExA(JNIEnv* km_env, jclass km_clazz, jlong lphphoneapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lpphoneinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitializeExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphphoneapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpphoneinitializeexparams) : -1;
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lpphoneinitializeexparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneInitializeExW(JNIEnv* km_env, jclass km_clazz, jlong lphphoneapp, jlong hinstance, jlong lpfncallback, jlong lpszfriendlyappname, jlong lpdwnumdevs, jlong lpdwapiversion, jlong lpphoneinitializeexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneInitializeExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphphoneapp, (void*)(uintptr_t)hinstance, (void*)(uintptr_t)lpfncallback, (void*)(uintptr_t)lpszfriendlyappname, (void*)(uintptr_t)lpdwnumdevs, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpphoneinitializeexparams) : -1;
#else
    (void)lphphoneapp;
    (void)hinstance;
    (void)lpfncallback;
    (void)lpszfriendlyappname;
    (void)lpdwnumdevs;
    (void)lpdwapiversion;
    (void)lpphoneinitializeexparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneNegotiateAPIVersion(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapilowversion, jint dwapihighversion, jlong lpdwapiversion, jlong lpextensionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneNegotiateAPIVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapilowversion, (uint32_t)dwapihighversion, (void*)(uintptr_t)lpdwapiversion, (void*)(uintptr_t)lpextensionid) : -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapilowversion;
    (void)dwapihighversion;
    (void)lpdwapiversion;
    (void)lpextensionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneNegotiateExtVersion(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jint dwapiversion, jint dwextlowversion, jint dwexthighversion, jlong lpdwextversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneNegotiateExtVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (uint32_t)dwapiversion, (uint32_t)dwextlowversion, (uint32_t)dwexthighversion, (void*)(uintptr_t)lpdwextversion) : -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)dwapiversion;
    (void)dwextlowversion;
    (void)dwexthighversion;
    (void)lpdwextversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneOpen(JNIEnv* km_env, jclass km_clazz, jint hphoneapp, jint dwdeviceid, jlong lphphone, jint dwapiversion, jint dwextversion, jlong dwcallbackinstance, jint dwprivilege) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp, (uint32_t)dwdeviceid, (void*)(uintptr_t)lphphone, (uint32_t)dwapiversion, (uint32_t)dwextversion, (uint64_t)dwcallbackinstance, (uint32_t)dwprivilege) : -1;
#else
    (void)hphoneapp;
    (void)dwdeviceid;
    (void)lphphone;
    (void)dwapiversion;
    (void)dwextversion;
    (void)dwcallbackinstance;
    (void)dwprivilege;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetButtonInfo(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetButtonInfoA(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetButtonInfoW(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jlong lpbuttoninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetButtonInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (void*)(uintptr_t)lpbuttoninfo) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)lpbuttoninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetData(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwdataid, jlong lpdata, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwdataid, (void*)(uintptr_t)lpdata, (uint32_t)dwsize) : -1;
#else
    (void)hphone;
    (void)dwdataid;
    (void)lpdata;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetDisplay(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwrow, jint dwcolumn, jlong lpsdisplay, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetDisplay");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwrow, (uint32_t)dwcolumn, (void*)(uintptr_t)lpsdisplay, (uint32_t)dwsize) : -1;
#else
    (void)hphone;
    (void)dwrow;
    (void)dwcolumn;
    (void)lpsdisplay;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetGain(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jint dwgain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetGain");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (uint32_t)dwgain) : -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)dwgain;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetHookSwitch(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdevs, jint dwhookswitchmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetHookSwitch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdevs, (uint32_t)dwhookswitchmode) : -1;
#else
    (void)hphone;
    (void)dwhookswitchdevs;
    (void)dwhookswitchmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetLamp(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwbuttonlampid, jint dwlampmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetLamp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwbuttonlampid, (uint32_t)dwlampmode) : -1;
#else
    (void)hphone;
    (void)dwbuttonlampid;
    (void)dwlampmode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetRing(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwringmode, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetRing");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwringmode, (uint32_t)dwvolume) : -1;
#else
    (void)hphone;
    (void)dwringmode;
    (void)dwvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetStatusMessages(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwphonestates, jint dwbuttonmodes, jint dwbuttonstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetStatusMessages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwphonestates, (uint32_t)dwbuttonmodes, (uint32_t)dwbuttonstates) : -1;
#else
    (void)hphone;
    (void)dwphonestates;
    (void)dwbuttonmodes;
    (void)dwbuttonstates;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneSetVolume(JNIEnv* km_env, jclass km_clazz, jint hphone, jint dwhookswitchdev, jint dwvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneSetVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphone, (uint32_t)dwhookswitchdev, (uint32_t)dwvolume) : -1;
#else
    (void)hphone;
    (void)dwhookswitchdev;
    (void)dwvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1phoneShutdown(JNIEnv* km_env, jclass km_clazz, jint hphoneapp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "phoneShutdown");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)hphoneapp) : -1;
#else
    (void)hphoneapp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiGetLocationInfo(JNIEnv* km_env, jclass km_clazz, jlong lpszcountrycode, jlong lpszcitycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszcountrycode, (void*)(uintptr_t)lpszcitycode) : -1;
#else
    (void)lpszcountrycode;
    (void)lpszcitycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiGetLocationInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpszcountrycode, jlong lpszcitycode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszcountrycode, (void*)(uintptr_t)lpszcitycode) : -1;
#else
    (void)lpszcountrycode;
    (void)lpszcitycode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiGetLocationInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpszcountrycodew, jlong lpszcitycodew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiGetLocationInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszcountrycodew, (void*)(uintptr_t)lpszcitycodew) : -1;
#else
    (void)lpszcountrycodew;
    (void)lpszcitycodew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiRequestDrop(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestDrop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid) : -1;
#else
    (void)hwnd;
    (void)wrequestid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiRequestMakeCall(JNIEnv* km_env, jclass km_clazz, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment) : -1;
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiRequestMakeCallA(JNIEnv* km_env, jclass km_clazz, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCallA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment) : -1;
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiRequestMakeCallW(JNIEnv* km_env, jclass km_clazz, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMakeCallW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment) : -1;
#else
    (void)lpszdestaddress;
    (void)lpszappname;
    (void)lpszcalledparty;
    (void)lpszcomment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiRequestMediaCall(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid, jlong lpszdeviceclass, jlong lpdeviceid, jint dwsize, jint dwsecure, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceid, (uint32_t)dwsize, (uint32_t)dwsecure, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiRequestMediaCallA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid, jlong lpszdeviceclass, jlong lpdeviceid, jint dwsize, jint dwsecure, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCallA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceid, (uint32_t)dwsize, (uint32_t)dwsecure, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_tapi_WindowsWin32DevicesTapiJniBridge_windowssys_1windows_1win32_1devices_1tapi_1tapiRequestMediaCallW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wrequestid, jlong lpszdeviceclass, jlong lpdeviceid, jint dwsize, jint dwsecure, jlong lpszdestaddress, jlong lpszappname, jlong lpszcalledparty, jlong lpszcomment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "tapiRequestMediaCallW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wrequestid, (void*)(uintptr_t)lpszdeviceclass, (void*)(uintptr_t)lpdeviceid, (uint32_t)dwsize, (uint32_t)dwsecure, (void*)(uintptr_t)lpszdestaddress, (void*)(uintptr_t)lpszappname, (void*)(uintptr_t)lpszcalledparty, (void*)(uintptr_t)lpszcomment) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

