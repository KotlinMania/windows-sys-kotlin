#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_remotemanagement_wrapper.h"
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

void windowssys_windows_win32_system_remotemanagement_WSManCloseCommand(int64_t commandhandle, uint32_t flags, void* async) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(commandhandle, flags, async);
        return;
    }
    errno = ENOSYS;
#else
    (void)commandhandle;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManCloseOperation(int64_t operationhandle, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operationhandle, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)operationhandle;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManCloseSession(int64_t session, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManCloseShell(int64_t shellhandle, uint32_t flags, void* async) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCloseShell");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shellhandle, flags, async);
        return;
    }
    errno = ENOSYS;
#else
    (void)shellhandle;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManConnectShell(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* options, void* connectxml, void* async, void* shell) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManConnectShell");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(session, flags, resourceuri, shellid, options, connectxml, async, shell);
        return;
    }
    errno = ENOSYS;
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)shellid;
    (void)options;
    (void)connectxml;
    (void)async;
    (void)shell;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManConnectShellCommand(int64_t shell, uint32_t flags, void* commandid, void* options, void* connectxml, void* async, void* command) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManConnectShellCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, flags, commandid, options, connectxml, async, command);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)flags;
    (void)commandid;
    (void)options;
    (void)connectxml;
    (void)async;
    (void)command;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManCreateSession(int64_t apihandle, void* connection, uint32_t flags, void* serverauthenticationcredentials, void* proxyinfo, void* session) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCreateSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(apihandle, connection, flags, serverauthenticationcredentials, proxyinfo, session);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)apihandle;
    (void)connection;
    (void)flags;
    (void)serverauthenticationcredentials;
    (void)proxyinfo;
    (void)session;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManCreateShell(int64_t session, uint32_t flags, void* resourceuri, void* startupinfo, void* options, void* createxml, void* async, void* shell) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCreateShell");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(session, flags, resourceuri, startupinfo, options, createxml, async, shell);
        return;
    }
    errno = ENOSYS;
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)startupinfo;
    (void)options;
    (void)createxml;
    (void)async;
    (void)shell;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManCreateShellEx(int64_t session, uint32_t flags, void* resourceuri, void* shellid, void* startupinfo, void* options, void* createxml, void* async, void* shell) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManCreateShellEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(session, flags, resourceuri, shellid, startupinfo, options, createxml, async, shell);
        return;
    }
    errno = ENOSYS;
#else
    (void)session;
    (void)flags;
    (void)resourceuri;
    (void)shellid;
    (void)startupinfo;
    (void)options;
    (void)createxml;
    (void)async;
    (void)shell;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManDeinitialize(int64_t apihandle, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManDeinitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(apihandle, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)apihandle;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManDisconnectShell(int64_t shell, uint32_t flags, void* disconnectinfo, void* async) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManDisconnectShell");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, flags, disconnectinfo, async);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)flags;
    (void)disconnectinfo;
    (void)async;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManGetErrorMessage(int64_t apihandle, uint32_t flags, void* languagecode, uint32_t errorcode, uint32_t messagelength, void* message, void* messagelengthused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManGetErrorMessage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(apihandle, flags, languagecode, errorcode, messagelength, message, messagelengthused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)apihandle;
    (void)flags;
    (void)languagecode;
    (void)errorcode;
    (void)messagelength;
    (void)message;
    (void)messagelengthused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsDword(int64_t session, int32_t option, void* value) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManGetSessionOptionAsDword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, option, value);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)option;
    (void)value;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManGetSessionOptionAsString(int64_t session, int32_t option, uint32_t stringlength, void* string, void* stringlengthused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManGetSessionOptionAsString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, option, stringlength, string, stringlengthused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)option;
    (void)stringlength;
    (void)string;
    (void)stringlengthused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManInitialize(uint32_t flags, void* apihandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManInitialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, apihandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)apihandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzOperationComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, uint32_t errorcode, void* extendederrorinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginAuthzOperationComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(senderdetails, flags, userauthorizationcontext, errorcode, extendederrorinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)senderdetails;
    (void)flags;
    (void)userauthorizationcontext;
    (void)errorcode;
    (void)extendederrorinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzQueryQuotaComplete(void* senderdetails, uint32_t flags, void* quota, uint32_t errorcode, void* extendederrorinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginAuthzQueryQuotaComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(senderdetails, flags, quota, errorcode, extendederrorinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)senderdetails;
    (void)flags;
    (void)quota;
    (void)errorcode;
    (void)extendederrorinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginAuthzUserComplete(void* senderdetails, uint32_t flags, void* userauthorizationcontext, void* impersonationtoken, int32_t userisadministrator, uint32_t errorcode, void* extendederrorinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginAuthzUserComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(senderdetails, flags, userauthorizationcontext, impersonationtoken, userisadministrator, errorcode, extendederrorinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)senderdetails;
    (void)flags;
    (void)userauthorizationcontext;
    (void)impersonationtoken;
    (void)userisadministrator;
    (void)errorcode;
    (void)extendederrorinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginFreeRequestDetails(void* requestdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginFreeRequestDetails");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginGetConfiguration(void* plugincontext, uint32_t flags, void* data) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginGetConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plugincontext, flags, data);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plugincontext;
    (void)flags;
    (void)data;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginGetOperationParameters(void* requestdetails, uint32_t flags, void* data) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginGetOperationParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestdetails, flags, data);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)data;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginOperationComplete(void* requestdetails, uint32_t flags, uint32_t errorcode, void* extendedinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginOperationComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestdetails, flags, errorcode, extendedinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)errorcode;
    (void)extendedinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginReceiveResult(void* requestdetails, uint32_t flags, void* stream, void* streamresult, void* commandstate, uint32_t exitcode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginReceiveResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestdetails, flags, stream, streamresult, commandstate, exitcode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)stream;
    (void)streamresult;
    (void)commandstate;
    (void)exitcode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginReportCompletion(void* plugincontext, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginReportCompletion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plugincontext, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plugincontext;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManPluginReportContext(void* requestdetails, uint32_t flags, void* context) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManPluginReportContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(requestdetails, flags, context);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)requestdetails;
    (void)flags;
    (void)context;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManReceiveShellOutput(int64_t shell, int64_t command, uint32_t flags, void* desiredstreamset, void* async, void* receiveoperation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManReceiveShellOutput");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, command, flags, desiredstreamset, async, receiveoperation);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)desiredstreamset;
    (void)async;
    (void)receiveoperation;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManReconnectShell(int64_t shell, uint32_t flags, void* async) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManReconnectShell");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, flags, async);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManReconnectShellCommand(int64_t commandhandle, uint32_t flags, void* async) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManReconnectShellCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(commandhandle, flags, async);
        return;
    }
    errno = ENOSYS;
#else
    (void)commandhandle;
    (void)flags;
    (void)async;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManRunShellCommand(int64_t shell, uint32_t flags, void* commandline, void* args, void* options, void* async, void* command) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManRunShellCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, flags, commandline, args, options, async, command);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)flags;
    (void)commandline;
    (void)args;
    (void)options;
    (void)async;
    (void)command;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManRunShellCommandEx(int64_t shell, uint32_t flags, void* commandid, void* commandline, void* args, void* options, void* async, void* command) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManRunShellCommandEx");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, flags, commandid, commandline, args, options, async, command);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)flags;
    (void)commandid;
    (void)commandline;
    (void)args;
    (void)options;
    (void)async;
    (void)command;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManSendShellInput(int64_t shell, int64_t command, uint32_t flags, void* streamid, void* streamdata, int32_t endofstream, void* async, void* sendoperation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManSendShellInput");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, command, flags, streamid, streamdata, endofstream, async, sendoperation);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)streamid;
    (void)streamdata;
    (void)endofstream;
    (void)async;
    (void)sendoperation;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_system_remotemanagement_WSManSetSessionOption(int64_t session, int32_t option, void* data) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManSetSessionOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(session, option, data);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)session;
    (void)option;
    (void)data;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_system_remotemanagement_WSManSignalShell(int64_t shell, int64_t command, uint32_t flags, void* code, void* async, void* signaloperation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wsmsvc.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WSManSignalShell");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(shell, command, flags, code, async, signaloperation);
        return;
    }
    errno = ENOSYS;
#else
    (void)shell;
    (void)command;
    (void)flags;
    (void)code;
    (void)async;
    (void)signaloperation;
    errno = ENOSYS;
#endif
}

