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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1AccSetRunningUtilityState(JNIEnv* km_env, jclass km_clazz, jlong hwndapp, jint dwutilitystatemask, jint dwutilitystate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccSetRunningUtilityState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndapp, (uint32_t)dwutilitystatemask, (uint32_t)dwutilitystate) : -1;
#else
    (void)hwndapp;
    (void)dwutilitystatemask;
    (void)dwutilitystate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1AccessibleChildren(JNIEnv* km_env, jclass km_clazz, jlong pacccontainer, jint ichildstart, jint cchildren, jlong rgvarchildren, jlong pcobtained) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessibleChildren");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacccontainer, (int32_t)ichildstart, (int32_t)cchildren, (void*)(uintptr_t)rgvarchildren, (void*)(uintptr_t)pcobtained) : -1;
#else
    (void)pacccontainer;
    (void)ichildstart;
    (void)cchildren;
    (void)rgvarchildren;
    (void)pcobtained;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1AccessibleObjectFromEvent(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwid, jint dwchildid, jlong ppacc, jlong pvarchild) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessibleObjectFromEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwid, (uint32_t)dwchildid, (void*)(uintptr_t)ppacc, (void*)(uintptr_t)pvarchild) : -1;
#else
    (void)hwnd;
    (void)dwid;
    (void)dwchildid;
    (void)ppacc;
    (void)pvarchild;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1AccessibleObjectFromWindow(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint dwid, jlong riid, jlong ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessibleObjectFromWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)dwid, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobject) : -1;
#else
    (void)hwnd;
    (void)dwid;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1CreateStdAccessibleObject(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint idobject, jlong riid, jlong ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdAccessibleObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)idobject, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobject) : -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1CreateStdAccessibleProxyA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pclassname, jint idobject, jlong riid, jlong ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdAccessibleProxyA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pclassname, (int32_t)idobject, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobject) : -1;
#else
    (void)hwnd;
    (void)pclassname;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1CreateStdAccessibleProxyW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pclassname, jint idobject, jlong riid, jlong ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdAccessibleProxyW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pclassname, (int32_t)idobject, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobject) : -1;
#else
    (void)hwnd;
    (void)pclassname;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1DockPattern_1SetDockPosition(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint dockposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DockPattern_SetDockPosition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)dockposition) : -1;
#else
    (void)hobj;
    (void)dockposition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1ExpandCollapsePattern_1Collapse(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandCollapsePattern_Collapse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1ExpandCollapsePattern_1Expand(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandCollapsePattern_Expand");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1GetOleaccVersionInfo(JNIEnv* km_env, jclass km_clazz, jlong pver, jlong pbuild) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOleaccVersionInfo");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pver, (void*)(uintptr_t)pbuild);
#else
    (void)pver;
    (void)pbuild;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1GetRoleTextA(JNIEnv* km_env, jclass km_clazz, jint lrole, jlong lpszrole, jint cchrolemax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRoleTextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)lrole, (void*)(uintptr_t)lpszrole, (uint32_t)cchrolemax) : 0;
#else
    (void)lrole;
    (void)lpszrole;
    (void)cchrolemax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1GetRoleTextW(JNIEnv* km_env, jclass km_clazz, jint lrole, jlong lpszrole, jint cchrolemax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRoleTextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)lrole, (void*)(uintptr_t)lpszrole, (uint32_t)cchrolemax) : 0;
#else
    (void)lrole;
    (void)lpszrole;
    (void)cchrolemax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1GetStateTextA(JNIEnv* km_env, jclass km_clazz, jint lstatebit, jlong lpszstate, jint cchstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStateTextA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)lstatebit, (void*)(uintptr_t)lpszstate, (uint32_t)cchstate) : 0;
#else
    (void)lstatebit;
    (void)lpszstate;
    (void)cchstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1GetStateTextW(JNIEnv* km_env, jclass km_clazz, jint lstatebit, jlong lpszstate, jint cchstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStateTextW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)lstatebit, (void*)(uintptr_t)lpszstate, (uint32_t)cchstate) : 0;
#else
    (void)lstatebit;
    (void)lpszstate;
    (void)cchstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1GridPattern_1GetItem(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint row, jint column, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GridPattern_GetItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)row, (int32_t)column, (void*)(uintptr_t)presult) : -1;
#else
    (void)hobj;
    (void)row;
    (void)column;
    (void)presult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1InvokePattern_1Invoke(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvokePattern_Invoke");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1IsWinEventHookInstalled(JNIEnv* km_env, jclass km_clazz, jint event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWinEventHookInstalled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)event) : -1;
#else
    (void)event;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1LegacyIAccessiblePattern_1DoDefaultAction(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_DoDefaultAction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1LegacyIAccessiblePattern_1GetIAccessible(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong paccessible) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_GetIAccessible");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)paccessible) : -1;
#else
    (void)hobj;
    (void)paccessible;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1LegacyIAccessiblePattern_1Select(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint flagsselect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_Select");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)flagsselect) : -1;
#else
    (void)hobj;
    (void)flagsselect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1LegacyIAccessiblePattern_1SetValue(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong szvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_SetValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)szvalue) : -1;
#else
    (void)hobj;
    (void)szvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1LresultFromObject(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong wparam, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LresultFromObject");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (uint64_t)wparam, (void*)(uintptr_t)punk) : -1;
#else
    (void)riid;
    (void)wparam;
    (void)punk;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1MultipleViewPattern_1GetViewName(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint viewid, jlong ppstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultipleViewPattern_GetViewName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)viewid, (void*)(uintptr_t)ppstr) : -1;
#else
    (void)hobj;
    (void)viewid;
    (void)ppstr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1MultipleViewPattern_1SetCurrentView(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint viewid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultipleViewPattern_SetCurrentView");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)viewid) : -1;
#else
    (void)hobj;
    (void)viewid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1NotifyWinEvent(JNIEnv* km_env, jclass km_clazz, jint event, jlong hwnd, jint idobject, jint idchild) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyWinEvent");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)event, (void*)(uintptr_t)hwnd, (int32_t)idobject, (int32_t)idchild);
#else
    (void)event;
    (void)hwnd;
    (void)idobject;
    (void)idchild;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1ObjectFromLresult(JNIEnv* km_env, jclass km_clazz, jlong lresult, jlong riid, jlong wparam, jlong ppvobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectFromLresult");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)lresult, (void*)(uintptr_t)riid, (uint64_t)wparam, (void*)(uintptr_t)ppvobject) : -1;
#else
    (void)lresult;
    (void)riid;
    (void)wparam;
    (void)ppvobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1RangeValuePattern_1SetValue(JNIEnv* km_env, jclass km_clazz, jlong hobj, jdouble val) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeValuePattern_SetValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (double)val) : -1;
#else
    (void)hobj;
    (void)val;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1RegisterPointerInputTarget(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint pointertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPointerInputTarget");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)pointertype) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1RegisterPointerInputTargetEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint pointertype, jint fobserve) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPointerInputTargetEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)pointertype, (int32_t)fobserve) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    (void)fobserve;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1ScrollItemPattern_1ScrollIntoView(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollItemPattern_ScrollIntoView");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1ScrollPattern_1Scroll(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint horizontalamount, jint verticalamount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollPattern_Scroll");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)horizontalamount, (int32_t)verticalamount) : -1;
#else
    (void)hobj;
    (void)horizontalamount;
    (void)verticalamount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1ScrollPattern_1SetScrollPercent(JNIEnv* km_env, jclass km_clazz, jlong hobj, jdouble horizontalpercent, jdouble verticalpercent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollPattern_SetScrollPercent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (double)horizontalpercent, (double)verticalpercent) : -1;
#else
    (void)hobj;
    (void)horizontalpercent;
    (void)verticalpercent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1SelectionItemPattern_1AddToSelection(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectionItemPattern_AddToSelection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1SelectionItemPattern_1RemoveFromSelection(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectionItemPattern_RemoveFromSelection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1SelectionItemPattern_1Select(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectionItemPattern_Select");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1SetWinEventHook(JNIEnv* km_env, jclass km_clazz, jint eventmin, jint eventmax, jlong hmodwineventproc, jlong pfnwineventproc, jint idprocess, jint idthread, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWinEventHook");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)eventmin, (uint32_t)eventmax, (void*)(uintptr_t)hmodwineventproc, (void*)(uintptr_t)pfnwineventproc, (uint32_t)idprocess, (uint32_t)idthread, (uint32_t)dwflags) : NULL;
#else
    (void)eventmin;
    (void)eventmax;
    (void)hmodwineventproc;
    (void)pfnwineventproc;
    (void)idprocess;
    (void)idthread;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1SynchronizedInputPattern_1Cancel(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SynchronizedInputPattern_Cancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1SynchronizedInputPattern_1StartListening(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint inputtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SynchronizedInputPattern_StartListening");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)inputtype) : -1;
#else
    (void)hobj;
    (void)inputtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextPattern_1GetSelection(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_GetSelection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextPattern_1GetVisibleRanges(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_GetVisibleRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextPattern_1RangeFromChild(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong hnodechild, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_RangeFromChild");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)hnodechild, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)hnodechild;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextPattern_1get_1DocumentRange(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_get_DocumentRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextPattern_1get_1SupportedTextSelection(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_get_SupportedTextSelection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1AddToSelection(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_AddToSelection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1Clone(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Clone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1Compare(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong range, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Compare");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)range, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)range;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1CompareEndpoints(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint endpoint, jlong targetrange, jint targetendpoint, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_CompareEndpoints");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)endpoint, (void*)(uintptr_t)targetrange, (int32_t)targetendpoint, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)targetrange;
    (void)targetendpoint;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1ExpandToEnclosingUnit(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint unit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_ExpandToEnclosingUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)unit) : -1;
#else
    (void)hobj;
    (void)unit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1FindText(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong text, jint backward, jint ignorecase, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_FindText");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)text, (int32_t)backward, (int32_t)ignorecase, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)text;
    (void)backward;
    (void)ignorecase;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1GetAttributeValue(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint attributeid, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetAttributeValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)attributeid, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)attributeid;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1GetBoundingRectangles(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetBoundingRectangles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1GetChildren(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetChildren");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1GetEnclosingElement(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetEnclosingElement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1GetText(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint maxlength, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetText");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)maxlength, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)maxlength;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1Move(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint unit, jint count, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Move");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)unit, (int32_t)count, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)unit;
    (void)count;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1MoveEndpointByRange(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint endpoint, jlong targetrange, jint targetendpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_MoveEndpointByRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)endpoint, (void*)(uintptr_t)targetrange, (int32_t)targetendpoint) : -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)targetrange;
    (void)targetendpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1MoveEndpointByUnit(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint endpoint, jint unit, jint count, jlong pretval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_MoveEndpointByUnit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)endpoint, (int32_t)unit, (int32_t)count, (void*)(uintptr_t)pretval) : -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)unit;
    (void)count;
    (void)pretval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1RemoveFromSelection(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_RemoveFromSelection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1ScrollIntoView(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint aligntotop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_ScrollIntoView");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)aligntotop) : -1;
#else
    (void)hobj;
    (void)aligntotop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TextRange_1Select(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Select");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TogglePattern_1Toggle(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TogglePattern_Toggle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TransformPattern_1Move(JNIEnv* km_env, jclass km_clazz, jlong hobj, jdouble x, jdouble y) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformPattern_Move");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (double)x, (double)y) : -1;
#else
    (void)hobj;
    (void)x;
    (void)y;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TransformPattern_1Resize(JNIEnv* km_env, jclass km_clazz, jlong hobj, jdouble width, jdouble height) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformPattern_Resize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (double)width, (double)height) : -1;
#else
    (void)hobj;
    (void)width;
    (void)height;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1TransformPattern_1Rotate(JNIEnv* km_env, jclass km_clazz, jlong hobj, jdouble degrees) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformPattern_Rotate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (double)degrees) : -1;
#else
    (void)hobj;
    (void)degrees;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaAddEvent(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint eventid, jlong pcallback, jint scope, jlong pproperties, jint cproperties, jlong prequest, jlong phevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaAddEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode, (int32_t)eventid, (void*)(uintptr_t)pcallback, (int32_t)scope, (void*)(uintptr_t)pproperties, (int32_t)cproperties, (void*)(uintptr_t)prequest, (void*)(uintptr_t)phevent) : -1;
#else
    (void)hnode;
    (void)eventid;
    (void)pcallback;
    (void)scope;
    (void)pproperties;
    (void)cproperties;
    (void)prequest;
    (void)phevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaClientsAreListening(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaClientsAreListening");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaDisconnectAllProviders(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaDisconnectAllProviders");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaDisconnectProvider(JNIEnv* km_env, jclass km_clazz, jlong pprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaDisconnectProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider) : -1;
#else
    (void)pprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaEventAddWindow(JNIEnv* km_env, jclass km_clazz, jlong hevent, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaEventAddWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hevent, (void*)(uintptr_t)hwnd) : -1;
#else
    (void)hevent;
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaEventRemoveWindow(JNIEnv* km_env, jclass km_clazz, jlong hevent, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaEventRemoveWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hevent, (void*)(uintptr_t)hwnd) : -1;
#else
    (void)hevent;
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaFind(JNIEnv* km_env, jclass km_clazz, jlong hnode, jlong pparams, jlong prequest, jlong pprequesteddata, jlong ppoffsets, jlong pptreestructures) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaFind");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode, (void*)(uintptr_t)pparams, (void*)(uintptr_t)prequest, (void*)(uintptr_t)pprequesteddata, (void*)(uintptr_t)ppoffsets, (void*)(uintptr_t)pptreestructures) : -1;
#else
    (void)hnode;
    (void)pparams;
    (void)prequest;
    (void)pprequesteddata;
    (void)ppoffsets;
    (void)pptreestructures;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetErrorDescription(JNIEnv* km_env, jclass km_clazz, jlong pdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetErrorDescription");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdescription) : -1;
#else
    (void)pdescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetPatternProvider(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint patternid, jlong phobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetPatternProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode, (int32_t)patternid, (void*)(uintptr_t)phobj) : -1;
#else
    (void)hnode;
    (void)patternid;
    (void)phobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetPropertyValue(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint propertyid, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetPropertyValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode, (int32_t)propertyid, (void*)(uintptr_t)pvalue) : -1;
#else
    (void)hnode;
    (void)propertyid;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetReservedMixedAttributeValue(JNIEnv* km_env, jclass km_clazz, jlong punkmixedattributevalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetReservedMixedAttributeValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punkmixedattributevalue) : -1;
#else
    (void)punkmixedattributevalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetReservedNotSupportedValue(JNIEnv* km_env, jclass km_clazz, jlong punknotsupportedvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetReservedNotSupportedValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punknotsupportedvalue) : -1;
#else
    (void)punknotsupportedvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetRootNode(JNIEnv* km_env, jclass km_clazz, jlong phnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetRootNode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phnode) : -1;
#else
    (void)phnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetRuntimeId(JNIEnv* km_env, jclass km_clazz, jlong hnode, jlong pruntimeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetRuntimeId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode, (void*)(uintptr_t)pruntimeid) : -1;
#else
    (void)hnode;
    (void)pruntimeid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaGetUpdatedCache(JNIEnv* km_env, jclass km_clazz, jlong hnode, jlong prequest, jint normalizestate, jlong pnormalizecondition, jlong pprequesteddata, jlong pptreestructure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetUpdatedCache");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode, (void*)(uintptr_t)prequest, (int32_t)normalizestate, (void*)(uintptr_t)pnormalizecondition, (void*)(uintptr_t)pprequesteddata, (void*)(uintptr_t)pptreestructure) : -1;
#else
    (void)hnode;
    (void)prequest;
    (void)normalizestate;
    (void)pnormalizecondition;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaHPatternObjectFromVariant(JNIEnv* km_env, jclass km_clazz, jlong pvar, jlong phobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHPatternObjectFromVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvar, (void*)(uintptr_t)phobj) : -1;
#else
    (void)pvar;
    (void)phobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaHTextRangeFromVariant(JNIEnv* km_env, jclass km_clazz, jlong pvar, jlong phtextrange) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHTextRangeFromVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvar, (void*)(uintptr_t)phtextrange) : -1;
#else
    (void)pvar;
    (void)phtextrange;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaHUiaNodeFromVariant(JNIEnv* km_env, jclass km_clazz, jlong pvar, jlong phnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHUiaNodeFromVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvar, (void*)(uintptr_t)phnode) : -1;
#else
    (void)pvar;
    (void)phnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaHasServerSideProvider(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHasServerSideProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd) : -1;
#else
    (void)hwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaHostProviderFromHwnd(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong ppprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHostProviderFromHwnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppprovider) : -1;
#else
    (void)hwnd;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaIAccessibleFromProvider(JNIEnv* km_env, jclass km_clazz, jlong pprovider, jint dwflags, jlong ppaccessible, jlong pvarchild) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaIAccessibleFromProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider, (uint32_t)dwflags, (void*)(uintptr_t)ppaccessible, (void*)(uintptr_t)pvarchild) : -1;
#else
    (void)pprovider;
    (void)dwflags;
    (void)ppaccessible;
    (void)pvarchild;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaLookupId(JNIEnv* km_env, jclass km_clazz, jint type, jlong pguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaLookupId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)type, (void*)(uintptr_t)pguid) : -1;
#else
    (void)type;
    (void)pguid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaNavigate(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint direction, jlong pcondition, jlong prequest, jlong pprequesteddata, jlong pptreestructure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNavigate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode, (int32_t)direction, (void*)(uintptr_t)pcondition, (void*)(uintptr_t)prequest, (void*)(uintptr_t)pprequesteddata, (void*)(uintptr_t)pptreestructure) : -1;
#else
    (void)hnode;
    (void)direction;
    (void)pcondition;
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaNodeFromFocus(JNIEnv* km_env, jclass km_clazz, jlong prequest, jlong pprequesteddata, jlong pptreestructure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromFocus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prequest, (void*)(uintptr_t)pprequesteddata, (void*)(uintptr_t)pptreestructure) : -1;
#else
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaNodeFromHandle(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong phnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)phnode) : -1;
#else
    (void)hwnd;
    (void)phnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaNodeFromPoint(JNIEnv* km_env, jclass km_clazz, jdouble x, jdouble y, jlong prequest, jlong pprequesteddata, jlong pptreestructure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((double)x, (double)y, (void*)(uintptr_t)prequest, (void*)(uintptr_t)pprequesteddata, (void*)(uintptr_t)pptreestructure) : -1;
#else
    (void)x;
    (void)y;
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaNodeFromProvider(JNIEnv* km_env, jclass km_clazz, jlong pprovider, jlong phnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider, (void*)(uintptr_t)phnode) : -1;
#else
    (void)pprovider;
    (void)phnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaNodeRelease(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeRelease");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaPatternRelease(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaPatternRelease");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaProviderForNonClient(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint idobject, jint idchild, jlong ppprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaProviderForNonClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)idobject, (int32_t)idchild, (void*)(uintptr_t)ppprovider) : -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)idchild;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaProviderFromIAccessible(JNIEnv* km_env, jclass km_clazz, jlong paccessible, jint idchild, jint dwflags, jlong ppprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaProviderFromIAccessible");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)paccessible, (int32_t)idchild, (uint32_t)dwflags, (void*)(uintptr_t)ppprovider) : -1;
#else
    (void)paccessible;
    (void)idchild;
    (void)dwflags;
    (void)ppprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRaiseActiveTextPositionChangedEvent(JNIEnv* km_env, jclass km_clazz, jlong provider, jlong textrange) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseActiveTextPositionChangedEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (void*)(uintptr_t)textrange) : -1;
#else
    (void)provider;
    (void)textrange;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRaiseAsyncContentLoadedEvent(JNIEnv* km_env, jclass km_clazz, jlong pprovider, jint asynccontentloadedstate, jdouble percentcomplete) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseAsyncContentLoadedEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider, (int32_t)asynccontentloadedstate, (double)percentcomplete) : -1;
#else
    (void)pprovider;
    (void)asynccontentloadedstate;
    (void)percentcomplete;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRaiseAutomationEvent(JNIEnv* km_env, jclass km_clazz, jlong pprovider, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseAutomationEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider, (int32_t)id) : -1;
#else
    (void)pprovider;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRaiseChangesEvent(JNIEnv* km_env, jclass km_clazz, jlong pprovider, jint eventidcount, jlong puiachanges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseChangesEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider, (int32_t)eventidcount, (void*)(uintptr_t)puiachanges) : -1;
#else
    (void)pprovider;
    (void)eventidcount;
    (void)puiachanges;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRaiseNotificationEvent(JNIEnv* km_env, jclass km_clazz, jlong provider, jint notificationkind, jint notificationprocessing, jlong displaystring, jlong activityid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseNotificationEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)provider, (int32_t)notificationkind, (int32_t)notificationprocessing, (void*)(uintptr_t)displaystring, (void*)(uintptr_t)activityid) : -1;
#else
    (void)provider;
    (void)notificationkind;
    (void)notificationprocessing;
    (void)displaystring;
    (void)activityid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRaiseStructureChangedEvent(JNIEnv* km_env, jclass km_clazz, jlong pprovider, jint structurechangetype, jlong pruntimeid, jint cruntimeidlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseStructureChangedEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider, (int32_t)structurechangetype, (void*)(uintptr_t)pruntimeid, (int32_t)cruntimeidlen) : -1;
#else
    (void)pprovider;
    (void)structurechangetype;
    (void)pruntimeid;
    (void)cruntimeidlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRaiseTextEditTextChangedEvent(JNIEnv* km_env, jclass km_clazz, jlong pprovider, jint texteditchangetype, jlong pchangeddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseTextEditTextChangedEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovider, (int32_t)texteditchangetype, (void*)(uintptr_t)pchangeddata) : -1;
#else
    (void)pprovider;
    (void)texteditchangetype;
    (void)pchangeddata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRegisterProviderCallback(JNIEnv* km_env, jclass km_clazz, jlong pcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRegisterProviderCallback");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pcallback);
#else
    (void)pcallback;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaRemoveEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRemoveEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hevent) : -1;
#else
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaReturnRawElementProvider(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong wparam, jlong lparam, jlong el) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaReturnRawElementProvider");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint64_t)wparam, (int64_t)lparam, (void*)(uintptr_t)el) : -1;
#else
    (void)hwnd;
    (void)wparam;
    (void)lparam;
    (void)el;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaSetFocus(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaSetFocus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UiaTextRangeRelease(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaTextRangeRelease");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UnhookWinEvent(JNIEnv* km_env, jclass km_clazz, jlong hwineventhook) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhookWinEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwineventhook) : -1;
#else
    (void)hwineventhook;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UnregisterPointerInputTarget(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint pointertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterPointerInputTarget");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)pointertype) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1UnregisterPointerInputTargetEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint pointertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterPointerInputTargetEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)pointertype) : -1;
#else
    (void)hwnd;
    (void)pointertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1ValuePattern_1SetValue(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong pval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValuePattern_SetValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)pval) : -1;
#else
    (void)hobj;
    (void)pval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1VirtualizedItemPattern_1Realize(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualizedItemPattern_Realize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1WindowFromAccessibleObject(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong phwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowFromAccessibleObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)phwnd) : -1;
#else
    (void)param0;
    (void)phwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1WindowPattern_1Close(JNIEnv* km_env, jclass km_clazz, jlong hobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowPattern_Close");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj) : -1;
#else
    (void)hobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1WindowPattern_1SetWindowVisualState(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint state) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowPattern_SetWindowVisualState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)state) : -1;
#else
    (void)hobj;
    (void)state;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_accessibility_WindowsWin32UiAccessibilityJniBridge_windowssys_1windows_1win32_1ui_1accessibility_1WindowPattern_1WaitForInputIdle(JNIEnv* km_env, jclass km_clazz, jlong hobj, jint milliseconds, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowPattern_WaitForInputIdle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (int32_t)milliseconds, (void*)(uintptr_t)presult) : -1;
#else
    (void)hobj;
    (void)milliseconds;
    (void)presult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

