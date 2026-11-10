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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeAsyncRecvDone(JNIEnv* km_env, jclass km_clazz, jlong hclientrequest, jint action) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeAsyncRecvDone");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclientrequest, (uint32_t)action) : 0;
#else
    (void)hclientrequest;
    (void)action;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpAppendOption(JNIEnv* km_env, jclass km_clazz, jlong preplypacket, jint umaxreplypacketlen, jlong pureplypacketlen, jbyte boption, jbyte boptionlen, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpAppendOption");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preplypacket, (uint32_t)umaxreplypacketlen, (void*)(uintptr_t)pureplypacketlen, (uint8_t)boption, (uint8_t)boptionlen, (void*)(uintptr_t)pvalue) : 0;
#else
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    (void)boption;
    (void)boptionlen;
    (void)pvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpAppendOptionRaw(JNIEnv* km_env, jclass km_clazz, jlong preplypacket, jint umaxreplypacketlen, jlong pureplypacketlen, jshort ubufferlen, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpAppendOptionRaw");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preplypacket, (uint32_t)umaxreplypacketlen, (void*)(uintptr_t)pureplypacketlen, (uint16_t)ubufferlen, (void*)(uintptr_t)pbuffer) : 0;
#else
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    (void)ubufferlen;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpGetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jint uinstance, jbyte boption, jlong pboptionlen, jlong ppoptionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpGetOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (uint32_t)uinstance, (uint8_t)boption, (void*)(uintptr_t)pboptionlen, (void*)(uintptr_t)ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)uinstance;
    (void)boption;
    (void)pboptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpGetVendorOptionValue(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jbyte boption, jint uinstance, jlong pboptionlen, jlong ppoptionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpGetVendorOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (uint8_t)boption, (uint32_t)uinstance, (void*)(uintptr_t)pboptionlen, (void*)(uintptr_t)ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)boption;
    (void)uinstance;
    (void)pboptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpInitialize(JNIEnv* km_env, jclass km_clazz, jlong precvpacket, jint urecvpacketlen, jlong preplypacket, jint umaxreplypacketlen, jlong pureplypacketlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpInitialize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)precvpacket, (uint32_t)urecvpacketlen, (void*)(uintptr_t)preplypacket, (uint32_t)umaxreplypacketlen, (void*)(uintptr_t)pureplypacketlen) : 0;
#else
    (void)precvpacket;
    (void)urecvpacketlen;
    (void)preplypacket;
    (void)umaxreplypacketlen;
    (void)pureplypacketlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpIsValid(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jint brequestpacket, jlong pbpxeoptionpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpIsValid");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (int32_t)brequestpacket, (void*)(uintptr_t)pbpxeoptionpresent) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)brequestpacket;
    (void)pbpxeoptionpresent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6AppendOption(JNIEnv* km_env, jclass km_clazz, jlong preply, jint cbreply, jlong pcbreplyused, jshort woptiontype, jshort cboption, jlong poption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6AppendOption");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preply, (uint32_t)cbreply, (void*)(uintptr_t)pcbreplyused, (uint16_t)woptiontype, (uint16_t)cboption, (void*)(uintptr_t)poption) : 0;
#else
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    (void)woptiontype;
    (void)cboption;
    (void)poption;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6AppendOptionRaw(JNIEnv* km_env, jclass km_clazz, jlong preply, jint cbreply, jlong pcbreplyused, jshort cbbuffer, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6AppendOptionRaw");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)preply, (uint32_t)cbreply, (void*)(uintptr_t)pcbreplyused, (uint16_t)cbbuffer, (void*)(uintptr_t)pbuffer) : 0;
#else
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    (void)cbbuffer;
    (void)pbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6CreateRelayRepl(JNIEnv* km_env, jclass km_clazz, jlong prelaymessages, jint nrelaymessages, jlong pinnerpacket, jint cbinnerpacket, jlong preplybuffer, jint cbreplybuffer, jlong pcbreplybuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6CreateRelayRepl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prelaymessages, (uint32_t)nrelaymessages, (void*)(uintptr_t)pinnerpacket, (uint32_t)cbinnerpacket, (void*)(uintptr_t)preplybuffer, (uint32_t)cbreplybuffer, (void*)(uintptr_t)pcbreplybuffer) : 0;
#else
    (void)prelaymessages;
    (void)nrelaymessages;
    (void)pinnerpacket;
    (void)cbinnerpacket;
    (void)preplybuffer;
    (void)cbreplybuffer;
    (void)pcbreplybuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6GetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jint uinstance, jshort woption, jlong pwoptionlen, jlong ppoptionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6GetOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (uint32_t)uinstance, (uint16_t)woption, (void*)(uintptr_t)pwoptionlen, (void*)(uintptr_t)ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)uinstance;
    (void)woption;
    (void)pwoptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6GetVendorOptionValue(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jint dwenterprisenumber, jshort woption, jint uinstance, jlong pwoptionlen, jlong ppoptionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint16_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6GetVendorOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (uint32_t)dwenterprisenumber, (uint16_t)woption, (uint32_t)uinstance, (void*)(uintptr_t)pwoptionlen, (void*)(uintptr_t)ppoptionvalue) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)dwenterprisenumber;
    (void)woption;
    (void)uinstance;
    (void)pwoptionlen;
    (void)ppoptionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6Initialize(JNIEnv* km_env, jclass km_clazz, jlong prequest, jint cbrequest, jlong preply, jint cbreply, jlong pcbreplyused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6Initialize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prequest, (uint32_t)cbrequest, (void*)(uintptr_t)preply, (uint32_t)cbreply, (void*)(uintptr_t)pcbreplyused) : 0;
#else
    (void)prequest;
    (void)cbrequest;
    (void)preply;
    (void)cbreply;
    (void)pcbreplyused;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6IsValid(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jint brequestpacket, jlong pbpxeoptionpresent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6IsValid");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (int32_t)brequestpacket, (void*)(uintptr_t)pbpxeoptionpresent) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)brequestpacket;
    (void)pbpxeoptionpresent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeDhcpv6ParseRelayForw(JNIEnv* km_env, jclass km_clazz, jlong prelayforwpacket, jint urelayforwpacketlen, jlong prelaymessages, jint nrelaymessages, jlong pnrelaymessages, jlong ppinnerpacket, jlong pcbinnerpacket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeDhcpv6ParseRelayForw");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prelayforwpacket, (uint32_t)urelayforwpacketlen, (void*)(uintptr_t)prelaymessages, (uint32_t)nrelaymessages, (void*)(uintptr_t)pnrelaymessages, (void*)(uintptr_t)ppinnerpacket, (void*)(uintptr_t)pcbinnerpacket) : 0;
#else
    (void)prelayforwpacket;
    (void)urelayforwpacketlen;
    (void)prelaymessages;
    (void)nrelaymessages;
    (void)pnrelaymessages;
    (void)ppinnerpacket;
    (void)pcbinnerpacket;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeGetServerInfo(JNIEnv* km_env, jclass km_clazz, jint uinfotype, jlong pbuffer, jint ubufferlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeGetServerInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uinfotype, (void*)(uintptr_t)pbuffer, (uint32_t)ubufferlen) : 0;
#else
    (void)uinfotype;
    (void)pbuffer;
    (void)ubufferlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeGetServerInfoEx(JNIEnv* km_env, jclass km_clazz, jint uinfotype, jlong pbuffer, jint ubufferlen, jlong pubufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeGetServerInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uinfotype, (void*)(uintptr_t)pbuffer, (uint32_t)ubufferlen, (void*)(uintptr_t)pubufferused) : 0;
#else
    (void)uinfotype;
    (void)pbuffer;
    (void)ubufferlen;
    (void)pubufferused;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxePacketAllocate(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong hclientrequest, jint usize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxePacketAllocate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)hclientrequest, (uint32_t)usize) : NULL;
#else
    (void)hprovider;
    (void)hclientrequest;
    (void)usize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxePacketFree(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong hclientrequest, jlong ppacket) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxePacketFree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)hclientrequest, (void*)(uintptr_t)ppacket) : 0;
#else
    (void)hprovider;
    (void)hclientrequest;
    (void)ppacket;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderEnumClose(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderEnumClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderEnumFirst(JNIEnv* km_env, jclass km_clazz, jlong phenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderEnumFirst");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phenum) : 0;
#else
    (void)phenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderEnumNext(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong ppprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderEnumNext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henum, (void*)(uintptr_t)ppprovider) : 0;
#else
    (void)henum;
    (void)ppprovider;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderFreeInfo(JNIEnv* km_env, jclass km_clazz, jlong pprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderFreeInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider) : 0;
#else
    (void)pprovider;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderQueryIndex(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong puindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderQueryIndex");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)puindex) : 0;
#else
    (void)pszprovidername;
    (void)puindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderRegister(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong pszmodulepath, jint arg_2_index, jint biscritical, jlong phproviderkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderRegister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)pszmodulepath, (uint32_t)arg_2_index, (int32_t)biscritical, (void*)(uintptr_t)phproviderkey) : 0;
#else
    (void)pszprovidername;
    (void)pszmodulepath;
    (void)arg_2_index;
    (void)biscritical;
    (void)phproviderkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderSetAttribute(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint attribute, jlong pparameterbuffer, jint uparamlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderSetAttribute");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)attribute, (void*)(uintptr_t)pparameterbuffer, (uint32_t)uparamlen) : 0;
#else
    (void)hprovider;
    (void)attribute;
    (void)pparameterbuffer;
    (void)uparamlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeProviderUnRegister(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeProviderUnRegister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprovidername) : 0;
#else
    (void)pszprovidername;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeRegisterCallback(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint callbacktype, jlong pcallbackfunction, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeRegisterCallback");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)callbacktype, (void*)(uintptr_t)pcallbackfunction, (void*)(uintptr_t)pcontext) : 0;
#else
    (void)hprovider;
    (void)callbacktype;
    (void)pcallbackfunction;
    (void)pcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeSendReply(JNIEnv* km_env, jclass km_clazz, jlong hclientrequest, jlong ppacket, jint upacketlen, jlong paddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeSendReply");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hclientrequest, (void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (void*)(uintptr_t)paddress) : 0;
#else
    (void)hclientrequest;
    (void)ppacket;
    (void)upacketlen;
    (void)paddress;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeTrace(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint severity, jlong pszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeTrace");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pszformat); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pszformat, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)hprovider;
    (void)severity;
    (void)pszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1pxeTraceV(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint severity, jlong pszformat, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdspxe.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PxeTraceV");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pszformat, (void*)(uintptr_t)params) : 0;
#else
    (void)hprovider;
    (void)severity;
    (void)pszformat;
    (void)params;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsBpAddOption(JNIEnv* km_env, jclass km_clazz, jlong hhandle, jint uoption, jint uvaluelen, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpAddOption");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hhandle, (uint32_t)uoption, (uint32_t)uvaluelen, (void*)(uintptr_t)pvalue) : 0;
#else
    (void)hhandle;
    (void)uoption;
    (void)uvaluelen;
    (void)pvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsBpCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpCloseHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hhandle) : 0;
#else
    (void)hhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsBpGetOptionBuffer(JNIEnv* km_env, jclass km_clazz, jlong hhandle, jint ubufferlen, jlong pbuffer, jlong pubytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpGetOptionBuffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hhandle, (uint32_t)ubufferlen, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pubytes) : 0;
#else
    (void)hhandle;
    (void)ubufferlen;
    (void)pbuffer;
    (void)pubytes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsBpInitialize(JNIEnv* km_env, jclass km_clazz, jbyte bpackettype, jlong phhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpInitialize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint8_t)bpackettype, (void*)(uintptr_t)phhandle) : 0;
#else
    (void)bpackettype;
    (void)phhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsBpParseInitialize(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jlong pbpackettype, jlong phhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpParseInitialize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (void*)(uintptr_t)pbpackettype, (void*)(uintptr_t)phhandle) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)pbpackettype;
    (void)phhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsBpParseInitializev6(JNIEnv* km_env, jclass km_clazz, jlong ppacket, jint upacketlen, jlong pbpackettype, jlong phhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpParseInitializev6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppacket, (uint32_t)upacketlen, (void*)(uintptr_t)pbpackettype, (void*)(uintptr_t)phhandle) : 0;
#else
    (void)ppacket;
    (void)upacketlen;
    (void)pbpackettype;
    (void)phhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsBpQueryOption(JNIEnv* km_env, jclass km_clazz, jlong hhandle, jint uoption, jint uvaluelen, jlong pvalue, jlong pubytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsbp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsBpQueryOption");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hhandle, (uint32_t)uoption, (uint32_t)uvaluelen, (void*)(uintptr_t)pvalue, (void*)(uintptr_t)pubytes) : 0;
#else
    (void)hhandle;
    (void)uoption;
    (void)uvaluelen;
    (void)pvalue;
    (void)pubytes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliAuthorizeSession(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong pcred) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliAuthorizeSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)pcred) : -1;
#else
    (void)hsession;
    (void)pcred;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliCancelTransfer(JNIEnv* km_env, jclass km_clazz, jlong htransfer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliCancelTransfer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htransfer) : -1;
#else
    (void)htransfer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliClose(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliCreateSession(JNIEnv* km_env, jclass km_clazz, jlong pwszserver, jlong pcred, jlong phsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliCreateSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszserver, (void*)(uintptr_t)pcred, (void*)(uintptr_t)phsession) : -1;
#else
    (void)pwszserver;
    (void)pcred;
    (void)phsession;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliFindFirstImage(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong phfindhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliFindFirstImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)phfindhandle) : -1;
#else
    (void)hsession;
    (void)phfindhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliFindNextImage(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliFindNextImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliFreeStringArray(JNIEnv* km_env, jclass km_clazz, jlong ppwszarray, jint ulcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliFreeStringArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppwszarray, (uint32_t)ulcount) : -1;
#else
    (void)ppwszarray;
    (void)ulcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetDriverQueryXml(JNIEnv* km_env, jclass km_clazz, jlong pwszwindirpath, jlong ppwszdriverquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetDriverQueryXml");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszwindirpath, (void*)(uintptr_t)ppwszdriverquery) : -1;
#else
    (void)pwszwindirpath;
    (void)ppwszdriverquery;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetEnumerationFlags(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetEnumerationFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)pdwflags) : -1;
#else
    (void)handle;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageArchitecture(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong pdwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageArchitecture");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)pdwvalue) : -1;
#else
    (void)hifh;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageDescription(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageDescription");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageFiles(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong pppwszfiles, jlong pdwcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)pppwszfiles, (void*)(uintptr_t)pdwcount) : -1;
#else
    (void)hifh;
    (void)pppwszfiles;
    (void)pdwcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageGroup(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageHalName(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageHalName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageHandleFromFindHandle(JNIEnv* km_env, jclass km_clazz, jlong findhandle, jlong phimagehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageHandleFromFindHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)findhandle, (void*)(uintptr_t)phimagehandle) : -1;
#else
    (void)findhandle;
    (void)phimagehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageHandleFromTransferHandle(JNIEnv* km_env, jclass km_clazz, jlong htransfer, jlong phimagehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageHandleFromTransferHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htransfer, (void*)(uintptr_t)phimagehandle) : -1;
#else
    (void)htransfer;
    (void)phimagehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageIndex(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong pdwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)pdwvalue) : -1;
#else
    (void)hifh;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageLanguage(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageLanguage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageLanguages(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong pppszvalues, jlong pdwnumvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageLanguages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)pppszvalues, (void*)(uintptr_t)pdwnumvalues) : -1;
#else
    (void)hifh;
    (void)pppszvalues;
    (void)pdwnumvalues;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageLastModifiedTime(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppsystimevalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageLastModifiedTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppsystimevalue) : -1;
#else
    (void)hifh;
    (void)ppsystimevalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageName(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageNamespace(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageNamespace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageParameter(JNIEnv* km_env, jclass km_clazz, jlong hifh, jint paramtype, jlong presponse, jint uresponselen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (int32_t)paramtype, (void*)(uintptr_t)presponse, (uint32_t)uresponselen) : -1;
#else
    (void)hifh;
    (void)paramtype;
    (void)presponse;
    (void)uresponselen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImagePath(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImagePath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageSize(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong pullvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)pullvalue) : -1;
#else
    (void)hifh;
    (void)pullvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageType(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong pimagetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)pimagetype) : -1;
#else
    (void)hifh;
    (void)pimagetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetImageVersion(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetImageVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hifh;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliGetTransferSize(JNIEnv* km_env, jclass km_clazz, jlong hifh, jlong pullvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliGetTransferSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hifh, (void*)(uintptr_t)pullvalue) : -1;
#else
    (void)hifh;
    (void)pullvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliInitializeLog(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint ulclientarchitecture, jlong pwszclientid, jlong pwszclientaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliInitializeLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)ulclientarchitecture, (void*)(uintptr_t)pwszclientid, (void*)(uintptr_t)pwszclientaddress) : -1;
#else
    (void)hsession;
    (void)ulclientarchitecture;
    (void)pwszclientid;
    (void)pwszclientaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliLog(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint ulloglevel, jint ulmessagecode, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, uint32_t, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliLog");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)ulloglevel, (uint32_t)ulmessagecode); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)ulloglevel, (uint32_t)ulmessagecode, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)ulloglevel, (uint32_t)ulmessagecode, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)ulloglevel, (uint32_t)ulmessagecode, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)ulloglevel, (uint32_t)ulmessagecode, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)hsession;
    (void)ulloglevel;
    (void)ulmessagecode;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliObtainDriverPackages(JNIEnv* km_env, jclass km_clazz, jlong himage, jlong ppwszservername, jlong pppwszdriverpackages, jlong pulcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliObtainDriverPackages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)himage, (void*)(uintptr_t)ppwszservername, (void*)(uintptr_t)pppwszdriverpackages, (void*)(uintptr_t)pulcount) : -1;
#else
    (void)himage;
    (void)ppwszservername;
    (void)pppwszdriverpackages;
    (void)pulcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliObtainDriverPackagesEx(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong pwszmachineinfo, jlong ppwszservername, jlong pppwszdriverpackages, jlong pulcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliObtainDriverPackagesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)pwszmachineinfo, (void*)(uintptr_t)ppwszservername, (void*)(uintptr_t)pppwszdriverpackages, (void*)(uintptr_t)pulcount) : -1;
#else
    (void)hsession;
    (void)pwszmachineinfo;
    (void)ppwszservername;
    (void)pppwszdriverpackages;
    (void)pulcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliRegisterTrace(JNIEnv* km_env, jclass km_clazz, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliRegisterTrace");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfn) : -1;
#else
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliSetTransferBufferSize(JNIEnv* km_env, jclass km_clazz, jint ulsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliSetTransferBufferSize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)ulsizeinbytes);
#else
    (void)ulsizeinbytes;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliTransferFile(JNIEnv* km_env, jclass km_clazz, jlong pwszserver, jlong pwsznamespace, jlong pwszremotefilepath, jlong pwszlocalfilepath, jint dwflags, jint dwreserved, jlong pfnwdsclicallback, jlong pvuserdata, jlong phtransfer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliTransferFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszserver, (void*)(uintptr_t)pwsznamespace, (void*)(uintptr_t)pwszremotefilepath, (void*)(uintptr_t)pwszlocalfilepath, (uint32_t)dwflags, (uint32_t)dwreserved, (void*)(uintptr_t)pfnwdsclicallback, (void*)(uintptr_t)pvuserdata, (void*)(uintptr_t)phtransfer) : -1;
#else
    (void)pwszserver;
    (void)pwsznamespace;
    (void)pwszremotefilepath;
    (void)pwszlocalfilepath;
    (void)dwflags;
    (void)dwreserved;
    (void)pfnwdsclicallback;
    (void)pvuserdata;
    (void)phtransfer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliTransferImage(JNIEnv* km_env, jclass km_clazz, jlong himage, jlong pwszlocalpath, jint dwflags, jint dwreserved, jlong pfnwdsclicallback, jlong pvuserdata, jlong phtransfer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliTransferImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)himage, (void*)(uintptr_t)pwszlocalpath, (uint32_t)dwflags, (uint32_t)dwreserved, (void*)(uintptr_t)pfnwdsclicallback, (void*)(uintptr_t)pvuserdata, (void*)(uintptr_t)phtransfer) : -1;
#else
    (void)himage;
    (void)pwszlocalpath;
    (void)dwflags;
    (void)dwreserved;
    (void)pfnwdsclicallback;
    (void)pvuserdata;
    (void)phtransfer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsCliWaitForTransfer(JNIEnv* km_env, jclass km_clazz, jlong htransfer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsclientapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsCliWaitForTransfer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htransfer) : -1;
#else
    (void)htransfer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientAddRefBuffer(JNIEnv* km_env, jclass km_clazz, jlong pvbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientAddRefBuffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvbuffer) : 0;
#else
    (void)pvbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientCancelSession(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCancelSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey) : 0;
#else
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientCancelSessionEx(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey, jint dwerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCancelSessionEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey, (uint32_t)dwerrorcode) : 0;
#else
    (void)hsessionkey;
    (void)dwerrorcode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientCloseSession(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCloseSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey) : 0;
#else
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientCompleteReceive(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey, jint ulsize, jlong pulloffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientCompleteReceive");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey, (uint32_t)ulsize, (void*)(uintptr_t)pulloffset) : 0;
#else
    (void)hsessionkey;
    (void)ulsize;
    (void)pulloffset;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientInitialize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientInitialize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientInitializeSession(JNIEnv* km_env, jclass km_clazz, jlong psessionrequest, jlong pcallerdata, jlong hsessionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientInitializeSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psessionrequest, (void*)(uintptr_t)pcallerdata, (void*)(uintptr_t)hsessionkey) : 0;
#else
    (void)psessionrequest;
    (void)pcallerdata;
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientQueryStatus(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey, jlong pustatus, jlong puerrorcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientQueryStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey, (void*)(uintptr_t)pustatus, (void*)(uintptr_t)puerrorcode) : 0;
#else
    (void)hsessionkey;
    (void)pustatus;
    (void)puerrorcode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientRegisterCallback(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey, jint callbackid, jlong pfncallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientRegisterCallback");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey, (int32_t)callbackid, (void*)(uintptr_t)pfncallback) : 0;
#else
    (void)hsessionkey;
    (void)callbackid;
    (void)pfncallback;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientReleaseBuffer(JNIEnv* km_env, jclass km_clazz, jlong pvbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientReleaseBuffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvbuffer) : 0;
#else
    (void)pvbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientShutdown");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientStartSession(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientStartSession");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey) : 0;
#else
    (void)hsessionkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportClientWaitForCompletion(JNIEnv* km_env, jclass km_clazz, jlong hsessionkey, jint utimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdstptc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportClientWaitForCompletion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsessionkey, (uint32_t)utimeout) : 0;
#else
    (void)hsessionkey;
    (void)utimeout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportServerAllocateBuffer(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint ulbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerAllocateBuffer");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)ulbuffersize) : NULL;
#else
    (void)hprovider;
    (void)ulbuffersize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportServerCompleteRead(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint ulbytesread, jlong pvuserdata, jint hreadresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerCompleteRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)ulbytesread, (void*)(uintptr_t)pvuserdata, (int32_t)hreadresult) : -1;
#else
    (void)hprovider;
    (void)ulbytesread;
    (void)pvuserdata;
    (void)hreadresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportServerFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pvbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerFreeBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (void*)(uintptr_t)pvbuffer) : -1;
#else
    (void)hprovider;
    (void)pvbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportServerRegisterCallback(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint callbackid, jlong pfncallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerRegisterCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (int32_t)callbackid, (void*)(uintptr_t)pfncallback) : -1;
#else
    (void)hprovider;
    (void)callbackid;
    (void)pfncallback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportServerTrace(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint severity, jlong pwszformat, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerTrace");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pwszformat); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pwszformat, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pwszformat, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pwszformat, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)hprovider;
    (void)severity;
    (void)pwszformat;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_deploymentservices_WindowsWin32SystemDeploymentservicesJniBridge_windowssys_1windows_1win32_1system_1deploymentservices_1wdsTransportServerTraceV(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint severity, jlong pwszformat, jlong params) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wdsmc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WdsTransportServerTraceV");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprovider, (uint32_t)severity, (void*)(uintptr_t)pwszformat, (void*)(uintptr_t)params) : -1;
#else
    (void)hprovider;
    (void)severity;
    (void)pwszformat;
    (void)params;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

