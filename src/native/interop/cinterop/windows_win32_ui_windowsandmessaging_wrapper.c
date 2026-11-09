#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_ui_windowsandmessaging_wrapper.h"
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRect(void* lprect, uint32_t dwstyle, int32_t bmenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustWindowRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprect, dwstyle, bmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprect;
    (void)dwstyle;
    (void)bmenu;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_AdjustWindowRectEx(void* lprect, uint32_t dwstyle, int32_t bmenu, uint32_t dwexstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustWindowRectEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprect, dwstyle, bmenu, dwexstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprect;
    (void)dwstyle;
    (void)bmenu;
    (void)dwexstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_AllowSetForegroundWindow(uint32_t dwprocessid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllowSetForegroundWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwprocessid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwprocessid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_AnimateWindow(void* hwnd, uint32_t dwtime, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AnimateWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwtime, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwtime;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_AnyPopup(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AnyPopup");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_AppendMenuA(void* hmenu, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppendMenuA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uflags, uidnewitem, lpnewitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_AppendMenuW(void* hmenu, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppendMenuW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uflags, uidnewitem, lpnewitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_ArrangeIconicWindows(void* hwnd) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ArrangeIconicWindows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_BeginDeferWindowPos(int32_t nnumwindows) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BeginDeferWindowPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nnumwindows);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nnumwindows;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_BringWindowToTop(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BringWindowToTop");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_CalculatePopupWindowPosition(void* anchorpoint, void* windowsize, uint32_t flags, void* excluderect, void* popupwindowposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CalculatePopupWindowPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(anchorpoint, windowsize, flags, excluderect, popupwindowposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)anchorpoint;
    (void)windowsize;
    (void)flags;
    (void)excluderect;
    (void)popupwindowposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterA(void* lpmsg, int32_t ncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallMsgFilterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg, ncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    (void)ncode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CallMsgFilterW(void* lpmsg, int32_t ncode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallMsgFilterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg, ncode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    (void)ncode;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_CallNextHookEx(void* hhk, int32_t ncode, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallNextHookEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhk, ncode, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhk;
    (void)ncode;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcA(void* lpprevwndfunc, void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallWindowProcA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprevwndfunc, hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprevwndfunc;
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_CallWindowProcW(void* lpprevwndfunc, void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallWindowProcW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpprevwndfunc, hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpprevwndfunc;
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CancelShutdown(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelShutdown");
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_CascadeWindows(void* hwndparent, uint32_t whow, void* lprect, uint32_t ckids, void* lpkids) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CascadeWindows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, whow, lprect, ckids, lpkids);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)whow;
    (void)lprect;
    (void)ckids;
    (void)lpkids;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuA(void* hmenu, uint32_t cmd, void* lpsznewitem, uint32_t cmdinsert, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeMenuA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, cmd, lpsznewitem, cmdinsert, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)cmd;
    (void)lpsznewitem;
    (void)cmdinsert;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ChangeMenuW(void* hmenu, uint32_t cmd, void* lpsznewitem, uint32_t cmdinsert, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeMenuW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, cmd, lpsznewitem, cmdinsert, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)cmd;
    (void)lpsznewitem;
    (void)cmdinsert;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilter(uint32_t message, uint32_t dwflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeWindowMessageFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(message, dwflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)message;
    (void)dwflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ChangeWindowMessageFilterEx(void* hwnd, uint32_t message, uint32_t action, void* pchangefilterstruct) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeWindowMessageFilterEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, message, action, pchangefilterstruct);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)message;
    (void)action;
    (void)pchangefilterstruct;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharLowerA(void* lpsz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffA(void* lpsz, uint32_t cchlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerBuffA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, cchlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsz;
    (void)cchlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_CharLowerBuffW(void* lpsz, uint32_t cchlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerBuffW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, cchlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsz;
    (void)cchlength;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharLowerW(void* lpsz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharLowerW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharNextA(void* lpsz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharNextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharNextExA(uint16_t codepage, void* lpcurrentchar, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharNextExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, lpcurrentchar, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)codepage;
    (void)lpcurrentchar;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharNextW(void* lpsz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharNextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharPrevA(void* lpszstart, void* lpszcurrent) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharPrevA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszstart, lpszcurrent);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszstart;
    (void)lpszcurrent;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharPrevExA(uint16_t codepage, void* lpstart, void* lpcurrentchar, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharPrevExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(codepage, lpstart, lpcurrentchar, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)codepage;
    (void)lpstart;
    (void)lpcurrentchar;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharPrevW(void* lpszstart, void* lpszcurrent) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharPrevW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszstart, lpszcurrent);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszstart;
    (void)lpszcurrent;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CharToOemA(void* psrc, void* pdst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrc, pdst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrc;
    (void)pdst;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffA(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemBuffA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsrc, lpszdst, cchdstlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CharToOemBuffW(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemBuffW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsrc, lpszdst, cchdstlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CharToOemW(void* psrc, void* pdst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharToOemW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrc, pdst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrc;
    (void)pdst;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharUpperA(void* lpsz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffA(void* lpsz, uint32_t cchlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperBuffA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, cchlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsz;
    (void)cchlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_CharUpperBuffW(void* lpsz, uint32_t cchlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperBuffW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz, cchlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsz;
    (void)cchlength;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CharUpperW(void* lpsz) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CharUpperW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsz);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpsz;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_CheckMenuItem(void* hmenu, uint32_t uidcheckitem, uint32_t ucheck) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckMenuItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uidcheckitem, ucheck);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmenu;
    (void)uidcheckitem;
    (void)ucheck;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CheckMenuRadioItem(void* hmenu, uint32_t first, uint32_t last, uint32_t check, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckMenuRadioItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, first, last, check, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)first;
    (void)last;
    (void)check;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ClipCursor(void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClipCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CloseWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseWindow");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableA(void* haccelsrc, void* lpacceldst, int32_t caccelentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyAcceleratorTableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(haccelsrc, lpacceldst, caccelentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)haccelsrc;
    (void)lpacceldst;
    (void)caccelentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CopyAcceleratorTableW(void* haccelsrc, void* lpacceldst, int32_t caccelentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyAcceleratorTableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(haccelsrc, lpacceldst, caccelentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)haccelsrc;
    (void)lpacceldst;
    (void)caccelentries;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CopyIcon(void* hicon) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hicon);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hicon;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CopyImage(void* h, uint32_t type, int32_t cx, int32_t cy, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(h, type, cx, cy, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)h;
    (void)type;
    (void)cx;
    (void)cy;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableA(void* paccel, int32_t caccel) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAcceleratorTableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paccel, caccel);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)paccel;
    (void)caccel;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateAcceleratorTableW(void* paccel, int32_t caccel) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateAcceleratorTableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(paccel, caccel);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)paccel;
    (void)caccel;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CreateCaret(void* hwnd, void* hbitmap, int32_t nwidth, int32_t nheight) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCaret");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hbitmap, nwidth, nheight);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hbitmap;
    (void)nwidth;
    (void)nheight;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateCursor(void* hinst, int32_t xhotspot, int32_t yhotspot, int32_t nwidth, int32_t nheight, void* pvandplane, void* pvxorplane) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, xhotspot, yhotspot, nwidth, nheight, pvandplane, pvxorplane);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)xhotspot;
    (void)yhotspot;
    (void)nwidth;
    (void)nheight;
    (void)pvandplane;
    (void)pvxorplane;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamA(void* hinstance, void* lptemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogIndirectParamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptemplate, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lptemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateDialogIndirectParamW(void* hinstance, void* lptemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogIndirectParamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptemplate, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lptemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamA(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogParamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptemplatename, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateDialogParamW(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDialogParamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptemplatename, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateIcon(void* hinstance, int32_t nwidth, int32_t nheight, uint8_t cplanes, uint8_t cbitspixel, void* lpbandbits, void* lpbxorbits) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint8_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, nwidth, nheight, cplanes, cbitspixel, lpbandbits, lpbxorbits);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)nwidth;
    (void)nheight;
    (void)cplanes;
    (void)cbitspixel;
    (void)lpbandbits;
    (void)lpbxorbits;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResource(void* presbits, uint32_t dwressize, int32_t ficon, uint32_t dwver) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIconFromResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(presbits, dwressize, ficon, dwver);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)presbits;
    (void)dwressize;
    (void)ficon;
    (void)dwver;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateIconFromResourceEx(void* presbits, uint32_t dwressize, int32_t ficon, uint32_t dwver, int32_t cxdesired, int32_t cydesired, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIconFromResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(presbits, dwressize, ficon, dwver, cxdesired, cydesired, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)presbits;
    (void)dwressize;
    (void)ficon;
    (void)dwver;
    (void)cxdesired;
    (void)cydesired;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateIconIndirect(void* piconinfo) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateIconIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(piconinfo);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)piconinfo;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowA(void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hinstance, int64_t lparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMDIWindowA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpclassname, lpwindowname, dwstyle, x, y, nwidth, nheight, hwndparent, hinstance, lparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hinstance;
    (void)lparam;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateMDIWindowW(void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hinstance, int64_t lparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMDIWindowW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpclassname, lpwindowname, dwstyle, x, y, nwidth, nheight, hwndparent, hinstance, lparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hinstance;
    (void)lparam;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateMenu(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreatePopupMenu(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePopupMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_CreateResourceIndexer(void* projectroot, void* extensiondllpath, void* ppresourceindexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateResourceIndexer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(projectroot, extensiondllpath, ppresourceindexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)projectroot;
    (void)extensiondllpath;
    (void)ppresourceindexer;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExA(uint32_t dwexstyle, void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hmenu, void* hinstance, void* lpparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwexstyle, lpclassname, lpwindowname, dwstyle, x, y, nwidth, nheight, hwndparent, hmenu, hinstance, lpparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwexstyle;
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hmenu;
    (void)hinstance;
    (void)lpparam;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_CreateWindowExW(uint32_t dwexstyle, void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hmenu, void* hinstance, void* lpparam) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int32_t, int32_t, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWindowExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwexstyle, lpclassname, lpwindowname, dwstyle, x, y, nwidth, nheight, hwndparent, hmenu, hinstance, lpparam);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwexstyle;
    (void)lpclassname;
    (void)lpwindowname;
    (void)dwstyle;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)hwndparent;
    (void)hmenu;
    (void)hinstance;
    (void)lpparam;
    errno = ENOSYS;
    return NULL;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcA(void* hdlg, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefDlgProcA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefDlgProcW(void* hdlg, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefDlgProcW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcA(void* hwnd, void* hwndmdiclient, uint32_t umsg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefFrameProcA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hwndmdiclient, umsg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hwndmdiclient;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefFrameProcW(void* hwnd, void* hwndmdiclient, uint32_t umsg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefFrameProcW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hwndmdiclient, umsg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hwndmdiclient;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcA(void* hwnd, uint32_t umsg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefMDIChildProcA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, umsg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefMDIChildProcW(void* hwnd, uint32_t umsg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefMDIChildProcW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, umsg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefWindowProcA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DefWindowProcW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefWindowProcW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_DeferWindowPos(void* hwinposinfo, void* hwnd, void* hwndinsertafter, int32_t x, int32_t y, int32_t cx, int32_t cy, uint32_t uflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeferWindowPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwinposinfo, hwnd, hwndinsertafter, x, y, cx, cy, uflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwinposinfo;
    (void)hwnd;
    (void)hwndinsertafter;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DeleteMenu(void* hmenu, uint32_t uposition, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uposition, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DeregisterShellHookWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterShellHookWindow");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_DestroyAcceleratorTable(void* haccel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyAcceleratorTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(haccel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)haccel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DestroyCaret(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyCaret");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_DestroyCursor(void* hcursor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DestroyIcon(void* hicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hicon;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_windowsandmessaging_DestroyIndexedResults(void* resourceuri, uint32_t qualifiercount, void* qualifiers) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyIndexedResults");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resourceuri, qualifiercount, qualifiers);
        return;
    }
    errno = ENOSYS;
#else
    (void)resourceuri;
    (void)qualifiercount;
    (void)qualifiers;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DestroyMenu(void* hmenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_windowsandmessaging_DestroyResourceIndexer(void* resourceindexer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyResourceIndexer");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(resourceindexer);
        return;
    }
    errno = ENOSYS;
#else
    (void)resourceindexer;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DestroyWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyWindow");
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamA(void* hinstance, void* hdialogtemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxIndirectParamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, hdialogtemplate, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)hdialogtemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DialogBoxIndirectParamW(void* hinstance, void* hdialogtemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxIndirectParamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, hdialogtemplate, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)hdialogtemplate;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamA(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxParamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptemplatename, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DialogBoxParamW(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DialogBoxParamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptemplatename, hwndparent, lpdialogfunc, dwinitparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)lptemplatename;
    (void)hwndparent;
    (void)lpdialogfunc;
    (void)dwinitparam;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_windowsandmessaging_DisableProcessWindowsGhosting(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisableProcessWindowsGhosting");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageA(void* lpmsg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispatchMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_DispatchMessageW(void* lpmsg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DispatchMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_DragObject(void* hwndparent, void* hwndfrom, uint32_t fmt, uint64_t data, void* hcur) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragObject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hwndfrom, fmt, data, hcur);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)hwndfrom;
    (void)fmt;
    (void)data;
    (void)hcur;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DrawIcon(void* hdc, int32_t x, int32_t y, void* hicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, x, y, hicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)x;
    (void)y;
    (void)hicon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DrawIconEx(void* hdc, int32_t xleft, int32_t ytop, void* hicon, int32_t cxwidth, int32_t cywidth, uint32_t istepifanicur, void* hbrflickerfreedraw, uint32_t diflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, int32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawIconEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, xleft, ytop, hicon, cxwidth, cywidth, istepifanicur, hbrflickerfreedraw, diflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)xleft;
    (void)ytop;
    (void)hicon;
    (void)cxwidth;
    (void)cywidth;
    (void)istepifanicur;
    (void)hbrflickerfreedraw;
    (void)diflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_DrawMenuBar(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DrawMenuBar");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnableMenuItem(void* hmenu, uint32_t uidenableitem, uint32_t uenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnableMenuItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uidenableitem, uenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uidenableitem;
    (void)uenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EndDeferWindowPos(void* hwinposinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndDeferWindowPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwinposinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwinposinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EndDialog(void* hdlg, int64_t nresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndDialog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, nresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)nresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EndMenu(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EndMenu");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnumChildWindows(void* hwndparent, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumChildWindows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnumPropsA(void* hwnd, void* lpenumfunc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpenumfunc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExA(void* hwnd, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnumPropsExW(void* hwnd, void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnumPropsW(void* hwnd, void* lpenumfunc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumPropsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpenumfunc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpenumfunc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnumThreadWindows(uint32_t dwthreadid, void* lpfn, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumThreadWindows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwthreadid, lpfn, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwthreadid;
    (void)lpfn;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_EnumWindows(void* lpenumfunc, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumWindows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenumfunc, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpenumfunc;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_FindWindowA(void* lpclassname, void* lpwindowname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpclassname, lpwindowname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_FindWindowExA(void* hwndparent, void* hwndchildafter, void* lpszclass, void* lpszwindow) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hwndchildafter, lpszclass, lpszwindow);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndparent;
    (void)hwndchildafter;
    (void)lpszclass;
    (void)lpszwindow;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_FindWindowExW(void* hwndparent, void* hwndchildafter, void* lpszclass, void* lpszwindow) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hwndchildafter, lpszclass, lpszwindow);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndparent;
    (void)hwndchildafter;
    (void)lpszclass;
    (void)lpszwindow;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_FindWindowW(void* lpclassname, void* lpwindowname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindWindowW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpclassname, lpwindowname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpclassname;
    (void)lpwindowname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_FlashWindow(void* hwnd, int32_t binvert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlashWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, binvert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)binvert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_FlashWindowEx(void* pfwi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlashWindowEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfwi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfwi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoA(void* hwnd, int32_t iitem, void* pati, void* pszitemtext, uint32_t cchitemtext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAltTabInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, iitem, pati, pszitemtext, cchitemtext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)iitem;
    (void)pati;
    (void)pszitemtext;
    (void)cchitemtext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetAltTabInfoW(void* hwnd, int32_t iitem, void* pati, void* pszitemtext, uint32_t cchitemtext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAltTabInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, iitem, pati, pszitemtext, cchitemtext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)iitem;
    (void)pati;
    (void)pszitemtext;
    (void)cchitemtext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetAncestor(void* hwnd, uint32_t gaflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAncestor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, gaflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)gaflags;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetCaretBlinkTime(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCaretBlinkTime");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetCaretPos(void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCaretPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoA(void* hinstance, void* lpclassname, void* lpwndclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpclassname, lpwndclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)lpclassname;
    (void)lpwndclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExA(void* hinstance, void* lpszclass, void* lpwcx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpszclass, lpwcx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)lpszclass;
    (void)lpwcx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoExW(void* hinstance, void* lpszclass, void* lpwcx) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpszclass, lpwcx);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)lpszclass;
    (void)lpwcx;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassInfoW(void* hinstance, void* lpclassname, void* lpwndclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpclassname, lpwndclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)lpclassname;
    (void)lpwndclass;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassLongA(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrA(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongPtrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_ui_windowsandmessaging_GetClassLongPtrW(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongPtrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassLongW(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassLongW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassNameA(void* hwnd, void* lpclassname, int32_t nmaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpclassname, nmaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpclassname;
    (void)nmaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClassNameW(void* hwnd, void* lpclassname, int32_t nmaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpclassname, nmaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpclassname;
    (void)nmaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_GetClassWord(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClassWord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClientRect(void* hwnd, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClientRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetClipCursor(void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClipCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetCursor(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetCursorInfo(void* pci) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCursorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pci);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pci;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetCursorPos(void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCursorPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetDesktopWindow(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDesktopWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetDialogBaseUnits(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDialogBaseUnits");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetDlgCtrlID(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgCtrlID");
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

void* windowssys_windows_win32_ui_windowsandmessaging_GetDlgItem(void* hdlg, int32_t niddlgitem) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdlg;
    (void)niddlgitem;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemInt(void* hdlg, int32_t niddlgitem, void* lptranslated, int32_t bsigned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItemInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, lptranslated, bsigned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lptranslated;
    (void)bsigned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextA(void* hdlg, int32_t niddlgitem, void* lpstring, int32_t cchmax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItemTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, lpstring, cchmax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    (void)cchmax;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetDlgItemTextW(void* hdlg, int32_t niddlgitem, void* lpstring, int32_t cchmax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDlgItemTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, lpstring, cchmax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    (void)cchmax;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetForegroundWindow(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetForegroundWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetGUIThreadInfo(uint32_t idthread, void* pgui) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGUIThreadInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idthread, pgui);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idthread;
    (void)pgui;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetIconInfo(void* hicon, void* piconinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIconInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hicon, piconinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hicon;
    (void)piconinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExA(void* hicon, void* piconinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIconInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hicon, piconinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hicon;
    (void)piconinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetIconInfoExW(void* hicon, void* piconinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIconInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hicon, piconinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hicon;
    (void)piconinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetInputState(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInputState");
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

void* windowssys_windows_win32_ui_windowsandmessaging_GetLastActivePopup(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLastActivePopup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetLayeredWindowAttributes(void* hwnd, void* pcrkey, void* pbalpha, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLayeredWindowAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pcrkey, pbalpha, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pcrkey;
    (void)pbalpha;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetMenu(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuBarInfo(void* hwnd, int32_t idobject, int32_t iditem, void* pmbi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuBarInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, idobject, iditem, pmbi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)iditem;
    (void)pmbi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuCheckMarkDimensions(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuCheckMarkDimensions");
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuDefaultItem(void* hmenu, uint32_t fbypos, uint32_t gmdiflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuDefaultItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, fbypos, gmdiflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmenu;
    (void)fbypos;
    (void)gmdiflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuInfo(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemCount(void* hmenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemID(void* hmenu, int32_t npos) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemID");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, npos);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmenu;
    (void)npos;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoA(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmii) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, item, fbyposition, lpmii);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmii;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemInfoW(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmii) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, item, fbyposition, lpmii);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmii;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuItemRect(void* hwnd, void* hmenu, uint32_t uitem, void* lprcitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuItemRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hmenu, uitem, lprcitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hmenu;
    (void)uitem;
    (void)lprcitem;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuState(void* hmenu, uint32_t uid, uint32_t uflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uid, uflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmenu;
    (void)uid;
    (void)uflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringA(void* hmenu, uint32_t uiditem, void* lpstring, int32_t cchmax, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uiditem, lpstring, cchmax, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uiditem;
    (void)lpstring;
    (void)cchmax;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMenuStringW(void* hmenu, uint32_t uiditem, void* lpstring, int32_t cchmax, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uiditem, lpstring, cchmax, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uiditem;
    (void)lpstring;
    (void)cchmax;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMessageA(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg, hwnd, wmsgfiltermin, wmsgfiltermax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_GetMessageExtraInfo(void) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageExtraInfo");
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetMessagePos(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessagePos");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMessageTime(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageTime");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetMessageW(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg, hwnd, wmsgfiltermin, wmsgfiltermax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgGroupItem(void* hdlg, void* hctl, int32_t bprevious) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextDlgGroupItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, hctl, bprevious);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdlg;
    (void)hctl;
    (void)bprevious;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetNextDlgTabItem(void* hdlg, void* hctl, int32_t bprevious) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextDlgTabItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, hctl, bprevious);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hdlg;
    (void)hctl;
    (void)bprevious;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetParent(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetPhysicalCursorPos(void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPhysicalCursorPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetProcessDefaultLayout(void* pdwdefaultlayout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDefaultLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwdefaultlayout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pdwdefaultlayout;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetPropA(void* hwnd, void* lpstring) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPropA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)lpstring;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetPropW(void* hwnd, void* lpstring) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPropW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)lpstring;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetQueueStatus(uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetQueueStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetScrollBarInfo(void* hwnd, int32_t idobject, void* psbi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollBarInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, idobject, psbi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)idobject;
    (void)psbi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetScrollInfo(void* hwnd, int32_t nbar, void* lpsi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nbar, lpsi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)lpsi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetScrollPos(void* hwnd, int32_t nbar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nbar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nbar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetScrollRange(void* hwnd, int32_t nbar, void* lpminpos, void* lpmaxpos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScrollRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nbar, lpminpos, lpmaxpos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nbar;
    (void)lpminpos;
    (void)lpmaxpos;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetShellWindow(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetShellWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetSubMenu(void* hmenu, int32_t npos) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSubMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, npos);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hmenu;
    (void)npos;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetSystemMenu(void* hwnd, int32_t brevert) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, brevert);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)brevert;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetSystemMetrics(int32_t nindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemMetrics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetTitleBarInfo(void* hwnd, void* pti) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTitleBarInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pti);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pti;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetTopWindow(void* hwnd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTopWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_GetWindow(void* hwnd, uint32_t ucmd) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ucmd);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)ucmd;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowDisplayAffinity(void* hwnd, void* pdwaffinity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowDisplayAffinity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pdwaffinity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pdwaffinity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowInfo(void* hwnd, void* pwi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pwi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pwi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongA(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrA(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongPtrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongPtrW(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongPtrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowLongW(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowLongW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameA(void* hwnd, void* pszfilename, uint32_t cchfilenamemax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowModuleFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszfilename, cchfilenamemax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)pszfilename;
    (void)cchfilenamemax;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowModuleFileNameW(void* hwnd, void* pszfilename, uint32_t cchfilenamemax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowModuleFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pszfilename, cchfilenamemax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)pszfilename;
    (void)cchfilenamemax;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowPlacement(void* hwnd, void* lpwndpl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowPlacement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpwndpl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpwndpl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowRect(void* hwnd, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextA(void* hwnd, void* lpstring, int32_t nmaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring, nmaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)nmaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthA(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextLengthA");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextLengthW(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextLengthW");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowTextW(void* hwnd, void* lpstring, int32_t nmaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring, nmaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)nmaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowThreadProcessId(void* hwnd, void* lpdwprocessid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowThreadProcessId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpdwprocessid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)lpdwprocessid;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_GetWindowWord(void* hwnd, int32_t nindex) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowWord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_HideCaret(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HideCaret");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_HiliteMenuItem(void* hwnd, void* hmenu, uint32_t uidhiliteitem, uint32_t uhilite) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HiliteMenuItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hmenu, uidhiliteitem, uhilite);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hmenu;
    (void)uidhiliteitem;
    (void)uhilite;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_InSendMessage(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InSendMessage");
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_InSendMessageEx(void* lpreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InSendMessageEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpreserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IndexFilePath(void* resourceindexer, void* filepath, void* ppresourceuri, void* pqualifiercount, void* ppqualifiers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IndexFilePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourceindexer, filepath, ppresourceuri, pqualifiercount, ppqualifiers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourceindexer;
    (void)filepath;
    (void)ppresourceuri;
    (void)pqualifiercount;
    (void)ppqualifiers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_InheritWindowMonitor(void* hwnd, void* hwndinherit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InheritWindowMonitor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hwndinherit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hwndinherit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_InsertMenuA(void* hmenu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uposition, uflags, uidnewitem, lpnewitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemA(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuItemA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, item, fbyposition, lpmi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_InsertMenuItemW(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmi) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuItemW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, item, fbyposition, lpmi);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbyposition;
    (void)lpmi;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_InsertMenuW(void* hmenu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InsertMenuW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uposition, uflags, uidnewitem, lpnewitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_InternalGetWindowText(void* hwnd, void* pstring, int32_t cchmaxcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InternalGetWindowText");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pstring, cchmaxcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pstring;
    (void)cchmaxcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaA(int8_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericA(int8_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaNumericA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaNumericW(uint16_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaNumericW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsCharAlphaW(uint16_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharAlphaW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsCharLowerA(int8_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharLowerA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperA(int8_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharUpperA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsCharUpperW(uint16_t ch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharUpperW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsChild(void* hwndparent, void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsChild");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hwnd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)hwnd;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageA(void* hdlg, void* lpmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDialogMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsDialogMessageW(void* hdlg, void* lpmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDialogMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsGUIThread(int32_t bconvert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsGUIThread");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bconvert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bconvert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsHungAppWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsHungAppWindow");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsIconic(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsIconic");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsMenu(void* hmenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsProcessDPIAware(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessDPIAware");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindow");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsWindowArranged(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowArranged");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsWindowUnicode(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowUnicode");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsWindowVisible(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWindowVisible");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsWow64Message(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64Message");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_IsZoomed(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsZoomed");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_KillTimer(void* hwnd, uint64_t uidevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KillTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, uidevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)uidevent;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsA(void* hinstance, void* lptablename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadAcceleratorsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptablename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lptablename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadAcceleratorsW(void* hinstance, void* lptablename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadAcceleratorsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lptablename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lptablename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadCursorA(void* hinstance, void* lpcursorname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpcursorname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpcursorname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileA(void* lpfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorFromFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadCursorFromFileW(void* lpfilename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorFromFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadCursorW(void* hinstance, void* lpcursorname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadCursorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpcursorname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpcursorname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadIconA(void* hinstance, void* lpiconname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpiconname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpiconname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadIconW(void* hinstance, void* lpiconname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadIconW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpiconname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpiconname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadImageA(void* hinst, void* name, uint32_t type, int32_t cx, int32_t cy, uint32_t fuload) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadImageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, name, type, cx, cy, fuload);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)name;
    (void)type;
    (void)cx;
    (void)cy;
    (void)fuload;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadImageW(void* hinst, void* name, uint32_t type, int32_t cx, int32_t cy, uint32_t fuload) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadImageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinst, name, type, cx, cy, fuload);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinst;
    (void)name;
    (void)type;
    (void)cx;
    (void)cy;
    (void)fuload;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadMenuA(void* hinstance, void* lpmenuname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpmenuname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpmenuname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectA(void* lpmenutemplate) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuIndirectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmenutemplate);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmenutemplate;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadMenuIndirectW(void* lpmenutemplate) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuIndirectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmenutemplate);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpmenutemplate;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_LoadMenuW(void* hinstance, void* lpmenuname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadMenuW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, lpmenuname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hinstance;
    (void)lpmenuname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_LoadStringA(void* hinstance, uint32_t uid, void* lpbuffer, int32_t cchbuffermax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, uid, lpbuffer, cchbuffermax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)uid;
    (void)lpbuffer;
    (void)cchbuffermax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_LoadStringW(void* hinstance, uint32_t uid, void* lpbuffer, int32_t cchbuffermax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hinstance, uid, lpbuffer, cchbuffermax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hinstance;
    (void)uid;
    (void)lpbuffer;
    (void)cchbuffermax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_LockSetForegroundWindow(uint32_t ulockcode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockSetForegroundWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulockcode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ulockcode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_LogicalToPhysicalPoint(void* hwnd, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogicalToPhysicalPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectory(void* presbits, int32_t ficon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupIconIdFromDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(presbits, ficon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)presbits;
    (void)ficon;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_LookupIconIdFromDirectoryEx(void* presbits, int32_t ficon, int32_t cxdesired, int32_t cydesired, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupIconIdFromDirectoryEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(presbits, ficon, cxdesired, cydesired, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)presbits;
    (void)ficon;
    (void)cxdesired;
    (void)cydesired;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MapDialogRect(void* hdlg, void* lprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapDialogRect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, lprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)lprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MessageBoxA(void* hwnd, void* lptext, void* lpcaption, uint32_t utype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lptext, lpcaption, utype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExA(void* hwnd, void* lptext, void* lpcaption, uint32_t utype, uint16_t wlanguageid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lptext, lpcaption, utype, wlanguageid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    (void)wlanguageid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MessageBoxExW(void* hwnd, void* lptext, void* lpcaption, uint32_t utype, uint16_t wlanguageid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lptext, lpcaption, utype, wlanguageid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    (void)wlanguageid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectA(void* lpmbp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxIndirectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmbp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmbp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MessageBoxIndirectW(void* lpmbp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxIndirectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmbp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmbp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MessageBoxW(void* hwnd, void* lptext, void* lpcaption, uint32_t utype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBoxW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lptext, lpcaption, utype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lptext;
    (void)lpcaption;
    (void)utype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuA(void* hmnu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyMenuA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmnu, uposition, uflags, uidnewitem, lpnewitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmnu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ModifyMenuW(void* hmnu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyMenuW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmnu, uposition, uflags, uidnewitem, lpnewitem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmnu;
    (void)uposition;
    (void)uflags;
    (void)uidnewitem;
    (void)lpnewitem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MoveWindow(void* hwnd, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, int32_t brepaint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, x, y, nwidth, nheight, brepaint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)x;
    (void)y;
    (void)nwidth;
    (void)nheight;
    (void)brepaint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfig(int32_t platformversion, void* defaultqualifiers, void* outputxmlfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateConfig");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(platformversion, defaultqualifiers, outputxmlfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)platformversion;
    (void)defaultqualifiers;
    (void)outputxmlfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateConfigInMemory(int32_t platformversion, void* defaultqualifiers, void* outputxmldata, void* outputxmlsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateConfigInMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(platformversion, defaultqualifiers, outputxmldata, outputxmlsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)platformversion;
    (void)defaultqualifiers;
    (void)outputxmldata;
    (void)outputxmlsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexer(void* packagefamilyname, void* projectroot, int32_t platformversion, void* defaultqualifiers, void* indexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, projectroot, platformversion, defaultqualifiers, indexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagefamilyname;
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)indexer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriData(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* pridata, uint32_t prisize, void* indexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousPriData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(projectroot, platformversion, defaultqualifiers, pridata, prisize, indexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)pridata;
    (void)prisize;
    (void)indexer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousPriFile(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* prifile, void* indexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousPriFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(projectroot, platformversion, defaultqualifiers, prifile, indexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)prifile;
    (void)indexer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaData(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* schemaxmldata, uint32_t schemaxmlsize, void* indexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousSchemaData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(projectroot, platformversion, defaultqualifiers, schemaxmldata, schemaxmlsize, indexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)schemaxmldata;
    (void)schemaxmlsize;
    (void)indexer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerFromPreviousSchemaFile(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* schemafile, void* indexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerFromPreviousSchemaFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(projectroot, platformversion, defaultqualifiers, schemafile, indexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)schemafile;
    (void)indexer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmCreateResourceIndexerWithFlags(void* packagefamilyname, void* projectroot, int32_t platformversion, void* defaultqualifiers, int32_t flags, void* indexer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmCreateResourceIndexerWithFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, projectroot, platformversion, defaultqualifiers, flags, indexer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagefamilyname;
    (void)projectroot;
    (void)platformversion;
    (void)defaultqualifiers;
    (void)flags;
    (void)indexer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriDataInMemory(void* inputpridata, uint32_t inputprisize, void* schemapridata, uint32_t schemaprisize, int32_t dumptype, void* outputxmldata, void* outputxmlsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmDumpPriDataInMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inputpridata, inputprisize, schemapridata, schemaprisize, dumptype, outputxmldata, outputxmlsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inputpridata;
    (void)inputprisize;
    (void)schemapridata;
    (void)schemaprisize;
    (void)dumptype;
    (void)outputxmldata;
    (void)outputxmlsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFile(void* indexfilename, void* schemaprifile, int32_t dumptype, void* outputxmlfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmDumpPriFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(indexfilename, schemaprifile, dumptype, outputxmlfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)indexfilename;
    (void)schemaprifile;
    (void)dumptype;
    (void)outputxmlfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmDumpPriFileInMemory(void* indexfilename, void* schemaprifile, int32_t dumptype, void* outputxmldata, void* outputxmlsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmDumpPriFileInMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(indexfilename, schemaprifile, dumptype, outputxmldata, outputxmlsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)indexfilename;
    (void)schemaprifile;
    (void)dumptype;
    (void)outputxmldata;
    (void)outputxmlsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmFreeMemory(void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmFreeMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_MrmGetPriFileContentChecksum(void* prifile, void* checksum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mrmsupport.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MrmGetPriFileContentChecksum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prifile, checksum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prifile;
    (void)checksum;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjects(uint32_t ncount, void* phandles, int32_t fwaitall, uint32_t dwmilliseconds, uint32_t dwwakemask) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsgWaitForMultipleObjects");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ncount, phandles, fwaitall, dwmilliseconds, dwwakemask);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ncount;
    (void)phandles;
    (void)fwaitall;
    (void)dwmilliseconds;
    (void)dwwakemask;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_MsgWaitForMultipleObjectsEx(uint32_t ncount, void* phandles, uint32_t dwmilliseconds, uint32_t dwwakemask, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MsgWaitForMultipleObjectsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ncount, phandles, dwmilliseconds, dwwakemask, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ncount;
    (void)phandles;
    (void)dwmilliseconds;
    (void)dwwakemask;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_OemToCharA(void* psrc, void* pdst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrc, pdst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrc;
    (void)pdst;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffA(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharBuffA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsrc, lpszdst, cchdstlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_OemToCharBuffW(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharBuffW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsrc, lpszdst, cchdstlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsrc;
    (void)lpszdst;
    (void)cchdstlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_OemToCharW(void* psrc, void* pdst) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OemToCharW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psrc, pdst);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psrc;
    (void)pdst;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_OpenIcon(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenIcon");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_PeekMessageA(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax, uint32_t wremovemsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg, hwnd, wmsgfiltermin, wmsgfiltermax, wremovemsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    (void)wremovemsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_PeekMessageW(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax, uint32_t wremovemsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg, hwnd, wmsgfiltermin, wmsgfiltermax, wremovemsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    (void)hwnd;
    (void)wmsgfiltermin;
    (void)wmsgfiltermax;
    (void)wremovemsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_PhysicalToLogicalPoint(void* hwnd, void* lppoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PhysicalToLogicalPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lppoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lppoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_PostMessageA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_PostMessageW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_windowsandmessaging_PostQuitMessage(int32_t nexitcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostQuitMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(nexitcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)nexitcode;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageA(uint32_t idthread, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostThreadMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idthread, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idthread;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_PostThreadMessageW(uint32_t idthread, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PostThreadMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idthread, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idthread;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsA(void* szfilename, int32_t niconindex, int32_t cxicon, int32_t cyicon, void* phicon, void* piconid, uint32_t nicons, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivateExtractIconsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, niconindex, cxicon, cyicon, phicon, piconid, nicons, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilename;
    (void)niconindex;
    (void)cxicon;
    (void)cyicon;
    (void)phicon;
    (void)piconid;
    (void)nicons;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_PrivateExtractIconsW(void* szfilename, int32_t niconindex, int32_t cxicon, int32_t cyicon, void* phicon, void* piconid, uint32_t nicons, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, int32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivateExtractIconsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, niconindex, cxicon, cyicon, phicon, piconid, nicons, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)szfilename;
    (void)niconindex;
    (void)cxicon;
    (void)cyicon;
    (void)phicon;
    (void)piconid;
    (void)nicons;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassA(void* hwnd, void* ptszclassname, uint32_t cchclassnamemax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealGetWindowClassA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ptszclassname, cchclassnamemax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)ptszclassname;
    (void)cchclassnamemax;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_RealGetWindowClassW(void* hwnd, void* ptszclassname, uint32_t cchclassnamemax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealGetWindowClassW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ptszclassname, cchclassnamemax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)ptszclassname;
    (void)cchclassnamemax;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_RegisterClassA(void* lpwndclass) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwndclass);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwndclass;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExA(void* param0) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_RegisterClassExW(void* param0) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)param0;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_RegisterClassW(void* lpwndclass) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClassW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpwndclass);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpwndclass;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationA(void* hrecipient, void* notificationfilter, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceNotificationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecipient, notificationfilter, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hrecipient;
    (void)notificationfilter;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_RegisterDeviceNotificationW(void* hrecipient, void* notificationfilter, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceNotificationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecipient, notificationfilter, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hrecipient;
    (void)notificationfilter;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_RegisterForTooltipDismissNotification(void* hwnd, int32_t tdflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterForTooltipDismissNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, tdflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)tdflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_RegisterShellHookWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterShellHookWindow");
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageA(void* lpstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWindowMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_RegisterWindowMessageW(void* lpstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWindowMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpstring;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_RemoveMenu(void* hmenu, uint32_t uposition, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uposition, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_RemovePropA(void* hwnd, void* lpstring) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePropA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)lpstring;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_RemovePropW(void* hwnd, void* lpstring) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePropW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwnd;
    (void)lpstring;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ReplyMessage(int64_t lresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplyMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ScrollDC(void* hdc, int32_t dx, int32_t dy, void* lprcscroll, void* lprcclip, void* hrgnupdate, void* lprcupdate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollDC");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdc, dx, dy, lprcscroll, lprcclip, hrgnupdate, lprcupdate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdc;
    (void)dx;
    (void)dy;
    (void)lprcscroll;
    (void)lprcclip;
    (void)hrgnupdate;
    (void)lprcupdate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ScrollWindow(void* hwnd, int32_t xamount, int32_t yamount, void* lprect, void* lpcliprect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, xamount, yamount, lprect, lpcliprect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)xamount;
    (void)yamount;
    (void)lprect;
    (void)lpcliprect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ScrollWindowEx(void* hwnd, int32_t dx, int32_t dy, void* prcscroll, void* prcclip, void* hrgnupdate, void* prcupdate, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScrollWindowEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dx, dy, prcscroll, prcclip, hrgnupdate, prcupdate, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dx;
    (void)dy;
    (void)prcscroll;
    (void)prcclip;
    (void)hrgnupdate;
    (void)prcupdate;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageA(void* hdlg, int32_t niddlgitem, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendDlgItemMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SendDlgItemMessageW(void* hdlg, int32_t niddlgitem, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendDlgItemMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SendMessageA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* lpresultcallback, uint64_t dwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageCallbackA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam, lpresultcallback, dwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)lpresultcallback;
    (void)dwdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SendMessageCallbackW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* lpresultcallback, uint64_t dwdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageCallbackW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam, lpresultcallback, dwdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)lpresultcallback;
    (void)dwdata;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, uint32_t fuflags, uint32_t utimeout, void* lpdwresult) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageTimeoutA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam, fuflags, utimeout, lpdwresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)fuflags;
    (void)utimeout;
    (void)lpdwresult;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SendMessageTimeoutW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, uint32_t fuflags, uint32_t utimeout, void* lpdwresult) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageTimeoutW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam, fuflags, utimeout, lpdwresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    (void)fuflags;
    (void)utimeout;
    (void)lpdwresult;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SendMessageW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendNotifyMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SendNotifyMessageW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendNotifyMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, msg, wparam, lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)msg;
    (void)wparam;
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetAdditionalForegroundBoostProcesses(void* toplevelwindow, uint32_t processhandlecount, void* processhandlearray) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAdditionalForegroundBoostProcesses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(toplevelwindow, processhandlecount, processhandlearray);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)toplevelwindow;
    (void)processhandlecount;
    (void)processhandlearray;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetCaretBlinkTime(uint32_t umseconds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCaretBlinkTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umseconds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)umseconds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetCaretPos(int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCaretPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_SetClassLongA(void* hwnd, int32_t nindex, int32_t dwnewlong) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrA(void* hwnd, int32_t nindex, int64_t dwnewlong) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongPtrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_ui_windowsandmessaging_SetClassLongPtrW(void* hwnd, int32_t nindex, int64_t dwnewlong) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongPtrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_ui_windowsandmessaging_SetClassLongW(void* hwnd, int32_t nindex, int32_t dwnewlong) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassLongW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_SetClassWord(void* hwnd, int32_t nindex, uint16_t wnewword) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClassWord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, wnewword);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)wnewword;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssys_windows_win32_ui_windowsandmessaging_SetCoalescableTimer(void* hwnd, uint64_t nidevent, uint32_t uelapse, void* lptimerfunc, uint32_t utolerancedelay) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCoalescableTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nidevent, uelapse, lptimerfunc, utolerancedelay);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nidevent;
    (void)uelapse;
    (void)lptimerfunc;
    (void)utolerancedelay;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_SetCursor(void* hcursor) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcursor);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcursor;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetCursorPos(int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCursorPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_ui_windowsandmessaging_SetDebugErrorLevel(uint32_t dwlevel) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDebugErrorLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwlevel);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwlevel;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemInt(void* hdlg, int32_t niddlgitem, uint32_t uvalue, int32_t bsigned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDlgItemInt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, uvalue, bsigned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)uvalue;
    (void)bsigned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextA(void* hdlg, int32_t niddlgitem, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDlgItemTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetDlgItemTextW(void* hdlg, int32_t niddlgitem, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDlgItemTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdlg, niddlgitem, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdlg;
    (void)niddlgitem;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetForegroundWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetForegroundWindow");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetLayeredWindowAttributes(void* hwnd, uint32_t crkey, uint8_t balpha, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLayeredWindowAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, crkey, balpha, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)crkey;
    (void)balpha;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetMenu(void* hwnd, void* hmenu) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hmenu);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hmenu;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetMenuDefaultItem(void* hmenu, uint32_t uitem, uint32_t fbypos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuDefaultItem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uitem, fbypos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uitem;
    (void)fbypos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetMenuInfo(void* param0, void* param1) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemBitmaps(void* hmenu, uint32_t uposition, uint32_t uflags, void* hbitmapunchecked, void* hbitmapchecked) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuItemBitmaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uposition, uflags, hbitmapunchecked, hbitmapchecked);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uposition;
    (void)uflags;
    (void)hbitmapunchecked;
    (void)hbitmapchecked;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoA(void* hmenu, uint32_t item, int32_t fbypositon, void* lpmii) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuItemInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, item, fbypositon, lpmii);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbypositon;
    (void)lpmii;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetMenuItemInfoW(void* hmenu, uint32_t item, int32_t fbypositon, void* lpmii) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuItemInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, item, fbypositon, lpmii);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)item;
    (void)fbypositon;
    (void)lpmii;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SetMessageExtraInfo(int64_t lparam) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMessageExtraInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetMessageQueue(int32_t cmessagesmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMessageQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cmessagesmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cmessagesmax;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_SetParent(void* hwndchild, void* hwndnewparent) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndchild, hwndnewparent);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hwndchild;
    (void)hwndnewparent;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetPhysicalCursorPos(int32_t x, int32_t y) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPhysicalCursorPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(x, y);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)x;
    (void)y;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetProcessDPIAware(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDPIAware");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetProcessDefaultLayout(uint32_t dwdefaultlayout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDefaultLayout");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdefaultlayout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwdefaultlayout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetPropA(void* hwnd, void* lpstring, void* hdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPropA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring, hdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)hdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetPropW(void* hwnd, void* lpstring, void* hdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPropW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring, hdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpstring;
    (void)hdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetSystemCursor(void* hcur, uint32_t id) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSystemCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcur, id);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcur;
    (void)id;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_ui_windowsandmessaging_SetTimer(void* hwnd, uint64_t nidevent, uint32_t uelapse, void* lptimerfunc) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTimer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nidevent, uelapse, lptimerfunc);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nidevent;
    (void)uelapse;
    (void)lptimerfunc;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowDisplayAffinity(void* hwnd, uint32_t dwaffinity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowDisplayAffinity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, dwaffinity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)dwaffinity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongA(void* hwnd, int32_t nindex, int32_t dwnewlong) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrA(void* hwnd, int32_t nindex, int64_t dwnewlong) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongPtrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongPtrW(void* hwnd, int32_t nindex, int64_t dwnewlong) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongPtrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowLongW(void* hwnd, int32_t nindex, int32_t dwnewlong) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowLongW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, dwnewlong);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)nindex;
    (void)dwnewlong;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowPlacement(void* hwnd, void* lpwndpl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowPlacement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpwndpl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpwndpl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowPos(void* hwnd, void* hwndinsertafter, int32_t x, int32_t y, int32_t cx, int32_t cy, uint32_t uflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hwndinsertafter, x, y, cx, cy, uflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hwndinsertafter;
    (void)x;
    (void)y;
    (void)cx;
    (void)cy;
    (void)uflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextA(void* hwnd, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowTextW(void* hwnd, void* lpstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, lpstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)lpstring;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_SetWindowWord(void* hwnd, int32_t nindex, uint16_t wnewword) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowWord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, nindex, wnewword);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwnd;
    (void)nindex;
    (void)wnewword;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookA(int32_t nfiltertype, void* pfnfilterproc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nfiltertype, pfnfilterproc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nfiltertype;
    (void)pfnfilterproc;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExA(int32_t idhook, void* lpfn, void* hmod, uint32_t dwthreadid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idhook, lpfn, hmod, dwthreadid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idhook;
    (void)lpfn;
    (void)hmod;
    (void)dwthreadid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookExW(int32_t idhook, void* lpfn, void* hmod, uint32_t dwthreadid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idhook, lpfn, hmod, dwthreadid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)idhook;
    (void)lpfn;
    (void)hmod;
    (void)dwthreadid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_ui_windowsandmessaging_SetWindowsHookW(int32_t nfiltertype, void* pfnfilterproc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowsHookW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nfiltertype, pfnfilterproc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nfiltertype;
    (void)pfnfilterproc;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ShowCaret(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCaret");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_ShowCursor(int32_t bshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)bshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ShowOwnedPopups(void* hwnd, int32_t fshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowOwnedPopups");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, fshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)fshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ShowWindow(void* hwnd, int32_t ncmdshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ncmdshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ncmdshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_ShowWindowAsync(void* hwnd, int32_t ncmdshow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShowWindowAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, ncmdshow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)ncmdshow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SoundSentry(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SoundSentry");
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

void windowssys_windows_win32_ui_windowsandmessaging_SwitchToThisWindow(void* hwnd, int32_t funknown) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchToThisWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hwnd, funknown);
        return;
    }
    errno = ENOSYS;
#else
    (void)hwnd;
    (void)funknown;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoA(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemParametersInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiaction, uiparam, pvparam, fwinini);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiaction;
    (void)uiparam;
    (void)pvparam;
    (void)fwinini;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_SystemParametersInfoW(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemParametersInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uiaction, uiparam, pvparam, fwinini);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)uiaction;
    (void)uiparam;
    (void)pvparam;
    (void)fwinini;
    errno = ENOSYS;
    return -1;
#endif
}

uint16_t windowssys_windows_win32_ui_windowsandmessaging_TileWindows(void* hwndparent, uint32_t whow, void* lprect, uint32_t ckids, void* lpkids) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TileWindows");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, whow, lprect, ckids, lpkids);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)whow;
    (void)lprect;
    (void)ckids;
    (void)lpkids;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenu(void* hmenu, uint32_t uflags, int32_t x, int32_t y, int32_t nreserved, void* hwnd, void* prcrect) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrackPopupMenu");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uflags, x, y, nreserved, hwnd, prcrect);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)x;
    (void)y;
    (void)nreserved;
    (void)hwnd;
    (void)prcrect;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_TrackPopupMenuEx(void* hmenu, uint32_t uflags, int32_t x, int32_t y, void* hwnd, void* lptpm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrackPopupMenuEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmenu, uflags, x, y, hwnd, lptpm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hmenu;
    (void)uflags;
    (void)x;
    (void)y;
    (void)hwnd;
    (void)lptpm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorA(void* hwnd, void* hacctable, void* lpmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateAcceleratorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hacctable, lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hacctable;
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_TranslateAcceleratorW(void* hwnd, void* hacctable, void* lpmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateAcceleratorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hacctable, lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hacctable;
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_TranslateMDISysAccel(void* hwndclient, void* lpmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateMDISysAccel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndclient, lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndclient;
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_TranslateMessage(void* lpmsg) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmsg;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHook(int32_t ncode, void* pfnfilterproc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhookWindowsHook");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ncode, pfnfilterproc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ncode;
    (void)pfnfilterproc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_UnhookWindowsHookEx(void* hhk) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhookWindowsHookEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hhk);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hhk;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassA(void* lpclassname, void* hinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterClassA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpclassname, hinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpclassname;
    (void)hinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_UnregisterClassW(void* lpclassname, void* hinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterClassW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpclassname, hinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpclassname;
    (void)hinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_UnregisterDeviceNotification(void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterDeviceNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindow(void* hwnd, void* hdcdst, void* pptdst, void* psize, void* hdcsrc, void* pptsrc, uint32_t crkey, void* pblend, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateLayeredWindow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, hdcdst, pptdst, psize, hdcsrc, pptsrc, crkey, pblend, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)hdcdst;
    (void)pptdst;
    (void)psize;
    (void)hdcsrc;
    (void)pptsrc;
    (void)crkey;
    (void)pblend;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_UpdateLayeredWindowIndirect(void* hwnd, void* pulwinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateLayeredWindowIndirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwnd, pulwinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwnd;
    (void)pulwinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_WaitMessage(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitMessage");
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_wvsprintfA(void* param0, void* param1, void* arglist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvsprintfA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, arglist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)arglist;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_wvsprintfW(void* param0, void* param1, void* arglist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvsprintfW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, arglist);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)arglist;
    errno = ENOSYS;
    return -1;
#endif
}

