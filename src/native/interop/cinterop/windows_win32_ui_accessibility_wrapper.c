#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_accessibility_wrapper.h"
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

int32_t windowssys_windows_win32_ui_accessibility_accSetRunningUtilityState(void* hwndapp, uint32_t dwutilitystatemask, uint32_t dwutilitystate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccSetRunningUtilityState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndapp, dwutilitystatemask, dwutilitystate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndapp;
    (void)dwutilitystatemask;
    (void)dwutilitystate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_accessibleChildren(void* pacccontainer, int32_t ichildstart, int32_t cchildren, void* rgvarchildren, void* pcobtained) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessibleChildren");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacccontainer, ichildstart, cchildren, rgvarchildren, pcobtained);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacccontainer;
    (void)ichildstart;
    (void)cchildren;
    (void)rgvarchildren;
    (void)pcobtained;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_accessibleObjectFromEvent(void* hwnd, uint32_t dwid, uint32_t dwchildid, void* ppacc, void* pvarchild) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessibleObjectFromEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwid, dwchildid, ppacc, pvarchild);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwid;
    (void)dwchildid;
    (void)ppacc;
    (void)pvarchild;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_accessibleObjectFromWindow(void* hwnd, uint32_t dwid, void* riid, void* ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessibleObjectFromWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwid, riid, ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwid;
    (void)riid;
    (void)ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_createStdAccessibleObject(void* hwnd, int32_t idobject, void* riid, void* ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdAccessibleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, idobject, riid, ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyA(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdAccessibleProxyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pclassname, idobject, riid, ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pclassname;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyW(void* hwnd, void* pclassname, int32_t idobject, void* riid, void* ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStdAccessibleProxyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pclassname, idobject, riid, ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pclassname;
    (void)idobject;
    (void)riid;
    (void)ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_dockPatternSetDockPosition(void* hobj, int32_t dockposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DockPattern_SetDockPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, dockposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)dockposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_expandCollapsePatternCollapse(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandCollapsePattern_Collapse");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_expandCollapsePatternExpand(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandCollapsePattern_Expand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_accessibility_getOleaccVersionInfo(void* pver, void* pbuild) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOleaccVersionInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pver, pbuild);
        return;
    }
    errno = ENOSYS;
#else
    (void)pver;
    (void)pbuild;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_ui_accessibility_getRoleTextA(uint32_t lrole, void* lpszrole, uint32_t cchrolemax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRoleTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lrole, lpszrole, cchrolemax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lrole;
    (void)lpszrole;
    (void)cchrolemax;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_accessibility_getRoleTextW(uint32_t lrole, void* lpszrole, uint32_t cchrolemax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRoleTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lrole, lpszrole, cchrolemax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lrole;
    (void)lpszrole;
    (void)cchrolemax;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_accessibility_getStateTextA(uint32_t lstatebit, void* lpszstate, uint32_t cchstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStateTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lstatebit, lpszstate, cchstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lstatebit;
    (void)lpszstate;
    (void)cchstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_accessibility_getStateTextW(uint32_t lstatebit, void* lpszstate, uint32_t cchstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStateTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lstatebit, lpszstate, cchstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lstatebit;
    (void)lpszstate;
    (void)cchstate;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_gridPatternGetItem(void* hobj, int32_t row, int32_t column, void* presult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GridPattern_GetItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, row, column, presult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)row;
    (void)column;
    (void)presult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_invokePatternInvoke(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InvokePattern_Invoke");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_isWinEventHookInstalled(uint32_t event) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWinEventHookInstalled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(event);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)event;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternDoDefaultAction(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_DoDefaultAction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternGetIaccessible(void* hobj, void* paccessible) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_GetIAccessible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, paccessible);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)paccessible;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSelect(void* hobj, int32_t flagsselect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_Select");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, flagsselect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)flagsselect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSetValue(void* hobj, void* szvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LegacyIAccessiblePattern_SetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, szvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)szvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_accessibility_lresultFromObject(void* riid, uint64_t wparam, void* punk) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LresultFromObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(riid, wparam, punk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)riid;
    (void)wparam;
    (void)punk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_multipleViewPatternGetViewName(void* hobj, int32_t viewid, void* ppstr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultipleViewPattern_GetViewName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, viewid, ppstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)viewid;
    (void)ppstr;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_multipleViewPatternSetCurrentView(void* hobj, int32_t viewid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MultipleViewPattern_SetCurrentView");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, viewid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)viewid;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_accessibility_notifyWinEvent(uint32_t event, void* hwnd, int32_t idobject, int32_t idchild) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyWinEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(event, hwnd, idobject, idchild);
        return;
    }
    errno = ENOSYS;
#else
    (void)event;
    (void)hwnd;
    (void)idobject;
    (void)idchild;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_objectFromLresult(int64_t lresult, void* riid, uint64_t wparam, void* ppvobject) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectFromLresult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lresult, riid, wparam, ppvobject);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lresult;
    (void)riid;
    (void)wparam;
    (void)ppvobject;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_rangeValuePatternSetValue(void* hobj, double val) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeValuePattern_SetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, val);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)val;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_registerPointerInputTarget(void* hwnd, int32_t pointertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPointerInputTarget");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pointertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pointertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_registerPointerInputTargetEx(void* hwnd, int32_t pointertype, int32_t fobserve) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterPointerInputTargetEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pointertype, fobserve);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pointertype;
    (void)fobserve;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_scrollItemPatternScrollIntoView(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollItemPattern_ScrollIntoView");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_scrollPatternScroll(void* hobj, int32_t horizontalamount, int32_t verticalamount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollPattern_Scroll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, horizontalamount, verticalamount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)horizontalamount;
    (void)verticalamount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_scrollPatternSetScrollPercent(void* hobj, double horizontalpercent, double verticalpercent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollPattern_SetScrollPercent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, horizontalpercent, verticalpercent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)horizontalpercent;
    (void)verticalpercent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_selectionItemPatternAddToSelection(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectionItemPattern_AddToSelection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_selectionItemPatternRemoveFromSelection(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectionItemPattern_RemoveFromSelection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_selectionItemPatternSelect(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SelectionItemPattern_Select");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_accessibility_setWinEventHook(uint32_t eventmin, uint32_t eventmax, void* hmodwineventproc, void* pfnwineventproc, uint32_t idprocess, uint32_t idthread, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWinEventHook");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventmin, eventmax, hmodwineventproc, pfnwineventproc, idprocess, idthread, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)eventmin;
    (void)eventmax;
    (void)hmodwineventproc;
    (void)pfnwineventproc;
    (void)idprocess;
    (void)idthread;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_synchronizedInputPatternCancel(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SynchronizedInputPattern_Cancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_synchronizedInputPatternStartListening(void* hobj, int32_t inputtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SynchronizedInputPattern_StartListening");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, inputtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)inputtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textPatternGetSelection(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_GetSelection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textPatternGetVisibleRanges(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_GetVisibleRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textPatternRangeFromChild(void* hobj, void* hnodechild, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_RangeFromChild");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, hnodechild, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)hnodechild;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textPatternGetDocumentRange(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_get_DocumentRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textPatternGetSupportedTextSelection(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextPattern_get_SupportedTextSelection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeAddToSelection(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_AddToSelection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeClone(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Clone");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeCompare(void* hobj, void* range, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Compare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, range, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)range;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeCompareEndpoints(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_CompareEndpoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, endpoint, targetrange, targetendpoint, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)targetrange;
    (void)targetendpoint;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeExpandToEnclosingUnit(void* hobj, int32_t unit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_ExpandToEnclosingUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, unit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)unit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeFindText(void* hobj, void* text, int32_t backward, int32_t ignorecase, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_FindText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, text, backward, ignorecase, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)text;
    (void)backward;
    (void)ignorecase;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeGetAttributeValue(void* hobj, int32_t attributeid, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetAttributeValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, attributeid, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)attributeid;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeGetBoundingRectangles(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetBoundingRectangles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeGetChildren(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetChildren");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeGetEnclosingElement(void* hobj, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetEnclosingElement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeGetText(void* hobj, int32_t maxlength, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_GetText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, maxlength, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)maxlength;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeMove(void* hobj, int32_t unit, int32_t count, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Move");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, unit, count, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)unit;
    (void)count;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByRange(void* hobj, int32_t endpoint, void* targetrange, int32_t targetendpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_MoveEndpointByRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, endpoint, targetrange, targetendpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)targetrange;
    (void)targetendpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByUnit(void* hobj, int32_t endpoint, int32_t unit, int32_t count, void* pretval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_MoveEndpointByUnit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, endpoint, unit, count, pretval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)endpoint;
    (void)unit;
    (void)count;
    (void)pretval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeRemoveFromSelection(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_RemoveFromSelection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeScrollIntoView(void* hobj, int32_t aligntotop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_ScrollIntoView");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, aligntotop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)aligntotop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_textRangeSelect(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TextRange_Select");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_togglePatternToggle(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TogglePattern_Toggle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_transformPatternMove(void* hobj, double x, double y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformPattern_Move");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_transformPatternResize(void* hobj, double width, double height) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformPattern_Resize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, width, height);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)width;
    (void)height;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_transformPatternRotate(void* hobj, double degrees) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformPattern_Rotate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, degrees);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)degrees;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaAddEvent(void* hnode, int32_t eventid, void* pcallback, int32_t scope, void* pproperties, int32_t cproperties, void* prequest, void* phevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaAddEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, eventid, pcallback, scope, pproperties, cproperties, prequest, phevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)eventid;
    (void)pcallback;
    (void)scope;
    (void)pproperties;
    (void)cproperties;
    (void)prequest;
    (void)phevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaClientsAreListening(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaClientsAreListening");
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

int32_t windowssys_windows_win32_ui_accessibility_uiaDisconnectAllProviders(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaDisconnectAllProviders");
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

int32_t windowssys_windows_win32_ui_accessibility_uiaDisconnectProvider(void* pprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaDisconnectProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaEventAddWindow(void* hevent, void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaEventAddWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent, hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaEventRemoveWindow(void* hevent, void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaEventRemoveWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent, hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaFind(void* hnode, void* pparams, void* prequest, void* pprequesteddata, void* ppoffsets, void* pptreestructures) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaFind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, pparams, prequest, pprequesteddata, ppoffsets, pptreestructures);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)pparams;
    (void)prequest;
    (void)pprequesteddata;
    (void)ppoffsets;
    (void)pptreestructures;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetErrorDescription(void* pdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetErrorDescription");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetPatternProvider(void* hnode, int32_t patternid, void* phobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetPatternProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, patternid, phobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)patternid;
    (void)phobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetPropertyValue(void* hnode, int32_t propertyid, void* pvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetPropertyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, propertyid, pvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)propertyid;
    (void)pvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetReservedMixedAttributeValue(void* punkmixedattributevalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetReservedMixedAttributeValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punkmixedattributevalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punkmixedattributevalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetReservedNotSupportedValue(void* punknotsupportedvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetReservedNotSupportedValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(punknotsupportedvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)punknotsupportedvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetRootNode(void* phnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetRootNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(phnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)phnode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetRuntimeId(void* hnode, void* pruntimeid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetRuntimeId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, pruntimeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)pruntimeid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaGetUpdatedCache(void* hnode, void* prequest, int32_t normalizestate, void* pnormalizecondition, void* pprequesteddata, void* pptreestructure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaGetUpdatedCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, prequest, normalizestate, pnormalizecondition, pprequesteddata, pptreestructure);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)prequest;
    (void)normalizestate;
    (void)pnormalizecondition;
    (void)pprequesteddata;
    (void)pptreestructure;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaHPatternObjectFromVariant(void* pvar, void* phobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHPatternObjectFromVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvar, phobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvar;
    (void)phobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaHTextRangeFromVariant(void* pvar, void* phtextrange) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHTextRangeFromVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvar, phtextrange);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvar;
    (void)phtextrange;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaHUiaNodeFromVariant(void* pvar, void* phnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHUiaNodeFromVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvar, phnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvar;
    (void)phnode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaHasServerSideProvider(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHasServerSideProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaHostProviderFromHwnd(void* hwnd, void* ppprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaHostProviderFromHwnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ppprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ppprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaIAccessibleFromProvider(void* pprovider, uint32_t dwflags, void* ppaccessible, void* pvarchild) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaIAccessibleFromProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider, dwflags, ppaccessible, pvarchild);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    (void)dwflags;
    (void)ppaccessible;
    (void)pvarchild;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaLookupId(int32_t type, void* pguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaLookupId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, pguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)type;
    (void)pguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaNavigate(void* hnode, int32_t direction, void* pcondition, void* prequest, void* pprequesteddata, void* pptreestructure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNavigate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, direction, pcondition, prequest, pprequesteddata, pptreestructure);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)direction;
    (void)pcondition;
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromFocus(void* prequest, void* pprequesteddata, void* pptreestructure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromFocus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prequest, pprequesteddata, pptreestructure);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromHandle(void* hwnd, void* phnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, phnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)phnode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromPoint(double x, double y, void* prequest, void* pprequesteddata, void* pptreestructure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(double, double, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x, y, prequest, pprequesteddata, pptreestructure);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)x;
    (void)y;
    (void)prequest;
    (void)pprequesteddata;
    (void)pptreestructure;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaNodeFromProvider(void* pprovider, void* phnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeFromProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider, phnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    (void)phnode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaNodeRelease(void* hnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaNodeRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaPatternRelease(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaPatternRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaProviderForNonClient(void* hwnd, int32_t idobject, int32_t idchild, void* ppprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaProviderForNonClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, idobject, idchild, ppprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)idchild;
    (void)ppprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaProviderFromIAccessible(void* paccessible, int32_t idchild, uint32_t dwflags, void* ppprovider) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaProviderFromIAccessible");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paccessible, idchild, dwflags, ppprovider);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)paccessible;
    (void)idchild;
    (void)dwflags;
    (void)ppprovider;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseActiveTextPositionChangedEvent(void* provider, void* textrange) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseActiveTextPositionChangedEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, textrange);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)provider;
    (void)textrange;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseAsyncContentLoadedEvent(void* pprovider, int32_t asynccontentloadedstate, double percentcomplete) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseAsyncContentLoadedEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider, asynccontentloadedstate, percentcomplete);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    (void)asynccontentloadedstate;
    (void)percentcomplete;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseAutomationEvent(void* pprovider, int32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseAutomationEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseChangesEvent(void* pprovider, int32_t eventidcount, void* puiachanges) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseChangesEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider, eventidcount, puiachanges);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    (void)eventidcount;
    (void)puiachanges;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseNotificationEvent(void* provider, int32_t notificationkind, int32_t notificationprocessing, void* displaystring, void* activityid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseNotificationEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(provider, notificationkind, notificationprocessing, displaystring, activityid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)provider;
    (void)notificationkind;
    (void)notificationprocessing;
    (void)displaystring;
    (void)activityid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseStructureChangedEvent(void* pprovider, int32_t structurechangetype, void* pruntimeid, int32_t cruntimeidlen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseStructureChangedEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider, structurechangetype, pruntimeid, cruntimeidlen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    (void)structurechangetype;
    (void)pruntimeid;
    (void)cruntimeidlen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRaiseTextEditTextChangedEvent(void* pprovider, int32_t texteditchangetype, void* pchangeddata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRaiseTextEditTextChangedEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pprovider, texteditchangetype, pchangeddata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pprovider;
    (void)texteditchangetype;
    (void)pchangeddata;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_accessibility_uiaRegisterProviderCallback(void* pcallback) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRegisterProviderCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pcallback);
        return;
    }
    errno = ENOSYS;
#else
    (void)pcallback;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaRemoveEvent(void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaRemoveEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_accessibility_uiaReturnRawElementProvider(void* hwnd, uint64_t wparam, int64_t lparam, void* el) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaReturnRawElementProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, wparam, lparam, el);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)wparam;
    (void)lparam;
    (void)el;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaSetFocus(void* hnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaSetFocus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_uiaTextRangeRelease(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UiaTextRangeRelease");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_unhookWinEvent(void* hwineventhook) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhookWinEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwineventhook);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwineventhook;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_unregisterPointerInputTarget(void* hwnd, int32_t pointertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterPointerInputTarget");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pointertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pointertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_unregisterPointerInputTargetEx(void* hwnd, int32_t pointertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterPointerInputTargetEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pointertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pointertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_valuePatternSetValue(void* hobj, void* pval) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValuePattern_SetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, pval);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)pval;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_virtualizedItemPatternRealize(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VirtualizedItemPattern_Realize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_windowFromAccessibleObject(void* param0, void* phwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowFromAccessibleObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, phwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)phwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_windowPatternClose(void* hobj) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowPattern_Close");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_windowPatternSetWindowVisualState(void* hobj, int32_t state) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowPattern_SetWindowVisualState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, state);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)state;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_accessibility_windowPatternWaitForInputIdle(void* hobj, int32_t milliseconds, void* presult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("uiautomationcore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WindowPattern_WaitForInputIdle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, milliseconds, presult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)milliseconds;
    (void)presult;
    errno = ENOSYS;
    return -1;
#endif
}

