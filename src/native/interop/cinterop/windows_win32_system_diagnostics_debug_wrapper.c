#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_diagnostics_debug_wrapper.h"
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

void* windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredContinueHandler(uint32_t first, void* handler) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVectoredContinueHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(first, handler);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)first;
    (void)handler;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugAddVectoredExceptionHandler(uint32_t first, void* handler) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVectoredExceptionHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(first, handler);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)first;
    (void)handler;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugBeep(uint32_t dwfreq, uint32_t dwduration) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Beep");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwfreq, dwduration);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwfreq;
    (void)dwduration;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugBindImage(void* imagename, void* dllpath, void* symbolpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagename, dllpath, symbolpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugBindImageEx(uint32_t flags, void* imagename, void* dllpath, void* symbolpath, void* statusroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BindImageEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, imagename, dllpath, symbolpath, statusroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)imagename;
    (void)dllpath;
    (void)symbolpath;
    (void)statusroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugCheckRemoteDebuggerPresent(void* hprocess, void* pbdebuggerpresent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckRemoteDebuggerPresent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pbdebuggerpresent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pbdebuggerpresent;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugCheckSumMappedFile(void* baseaddress, uint32_t filelength, void* headersum, void* checksum) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckSumMappedFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(baseaddress, filelength, headersum, checksum);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)baseaddress;
    (void)filelength;
    (void)headersum;
    (void)checksum;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugCloseThreadWaitChainSession(void* wcthandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadWaitChainSession");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(wcthandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)wcthandle;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugContinueDebugEvent(uint32_t dwprocessid, uint32_t dwthreadid, int32_t dwcontinuestatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ContinueDebugEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwprocessid, dwthreadid, dwcontinuestatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwprocessid;
    (void)dwthreadid;
    (void)dwcontinuestatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugCopyContext(void* destination, uint32_t contextflags, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(destination, contextflags, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)destination;
    (void)contextflags;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDump(void* filename, void* callback, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgHelpCreateUserDump");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, callback, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugDbgHelpCreateUserDumpW(void* filename, void* callback, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DbgHelpCreateUserDumpW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, callback, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)callback;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcess(uint32_t dwprocessid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugActiveProcess");
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugDebugActiveProcessStop(uint32_t dwprocessid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugActiveProcessStop");
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

void windowssysWindowsWin32SystemDiagnosticsDebugDebugBreak(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugBreak");
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugDebugBreakProcess(void* process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugBreakProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugDebugSetProcessKillOnExit(int32_t killonexit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DebugSetProcessKillOnExit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(killonexit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)killonexit;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugDecodePointer(void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodePointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugDecodeRemotePointer(void* processhandle, void* ptr, void* decodedptr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeRemotePointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, ptr, decodedptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)ptr;
    (void)decodedptr;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugDecodeSystemPointer(void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecodeSystemPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugEncodePointer(void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodePointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugEncodeRemotePointer(void* processhandle, void* ptr, void* encodedptr) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-util-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodeRemotePointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, ptr, encodedptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processhandle;
    (void)ptr;
    (void)encodedptr;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugEncodeSystemPointer(void* ptr) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncodeSystemPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptr);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ptr;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTree(void* hprocess, void* rootpath, void* inputpathname, void* outputpathbuffer, void* cb, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDirTree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, rootpath, inputpathname, outputpathbuffer, cb, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugEnumDirTreeW(void* hprocess, void* rootpath, void* inputpathname, void* outputpathbuffer, void* cb, void* data) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDirTreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, rootpath, inputpathname, outputpathbuffer, cb, data);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    (void)cb;
    (void)data;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModules64(void* hprocess, void* enumloadedmodulescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModules64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesEx(void* hprocess, void* enumloadedmodulescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesExW(void* hprocess, void* enumloadedmodulescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugEnumerateLoadedModulesW64(void* hprocess, void* enumloadedmodulescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateLoadedModulesW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, enumloadedmodulescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)enumloadedmodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitA(uint32_t uaction, void* lpmessagetext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalAppExitA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uaction, lpmessagetext);
        return;
    }
    errno = ENOSYS;
#else
    (void)uaction;
    (void)lpmessagetext;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugFatalAppExitW(uint32_t uaction, void* lpmessagetext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalAppExitW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(uaction, lpmessagetext);
        return;
    }
    errno = ENOSYS;
#else
    (void)uaction;
    (void)lpmessagetext;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugFatalExit(int32_t exitcode) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FatalExit");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(exitcode);
        return;
    }
    errno = ENOSYS;
#else
    (void)exitcode;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFile(void* filename, void* symbolpath, void* debugfilepath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, symbolpath, debugfilepath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileEx(void* filename, void* symbolpath, void* debugfilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, symbolpath, debugfilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugFindDebugInfoFileExW(void* filename, void* symbolpath, void* debugfilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindDebugInfoFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, symbolpath, debugfilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImage(void* filename, void* symbolpath, void* imagefilepath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, symbolpath, imagefilepath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageEx(void* filename, void* symbolpath, void* imagefilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImageEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, symbolpath, imagefilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugFindExecutableImageExW(void* filename, void* symbolpath, void* imagefilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableImageExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, symbolpath, imagefilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)symbolpath;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugFindFileInPath(void* hprocess, void* searchpatha, void* filename, void* id, uint32_t two, uint32_t three, uint32_t flags, void* filepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFileInPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha, filename, id, two, three, flags, filepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)filepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugFindFileInSearchPath(void* hprocess, void* searchpatha, void* filename, uint32_t one, uint32_t two, uint32_t three, void* filepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFileInSearchPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha, filename, one, two, three, filepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)one;
    (void)two;
    (void)three;
    (void)filepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugFlushInstructionCache(void* hprocess, void* lpbaseaddress, uint64_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushInstructionCache");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpbaseaddress, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageA(uint32_t dwflags, void* lpsource, uint32_t dwmessageid, uint32_t dwlanguageid, void* lpbuffer, uint32_t nsize, void* arguments) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatMessageA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpsource, dwmessageid, dwlanguageid, lpbuffer, nsize, arguments);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugFormatMessageW(uint32_t dwflags, void* lpsource, uint32_t dwmessageid, uint32_t dwlanguageid, void* lpbuffer, uint32_t nsize, void* arguments) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatMessageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpsource, dwmessageid, dwlanguageid, lpbuffer, nsize, arguments);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    (void)lpsource;
    (void)dwmessageid;
    (void)dwlanguageid;
    (void)lpbuffer;
    (void)nsize;
    (void)arguments;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWin32SystemDiagnosticsDebugGetEnabledXStateFeatures(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnabledXStateFeatures");
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

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugGetErrorMode(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetErrorMode");
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugGetImageConfigInformation(void* loadedimage, void* imageconfiginformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetImageConfigInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadedimage, imageconfiginformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugGetImageUnusedHeaderBytes(void* loadedimage, void* sizeunusedheaderbytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetImageUnusedHeaderBytes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadedimage, sizeunusedheaderbytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)loadedimage;
    (void)sizeunusedheaderbytes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugGetSymLoadError(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSymLoadError");
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugGetThreadContext(void* hthread, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugGetThreadErrorMode(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadErrorMode");
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugGetThreadSelectorEntry(void* hthread, uint32_t dwselector, void* lpselectorentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadSelectorEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, dwselector, lpselectorentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugGetThreadWaitChain(void* wcthandle, uint64_t context, uint32_t flags, uint32_t threadid, void* nodecount, void* nodeinfoarray, void* iscycle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadWaitChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wcthandle, context, flags, threadid, nodecount, nodeinfoarray, iscycle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wcthandle;
    (void)context;
    (void)flags;
    (void)threadid;
    (void)nodecount;
    (void)nodeinfoarray;
    (void)iscycle;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugGetTimestampForLoadedLibrary(void* module) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTimestampForLoadedLibrary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(module);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)module;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugGetXStateFeaturesMask(void* context, void* featuremask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetXStateFeaturesMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, featuremask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)featuremask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugImageAddCertificate(void* filehandle, void* certificate, void* arg2Index) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageAddCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, certificate, arg2Index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)certificate;
    (void)arg2Index;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToData(void* base, bool mappedasimage, uint16_t directoryentry, void* size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageDirectoryEntryToData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(base, mappedasimage, directoryentry, size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugImageDirectoryEntryToDataEx(void* base, bool mappedasimage, uint16_t directoryentry, void* size, void* foundheader) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageDirectoryEntryToDataEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(base, mappedasimage, directoryentry, size, foundheader);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)base;
    (void)mappedasimage;
    (void)directoryentry;
    (void)size;
    (void)foundheader;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugImageEnumerateCertificates(void* filehandle, uint16_t typefilter, void* certificatecount, void* indices, uint32_t indexcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageEnumerateCertificates");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, typefilter, certificatecount, indices, indexcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)typefilter;
    (void)certificatecount;
    (void)indices;
    (void)indexcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateData(void* filehandle, uint32_t certificateindex, void* certificate, void* requiredlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetCertificateData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, certificateindex, certificate, requiredlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificate;
    (void)requiredlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugImageGetCertificateHeader(void* filehandle, uint32_t certificateindex, void* certificateheader) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetCertificateHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, certificateindex, certificateheader);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)certificateindex;
    (void)certificateheader;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugImageGetDigestStream(void* filehandle, uint32_t digestlevel, void* digestfunction, void* digesthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageGetDigestStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, digestlevel, digestfunction, digesthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)digestlevel;
    (void)digestfunction;
    (void)digesthandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugImageLoad(void* dllname, void* dllpath) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageLoad");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dllname, dllpath);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dllname;
    (void)dllpath;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugImageNtHeader(void* base) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageNtHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(base);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)base;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugImageRemoveCertificate(void* filehandle, uint32_t arg1Index) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRemoveCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, arg1Index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)arg1Index;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToSection(void* ntheaders, void* base, uint32_t rva) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRvaToSection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ntheaders, base, rva);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugImageRvaToVa(void* ntheaders, void* base, uint32_t rva, void* lastrvasection) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageRvaToVa");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ntheaders, base, rva, lastrvasection);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ntheaders;
    (void)base;
    (void)rva;
    (void)lastrvasection;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugImageUnload(void* loadedimage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImageUnload");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadedimage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loadedimage;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersion(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImagehlpApiVersion");
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

void* windowssysWindowsWin32SystemDiagnosticsDebugImagehlpApiVersionEx(void* appversion) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImagehlpApiVersionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(appversion);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)appversion;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext(void* buffer, uint32_t contextflags, void* context, void* contextlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, contextflags, context, contextlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugInitializeContext2(void* buffer, uint32_t contextflags, void* context, void* contextlength, uint64_t xstatecompactionmask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeContext2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffer, contextflags, context, contextlength, xstatecompactionmask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)buffer;
    (void)contextflags;
    (void)context;
    (void)contextlength;
    (void)xstatecompactionmask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugIsDebuggerPresent(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDebuggerPresent");
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

void* windowssysWindowsWin32SystemDiagnosticsDebugLocateXStateFeature(void* context, uint32_t featureid, void* length) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocateXStateFeature");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, featureid, length);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)context;
    (void)featureid;
    (void)length;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugMakeSureDirectoryPathExists(void* dirpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSureDirectoryPathExists");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dirpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugMapAndLoad(void* imagename, void* dllpath, void* loadedimage, int32_t dotdll, int32_t readonly) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapAndLoad");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagename, dllpath, loadedimage, dotdll, readonly);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imagename;
    (void)dllpath;
    (void)loadedimage;
    (void)dotdll;
    (void)readonly;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumA(void* filename, void* headersum, void* checksum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapFileAndCheckSumA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, headersum, checksum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugMapFileAndCheckSumW(void* filename, void* headersum, void* checksum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapFileAndCheckSumW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, headersum, checksum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)filename;
    (void)headersum;
    (void)checksum;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugMessageBeep(uint32_t utype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MessageBeep");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(utype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)utype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpReadDumpStream(void* baseofdump, uint32_t streamnumber, void* dir, void* streampointer, void* streamsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MiniDumpReadDumpStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(baseofdump, streamnumber, dir, streampointer, streamsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)baseofdump;
    (void)streamnumber;
    (void)dir;
    (void)streampointer;
    (void)streamsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugMiniDumpWriteDump(void* hprocess, uint32_t processid, void* hfile, int32_t dumptype, void* exceptionparam, void* userstreamparam, void* callbackparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MiniDumpWriteDump");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, processid, hfile, dumptype, exceptionparam, userstreamparam, callbackparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)processid;
    (void)hfile;
    (void)dumptype;
    (void)exceptionparam;
    (void)userstreamparam;
    (void)callbackparam;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugOpenThreadWaitChainSession(uint32_t flags, void* callback) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThreadWaitChainSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, callback);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)flags;
    (void)callback;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringA(void* lpoutputstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OutputDebugStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpoutputstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpoutputstring;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugOutputDebugStringW(void* lpoutputstring) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OutputDebugStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpoutputstring);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpoutputstring;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRaiseException(uint32_t dwexceptioncode, uint32_t dwexceptionflags, uint32_t nnumberofarguments, void* lparguments) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseException");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dwexceptioncode, dwexceptionflags, nnumberofarguments, lparguments);
        return;
    }
    errno = ENOSYS;
#else
    (void)dwexceptioncode;
    (void)dwexceptionflags;
    (void)nnumberofarguments;
    (void)lparguments;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRaiseFailFastException(void* pexceptionrecord, void* pcontextrecord, uint32_t dwflags) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RaiseFailFastException");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pexceptionrecord, pcontextrecord, dwflags);
        return;
    }
    errno = ENOSYS;
#else
    (void)pexceptionrecord;
    (void)pcontextrecord;
    (void)dwflags;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugRangeMapAddPeImageSections(void* rmaphandle, void* imagename, void* mappedimage, uint32_t mappingbytes, uint64_t imagebase, uint64_t usertag, uint32_t mappingflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapAddPeImageSections");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rmaphandle, imagename, mappedimage, mappingbytes, imagebase, usertag, mappingflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rmaphandle;
    (void)imagename;
    (void)mappedimage;
    (void)mappingbytes;
    (void)imagebase;
    (void)usertag;
    (void)mappingflags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugRangeMapCreate(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapCreate");
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

void windowssysWindowsWin32SystemDiagnosticsDebugRangeMapFree(void* rmaphandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(rmaphandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)rmaphandle;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRead(void* rmaphandle, uint64_t offset, void* buffer, uint32_t requestbytes, uint32_t flags, void* donebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rmaphandle, offset, buffer, requestbytes, flags, donebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugRangeMapRemove(void* rmaphandle, uint64_t usertag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapRemove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rmaphandle, usertag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rmaphandle;
    (void)usertag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugRangeMapWrite(void* rmaphandle, uint64_t offset, void* buffer, uint32_t requestbytes, uint32_t flags, void* donebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RangeMapWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rmaphandle, offset, buffer, requestbytes, flags, donebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rmaphandle;
    (void)offset;
    (void)buffer;
    (void)requestbytes;
    (void)flags;
    (void)donebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage(void* currentimagename, void* symbolpath, int32_t frebase, int32_t frebasesysfileok, int32_t fgoingdown, uint32_t checkimagesize, void* oldimagesize, void* oldimagebase, void* newimagesize, void* newimagebase, uint32_t timestamp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReBaseImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currentimagename, symbolpath, frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currentimagename;
    (void)symbolpath;
    (void)frebase;
    (void)frebasesysfileok;
    (void)fgoingdown;
    (void)checkimagesize;
    (void)oldimagesize;
    (void)oldimagebase;
    (void)newimagesize;
    (void)newimagebase;
    (void)timestamp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugReBaseImage64(void* currentimagename, void* symbolpath, int32_t frebase, int32_t frebasesysfileok, int32_t fgoingdown, uint32_t checkimagesize, void* oldimagesize, void* oldimagebase, void* newimagesize, void* newimagebase, uint32_t timestamp) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReBaseImage64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(currentimagename, symbolpath, frebase, frebasesysfileok, fgoingdown, checkimagesize, oldimagesize, oldimagebase, newimagesize, newimagebase, timestamp);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)currentimagename;
    (void)symbolpath;
    (void)frebase;
    (void)frebasesysfileok;
    (void)fgoingdown;
    (void)checkimagesize;
    (void)oldimagesize;
    (void)oldimagebase;
    (void)newimagesize;
    (void)newimagebase;
    (void)timestamp;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugReadProcessMemory(void* hprocess, void* lpbaseaddress, void* lpbuffer, uint64_t nsize, void* lpnumberofbytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadProcessMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpbaseaddress, lpbuffer, nsize, lpnumberofbytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbytesread;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRegisterWaitChainCOMCallback(void* callstatecallback, void* activationstatecallback) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWaitChainCOMCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(callstatecallback, activationstatecallback);
        return;
    }
    errno = ENOSYS;
#else
    (void)callstatecallback;
    (void)activationstatecallback;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRemoveInvalidModuleList(void* hprocess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveInvalidModuleList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hprocess);
        return;
    }
    errno = ENOSYS;
#else
    (void)hprocess;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredContinueHandler(void* handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveVectoredContinueHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugRemoveVectoredExceptionHandler(void* handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveVectoredExceptionHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)handle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugReportSymbolLoadSummary(void* hprocess, void* ploadmodule, void* psymboldata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportSymbolLoadSummary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, ploadmodule, psymboldata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)ploadmodule;
    (void)psymboldata;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssysWindowsWin32SystemDiagnosticsDebugRtlAddFunctionTable(void* functiontable, uint32_t entrycount, uint64_t baseaddress) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddFunctionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(functiontable, entrycount, baseaddress);
    }
    errno = ENOSYS;
    return false;
#else
    (void)functiontable;
    (void)entrycount;
    (void)baseaddress;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugRtlAddGrowableFunctionTable(void* dynamictable, void* functiontable, uint32_t entrycount, uint32_t maximumentrycount, uint64_t rangebase, uint64_t rangeend) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddGrowableFunctionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dynamictable, functiontable, entrycount, maximumentrycount, rangebase, rangeend);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dynamictable;
    (void)functiontable;
    (void)entrycount;
    (void)maximumentrycount;
    (void)rangebase;
    (void)rangeend;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext(void* contextrecord) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(contextrecord);
        return;
    }
    errno = ENOSYS;
#else
    (void)contextrecord;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureContext2(void* contextrecord) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureContext2");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(contextrecord);
        return;
    }
    errno = ENOSYS;
#else
    (void)contextrecord;
    errno = ENOSYS;
#endif
}

uint16_t windowssysWindowsWin32SystemDiagnosticsDebugRtlCaptureStackBackTrace(uint32_t framestoskip, uint32_t framestocapture, void* backtrace, void* backtracehash) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCaptureStackBackTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(framestoskip, framestocapture, backtrace, backtracehash);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)framestoskip;
    (void)framestocapture;
    (void)backtrace;
    (void)backtracehash;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteFunctionTable(void* functiontable) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteFunctionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(functiontable);
    }
    errno = ENOSYS;
    return false;
#else
    (void)functiontable;
    errno = ENOSYS;
    return false;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlDeleteGrowableFunctionTable(void* dynamictable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteGrowableFunctionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dynamictable);
        return;
    }
    errno = ENOSYS;
#else
    (void)dynamictable;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlGrowFunctionTable(void* dynamictable, uint32_t newentrycount) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGrowFunctionTable");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(dynamictable, newentrycount);
        return;
    }
    errno = ENOSYS;
#else
    (void)dynamictable;
    (void)newentrycount;
    errno = ENOSYS;
#endif
}

bool windowssysWindowsWin32SystemDiagnosticsDebugRtlInstallFunctionTableCallback(uint64_t tableidentifier, uint64_t baseaddress, uint32_t length, void* callback, void* context, void* outofprocesscallbackdll) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInstallFunctionTableCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tableidentifier, baseaddress, length, callback, context, outofprocesscallbackdll);
    }
    errno = ENOSYS;
    return false;
#else
    (void)tableidentifier;
    (void)baseaddress;
    (void)length;
    (void)callback;
    (void)context;
    (void)outofprocesscallbackdll;
    errno = ENOSYS;
    return false;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugRtlLookupFunctionEntry(uint64_t controlpc, void* imagebase, void* historytable) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLookupFunctionEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(controlpc, imagebase, historytable);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)controlpc;
    (void)imagebase;
    (void)historytable;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugRtlPcToFileHeader(void* pcvalue, void* baseofimage) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPcToFileHeader");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcvalue, baseofimage);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pcvalue;
    (void)baseofimage;
    errno = ENOSYS;
    return NULL;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlRaiseException(void* exceptionrecord) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRaiseException");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(exceptionrecord);
        return;
    }
    errno = ENOSYS;
#else
    (void)exceptionrecord;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlRestoreContext(void* contextrecord, void* exceptionrecord) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRestoreContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(contextrecord, exceptionrecord);
        return;
    }
    errno = ENOSYS;
#else
    (void)contextrecord;
    (void)exceptionrecord;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwind(void* targetframe, void* targetip, void* exceptionrecord, void* returnvalue) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnwind");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(targetframe, targetip, exceptionrecord, returnvalue);
        return;
    }
    errno = ENOSYS;
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
    errno = ENOSYS;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugRtlUnwindEx(void* targetframe, void* targetip, void* exceptionrecord, void* returnvalue, void* contextrecord, void* historytable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnwindEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(targetframe, targetip, exceptionrecord, returnvalue, contextrecord, historytable);
        return;
    }
    errno = ENOSYS;
#else
    (void)targetframe;
    (void)targetip;
    (void)exceptionrecord;
    (void)returnvalue;
    (void)contextrecord;
    (void)historytable;
    errno = ENOSYS;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugRtlVirtualUnwind(uint32_t handlertype, uint64_t imagebase, uint64_t controlpc, void* functionentry, void* contextrecord, void* handlerdata, void* establisherframe, void* contextpointers) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlVirtualUnwind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handlertype, imagebase, controlpc, functionentry, contextrecord, handlerdata, establisherframe, contextpointers);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)handlertype;
    (void)imagebase;
    (void)controlpc;
    (void)functionentry;
    (void)contextrecord;
    (void)handlerdata;
    (void)establisherframe;
    (void)contextpointers;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFile(void* rootpath, void* inputpathname, void* outputpathbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchTreeForFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpath, inputpathname, outputpathbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSearchTreeForFileW(void* rootpath, void* inputpathname, void* outputpathbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchTreeForFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpath, inputpathname, outputpathbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rootpath;
    (void)inputpathname;
    (void)outputpathbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugSetCheckUserInterruptShared(void* lpstartaddress) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCheckUserInterruptShared");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpstartaddress);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpstartaddress;
    errno = ENOSYS;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugSetErrorMode(uint32_t umode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetErrorMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(umode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)umode;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSetImageConfigInformation(void* loadedimage, void* imageconfiginformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetImageConfigInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadedimage, imageconfiginformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loadedimage;
    (void)imageconfiginformation;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugSetSymLoadError(uint32_t error) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSymLoadError");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(error);
        return;
    }
    errno = ENOSYS;
#else
    (void)error;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSetThreadContext(void* hthread, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSetThreadErrorMode(uint32_t dwnewmode, void* lpoldmode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadErrorMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwnewmode, lpoldmode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwnewmode;
    (void)lpoldmode;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSetUnhandledExceptionFilter(void* lptoplevelexceptionfilter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUnhandledExceptionFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptoplevelexceptionfilter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lptoplevelexceptionfilter;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSetXStateFeaturesMask(void* context, uint64_t featuremask) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetXStateFeaturesMask");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, featuremask);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)featuremask;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugStackWalk2(uint32_t machinetype, void* hprocess, void* hthread, void* stackframe, void* contextrecord, void* readmemoryroutine, void* functiontableaccessroutine, void* getmodulebaseroutine, void* translateaddress, void* gettargetattributevalue, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalk2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machinetype, hprocess, hthread, stackframe, contextrecord, readmemoryroutine, functiontableaccessroutine, getmodulebaseroutine, translateaddress, gettargetattributevalue, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    (void)gettargetattributevalue;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugStackWalk64(uint32_t machinetype, void* hprocess, void* hthread, void* stackframe, void* contextrecord, void* readmemoryroutine, void* functiontableaccessroutine, void* getmodulebaseroutine, void* translateaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalk64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machinetype, hprocess, hthread, stackframe, contextrecord, readmemoryroutine, functiontableaccessroutine, getmodulebaseroutine, translateaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugStackWalkEx(uint32_t machinetype, void* hprocess, void* hthread, void* stackframe, void* contextrecord, void* readmemoryroutine, void* functiontableaccessroutine, void* getmodulebaseroutine, void* translateaddress, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StackWalkEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(machinetype, hprocess, hthread, stackframe, contextrecord, readmemoryroutine, functiontableaccessroutine, getmodulebaseroutine, translateaddress, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)machinetype;
    (void)hprocess;
    (void)hthread;
    (void)stackframe;
    (void)contextrecord;
    (void)readmemoryroutine;
    (void)functiontableaccessroutine;
    (void)getmodulebaseroutine;
    (void)translateaddress;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStream(void* hprocess, uint64_t base, void* streamfile, void* buffer, uint64_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStream");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, streamfile, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamA(void* hprocess, uint64_t base, void* streamfile, void* buffer, uint64_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStreamA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, streamfile, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)streamfile;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymAddSourceStreamW(void* hprocess, uint64_t base, void* filespec, void* buffer, uint64_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSourceStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, filespec, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbol(void* hprocess, uint64_t baseofdll, void* name, uint64_t address, uint32_t size, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSymbol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, name, address, size, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymAddSymbolW(void* hprocess, uint64_t baseofdll, void* name, uint64_t address, uint32_t size, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddSymbolW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, name, address, size, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugSymAddrIncludeInlineTrace(void* hprocess, uint64_t address) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymAddrIncludeInlineTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)address;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymCleanup(void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymCleanup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugSymCompareInlineTrace(void* hprocess, uint64_t address1, uint32_t inlinecontext1, uint64_t retaddress1, uint64_t address2, uint64_t retaddress2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymCompareInlineTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address1, inlinecontext1, retaddress1, address2, retaddress2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)address1;
    (void)inlinecontext1;
    (void)retaddress1;
    (void)address2;
    (void)retaddress2;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbol(void* hprocess, uint64_t baseofdll, void* name, uint64_t address, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymDeleteSymbol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, name, address, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymDeleteSymbolW(void* hprocess, uint64_t baseofdll, void* name, uint64_t address, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymDeleteSymbolW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, name, address, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)address;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLines(void* hprocess, uint64_t base, void* obj, void* file, void* enumlinescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumLines");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, obj, file, enumlinescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumLinesW(void* hprocess, uint64_t base, void* obj, void* file, void* enumlinescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumLinesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, obj, file, enumlinescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumProcesses(void* enumprocessescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumProcesses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enumprocessescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enumprocessescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFileTokens(void* hprocess, uint64_t base, void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFileTokens");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFiles(void* hprocess, uint64_t modbase, void* mask, void* cbsrcfiles, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, modbase, mask, cbsrcfiles, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceFilesW(void* hprocess, uint64_t modbase, void* mask, void* cbsrcfiles, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceFilesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, modbase, mask, cbsrcfiles, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)mask;
    (void)cbsrcfiles;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLines(void* hprocess, uint64_t base, void* obj, void* file, uint32_t line, uint32_t flags, void* enumlinescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceLines");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, obj, file, line, flags, enumlinescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSourceLinesW(void* hprocess, uint64_t base, void* obj, void* file, uint32_t line, uint32_t flags, void* enumlinescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSourceLinesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, obj, file, line, flags, enumlinescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)obj;
    (void)file;
    (void)line;
    (void)flags;
    (void)enumlinescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSym(void* hprocess, uint64_t baseofdll, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSym");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbols(void* hprocess, uint64_t baseofdll, void* mask, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbols");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsEx(void* hprocess, uint64_t baseofdll, void* mask, void* enumsymbolscallback, void* usercontext, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsExW(void* hprocess, uint64_t baseofdll, void* mask, void* enumsymbolscallback, void* usercontext, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddr(void* hprocess, uint64_t address, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsForAddr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsForAddrW(void* hprocess, uint64_t address, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsForAddrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumSymbolsW(void* hprocess, uint64_t baseofdll, void* mask, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumSymbolsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypes(void* hprocess, uint64_t baseofdll, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByName(void* hprocess, uint64_t baseofdll, void* mask, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesByNameW(void* hprocess, uint64_t baseofdll, void* mask, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesByNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, mask, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)mask;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumTypesW(void* hprocess, uint64_t baseofdll, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumTypesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModules64(void* hprocess, void* enummodulescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateModules64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, enummodulescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateModulesW64(void* hprocess, void* enummodulescallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateModulesW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, enummodulescallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)enummodulescallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbols64(void* hprocess, uint64_t baseofdll, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateSymbols64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymEnumerateSymbolsW64(void* hprocess, uint64_t baseofdll, void* enumsymbolscallback, void* usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymEnumerateSymbolsW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, enumsymbolscallback, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)enumsymbolscallback;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFile(void* hprocess, void* filename, void* debugfilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindDebugInfoFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, filename, debugfilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymFindDebugInfoFileW(void* hprocess, void* filename, void* debugfilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindDebugInfoFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, filename, debugfilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)debugfilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImage(void* hprocess, void* filename, void* imagefilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindExecutableImage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, filename, imagefilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymFindExecutableImageW(void* hprocess, void* filename, void* imagefilepath, void* callback, void* callerdata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindExecutableImageW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, filename, imagefilepath, callback, callerdata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)filename;
    (void)imagefilepath;
    (void)callback;
    (void)callerdata;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPath(void* hprocess, void* searchpatha, void* filename, void* id, uint32_t two, uint32_t three, uint32_t flags, void* foundfile, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindFileInPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha, filename, id, two, three, flags, foundfile, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)foundfile;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFindFileInPathW(void* hprocess, void* searchpatha, void* filename, void* id, uint32_t two, uint32_t three, uint32_t flags, void* foundfile, void* callback, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFindFileInPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha, filename, id, two, three, flags, foundfile, callback, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)filename;
    (void)id;
    (void)two;
    (void)three;
    (void)flags;
    (void)foundfile;
    (void)callback;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddr(void* hprocess, uint64_t address, void* displacement, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromAddr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, displacement, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromAddrW(void* hprocess, uint64_t address, void* displacement, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromAddrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, displacement, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndex(void* hprocess, uint64_t baseofdll, uint32_t arg2Index, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, arg2Index, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromIndexW(void* hprocess, uint64_t baseofdll, uint32_t arg2Index, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, arg2Index, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContext(void* hprocess, uint64_t address, uint32_t inlinecontext, void* displacement, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromInlineContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, inlinecontext, displacement, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromInlineContextW(void* hprocess, uint64_t address, uint32_t inlinecontext, void* displacement, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromInlineContextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, inlinecontext, displacement, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    (void)displacement;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromName(void* hprocess, void* name, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, name, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromNameW(void* hprocess, void* name, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, name, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromToken(void* hprocess, uint64_t base, uint32_t token, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, token, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymFromTokenW(void* hprocess, uint64_t base, uint32_t token, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFromTokenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, token, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)token;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64(void* hprocess, uint64_t addrbase) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFunctionTableAccess64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, addrbase);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)addrbase;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymFunctionTableAccess64AccessRoutines(void* hprocess, uint64_t addrbase, void* readmemoryroutine, void* getmodulebaseroutine) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymFunctionTableAccess64AccessRoutines");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, addrbase, readmemoryroutine, getmodulebaseroutine);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)addrbase;
    (void)readmemoryroutine;
    (void)getmodulebaseroutine;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetExtendedOption(int32_t option) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetExtendedOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(option);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)option;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetFileLineOffsets64(void* hprocess, void* modulename, void* filename, void* buffer, uint32_t bufferlines) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetFileLineOffsets64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, modulename, filename, buffer, bufferlines);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)buffer;
    (void)bufferlines;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectory(uint32_t type, void* dir, uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetHomeDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, dir, size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)type;
    (void)dir;
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymGetHomeDirectoryW(uint32_t type, void* dir, uint64_t size) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetHomeDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(type, dir, size);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)type;
    (void)dir;
    (void)size;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddr64(void* hprocess, uint64_t qwaddr, void* pdwdisplacement, void* line64) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromAddr64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, qwaddr, pdwdisplacement, line64);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)line64;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromAddrW64(void* hprocess, uint64_t dwaddr, void* pdwdisplacement, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromAddrW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwaddr, pdwdisplacement, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwaddr;
    (void)pdwdisplacement;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContext(void* hprocess, uint64_t qwaddr, uint32_t inlinecontext, uint64_t qwmodulebaseaddress, void* pdwdisplacement, void* line64) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromInlineContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, qwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement, line64);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line64;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromInlineContextW(void* hprocess, uint64_t dwaddr, uint32_t inlinecontext, uint64_t qwmodulebaseaddress, void* pdwdisplacement, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromInlineContextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dwaddr, inlinecontext, qwmodulebaseaddress, pdwdisplacement, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)dwaddr;
    (void)inlinecontext;
    (void)qwmodulebaseaddress;
    (void)pdwdisplacement;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromName64(void* hprocess, void* modulename, void* filename, uint32_t dwlinenumber, void* pldisplacement, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromName64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, modulename, filename, dwlinenumber, pldisplacement, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineFromNameW64(void* hprocess, void* modulename, void* filename, uint32_t dwlinenumber, void* pldisplacement, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineFromNameW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, modulename, filename, dwlinenumber, pldisplacement, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)modulename;
    (void)filename;
    (void)dwlinenumber;
    (void)pldisplacement;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNext64(void* hprocess, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineNext64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLineNextW64(void* hprocess, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLineNextW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrev64(void* hprocess, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLinePrev64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetLinePrevW64(void* hprocess, void* line) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetLinePrevW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, line);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)line;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleBase64(void* hprocess, uint64_t qwaddr) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleBase64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, qwaddr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)qwaddr;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfo64(void* hprocess, uint64_t qwaddr, void* moduleinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleInfo64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, qwaddr, moduleinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetModuleInfoW64(void* hprocess, uint64_t qwaddr, void* moduleinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetModuleInfoW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, qwaddr, moduleinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)moduleinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetOmaps(void* hprocess, uint64_t baseofdll, void* omapto, void* comapto, void* omapfrom, void* comapfrom) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetOmaps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, omapto, comapto, omapfrom, comapfrom);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)omapto;
    (void)comapto;
    (void)omapfrom;
    (void)comapfrom;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetOptions(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetOptions");
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetScope(void* hprocess, uint64_t baseofdll, uint32_t arg2Index, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetScope");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, arg2Index, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetScopeW(void* hprocess, uint64_t baseofdll, uint32_t arg2Index, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetScopeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, arg2Index, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPath(void* hprocess, void* searchpatha, uint32_t searchpathlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSearchPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha, searchpathlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSearchPathW(void* hprocess, void* searchpatha, uint32_t searchpathlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSearchPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha, searchpathlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    (void)searchpathlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFile(void* hprocess, uint64_t base, void* params, void* filespec, void* filepath, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, params, filespec, filepath, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksum(void* hprocess, uint64_t base, void* filespec, void* pchecksumtype, void* pchecksum, uint32_t checksumsize, void* pactualbyteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileChecksum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, filespec, pchecksumtype, pchecksum, checksumsize, pactualbyteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileChecksumW(void* hprocess, uint64_t base, void* filespec, void* pchecksumtype, void* pchecksum, uint32_t checksumsize, void* pactualbyteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileChecksumW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, filespec, pchecksumtype, pchecksum, checksumsize, pactualbyteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)pchecksumtype;
    (void)pchecksum;
    (void)checksumsize;
    (void)pactualbyteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromToken(void* hprocess, void* token, void* params, void* filepath, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, token, params, filepath, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenName(void* hprocess, void* token, void* tokenname, void* params, void* filepath, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, token, tokenname, params, filepath, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenByTokenNameW(void* hprocess, void* token, void* tokenname, void* params, void* filepath, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenByTokenNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, token, tokenname, params, filepath, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)token;
    (void)tokenname;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileFromTokenW(void* hprocess, void* token, void* params, void* filepath, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileFromTokenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, token, params, filepath, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileToken(void* hprocess, uint64_t base, void* filespec, void* token, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, filespec, token, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenName(void* hprocess, uint64_t base, void* filespec, void* tokenname, void* tokenparameters, void* token, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, filespec, tokenname, tokenparameters, token, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenByTokenNameW(void* hprocess, uint64_t base, void* filespec, void* tokenname, void* tokenparameters, void* token, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenByTokenNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, filespec, tokenname, tokenparameters, token, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)tokenname;
    (void)tokenparameters;
    (void)token;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileTokenW(void* hprocess, uint64_t base, void* filespec, void* token, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileTokenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, filespec, token, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)filespec;
    (void)token;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceFileW(void* hprocess, uint64_t base, void* params, void* filespec, void* filepath, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, base, params, filespec, filepath, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)base;
    (void)params;
    (void)filespec;
    (void)filepath;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromToken(void* hprocess, void* token, void* params, void* varname, void* value, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceVarFromToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, token, params, varname, value, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSourceVarFromTokenW(void* hprocess, void* token, void* params, void* varname, void* value, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSourceVarFromTokenW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, token, params, varname, value, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)token;
    (void)params;
    (void)varname;
    (void)value;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromAddr64(void* hprocess, uint64_t qwaddr, void* pdwdisplacement, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymFromAddr64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, qwaddr, pdwdisplacement, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)qwaddr;
    (void)pdwdisplacement;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymFromName64(void* hprocess, void* name, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymFromName64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, name, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymNext64(void* hprocess, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymNext64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymPrev64(void* hprocess, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymPrev64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFile(void* hprocess, void* sympath, void* imagefile, uint32_t type, void* symbolfile, uint64_t csymbolfile, void* dbgfile, uint64_t cdbgfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymbolFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, sympath, imagefile, type, symbolfile, csymbolfile, dbgfile, cdbgfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetSymbolFileW(void* hprocess, void* sympath, void* imagefile, uint32_t type, void* symbolfile, uint64_t csymbolfile, void* dbgfile, uint64_t cdbgfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetSymbolFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, sympath, imagefile, type, symbolfile, csymbolfile, dbgfile, cdbgfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)sympath;
    (void)imagefile;
    (void)type;
    (void)symbolfile;
    (void)csymbolfile;
    (void)dbgfile;
    (void)cdbgfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromName(void* hprocess, uint64_t baseofdll, void* name, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, name, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeFromNameW(void* hprocess, uint64_t baseofdll, void* name, void* symbol) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeFromNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, name, symbol);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)name;
    (void)symbol;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfo(void* hprocess, uint64_t modbase, uint32_t arg2Typeid, int32_t gettype, void* pinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, modbase, arg2Typeid, gettype, pinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)arg2Typeid;
    (void)gettype;
    (void)pinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetTypeInfoEx(void* hprocess, uint64_t modbase, void* params) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetTypeInfoEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, modbase, params);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)modbase;
    (void)params;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymGetUnwindInfo(void* hprocess, uint64_t address, void* buffer, void* size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymGetUnwindInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, buffer, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)buffer;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymInitialize(void* hprocess, void* usersearchpath, int32_t finvadeprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, usersearchpath, finvadeprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymInitializeW(void* hprocess, void* usersearchpath, int32_t finvadeprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymInitializeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, usersearchpath, finvadeprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)usersearchpath;
    (void)finvadeprocess;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModule64(void* hprocess, void* hfile, void* imagename, void* modulename, uint64_t baseofdll, uint32_t sizeofdll) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModule64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hfile, imagename, modulename, baseofdll, sizeofdll);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)sizeofdll;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleEx(void* hprocess, void* hfile, void* imagename, void* modulename, uint64_t baseofdll, uint32_t dllsize, void* data, uint32_t flags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModuleEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hfile, imagename, modulename, baseofdll, dllsize, data, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint64_t windowssysWindowsWin32SystemDiagnosticsDebugSymLoadModuleExW(void* hprocess, void* hfile, void* imagename, void* modulename, uint64_t baseofdll, uint32_t dllsize, void* data, uint32_t flags) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymLoadModuleExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, hfile, imagename, modulename, baseofdll, dllsize, data, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)hfile;
    (void)imagename;
    (void)modulename;
    (void)baseofdll;
    (void)dllsize;
    (void)data;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileName(void* filename, void* match, void* filenamestop, void* matchstop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchFileName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, match, filenamestop, matchstop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymMatchFileNameW(void* filename, void* match, void* filenamestop, void* matchstop) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, match, filenamestop, matchstop);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)match;
    (void)filenamestop;
    (void)matchstop;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymMatchString(void* string, void* expression, int32_t fcase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, expression, fcase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringA(void* string, void* expression, int32_t fcase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, expression, fcase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymMatchStringW(void* string, void* expression, int32_t fcase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymMatchStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(string, expression, fcase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)string;
    (void)expression;
    (void)fcase;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymNext(void* hprocess, void* si) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymNext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, si);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)si;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymNextW(void* hprocess, void* siw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymNextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, siw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)siw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymPrev(void* hprocess, void* si) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymPrev");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, si);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)si;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymPrevW(void* hprocess, void* siw) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymPrevW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, siw);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)siw;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymQueryInlineTrace(void* hprocess, uint64_t startaddress, uint32_t startcontext, uint64_t startretaddress, uint64_t curaddress, void* curcontext, void* curframeindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymQueryInlineTrace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, startaddress, startcontext, startretaddress, curaddress, curcontext, curframeindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)startaddress;
    (void)startcontext;
    (void)startretaddress;
    (void)curaddress;
    (void)curcontext;
    (void)curframeindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymRefreshModuleList(void* hprocess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRefreshModuleList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallback64(void* hprocess, void* callbackfunction, uint64_t usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterCallback64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, callbackfunction, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterCallbackW64(void* hprocess, void* callbackfunction, uint64_t usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterCallbackW64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, callbackfunction, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymRegisterFunctionEntryCallback64(void* hprocess, void* callbackfunction, uint64_t usercontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymRegisterFunctionEntryCallback64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, callbackfunction, usercontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)callbackfunction;
    (void)usercontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSearch(void* hprocess, uint64_t baseofdll, uint32_t arg2Index, uint32_t symtag, void* mask, uint64_t address, void* enumsymbolscallback, void* usercontext, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSearch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, arg2Index, symtag, mask, address, enumsymbolscallback, usercontext, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSearchW(void* hprocess, uint64_t baseofdll, uint32_t arg2Index, uint32_t symtag, void* mask, uint64_t address, void* enumsymbolscallback, void* usercontext, uint32_t options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSearchW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, arg2Index, symtag, mask, address, enumsymbolscallback, usercontext, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    (void)symtag;
    (void)mask;
    (void)address;
    (void)enumsymbolscallback;
    (void)usercontext;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetContext(void* hprocess, void* stackframe, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, stackframe, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)stackframe;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetExtendedOption(int32_t option, int32_t value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetExtendedOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(option, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)option;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectory(void* hprocess, void* dir) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetHomeDirectory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dir);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)dir;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSetHomeDirectoryW(void* hprocess, void* dir) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetHomeDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, dir);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)dir;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetOptions(uint32_t symoptions) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(symoptions);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)symoptions;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetParentWindow(void* hwnd) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetParentWindow");
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

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromAddr(void* hprocess, uint64_t address) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromAddr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromIndex(void* hprocess, uint64_t baseofdll, uint32_t arg2Index) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll, arg2Index);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    (void)arg2Index;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetScopeFromInlineContext(void* hprocess, uint64_t address, uint32_t inlinecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetScopeFromInlineContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, address, inlinecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)address;
    (void)inlinecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPath(void* hprocess, void* searchpatha) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetSearchPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSetSearchPathW(void* hprocess, void* searchpatha) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSetSearchPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, searchpatha);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)searchpatha;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaName(void* hprocess, void* sympath, void* type, void* file1, void* file2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvDeltaName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, sympath, type, file1, file2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvDeltaNameW(void* hprocess, void* sympath, void* type, void* file1, void* file2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvDeltaNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, sympath, type, file1, file2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)type;
    (void)file1;
    (void)file2;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfo(void* file, void* info, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, info, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)file;
    (void)info;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexInfoW(void* file, void* info, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, info, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)file;
    (void)info;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexString(void* hprocess, void* srvpath, void* file, void* arg3Index, uint64_t size, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, srvpath, file, arg3Index, size, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg3Index;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexStringW(void* hprocess, void* srvpath, void* file, void* arg3Index, uint64_t size, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, srvpath, file, arg3Index, size, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)arg3Index;
    (void)size;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexes(void* file, void* id, void* val1, void* val2, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, id, val1, val2, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetFileIndexesW(void* file, void* id, void* val1, void* val2, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetFileIndexesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, id, val1, val2, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)file;
    (void)id;
    (void)val1;
    (void)val2;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplement(void* hprocess, void* sympath, void* node, void* file) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetSupplement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, sympath, node, file);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvGetSupplementW(void* hprocess, void* sympath, void* node, void* file) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvGetSupplementW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, sympath, node, file);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStore(void* hprocess, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvIsStore");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymSrvIsStoreW(void* hprocess, void* path) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvIsStoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, path);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)path;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFile(void* hprocess, void* srvpath, void* file, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, srvpath, file, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreFileW(void* hprocess, void* srvpath, void* file, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, srvpath, file, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplement(void* hprocess, void* srvpath, void* node, void* file, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreSupplement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, srvpath, node, file, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)srvpath;
    (void)node;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemDiagnosticsDebugSymSrvStoreSupplementW(void* hprocess, void* sympath, void* node, void* file, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymSrvStoreSupplementW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, sympath, node, file, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hprocess;
    (void)sympath;
    (void)node;
    (void)file;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymUnDName64(void* sym, void* undecname, uint32_t undecnamelength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymUnDName64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sym, undecname, undecnamelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sym;
    (void)undecname;
    (void)undecnamelength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugSymUnloadModule64(void* hprocess, uint64_t baseofdll) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SymUnloadModule64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, baseofdll);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)baseofdll;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemDiagnosticsDebugTerminateProcessOnMemoryExhaustion(uint64_t failedallocationsize) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-errorhandling-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateProcessOnMemoryExhaustion");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(failedallocationsize);
        return;
    }
    errno = ENOSYS;
#else
    (void)failedallocationsize;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugTouchFileTimes(void* filehandle, void* psystemtime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TouchFileTimes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, psystemtime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)psystemtime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolName(void* name, void* outputstring, uint32_t maxstringlength, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnDecorateSymbolName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, outputstring, maxstringlength, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssysWindowsWin32SystemDiagnosticsDebugUnDecorateSymbolNameW(void* name, void* outputstring, uint32_t maxstringlength, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dbghelp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnDecorateSymbolNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(name, outputstring, maxstringlength, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)name;
    (void)outputstring;
    (void)maxstringlength;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugUnMapAndLoad(void* loadedimage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnMapAndLoad");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadedimage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loadedimage;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugUnhandledExceptionFilter(void* exceptioninfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnhandledExceptionFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(exceptioninfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)exceptioninfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFile(void* imagefilename, void* symbolpath, void* debugfilepath, void* ntheaders) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDebugInfoFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagefilename, symbolpath, debugfilepath, ntheaders);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugUpdateDebugInfoFileEx(void* imagefilename, void* symbolpath, void* debugfilepath, void* ntheaders, uint32_t oldchecksum) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("imagehlp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDebugInfoFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(imagefilename, symbolpath, debugfilepath, ntheaders, oldchecksum);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)imagefilename;
    (void)symbolpath;
    (void)debugfilepath;
    (void)ntheaders;
    (void)oldchecksum;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEvent(void* lpdebugevent, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForDebugEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdebugevent, dwmilliseconds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugWaitForDebugEventEx(void* lpdebugevent, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForDebugEventEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdebugevent, dwmilliseconds);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdebugevent;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadContext(void* hthread, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64GetThreadContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugWow64GetThreadSelectorEntry(void* hthread, uint32_t dwselector, void* lpselectorentry) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64GetThreadSelectorEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, dwselector, lpselectorentry);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)dwselector;
    (void)lpselectorentry;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugWow64SetThreadContext(void* hthread, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64SetThreadContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hthread, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hthread;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemDiagnosticsDebugWriteProcessMemory(void* hprocess, void* lpbaseaddress, void* lpbuffer, uint64_t nsize, void* lpnumberofbyteswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteProcessMemory");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, lpbaseaddress, lpbuffer, nsize, lpnumberofbyteswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)lpbaseaddress;
    (void)lpbuffer;
    (void)nsize;
    (void)lpnumberofbyteswritten;
    errno = ENOSYS;
    return -1;
#endif
}

