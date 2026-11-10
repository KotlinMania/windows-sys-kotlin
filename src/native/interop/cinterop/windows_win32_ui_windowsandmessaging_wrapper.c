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

int32_t windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRect(void* lprect, uint32_t dwstyle, int32_t bmenu) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_adjustWindowRectEx(void* lprect, uint32_t dwstyle, int32_t bmenu, uint32_t dwexstyle) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_allowSetForegroundWindow(uint32_t dwprocessid) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_animateWindow(void* hwnd, uint32_t dwtime, uint32_t dwflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_anyPopup(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_appendMenuA(void* hmenu, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_appendMenuW(void* hmenu, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_arrangeIconicWindows(void* hwnd) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_beginDeferWindowPos(int32_t nnumwindows) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_bringWindowToTop(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_calculatePopupWindowPosition(void* anchorpoint, void* windowsize, uint32_t flags, void* excluderect, void* popupwindowposition) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterA(void* lpmsg, int32_t ncode) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_callMsgFilterW(void* lpmsg, int32_t ncode) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_callNextHookEx(void* hhk, int32_t ncode, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_callWindowProcA(void* lpprevwndfunc, void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_callWindowProcW(void* lpprevwndfunc, void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_cancelShutdown(void) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_cascadeWindows(void* hwndparent, uint32_t whow, void* lprect, uint32_t ckids, void* lpkids) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_changeMenuA(void* hmenu, uint32_t cmd, void* lpsznewitem, uint32_t cmdinsert, uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_changeMenuW(void* hmenu, uint32_t cmd, void* lpsznewitem, uint32_t cmdinsert, uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilter(uint32_t message, uint32_t dwflag) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_changeWindowMessageFilterEx(void* hwnd, uint32_t message, uint32_t action, void* pchangefilterstruct) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charLowerA(void* lpsz) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffA(void* lpsz, uint32_t cchlength) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_charLowerBuffW(void* lpsz, uint32_t cchlength) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charLowerW(void* lpsz) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charNextA(void* lpsz) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charNextExA(uint16_t codepage, void* lpcurrentchar, uint32_t dwflags) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charNextW(void* lpsz) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charPrevA(void* lpszstart, void* lpszcurrent) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charPrevExA(uint16_t codepage, void* lpstart, void* lpcurrentchar, uint32_t dwflags) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charPrevW(void* lpszstart, void* lpszcurrent) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_charToOemA(void* psrc, void* pdst) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffA(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_charToOemBuffW(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_charToOemW(void* psrc, void* pdst) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charUpperA(void* lpsz) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffA(void* lpsz, uint32_t cchlength) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_charUpperBuffW(void* lpsz, uint32_t cchlength) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_charUpperW(void* lpsz) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_checkMenuItem(void* hmenu, uint32_t uidcheckitem, uint32_t ucheck) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_checkMenuRadioItem(void* hmenu, uint32_t first, uint32_t last, uint32_t check, uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_clipCursor(void* lprect) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_closeWindow(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableA(void* haccelsrc, void* lpacceldst, int32_t caccelentries) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_copyAcceleratorTableW(void* haccelsrc, void* lpacceldst, int32_t caccelentries) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_copyIcon(void* hicon) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_copyImage(void* h, uint32_t type, int32_t cx, int32_t cy, uint32_t flags) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableA(void* paccel, int32_t caccel) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createAcceleratorTableW(void* paccel, int32_t caccel) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_createCaret(void* hwnd, void* hbitmap, int32_t nwidth, int32_t nheight) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createCursor(void* hinst, int32_t xhotspot, int32_t yhotspot, int32_t nwidth, int32_t nheight, void* pvandplane, void* pvxorplane) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamA(void* hinstance, void* lptemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createDialogIndirectParamW(void* hinstance, void* lptemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createDialogParamA(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createDialogParamW(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createIcon(void* hinstance, int32_t nwidth, int32_t nheight, uint8_t cplanes, uint8_t cbitspixel, void* lpbandbits, void* lpbxorbits) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createIconFromResource(void* presbits, uint32_t dwressize, int32_t ficon, uint32_t dwver) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createIconFromResourceEx(void* presbits, uint32_t dwressize, int32_t ficon, uint32_t dwver, int32_t cxdesired, int32_t cydesired, uint32_t flags) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createIconIndirect(void* piconinfo) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowA(void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hinstance, int64_t lparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createMDIWindowW(void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hinstance, int64_t lparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createMenu(void) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createPopupMenu(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_createResourceIndexer(void* projectroot, void* extensiondllpath, void* ppresourceindexer) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createWindowExA(uint32_t dwexstyle, void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hmenu, void* hinstance, void* lpparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_createWindowExW(uint32_t dwexstyle, void* lpclassname, void* lpwindowname, uint32_t dwstyle, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, void* hwndparent, void* hmenu, void* hinstance, void* lpparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defDlgProcA(void* hdlg, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defDlgProcW(void* hdlg, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defFrameProcA(void* hwnd, void* hwndmdiclient, uint32_t umsg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defFrameProcW(void* hwnd, void* hwndmdiclient, uint32_t umsg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcA(void* hwnd, uint32_t umsg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defMDIChildProcW(void* hwnd, uint32_t umsg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defWindowProcA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_defWindowProcW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_deferWindowPos(void* hwinposinfo, void* hwnd, void* hwndinsertafter, int32_t x, int32_t y, int32_t cx, int32_t cy, uint32_t uflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_deleteMenu(void* hmenu, uint32_t uposition, uint32_t uflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_deregisterShellHookWindow(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_destroyAcceleratorTable(void* haccel) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_destroyCaret(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_destroyCursor(void* hcursor) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_destroyIcon(void* hicon) {
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

void windowssys_windows_win32_ui_windowsandmessaging_destroyIndexedResults(void* resourceuri, uint32_t qualifiercount, void* qualifiers) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_destroyMenu(void* hmenu) {
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

void windowssys_windows_win32_ui_windowsandmessaging_destroyResourceIndexer(void* resourceindexer) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_destroyWindow(void* hwnd) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamA(void* hinstance, void* hdialogtemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_dialogBoxIndirectParamW(void* hinstance, void* hdialogtemplate, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamA(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_dialogBoxParamW(void* hinstance, void* lptemplatename, void* hwndparent, void* lpdialogfunc, int64_t dwinitparam) {
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

void windowssys_windows_win32_ui_windowsandmessaging_disableProcessWindowsGhosting(void) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageA(void* lpmsg) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_dispatchMessageW(void* lpmsg) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_dragObject(void* hwndparent, void* hwndfrom, uint32_t fmt, uint64_t data, void* hcur) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_drawIcon(void* hdc, int32_t x, int32_t y, void* hicon) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_drawIconEx(void* hdc, int32_t xleft, int32_t ytop, void* hicon, int32_t cxwidth, int32_t cywidth, uint32_t istepifanicur, void* hbrflickerfreedraw, uint32_t diflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_drawMenuBar(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enableMenuItem(void* hmenu, uint32_t uidenableitem, uint32_t uenable) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_endDeferWindowPos(void* hwinposinfo) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_endDialog(void* hdlg, int64_t nresult) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_endMenu(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enumChildWindows(void* hwndparent, void* lpenumfunc, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enumPropsA(void* hwnd, void* lpenumfunc) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enumPropsExA(void* hwnd, void* lpenumfunc, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enumPropsExW(void* hwnd, void* lpenumfunc, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enumPropsW(void* hwnd, void* lpenumfunc) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enumThreadWindows(uint32_t dwthreadid, void* lpfn, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_enumWindows(void* lpenumfunc, int64_t lparam) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_findWindowA(void* lpclassname, void* lpwindowname) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_findWindowExA(void* hwndparent, void* hwndchildafter, void* lpszclass, void* lpszwindow) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_findWindowExW(void* hwndparent, void* hwndchildafter, void* lpszclass, void* lpszwindow) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_findWindowW(void* lpclassname, void* lpwindowname) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_flashWindow(void* hwnd, int32_t binvert) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_flashWindowEx(void* pfwi) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoA(void* hwnd, int32_t iitem, void* pati, void* pszitemtext, uint32_t cchitemtext) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getAltTabInfoW(void* hwnd, int32_t iitem, void* pati, void* pszitemtext, uint32_t cchitemtext) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getAncestor(void* hwnd, uint32_t gaflags) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getCaretBlinkTime(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getCaretPos(void* lppoint) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClassInfoA(void* hinstance, void* lpclassname, void* lpwndclass) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExA(void* hinstance, void* lpszclass, void* lpwcx) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClassInfoExW(void* hinstance, void* lpszclass, void* lpwcx) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClassInfoW(void* hinstance, void* lpclassname, void* lpwndclass) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getClassLongA(void* hwnd, int32_t nindex) {
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

uint64_t windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrA(void* hwnd, int32_t nindex) {
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

uint64_t windowssys_windows_win32_ui_windowsandmessaging_getClassLongPtrW(void* hwnd, int32_t nindex) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getClassLongW(void* hwnd, int32_t nindex) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClassNameA(void* hwnd, void* lpclassname, int32_t nmaxcount) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClassNameW(void* hwnd, void* lpclassname, int32_t nmaxcount) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_getClassWord(void* hwnd, int32_t nindex) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClientRect(void* hwnd, void* lprect) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getClipCursor(void* lprect) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getCursor(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getCursorInfo(void* pci) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getCursorPos(void* lppoint) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getDesktopWindow(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getDialogBaseUnits(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getDlgCtrlID(void* hwnd) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getDlgItem(void* hdlg, int32_t niddlgitem) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getDlgItemInt(void* hdlg, int32_t niddlgitem, void* lptranslated, int32_t bsigned) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextA(void* hdlg, int32_t niddlgitem, void* lpstring, int32_t cchmax) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getDlgItemTextW(void* hdlg, int32_t niddlgitem, void* lpstring, int32_t cchmax) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getForegroundWindow(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getGUIThreadInfo(uint32_t idthread, void* pgui) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getIconInfo(void* hicon, void* piconinfo) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExA(void* hicon, void* piconinfo) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getIconInfoExW(void* hicon, void* piconinfo) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getInputState(void) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getLastActivePopup(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getLayeredWindowAttributes(void* hwnd, void* pcrkey, void* pbalpha, void* pdwflags) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getMenu(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuBarInfo(void* hwnd, int32_t idobject, int32_t iditem, void* pmbi) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuCheckMarkDimensions(void) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuDefaultItem(void* hmenu, uint32_t fbypos, uint32_t gmdiflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuInfo(void* param0, void* param1) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuItemCount(void* hmenu) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuItemID(void* hmenu, int32_t npos) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoA(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmii) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuItemInfoW(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmii) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuItemRect(void* hwnd, void* hmenu, uint32_t uitem, void* lprcitem) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuState(void* hmenu, uint32_t uid, uint32_t uflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuStringA(void* hmenu, uint32_t uiditem, void* lpstring, int32_t cchmax, uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMenuStringW(void* hmenu, uint32_t uiditem, void* lpstring, int32_t cchmax, uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMessageA(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_getMessageExtraInfo(void) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getMessagePos(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMessageTime(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getMessageW(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getNextDlgGroupItem(void* hdlg, void* hctl, int32_t bprevious) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getNextDlgTabItem(void* hdlg, void* hctl, int32_t bprevious) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getParent(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getPhysicalCursorPos(void* lppoint) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getProcessDefaultLayout(void* pdwdefaultlayout) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getPropA(void* hwnd, void* lpstring) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getPropW(void* hwnd, void* lpstring) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getQueueStatus(uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getScrollBarInfo(void* hwnd, int32_t idobject, void* psbi) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getScrollInfo(void* hwnd, int32_t nbar, void* lpsi) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getScrollPos(void* hwnd, int32_t nbar) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getScrollRange(void* hwnd, int32_t nbar, void* lpminpos, void* lpmaxpos) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getShellWindow(void) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getSubMenu(void* hmenu, int32_t npos) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getSystemMenu(void* hwnd, int32_t brevert) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getSystemMetrics(int32_t nindex) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getTitleBarInfo(void* hwnd, void* pti) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getTopWindow(void* hwnd) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_getWindow(void* hwnd, uint32_t ucmd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowDisplayAffinity(void* hwnd, void* pdwaffinity) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowInfo(void* hwnd, void* pwi) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowLongA(void* hwnd, int32_t nindex) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrA(void* hwnd, int32_t nindex) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_getWindowLongPtrW(void* hwnd, int32_t nindex) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowLongW(void* hwnd, int32_t nindex) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameA(void* hwnd, void* pszfilename, uint32_t cchfilenamemax) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowModuleFileNameW(void* hwnd, void* pszfilename, uint32_t cchfilenamemax) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowPlacement(void* hwnd, void* lpwndpl) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowRect(void* hwnd, void* lprect) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowTextA(void* hwnd, void* lpstring, int32_t nmaxcount) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthA(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowTextLengthW(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowTextW(void* hwnd, void* lpstring, int32_t nmaxcount) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_getWindowThreadProcessId(void* hwnd, void* lpdwprocessid) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_getWindowWord(void* hwnd, int32_t nindex) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_hideCaret(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_hiliteMenuItem(void* hwnd, void* hmenu, uint32_t uidhiliteitem, uint32_t uhilite) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_inSendMessage(void) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_inSendMessageEx(void* lpreserved) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_indexFilePath(void* resourceindexer, void* filepath, void* ppresourceuri, void* pqualifiercount, void* ppqualifiers) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_inheritWindowMonitor(void* hwnd, void* hwndinherit) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_insertMenuA(void* hmenu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemA(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmi) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_insertMenuItemW(void* hmenu, uint32_t item, int32_t fbyposition, void* lpmi) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_insertMenuW(void* hmenu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_internalGetWindowText(void* hwnd, void* pstring, int32_t cchmaxcount) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaA(int8_t ch) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericA(int8_t ch) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaNumericW(uint16_t ch) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isCharAlphaW(uint16_t ch) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isCharLowerA(int8_t ch) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isCharUpperA(int8_t ch) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isCharUpperW(uint16_t ch) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isChild(void* hwndparent, void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageA(void* hdlg, void* lpmsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isDialogMessageW(void* hdlg, void* lpmsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isGUIThread(int32_t bconvert) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isHungAppWindow(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isIconic(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isMenu(void* hmenu) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isProcessDPIAware(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isWindow(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isWindowArranged(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isWindowUnicode(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isWindowVisible(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isWow64Message(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_isZoomed(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_killTimer(void* hwnd, uint64_t uidevent) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsA(void* hinstance, void* lptablename) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadAcceleratorsW(void* hinstance, void* lptablename) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadCursorA(void* hinstance, void* lpcursorname) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileA(void* lpfilename) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadCursorFromFileW(void* lpfilename) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadCursorW(void* hinstance, void* lpcursorname) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadIconA(void* hinstance, void* lpiconname) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadIconW(void* hinstance, void* lpiconname) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadImageA(void* hinst, void* name, uint32_t type, int32_t cx, int32_t cy, uint32_t fuload) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadImageW(void* hinst, void* name, uint32_t type, int32_t cx, int32_t cy, uint32_t fuload) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadMenuA(void* hinstance, void* lpmenuname) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectA(void* lpmenutemplate) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadMenuIndirectW(void* lpmenutemplate) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_loadMenuW(void* hinstance, void* lpmenuname) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_loadStringA(void* hinstance, uint32_t uid, void* lpbuffer, int32_t cchbuffermax) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_loadStringW(void* hinstance, uint32_t uid, void* lpbuffer, int32_t cchbuffermax) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_lockSetForegroundWindow(uint32_t ulockcode) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_logicalToPhysicalPoint(void* hwnd, void* lppoint) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectory(void* presbits, int32_t ficon) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_lookupIconIdFromDirectoryEx(void* presbits, int32_t ficon, int32_t cxdesired, int32_t cydesired, uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mapDialogRect(void* hdlg, void* lprect) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_messageBoxA(void* hwnd, void* lptext, void* lpcaption, uint32_t utype) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_messageBoxExA(void* hwnd, void* lptext, void* lpcaption, uint32_t utype, uint16_t wlanguageid) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_messageBoxExW(void* hwnd, void* lptext, void* lpcaption, uint32_t utype, uint16_t wlanguageid) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectA(void* lpmbp) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_messageBoxIndirectW(void* lpmbp) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_messageBoxW(void* hwnd, void* lptext, void* lpcaption, uint32_t utype) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_modifyMenuA(void* hmnu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_modifyMenuW(void* hmnu, uint32_t uposition, uint32_t uflags, uint64_t uidnewitem, void* lpnewitem) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_moveWindow(void* hwnd, int32_t x, int32_t y, int32_t nwidth, int32_t nheight, int32_t brepaint) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfig(int32_t platformversion, void* defaultqualifiers, void* outputxmlfile) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateConfigInMemory(int32_t platformversion, void* defaultqualifiers, void* outputxmldata, void* outputxmlsize) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexer(void* packagefamilyname, void* projectroot, int32_t platformversion, void* defaultqualifiers, void* indexer) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriData(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* pridata, uint32_t prisize, void* indexer) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousPriFile(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* prifile, void* indexer) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaData(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* schemaxmldata, uint32_t schemaxmlsize, void* indexer) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerFromPreviousSchemaFile(void* projectroot, int32_t platformversion, void* defaultqualifiers, void* schemafile, void* indexer) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmCreateResourceIndexerWithFlags(void* packagefamilyname, void* projectroot, int32_t platformversion, void* defaultqualifiers, int32_t flags, void* indexer) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriDataInMemory(void* inputpridata, uint32_t inputprisize, void* schemapridata, uint32_t schemaprisize, int32_t dumptype, void* outputxmldata, void* outputxmlsize) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFile(void* indexfilename, void* schemaprifile, int32_t dumptype, void* outputxmlfile) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmDumpPriFileInMemory(void* indexfilename, void* schemaprifile, int32_t dumptype, void* outputxmldata, void* outputxmlsize) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmFreeMemory(void* data) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_mrmGetPriFileContentChecksum(void* prifile, void* checksum) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjects(uint32_t ncount, void* phandles, int32_t fwaitall, uint32_t dwmilliseconds, uint32_t dwwakemask) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_msgWaitForMultipleObjectsEx(uint32_t ncount, void* phandles, uint32_t dwmilliseconds, uint32_t dwwakemask, uint32_t dwflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_oemToCharA(void* psrc, void* pdst) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffA(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_oemToCharBuffW(void* lpszsrc, void* lpszdst, uint32_t cchdstlength) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_oemToCharW(void* psrc, void* pdst) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_openIcon(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_peekMessageA(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax, uint32_t wremovemsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_peekMessageW(void* lpmsg, void* hwnd, uint32_t wmsgfiltermin, uint32_t wmsgfiltermax, uint32_t wremovemsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_physicalToLogicalPoint(void* hwnd, void* lppoint) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_postMessageA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_postMessageW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

void windowssys_windows_win32_ui_windowsandmessaging_postQuitMessage(int32_t nexitcode) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageA(uint32_t idthread, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_postThreadMessageW(uint32_t idthread, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsA(void* szfilename, int32_t niconindex, int32_t cxicon, int32_t cyicon, void* phicon, void* piconid, uint32_t nicons, uint32_t flags) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_privateExtractIconsW(void* szfilename, int32_t niconindex, int32_t cxicon, int32_t cyicon, void* phicon, void* piconid, uint32_t nicons, uint32_t flags) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassA(void* hwnd, void* ptszclassname, uint32_t cchclassnamemax) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_realGetWindowClassW(void* hwnd, void* ptszclassname, uint32_t cchclassnamemax) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_registerClassA(void* lpwndclass) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_registerClassExA(void* param0) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_registerClassExW(void* param0) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_registerClassW(void* lpwndclass) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationA(void* hrecipient, void* notificationfilter, uint32_t flags) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_registerDeviceNotificationW(void* hrecipient, void* notificationfilter, uint32_t flags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_registerForTooltipDismissNotification(void* hwnd, int32_t tdflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_registerShellHookWindow(void* hwnd) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageA(void* lpstring) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_registerWindowMessageW(void* lpstring) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_removeMenu(void* hmenu, uint32_t uposition, uint32_t uflags) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_removePropA(void* hwnd, void* lpstring) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_removePropW(void* hwnd, void* lpstring) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_replyMessage(int64_t lresult) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_scrollDC(void* hdc, int32_t dx, int32_t dy, void* lprcscroll, void* lprcclip, void* hrgnupdate, void* lprcupdate) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_scrollWindow(void* hwnd, int32_t xamount, int32_t yamount, void* lprect, void* lpcliprect) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_scrollWindowEx(void* hwnd, int32_t dx, int32_t dy, void* prcscroll, void* prcclip, void* hrgnupdate, void* prcupdate, uint32_t flags) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageA(void* hdlg, int32_t niddlgitem, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_sendDlgItemMessageW(void* hdlg, int32_t niddlgitem, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_sendMessageA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* lpresultcallback, uint64_t dwdata) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_sendMessageCallbackW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, void* lpresultcallback, uint64_t dwdata) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, uint32_t fuflags, uint32_t utimeout, void* lpdwresult) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_sendMessageTimeoutW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam, uint32_t fuflags, uint32_t utimeout, void* lpdwresult) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_sendMessageW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageA(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_sendNotifyMessageW(void* hwnd, uint32_t msg, uint64_t wparam, int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setAdditionalForegroundBoostProcesses(void* toplevelwindow, uint32_t processhandlecount, void* processhandlearray) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setCaretBlinkTime(uint32_t umseconds) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setCaretPos(int32_t x, int32_t y) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_setClassLongA(void* hwnd, int32_t nindex, int32_t dwnewlong) {
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

uint64_t windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrA(void* hwnd, int32_t nindex, int64_t dwnewlong) {
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

uint64_t windowssys_windows_win32_ui_windowsandmessaging_setClassLongPtrW(void* hwnd, int32_t nindex, int64_t dwnewlong) {
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

uint32_t windowssys_windows_win32_ui_windowsandmessaging_setClassLongW(void* hwnd, int32_t nindex, int32_t dwnewlong) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_setClassWord(void* hwnd, int32_t nindex, uint16_t wnewword) {
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

uint64_t windowssys_windows_win32_ui_windowsandmessaging_setCoalescableTimer(void* hwnd, uint64_t nidevent, uint32_t uelapse, void* lptimerfunc, uint32_t utolerancedelay) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_setCursor(void* hcursor) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setCursorPos(int32_t x, int32_t y) {
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

void windowssys_windows_win32_ui_windowsandmessaging_setDebugErrorLevel(uint32_t dwlevel) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setDlgItemInt(void* hdlg, int32_t niddlgitem, uint32_t uvalue, int32_t bsigned) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextA(void* hdlg, int32_t niddlgitem, void* lpstring) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setDlgItemTextW(void* hdlg, int32_t niddlgitem, void* lpstring) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setForegroundWindow(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setLayeredWindowAttributes(void* hwnd, uint32_t crkey, uint8_t balpha, uint32_t dwflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setMenu(void* hwnd, void* hmenu) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setMenuDefaultItem(void* hmenu, uint32_t uitem, uint32_t fbypos) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setMenuInfo(void* param0, void* param1) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setMenuItemBitmaps(void* hmenu, uint32_t uposition, uint32_t uflags, void* hbitmapunchecked, void* hbitmapchecked) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoA(void* hmenu, uint32_t item, int32_t fbypositon, void* lpmii) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setMenuItemInfoW(void* hmenu, uint32_t item, int32_t fbypositon, void* lpmii) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_setMessageExtraInfo(int64_t lparam) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setMessageQueue(int32_t cmessagesmax) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_setParent(void* hwndchild, void* hwndnewparent) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setPhysicalCursorPos(int32_t x, int32_t y) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setProcessDPIAware(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setProcessDefaultLayout(uint32_t dwdefaultlayout) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setPropA(void* hwnd, void* lpstring, void* hdata) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setPropW(void* hwnd, void* lpstring, void* hdata) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setSystemCursor(void* hcur, uint32_t id) {
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

uint64_t windowssys_windows_win32_ui_windowsandmessaging_setTimer(void* hwnd, uint64_t nidevent, uint32_t uelapse, void* lptimerfunc) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setWindowDisplayAffinity(void* hwnd, uint32_t dwaffinity) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setWindowLongA(void* hwnd, int32_t nindex, int32_t dwnewlong) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrA(void* hwnd, int32_t nindex, int64_t dwnewlong) {
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

int64_t windowssys_windows_win32_ui_windowsandmessaging_setWindowLongPtrW(void* hwnd, int32_t nindex, int64_t dwnewlong) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setWindowLongW(void* hwnd, int32_t nindex, int32_t dwnewlong) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setWindowPlacement(void* hwnd, void* lpwndpl) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setWindowPos(void* hwnd, void* hwndinsertafter, int32_t x, int32_t y, int32_t cx, int32_t cy, uint32_t uflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setWindowTextA(void* hwnd, void* lpstring) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_setWindowTextW(void* hwnd, void* lpstring) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_setWindowWord(void* hwnd, int32_t nindex, uint16_t wnewword) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookA(int32_t nfiltertype, void* pfnfilterproc) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExA(int32_t idhook, void* lpfn, void* hmod, uint32_t dwthreadid) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookExW(int32_t idhook, void* lpfn, void* hmod, uint32_t dwthreadid) {
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

void* windowssys_windows_win32_ui_windowsandmessaging_setWindowsHookW(int32_t nfiltertype, void* pfnfilterproc) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_showCaret(void* hwnd) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_showCursor(int32_t bshow) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_showOwnedPopups(void* hwnd, int32_t fshow) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_showWindow(void* hwnd, int32_t ncmdshow) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_showWindowAsync(void* hwnd, int32_t ncmdshow) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_soundSentry(void) {
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

void windowssys_windows_win32_ui_windowsandmessaging_switchToThisWindow(void* hwnd, int32_t funknown) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoA(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_systemParametersInfoW(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini) {
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

uint16_t windowssys_windows_win32_ui_windowsandmessaging_tileWindows(void* hwndparent, uint32_t whow, void* lprect, uint32_t ckids, void* lpkids) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenu(void* hmenu, uint32_t uflags, int32_t x, int32_t y, int32_t nreserved, void* hwnd, void* prcrect) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_trackPopupMenuEx(void* hmenu, uint32_t uflags, int32_t x, int32_t y, void* hwnd, void* lptpm) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorA(void* hwnd, void* hacctable, void* lpmsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_translateAcceleratorW(void* hwnd, void* hacctable, void* lpmsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_translateMDISysAccel(void* hwndclient, void* lpmsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_translateMessage(void* lpmsg) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHook(int32_t ncode, void* pfnfilterproc) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_unhookWindowsHookEx(void* hhk) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_unregisterClassA(void* lpclassname, void* hinstance) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_unregisterClassW(void* lpclassname, void* hinstance) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_unregisterDeviceNotification(void* handle) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindow(void* hwnd, void* hdcdst, void* pptdst, void* psize, void* hdcsrc, void* pptsrc, uint32_t crkey, void* pblend, uint32_t dwflags) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_updateLayeredWindowIndirect(void* hwnd, void* pulwinfo) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_waitMessage(void) {
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

int32_t windowssys_windows_win32_ui_windowsandmessaging_wsprintfA(void* param0, void* param1, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wsprintfA");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(param0, param1);
            case 1: return km_fn_ptr(param0, param1, (intptr_t)km_va0);
            case 2: return km_fn_ptr(param0, param1, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(param0, param1, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(param0, param1, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_ui_windowsandmessaging_wsprintfW(void* param0, void* param1, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wsprintfW");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: return km_fn_ptr(param0, param1);
            case 1: return km_fn_ptr(param0, param1, (intptr_t)km_va0);
            case 2: return km_fn_ptr(param0, param1, (intptr_t)km_va0, (intptr_t)km_va1);
            case 3: return km_fn_ptr(param0, param1, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2);
            default: return km_fn_ptr(param0, param1, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3);
        }
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
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

