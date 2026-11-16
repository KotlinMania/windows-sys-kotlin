#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_console_wrapper.h"
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

int32_t windowssysWindowsWin32SystemConsoleAddConsoleAliasA(void* source, void* target, void* exename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConsoleAliasA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, target, exename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    (void)target;
    (void)exename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleAddConsoleAliasW(void* source, void* target, void* exename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConsoleAliasW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, target, exename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)source;
    (void)target;
    (void)exename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleAllocConsole(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocConsole");
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

int32_t windowssysWindowsWin32SystemConsoleAttachConsole(uint32_t dwprocessid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AttachConsole");
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

void windowssysWindowsWin32SystemConsoleClosePseudoConsole(int64_t hpc) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePseudoConsole");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hpc);
        return;
    }
    errno = ENOSYS;
#else
    (void)hpc;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleConsoleControl(int32_t command, void* consoleinformation, uint32_t consoleinformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConsoleControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(command, consoleinformation, consoleinformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)command;
    (void)consoleinformation;
    (void)consoleinformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemConsoleCreateConsoleScreenBuffer(uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwflags, void* lpscreenbufferdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateConsoleScreenBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, dwsharemode, lpsecurityattributes, dwflags, lpscreenbufferdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwflags;
    (void)lpscreenbufferdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryA(void* exename) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpungeConsoleCommandHistoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(exename);
        return;
    }
    errno = ENOSYS;
#else
    (void)exename;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemConsoleExpungeConsoleCommandHistoryW(void* exename) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpungeConsoleCommandHistoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(exename);
        return;
    }
    errno = ENOSYS;
#else
    (void)exename;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleFlushConsoleInputBuffer(void* hconsoleinput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushConsoleInputBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleFreeConsole(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeConsole");
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

int32_t windowssysWindowsWin32SystemConsoleGenerateConsoleCtrlEvent(uint32_t dwctrlevent, uint32_t dwprocessgroupid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateConsoleCtrlEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwctrlevent, dwprocessgroupid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwctrlevent;
    (void)dwprocessgroupid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasA(void* source, void* targetbuffer, uint32_t targetbufferlength, void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, targetbuffer, targetbufferlength, exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)source;
    (void)targetbuffer;
    (void)targetbufferlength;
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesA(void* exenamebuffer, uint32_t exenamebufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exenamebuffer, exenamebufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exenamebuffer;
    (void)exenamebufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthA(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesLengthA");
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

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesLengthW(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesLengthW");
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

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasExesW(void* exenamebuffer, uint32_t exenamebufferlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasExesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exenamebuffer, exenamebufferlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exenamebuffer;
    (void)exenamebufferlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasW(void* source, void* targetbuffer, uint32_t targetbufferlength, void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(source, targetbuffer, targetbufferlength, exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)source;
    (void)targetbuffer;
    (void)targetbufferlength;
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesA(void* aliasbuffer, uint32_t aliasbufferlength, void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(aliasbuffer, aliasbufferlength, exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)aliasbuffer;
    (void)aliasbufferlength;
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthA(void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesLengthA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesLengthW(void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesLengthW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleAliasesW(void* aliasbuffer, uint32_t aliasbufferlength, void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleAliasesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(aliasbuffer, aliasbufferlength, exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)aliasbuffer;
    (void)aliasbufferlength;
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCP(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCP");
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

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryA(void* commands, uint32_t commandbufferlength, void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(commands, commandbufferlength, exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)commands;
    (void)commandbufferlength;
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthA(void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryLengthA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryLengthW(void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryLengthW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleCommandHistoryW(void* commands, uint32_t commandbufferlength, void* exename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCommandHistoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(commands, commandbufferlength, exename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)commands;
    (void)commandbufferlength;
    (void)exename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetConsoleCursorInfo(void* hconsoleoutput, void* lpconsolecursorinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleCursorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, lpconsolecursorinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolecursorinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetConsoleDisplayMode(void* lpmodeflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleDisplayMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmodeflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmodeflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetConsoleHistoryInfo(void* lpconsolehistoryinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleHistoryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsolehistoryinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpconsolehistoryinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetConsoleMode(void* hconsolehandle, void* lpmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsolehandle, lpmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsolehandle;
    (void)lpmode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleA(void* lpconsoletitle, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOriginalTitleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsoletitle, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleOriginalTitleW(void* lpconsoletitle, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOriginalTitleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsoletitle, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleOutputCP(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleOutputCP");
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

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleProcessList(void* lpdwprocesslist, uint32_t dwprocesscount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleProcessList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdwprocesslist, dwprocesscount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpdwprocesslist;
    (void)dwprocesscount;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfo(void* hconsoleoutput, void* lpconsolescreenbufferinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleScreenBufferInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, lpconsolescreenbufferinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetConsoleScreenBufferInfoEx(void* hconsoleoutput, void* lpconsolescreenbufferinfoex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleScreenBufferInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, lpconsolescreenbufferinfoex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfoex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetConsoleSelectionInfo(void* lpconsoleselectioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleSelectionInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsoleselectioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpconsoleselectioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleTitleA(void* lpconsoletitle, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleTitleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsoletitle, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemConsoleGetConsoleTitleW(void* lpconsoletitle, uint32_t nsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleTitleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsoletitle, nsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpconsoletitle;
    (void)nsize;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemConsoleGetConsoleWindow(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConsoleWindow");
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

int32_t windowssysWindowsWin32SystemConsoleGetCurrentConsoleFont(void* hconsoleoutput, int32_t bmaximumwindow, void* lpconsolecurrentfont) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentConsoleFont");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, bmaximumwindow, lpconsolecurrentfont);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfont;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetCurrentConsoleFontEx(void* hconsoleoutput, int32_t bmaximumwindow, void* lpconsolecurrentfontex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentConsoleFontEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, bmaximumwindow, lpconsolecurrentfontex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfontex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetNumberOfConsoleInputEvents(void* hconsoleinput, void* lpnumberofevents) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfConsoleInputEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpnumberofevents);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpnumberofevents;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleGetNumberOfConsoleMouseButtons(void* lpnumberofmousebuttons) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumberOfConsoleMouseButtons");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpnumberofmousebuttons);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpnumberofmousebuttons;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemConsoleGetStdHandle(uint32_t nstdhandle) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStdHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nstdhandle);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)nstdhandle;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemConsolePeekConsoleInputA(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekConsoleInputA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nlength, lpnumberofeventsread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsolePeekConsoleInputW(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PeekConsoleInputW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nlength, lpnumberofeventsread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleReadConsoleA(void* hconsoleinput, void* lpbuffer, uint32_t nnumberofcharstoread, void* lpnumberofcharsread, void* pinputcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nnumberofcharstoread, lpnumberofcharsread, pinputcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nnumberofcharstoread;
    (void)lpnumberofcharsread;
    (void)pinputcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleReadConsoleInputA(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleInputA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nlength, lpnumberofeventsread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleReadConsoleInputW(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventsread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleInputW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nlength, lpnumberofeventsread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventsread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleReadConsoleW(void* hconsoleinput, void* lpbuffer, uint32_t nnumberofcharstoread, void* lpnumberofcharsread, void* pinputcontrol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadConsoleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nnumberofcharstoread, lpnumberofcharsread, pinputcontrol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nnumberofcharstoread;
    (void)lpnumberofcharsread;
    (void)pinputcontrol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleActiveScreenBuffer(void* hconsoleoutput) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleActiveScreenBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleCP(uint32_t wcodepageid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wcodepageid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wcodepageid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleCtrlHandler(void* handlerroutine, int32_t add) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCtrlHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handlerroutine, add);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handlerroutine;
    (void)add;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleCursorInfo(void* hconsoleoutput, void* lpconsolecursorinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleCursorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, lpconsolecursorinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolecursorinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleDisplayMode(void* hconsoleoutput, uint32_t dwflags, void* lpnewscreenbufferdimensions) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleDisplayMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, dwflags, lpnewscreenbufferdimensions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)dwflags;
    (void)lpnewscreenbufferdimensions;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleHistoryInfo(void* lpconsolehistoryinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleHistoryInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsolehistoryinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpconsolehistoryinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleMode(void* hconsolehandle, uint32_t dwmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsolehandle, dwmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsolehandle;
    (void)dwmode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsA(uint32_t number, void* exename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleNumberOfCommandsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(number, exename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)number;
    (void)exename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleNumberOfCommandsW(uint32_t number, void* exename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleNumberOfCommandsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(number, exename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)number;
    (void)exename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleOutputCP(uint32_t wcodepageid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleOutputCP");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wcodepageid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wcodepageid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleScreenBufferInfoEx(void* hconsoleoutput, void* lpconsolescreenbufferinfoex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleScreenBufferInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, lpconsolescreenbufferinfoex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)lpconsolescreenbufferinfoex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleTextAttribute(void* hconsoleoutput, uint16_t wattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTextAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, wattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)wattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleTitleA(void* lpconsoletitle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTitleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsoletitle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpconsoletitle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleTitleW(void* lpconsoletitle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleTitleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpconsoletitle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpconsoletitle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetConsoleWindowInfo(void* hconsoleoutput, int32_t babsolute, void* lpconsolewindow) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConsoleWindowInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, babsolute, lpconsolewindow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)babsolute;
    (void)lpconsolewindow;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetCurrentConsoleFontEx(void* hconsoleoutput, int32_t bmaximumwindow, void* lpconsolecurrentfontex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentConsoleFontEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, bmaximumwindow, lpconsolecurrentfontex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)bmaximumwindow;
    (void)lpconsolecurrentfontex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetStdHandle(uint32_t nstdhandle, void* hhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStdHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nstdhandle, hhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nstdhandle;
    (void)hhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleSetStdHandleEx(uint32_t nstdhandle, void* hhandle, void* phprevvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetStdHandleEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nstdhandle, hhandle, phprevvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)nstdhandle;
    (void)hhandle;
    (void)phprevvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleWriteConsoleA(void* hconsoleoutput, void* lpbuffer, uint32_t nnumberofcharstowrite, void* lpnumberofcharswritten, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, lpbuffer, nnumberofcharstowrite, lpnumberofcharswritten, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)lpbuffer;
    (void)nnumberofcharstowrite;
    (void)lpnumberofcharswritten;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleWriteConsoleInputA(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleInputA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nlength, lpnumberofeventswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleWriteConsoleInputW(void* hconsoleinput, void* lpbuffer, uint32_t nlength, void* lpnumberofeventswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleInputW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleinput, lpbuffer, nlength, lpnumberofeventswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleinput;
    (void)lpbuffer;
    (void)nlength;
    (void)lpnumberofeventswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemConsoleWriteConsoleW(void* hconsoleoutput, void* lpbuffer, uint32_t nnumberofcharstowrite, void* lpnumberofcharswritten, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteConsoleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hconsoleoutput, lpbuffer, nnumberofcharstowrite, lpnumberofcharswritten, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hconsoleoutput;
    (void)lpbuffer;
    (void)nnumberofcharstowrite;
    (void)lpnumberofcharswritten;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

