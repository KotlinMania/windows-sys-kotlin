#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_deviceanddriverinstallation_wrapper.h"
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CMP_WaitNoPendingInstallEvents(uint32_t dwtimeout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CMP_WaitNoPendingInstallEvents");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwtimeout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwtimeout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf(void* plclogconf, uint32_t dndevinst, int32_t priority, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Empty_Log_Conf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plclogconf, dndevinst, priority, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)priority;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Empty_Log_Conf_Ex(void* plclogconf, uint32_t dndevinst, int32_t priority, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Empty_Log_Conf_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plclogconf, dndevinst, priority, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)priority;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDA(uint32_t dndevinst, void* pszid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_IDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_IDW(uint32_t dndevinst, void* pszid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_IDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExA(uint32_t dndevinst, void* pszid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_ID_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_ID_ExW(uint32_t dndevinst, void* pszid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_ID_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Range(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Range");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ullstartvalue, ullendvalue, rlh, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des(void* prdresdes, uint64_t lclogconf, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Res_Des");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, lclogconf, resourceid, resourcedata, resourcelen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)lclogconf;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Add_Res_Des_Ex(void* prdresdes, uint64_t lclogconf, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Add_Res_Des_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, lclogconf, resourceid, resourcedata, resourcelen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)lclogconf;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineA(void* uncservername, void* phmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Connect_MachineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, phmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)phmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Connect_MachineW(void* uncservername, void* phmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Connect_MachineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uncservername, phmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uncservername;
    (void)phmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeA(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNodeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNodeW(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNodeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExA(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNode_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_DevNode_ExW(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_DevNode_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, dnparent, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)dnparent;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Create_Range_List(void* prlh, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Create_Range_List");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prlh, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prlh;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key(void* classguid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Class_Key");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Class_Key_Ex(void* classguid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Class_Key_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key(uint32_t dndevnode, uint32_t ulhardwareprofile, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_DevNode_Key");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevnode, ulhardwareprofile, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevnode;
    (void)ulhardwareprofile;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_DevNode_Key_Ex(uint32_t dndevnode, uint32_t ulhardwareprofile, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_DevNode_Key_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevnode, ulhardwareprofile, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevnode;
    (void)ulhardwareprofile;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyA(void* pszdeviceinterface, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_KeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_KeyW(void* pszdeviceinterface, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_KeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExA(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_Key_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Device_Interface_Key_ExW(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Device_Interface_Key_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Delete_Range(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Delete_Range");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ullstartvalue, ullendvalue, rlh, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict(uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, void* pbconflictdetected, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Detect_Resource_Conflict");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, resourceid, resourcedata, resourcelen, pbconflictdetected, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)pbconflictdetected;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Detect_Resource_Conflict_Ex(uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, void* pbconflictdetected, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Detect_Resource_Conflict_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, resourceid, resourcedata, resourcelen, pbconflictdetected, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)pbconflictdetected;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode(uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Disable_DevNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disable_DevNode_Ex(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Disable_DevNode_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Disconnect_Machine(int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Disconnect_Machine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Dup_Range_List(uint64_t rlhold, uint64_t rlhnew, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Dup_Range_List");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rlhold, rlhnew, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rlhold;
    (void)rlhnew;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode(uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enable_DevNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enable_DevNode_Ex(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enable_DevNode_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes(uint32_t ulclassindex, void* classguid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Classes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulclassindex, classguid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulclassindex;
    (void)classguid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Classes_Ex(uint32_t ulclassindex, void* classguid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Classes_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulclassindex, classguid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulclassindex;
    (void)classguid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsA(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_EnumeratorsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulenumindex, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_EnumeratorsW(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_EnumeratorsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulenumindex, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExA(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Enumerators_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulenumindex, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Enumerate_Enumerators_ExW(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Enumerate_Enumerators_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulenumindex, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulenumindex;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Find_Range(void* pullstart, uint64_t ullstart, uint32_t ullength, uint64_t ullalignment, uint64_t ullend, uint64_t rlh, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Find_Range");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullstart, ullstart, ullength, ullalignment, ullend, rlh, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullstart;
    (void)ullstart;
    (void)ullength;
    (void)ullalignment;
    (void)ullend;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_First_Range(uint64_t rlh, void* pullstart, void* pullend, void* preelement, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_First_Range");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rlh, pullstart, pullend, preelement, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rlh;
    (void)pullstart;
    (void)pullend;
    (void)preelement;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf(uint64_t lclogconftobefreed, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Log_Conf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lclogconftobefreed, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lclogconftobefreed;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Ex(uint64_t lclogconftobefreed, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Log_Conf_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lclogconftobefreed, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lclogconftobefreed;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Log_Conf_Handle(uint64_t lclogconf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Log_Conf_Handle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lclogconf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lclogconf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Range_List(uint64_t rlh, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Range_List");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rlh, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des(void* prdresdes, uint64_t rdresdes, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Res_Des");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, rdresdes, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Ex(void* prdresdes, uint64_t rdresdes, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Res_Des_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, rdresdes, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Res_Des_Handle(uint64_t rdresdes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Res_Des_Handle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rdresdes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rdresdes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Free_Resource_Conflict_Handle(uint64_t clconflictlist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Free_Resource_Conflict_Handle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clconflictlist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clconflictlist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Child");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Child_Ex(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Child_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameA(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_NameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszkeyname, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_NameW(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_NameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszkeyname, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExA(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_Name_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszkeyname, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Key_Name_ExW(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Key_Name_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszkeyname, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszkeyname;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameA(void* classguid, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_NameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_NameW(void* classguid, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_NameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExA(void* classguid, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Name_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Name_ExW(void* classguid, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Name_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_PropertyW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_ExW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys(void* classguid, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Property_Keys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykeyarray, propertykeycount, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Property_Keys_Ex(void* classguid, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Property_Keys_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykeyarray, propertykeycount, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyA(void* classguid, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Registry_PropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Class_Registry_PropertyW(void* classguid, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Class_Registry_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth(void* puldepth, uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Depth");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puldepth, dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puldepth;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Depth_Ex(void* puldepth, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Depth_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(puldepth, dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)puldepth;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyA(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_PropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_PropertyW(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExA(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_Property_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Custom_Property_ExW(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Custom_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pszcustompropertyname, pulregdatatype, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pszcustompropertyname;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_PropertyW(uint32_t dndevinst, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_ExW(uint32_t dndevinst, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys(uint32_t dndevinst, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_Keys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, propertykeyarray, propertykeycount, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Property_Keys_Ex(uint32_t dndevinst, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Property_Keys_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, propertykeyarray, propertykeycount, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyA(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_PropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_PropertyW(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExA(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_Property_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Registry_Property_ExW(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Registry_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, pulregdatatype, buffer, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)pulregdatatype;
    (void)buffer;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status(void* pulstatus, void* pulproblemnumber, uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Status");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulstatus, pulproblemnumber, dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulstatus;
    (void)pulproblemnumber;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_DevNode_Status_Ex(void* pulstatus, void* pulproblemnumber, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_DevNode_Status_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulstatus, pulproblemnumber, dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulstatus;
    (void)pulproblemnumber;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDA(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_IDA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, buffer, bufferlen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_IDW(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_IDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, buffer, bufferlen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExA(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, buffer, bufferlen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ExW(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, buffer, bufferlen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListA(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilter, buffer, bufferlen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_ListW(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_ListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilter, buffer, bufferlen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExA(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilter, buffer, bufferlen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_ExW(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszfilter, buffer, bufferlen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszfilter;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeA(void* pullen, void* pszfilter, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_SizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, pszfilter, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_SizeW(void* pullen, void* pszfilter, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_SizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, pszfilter, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExA(void* pullen, void* pszfilter, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_Size_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, pszfilter, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_List_Size_ExW(void* pullen, void* pszfilter, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_List_Size_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, pszfilter, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)pszfilter;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size(void* pullen, uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_Size");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_ID_Size_Ex(void* pullen, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_ID_Size_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasA(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_AliasA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_AliasW(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_AliasW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExA(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Alias_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Alias_ExW(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Alias_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, aliasinterfaceguid, pszaliasdeviceinterface, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)aliasinterfaceguid;
    (void)pszaliasdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListA(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_ListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_ListW(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_ListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExA(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_ExW(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(interfaceclassguid, pdeviceid, buffer, bufferlen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeA(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_SizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_SizeW(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_SizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExA(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_Size_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_List_Size_ExW(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_List_Size_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pullen, interfaceclassguid, pdeviceid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pullen;
    (void)interfaceclassguid;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_PropertyW(void* pszdeviceinterface, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_ExW(void* pszdeviceinterface, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_KeysW(void* pszdeviceinterface, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_KeysW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Device_Interface_Property_Keys_ExW(void* pszdeviceinterface, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Device_Interface_Property_Keys_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, propertykeyarray, propertykeycount, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf(void* plclogconf, uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_First_Log_Conf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plclogconf, dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_First_Log_Conf_Ex(void* plclogconf, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_First_Log_Conf_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plclogconf, dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plclogconf;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State(void* pulstate, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Global_State");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulstate, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulstate;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Global_State_Ex(void* pulstate, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Global_State_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulstate, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulstate;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsA(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_FlagsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_FlagsW(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_FlagsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExA(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_Flags_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_HW_Prof_Flags_ExW(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_HW_Prof_Flags_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulhardwareprofile, pulvalue, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulhardwareprofile;
    (void)pulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoA(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_InfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulindex, phwprofileinfo, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_InfoW(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_InfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulindex, phwprofileinfo, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExA(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_Info_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulindex, phwprofileinfo, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Hardware_Profile_Info_ExW(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Hardware_Profile_Info_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulindex, phwprofileinfo, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulindex;
    (void)phwprofileinfo;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority(uint64_t lclogconf, void* ppriority, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Log_Conf_Priority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lclogconf, ppriority, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lclogconf;
    (void)ppriority;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Log_Conf_Priority_Ex(uint64_t lclogconf, void* ppriority, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Log_Conf_Priority_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lclogconf, ppriority, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lclogconf;
    (void)ppriority;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf(void* plclogconf, uint64_t lclogconf, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Log_Conf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plclogconf, lclogconf, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plclogconf;
    (void)lclogconf;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Log_Conf_Ex(void* plclogconf, uint64_t lclogconf, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Log_Conf_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plclogconf, lclogconf, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plclogconf;
    (void)lclogconf;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des(void* prdresdes, uint64_t rdresdes, uint32_t forresource, void* presourceid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Res_Des");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, rdresdes, forresource, presourceid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)forresource;
    (void)presourceid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Next_Res_Des_Ex(void* prdresdes, uint64_t rdresdes, uint32_t forresource, void* presourceid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Next_Res_Des_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, rdresdes, forresource, presourceid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)forresource;
    (void)presourceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Parent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Parent_Ex(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Parent_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data(uint64_t rdresdes, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rdresdes, buffer, bufferlen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rdresdes;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Ex(uint64_t rdresdes, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rdresdes, buffer, bufferlen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rdresdes;
    (void)buffer;
    (void)bufferlen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size(void* pulsize, uint64_t rdresdes, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Size");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulsize, rdresdes, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulsize;
    (void)rdresdes;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Res_Des_Data_Size_Ex(void* pulsize, uint64_t rdresdes, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Res_Des_Data_Size_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulsize, rdresdes, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulsize;
    (void)rdresdes;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_Count(uint64_t clconflictlist, void* pulcount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_Count");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clconflictlist, pulcount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clconflictlist;
    (void)pulcount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsA(uint64_t clconflictlist, uint32_t ulindex, void* pconflictdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_DetailsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clconflictlist, ulindex, pconflictdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clconflictlist;
    (void)ulindex;
    (void)pconflictdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Resource_Conflict_DetailsW(uint64_t clconflictlist, uint32_t ulindex, void* pconflictdetails) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Resource_Conflict_DetailsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clconflictlist, ulindex, pconflictdetails);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clconflictlist;
    (void)ulindex;
    (void)pconflictdetails;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Sibling");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Sibling_Ex(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Sibling_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint16_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version(void) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Version");
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

uint16_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Get_Version_Ex(int64_t hmachine) {
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Get_Version_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Intersect_Range_List(uint64_t rlhold1, uint64_t rlhold2, uint64_t rlhnew, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Intersect_Range_List");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rlhold1, rlhold2, rlhnew, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rlhold1;
    (void)rlhold2;
    (void)rlhnew;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Invert_Range_List(uint64_t rlhold, uint64_t rlhnew, uint64_t ullmaxvalue, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Invert_Range_List");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rlhold, rlhnew, ullmaxvalue, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rlhold;
    (void)rlhnew;
    (void)ullmaxvalue;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present(void* pbpresent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Dock_Station_Present");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbpresent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbpresent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Dock_Station_Present_Ex(void* pbpresent, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Dock_Station_Present_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbpresent, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pbpresent;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available(uint16_t wversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Version_Available");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Is_Version_Available_Ex(uint16_t wversion, int64_t hmachine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Is_Version_Available_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wversion, hmachine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wversion;
    (void)hmachine;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeA(void* pdndevinst, void* pdeviceid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNodeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNodeW(void* pdndevinst, void* pdeviceid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNodeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExA(void* pdndevinst, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNode_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Locate_DevNode_ExW(void* pdndevinst, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Locate_DevNode_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdndevinst, pdeviceid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdndevinst;
    (void)pdeviceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_MapCrToWin32Err(uint32_t cmreturncode, uint32_t defaulterr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_MapCrToWin32Err");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cmreturncode, defaulterr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cmreturncode;
    (void)defaulterr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Merge_Range_List(uint64_t rlhold1, uint64_t rlhold2, uint64_t rlhnew, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Merge_Range_List");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rlhold1, rlhold2, rlhnew, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)rlhold1;
    (void)rlhold2;
    (void)rlhnew;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des(void* prdresdes, uint64_t rdresdes, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Modify_Res_Des");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, rdresdes, resourceid, resourcedata, resourcelen, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Modify_Res_Des_Ex(void* prdresdes, uint64_t rdresdes, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Modify_Res_Des_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prdresdes, rdresdes, resourceid, resourcedata, resourcelen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)prdresdes;
    (void)rdresdes;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode(uint32_t dnfromdevinst, uint32_t dntodevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Move_DevNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnfromdevinst, dntodevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnfromdevinst;
    (void)dntodevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Move_DevNode_Ex(uint32_t dnfromdevinst, uint32_t dntodevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Move_DevNode_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnfromdevinst, dntodevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnfromdevinst;
    (void)dntodevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Next_Range(void* preelement, void* pullstart, void* pullend, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Next_Range");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(preelement, pullstart, pullend, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)preelement;
    (void)pullstart;
    (void)pullend;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyA(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_KeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_KeyW(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_KeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExA(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_Key_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Class_Key_ExW(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Class_Key_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, pszclassname, samdesired, disposition, phkclass, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)pszclassname;
    (void)samdesired;
    (void)disposition;
    (void)phkclass;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key(uint32_t dndevnode, uint32_t samdesired, uint32_t ulhardwareprofile, uint32_t disposition, void* phkdevice, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_DevNode_Key");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevnode, samdesired, ulhardwareprofile, disposition, phkdevice, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevnode;
    (void)samdesired;
    (void)ulhardwareprofile;
    (void)disposition;
    (void)phkdevice;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_DevNode_Key_Ex(uint32_t dndevnode, uint32_t samdesired, uint32_t ulhardwareprofile, uint32_t disposition, void* phkdevice, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_DevNode_Key_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevnode, samdesired, ulhardwareprofile, disposition, phkdevice, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevnode;
    (void)samdesired;
    (void)ulhardwareprofile;
    (void)disposition;
    (void)phkdevice;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyA(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_KeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_KeyW(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_KeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExA(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_Key_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Open_Device_Interface_Key_ExW(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Open_Device_Interface_Key_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, samdesired, disposition, phkdeviceinterface, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)samdesired;
    (void)disposition;
    (void)phkdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeA(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTreeW(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExA(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTree_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_And_Remove_SubTree_ExW(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_And_Remove_SubTree_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data(void* pdata, uint32_t datalen, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Data");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata, datalen, dndevinst, resourceid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdata;
    (void)datalen;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Data_Ex(void* pdata, uint32_t datalen, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Data_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdata, datalen, dndevinst, resourceid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdata;
    (void)datalen;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size(void* pulsize, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Size");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulsize, dndevinst, resourceid, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulsize;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Arbitrator_Free_Size_Ex(void* pulsize, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Arbitrator_Free_Size_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pulsize, dndevinst, resourceid, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pulsize;
    (void)dndevinst;
    (void)resourceid;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree(uint32_t dnancestor, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Remove_SubTree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Remove_SubTree_Ex(uint32_t dnancestor, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Remove_SubTree_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Query_Resource_Conflict_List(void* pclconflictlist, uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Query_Resource_Conflict_List");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pclconflictlist, dndevinst, resourceid, resourcedata, resourcelen, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pclconflictlist;
    (void)dndevinst;
    (void)resourceid;
    (void)resourcedata;
    (void)resourcelen;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode(uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Reenumerate_DevNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Reenumerate_DevNode_Ex(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Reenumerate_DevNode_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver(uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Driver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Driver_Ex(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Driver_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceA(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_InterfaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_InterfaceW(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_InterfaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExA(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Interface_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Device_Interface_ExW(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Device_Interface_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, interfaceclassguid, pszreference, pszdeviceinterface, pullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)interfaceclassguid;
    (void)pszreference;
    (void)pszdeviceinterface;
    (void)pullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Register_Notification(void* pfilter, void* pcontext, void* pcallback, void* pnotifycontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Register_Notification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfilter, pcontext, pcallback, pnotifycontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfilter;
    (void)pcontext;
    (void)pcallback;
    (void)pnotifycontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree(uint32_t dnancestor, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Remove_SubTree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Remove_SubTree_Ex(uint32_t dnancestor, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Remove_SubTree_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dnancestor, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dnancestor;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectA(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_EjectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_EjectW(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_EjectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExA(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_Eject_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Device_Eject_ExW(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Device_Eject_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, pvetotype, pszvetoname, ulnamelength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)pvetotype;
    (void)pszvetoname;
    (void)ulnamelength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Eject_PC");
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Request_Eject_PC_Ex(int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Request_Eject_PC_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection(uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Run_Detection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Run_Detection_Ex(uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Run_Detection_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_PropertyW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Property_ExW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyA(void* classguid, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_Registry_PropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, ulproperty, buffer, ullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Class_Registry_PropertyW(void* classguid, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Class_Registry_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, ulproperty, buffer, ullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)classguid;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem(uint32_t dndevinst, uint32_t ulproblem, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Problem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproblem, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproblem;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Problem_Ex(uint32_t dndevinst, uint32_t ulproblem, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Problem_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproblem, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproblem;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_PropertyW(uint32_t dndevinst, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Property_ExW(uint32_t dndevinst, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyA(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_PropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_PropertyW(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExA(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_Property_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_DevNode_Registry_Property_ExW(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_DevNode_Registry_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulproperty, buffer, ullength, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulproperty;
    (void)buffer;
    (void)ullength;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_PropertyW(void* pszdeviceinterface, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Device_Interface_PropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_Device_Interface_Property_ExW(void* pszdeviceinterface, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_Device_Interface_Property_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, propertykey, propertytype, propertybuffer, propertybuffersize, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof(uint32_t ulhardwareprofile, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulhardwareprofile, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulhardwareprofile;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Ex(uint32_t ulhardwareprofile, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ulhardwareprofile, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ulhardwareprofile;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsA(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_FlagsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_FlagsW(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_FlagsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExA(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Flags_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Set_HW_Prof_Flags_ExW(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Set_HW_Prof_Flags_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdeviceid, ulconfig, ulvalue, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdeviceid;
    (void)ulconfig;
    (void)ulvalue;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode(uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Setup_DevNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Setup_DevNode_Ex(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Setup_DevNode_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Test_Range_Available(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Test_Range_Available");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ullstartvalue, ullendvalue, rlh, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ullstartvalue;
    (void)ullendvalue;
    (void)rlh;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode(uint32_t dndevinst, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Uninstall_DevNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Uninstall_DevNode_Ex(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Uninstall_DevNode_Ex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dndevinst, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dndevinst;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceA(void* pszdeviceinterface, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_InterfaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_InterfaceW(void* pszdeviceinterface, uint32_t ulflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_InterfaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExA(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_Interface_ExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Device_Interface_ExW(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Device_Interface_ExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszdeviceinterface, ulflags, hmachine);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszdeviceinterface;
    (void)ulflags;
    (void)hmachine;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_CM_Unregister_Notification(void* notifycontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cfgmgr32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CM_Unregister_Notification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(notifycontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)notifycontext;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiInstallDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata, driverinfodata, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverA(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiInstallDriverA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, infpath, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiInstallDriverW(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiInstallDriverW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, infpath, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiRollbackDriver(int64_t deviceinfoset, void* deviceinfodata, void* hwndparent, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiRollbackDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, hwndparent, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)hwndparent;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiShowUpdateDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiShowUpdateDriver(void* hwndparent, void* filepath, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiShowUpdateDriver");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, filepath, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)filepath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiUninstallDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverA(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiUninstallDriverA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, infpath, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_DiUninstallDriverW(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiUninstallDriverW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, infpath, flags, needreboot);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)infpath;
    (void)flags;
    (void)needreboot;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionA(void* window, void* modulehandle, void* commandline, int32_t showcommand) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallHinfSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(window, modulehandle, commandline, showcommand);
        return;
    }
    errno = ENOSYS;
#else
    (void)window;
    (void)modulehandle;
    (void)commandline;
    (void)showcommand;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_InstallHinfSectionW(void* window, void* modulehandle, void* commandline, int32_t showcommand) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallHinfSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(window, modulehandle, commandline, showcommand);
        return;
    }
    errno = ENOSYS;
#else
    (void)window;
    (void)modulehandle;
    (void)commandline;
    (void)showcommand;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListA(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddInstallSectionToDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddInstallSectionToDiskSpaceListW(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddInstallSectionToDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListA(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddSectionToDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddSectionToDiskSpaceListW(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddSectionToDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListA(void* diskspace, void* targetfilespec, int64_t filesize, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, targetfilespec, filesize, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)filesize;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToDiskSpaceListW(void* diskspace, void* targetfilespec, int64_t filesize, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, targetfilespec, filesize, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)filesize;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListA(uint32_t flags, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToSourceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAddToSourceListW(uint32_t flags, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAddToSourceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListA(void* diskspace, void* driveroot, int64_t amount, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAdjustDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, driveroot, amount, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)driveroot;
    (void)amount;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupAdjustDiskSpaceListW(void* diskspace, void* driveroot, int64_t amount, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupAdjustDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, driveroot, amount, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)driveroot;
    (void)amount;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorA(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupBackupErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupBackupErrorW(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupBackupErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCancelTemporarySourceList(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCancelTemporarySourceList");
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseFileQueue(void* queuehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCloseFileQueue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseInfFile(void* infhandle) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCloseInfFile");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(infhandle);
        return;
    }
    errno = ENOSYS;
#else
    (void)infhandle;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCloseLog(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCloseLog");
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueA(void* owner, void* queuehandle, void* msghandler, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCommitFileQueueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(owner, queuehandle, msghandler, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)owner;
    (void)queuehandle;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCommitFileQueueW(void* owner, void* queuehandle, void* msghandler, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCommitFileQueueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(owner, queuehandle, msghandler, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)owner;
    (void)queuehandle;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionA(void* infhandle, void* sectionname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupConfigureWmiFromInfSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sectionname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupConfigureWmiFromInfSectionW(void* infhandle, void* sectionname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupConfigureWmiFromInfSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sectionname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorA(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* sourcefile, void* targetpathfile, uint32_t win32errorcode, uint32_t style, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode, style, pathbuffer, pathbuffersize, pathrequiredsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)sourcefile;
    (void)targetpathfile;
    (void)win32errorcode;
    (void)style;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyErrorW(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* sourcefile, void* targetpathfile, uint32_t win32errorcode, uint32_t style, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, sourcefile, targetpathfile, win32errorcode, style, pathbuffer, pathbuffersize, pathrequiredsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)sourcefile;
    (void)targetpathfile;
    (void)win32errorcode;
    (void)style;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfA(void* sourceinffilename, void* oemsourcemedialocation, uint32_t oemsourcemediatype, uint32_t copystyle, void* destinationinffilename, uint32_t destinationinffilenamesize, void* requiredsize, void* destinationinffilenamecomponent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyOEMInfA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceinffilename, oemsourcemedialocation, oemsourcemediatype, copystyle, destinationinffilename, destinationinffilenamesize, requiredsize, destinationinffilenamecomponent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourceinffilename;
    (void)oemsourcemedialocation;
    (void)oemsourcemediatype;
    (void)copystyle;
    (void)destinationinffilename;
    (void)destinationinffilenamesize;
    (void)requiredsize;
    (void)destinationinffilenamecomponent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCopyOEMInfW(void* sourceinffilename, void* oemsourcemedialocation, uint32_t oemsourcemediatype, uint32_t copystyle, void* destinationinffilename, uint32_t destinationinffilenamesize, void* requiredsize, void* destinationinffilenamecomponent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCopyOEMInfW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourceinffilename, oemsourcemedialocation, oemsourcemediatype, copystyle, destinationinffilename, destinationinffilenamesize, requiredsize, destinationinffilenamecomponent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourceinffilename;
    (void)oemsourcemedialocation;
    (void)oemsourcemediatype;
    (void)copystyle;
    (void)destinationinffilename;
    (void)destinationinffilenamesize;
    (void)requiredsize;
    (void)destinationinffilenamecomponent;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListA(void* reserved1, uint32_t reserved2, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCreateDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved1, reserved2, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupCreateDiskSpaceListW(void* reserved1, uint32_t reserved2, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupCreateDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(reserved1, reserved2, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileA(void* sourcefilename, void* targetfilename, void* compressiontype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDecompressOrCopyFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilename, targetfilename, compressiontype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcefilename;
    (void)targetfilename;
    (void)compressiontype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDecompressOrCopyFileW(void* sourcefilename, void* targetfilename, void* compressiontype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDecompressOrCopyFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilename, targetfilename, compressiontype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcefilename;
    (void)targetfilename;
    (void)compressiontype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackA(void* context, uint32_t notification, uint64_t param1, uint64_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDefaultQueueCallbackA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, notification, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)context;
    (void)notification;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDefaultQueueCallbackW(void* context, uint32_t notification, uint64_t param1, uint64_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDefaultQueueCallbackW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, notification, param1, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)context;
    (void)notification;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorA(void* hwndparent, void* dialogtitle, void* file, uint32_t win32errorcode, uint32_t style) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDeleteErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, file, win32errorcode, style);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)file;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDeleteErrorW(void* hwndparent, void* dialogtitle, void* file, uint32_t win32errorcode, uint32_t style) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDeleteErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, file, win32errorcode, style);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)file;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDestroyDiskSpaceList(void* diskspace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDestroyDiskSpaceList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiAskForOEMDisk(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiAskForOEMDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoList(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildClassInfoList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, classguidlist, classguidlistsize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExA(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildClassInfoListExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, classguidlist, classguidlistsize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildClassInfoListExW(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildClassInfoListExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, classguidlist, classguidlistsize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiBuildDriverInfoList(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiBuildDriverInfoList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, drivertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCallClassInstaller(uint32_t installfunction, int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCallClassInstaller");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(installfunction, deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)installfunction;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCancelDriverInfoSearch(int64_t deviceinfoset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCancelDriverInfoSearch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiChangeState(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiChangeState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameA(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExA(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameExW(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassGuidsFromNameW(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassGuidsFromNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classname, classguidlist, classguidlistsize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classname;
    (void)classguidlist;
    (void)classguidlistsize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidA(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classname, classnamesize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExA(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classname, classnamesize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidExW(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classname, classnamesize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiClassNameFromGuidW(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiClassNameFromGuidW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classname, classnamesize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, void* infhandle, void* infsectionname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDevRegKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype, infhandle, infsectionname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDevRegKeyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, void* infhandle, void* infsectionname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDevRegKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype, infhandle, infsectionname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoA(int64_t deviceinfoset, void* devicename, void* classguid, void* devicedescription, void* hwndparent, uint32_t creationflags, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, devicename, classguid, devicedescription, hwndparent, creationflags, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)devicename;
    (void)classguid;
    (void)devicedescription;
    (void)hwndparent;
    (void)creationflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoList(void* classguid, void* hwndparent) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, hwndparent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)hwndparent;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExA(void* classguid, void* hwndparent, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoListExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, hwndparent, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)hwndparent;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoListExW(void* classguid, void* hwndparent, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoListExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, hwndparent, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)hwndparent;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInfoW(int64_t deviceinfoset, void* devicename, void* classguid, void* devicedescription, void* hwndparent, uint32_t creationflags, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, devicename, classguid, devicedescription, hwndparent, creationflags, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)devicename;
    (void)classguid;
    (void)devicedescription;
    (void)hwndparent;
    (void)creationflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceA(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, void* referencestring, uint32_t creationflags, void* deviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags, deviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)referencestring;
    (void)creationflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyA(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired, void* infhandle, void* infsectionname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceRegKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved, samdesired, infhandle, infsectionname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceRegKeyW(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired, void* infhandle, void* infsectionname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceRegKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved, samdesired, infhandle, infsectionname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    (void)infhandle;
    (void)infsectionname;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiCreateDeviceInterfaceW(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, void* referencestring, uint32_t creationflags, void* deviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiCreateDeviceInterfaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, interfaceclassguid, referencestring, creationflags, deviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)referencestring;
    (void)creationflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDevRegKey(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDevRegKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInfo(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceData(int64_t deviceinfoset, void* deviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInterfaceData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDeleteDeviceInterfaceRegKey(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDeleteDeviceInterfaceRegKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyClassImageList(void* classimagelistdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDestroyClassImageList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classimagelistdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classimagelistdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDeviceInfoList(int64_t deviceinfoset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDestroyDeviceInfoList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiDestroyDriverInfoList(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiDestroyDriverInfoList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, drivertype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInfo(int64_t deviceinfoset, uint32_t memberindex, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDeviceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, memberindex, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)memberindex;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDeviceInterfaces(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, uint32_t memberindex, void* deviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDeviceInterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, interfaceclassguid, memberindex, deviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)interfaceclassguid;
    (void)memberindex;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoA(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype, uint32_t memberindex, void* driverinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDriverInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, drivertype, memberindex, driverinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    (void)memberindex;
    (void)driverinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiEnumDriverInfoW(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype, uint32_t memberindex, void* driverinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiEnumDriverInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, drivertype, memberindex, driverinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)drivertype;
    (void)memberindex;
    (void)driverinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionA(void* context, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualModelsSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualModelsSectionW(void* context, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualModelsSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallA(void* infhandle, void* infsectionname, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infsectionname, infsectionwithext, infsectionwithextsize, requiredsize, extension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExA(void* infhandle, void* infsectionname, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, extension, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallExW(void* infhandle, void* infsectionname, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infsectionname, alternateplatforminfo, infsectionwithext, infsectionwithextsize, requiredsize, extension, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)alternateplatforminfo;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetActualSectionToInstallW(void* infhandle, void* infsectionname, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetActualSectionToInstallW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infsectionname, infsectionwithext, infsectionwithextsize, requiredsize, extension);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infsectionname;
    (void)infsectionwithext;
    (void)infsectionwithextsize;
    (void)requiredsize;
    (void)extension;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassBitmapIndex(void* classguid, void* miniiconindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassBitmapIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, miniiconindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)miniiconindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionA(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExA(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionExW(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDescriptionW(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDescriptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, classdescription, classdescriptionsize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)classdescription;
    (void)classdescriptionsize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsA(int64_t deviceinfoset, void* deviceinfodata, void* propertysheetheader, uint32_t propertysheetheaderpagelistsize, void* requiredsize, uint32_t propertysheettype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevPropertySheetsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize, requiredsize, propertysheettype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertysheetheader;
    (void)propertysheetheaderpagelistsize;
    (void)requiredsize;
    (void)propertysheettype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevPropertySheetsW(int64_t deviceinfoset, void* deviceinfodata, void* propertysheetheader, uint32_t propertysheetheaderpagelistsize, void* requiredsize, uint32_t propertysheettype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevPropertySheetsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, propertysheetheader, propertysheetheaderpagelistsize, requiredsize, propertysheettype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertysheetheader;
    (void)propertysheetheaderpagelistsize;
    (void)requiredsize;
    (void)propertysheettype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsA(void* classguid, void* enumerator, void* hwndparent, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, enumerator, hwndparent, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExA(void* classguid, void* enumerator, void* hwndparent, uint32_t flags, int64_t deviceinfoset, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, enumerator, hwndparent, flags, deviceinfoset, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    (void)deviceinfoset;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsExW(void* classguid, void* enumerator, void* hwndparent, uint32_t flags, int64_t deviceinfoset, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, enumerator, hwndparent, flags, deviceinfoset, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    (void)deviceinfoset;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassDevsW(void* classguid, void* enumerator, void* hwndparent, uint32_t flags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassDevsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, enumerator, hwndparent, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)enumerator;
    (void)hwndparent;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageIndex(void* classimagelistdata, void* classguid, void* imageindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classimagelistdata, classguid, imageindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classimagelistdata;
    (void)classguid;
    (void)imageindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageList(void* classimagelistdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classimagelistdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classimagelistdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExA(void* classimagelistdata, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageListExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classimagelistdata, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classimagelistdata;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassImageListExW(void* classimagelistdata, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassImageListExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classimagelistdata, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classimagelistdata;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassInstallParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassInstallParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyExW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeys(void* classguid, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykeyarray, propertykeycount, requiredpropertykeycount, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyKeysExW(void* classguid, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyKeysExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykeyarray, propertykeycount, requiredpropertykeycount, flags, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassPropertyW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyA(void* classguid, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassRegistryPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetClassRegistryPropertyW(void* classguid, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetClassRegistryPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyA(int64_t deviceinfoset, void* deviceinfodata, void* custompropertyname, uint32_t flags, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetCustomDevicePropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, custompropertyname, flags, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)custompropertyname;
    (void)flags;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetCustomDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* custompropertyname, uint32_t flags, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetCustomDevicePropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, custompropertyname, flags, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)custompropertyname;
    (void)flags;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListClass(int64_t deviceinfoset, void* classguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, classguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)classguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailA(int64_t deviceinfoset, void* deviceinfosetdetaildata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListDetailA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfosetdetaildata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfosetdetaildata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInfoListDetailW(int64_t deviceinfoset, void* deviceinfosetdetaildata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInfoListDetailW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfosetdetaildata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfosetdetaildata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstallParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstallParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstanceid, uint32_t deviceinstanceidsize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstanceIdA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstanceid;
    (void)deviceinstanceidsize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInstanceIdW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstanceid, uint32_t deviceinstanceidsize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInstanceIdW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstanceid, deviceinstanceidsize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstanceid;
    (void)deviceinstanceidsize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceAlias(int64_t deviceinfoset, void* deviceinterfacedata, void* aliasinterfaceclassguid, void* aliasdeviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceAlias");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, aliasinterfaceclassguid, aliasdeviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)aliasinterfaceclassguid;
    (void)aliasdeviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailA(int64_t deviceinfoset, void* deviceinterfacedata, void* deviceinterfacedetaildata, uint32_t deviceinterfacedetaildatasize, void* requiredsize, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceDetailA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize, requiredsize, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)deviceinterfacedetaildata;
    (void)deviceinterfacedetaildatasize;
    (void)requiredsize;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfaceDetailW(int64_t deviceinfoset, void* deviceinterfacedata, void* deviceinterfacedetaildata, uint32_t deviceinterfacedetaildatasize, void* requiredsize, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfaceDetailW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, deviceinterfacedetaildata, deviceinterfacedetaildatasize, requiredsize, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)deviceinterfacedetaildata;
    (void)deviceinterfacedetaildatasize;
    (void)requiredsize;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyKeys(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfacePropertyKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, propertykeyarray, propertykeycount, requiredpropertykeycount, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceInterfacePropertyW(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceInterfacePropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyKeys(int64_t deviceinfoset, void* deviceinfodata, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDevicePropertyKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, propertykeyarray, propertykeycount, requiredpropertykeycount, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykeyarray;
    (void)propertykeycount;
    (void)requiredpropertykeycount;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDevicePropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, propertykey, propertytype, propertybuffer, propertybuffersize, requiredsize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceRegistryPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDeviceRegistryPropertyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDeviceRegistryPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, property, propertyregdatatype, propertybuffer, propertybuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertyregdatatype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinfodetaildata, uint32_t driverinfodetaildatasize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInfoDetailA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinfodetaildata;
    (void)driverinfodetaildatasize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInfoDetailW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinfodetaildata, uint32_t driverinfodetaildatasize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInfoDetailW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinfodetaildata, driverinfodetaildatasize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinfodetaildata;
    (void)driverinfodetaildatasize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInstallParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetDriverInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetDriverInstallParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameA(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExA(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameExW(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileFriendlyNameW(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileFriendlyNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwprofile, friendlyname, friendlynamesize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwprofile;
    (void)friendlyname;
    (void)friendlynamesize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileList(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwprofilelist, hwprofilelistsize, requiredsize, currentlyactiveindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExA(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileListExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwprofilelist, hwprofilelistsize, requiredsize, currentlyactiveindex, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetHwProfileListExW(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetHwProfileListExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwprofilelist, hwprofilelistsize, requiredsize, currentlyactiveindex, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwprofilelist;
    (void)hwprofilelistsize;
    (void)requiredsize;
    (void)currentlyactiveindex;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassA(void* infname, void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetINFClassA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infname, classguid, classname, classnamesize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infname;
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetINFClassW(void* infname, void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetINFClassW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infname, classguid, classname, classnamesize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infname;
    (void)classguid;
    (void)classname;
    (void)classnamesize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDevice(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetSelectedDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetSelectedDriverA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetSelectedDriverW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetSelectedDriverW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiGetWizardPage(int64_t deviceinfoset, void* deviceinfodata, void* installwizarddata, uint32_t pagetype, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiGetWizardPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, installwizarddata, pagetype, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)installwizarddata;
    (void)pagetype;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassA(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, inffilename, flags, filequeue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExA(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue, void* interfaceclassguid, void* reserved1, void* reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, inffilename, flags, filequeue, interfaceclassguid, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    (void)interfaceclassguid;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassExW(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue, void* interfaceclassguid, void* reserved1, void* reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, inffilename, flags, filequeue, interfaceclassguid, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    (void)interfaceclassguid;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallClassW(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallClassW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, inffilename, flags, filequeue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)inffilename;
    (void)flags;
    (void)filequeue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDevice(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDeviceInterfaces(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallDeviceInterfaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiInstallDriverFiles(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiInstallDriverFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadClassIcon(void* classguid, void* largeicon, void* miniiconindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiLoadClassIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, largeicon, miniiconindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)largeicon;
    (void)miniiconindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiLoadDeviceIcon(int64_t deviceinfoset, void* deviceinfodata, uint32_t cxicon, uint32_t cyicon, uint32_t flags, void* hicon) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiLoadDeviceIcon");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, cxicon, cyicon, flags, hicon);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)cxicon;
    (void)cyicon;
    (void)flags;
    (void)hicon;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKey(void* classguid, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenClassRegKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)classguid;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExA(void* classguid, uint32_t samdesired, uint32_t flags, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenClassRegKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, samdesired, flags, machinename, reserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)classguid;
    (void)samdesired;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenClassRegKeyExW(void* classguid, uint32_t samdesired, uint32_t flags, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenClassRegKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, samdesired, flags, machinename, reserved);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)classguid;
    (void)samdesired;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDevRegKey(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDevRegKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, scope, hwprofile, keytype, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)scope;
    (void)hwprofile;
    (void)keytype;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoA(int64_t deviceinfoset, void* deviceinstanceid, void* hwndparent, uint32_t openflags, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinstanceid, hwndparent, openflags, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinstanceid;
    (void)hwndparent;
    (void)openflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInfoW(int64_t deviceinfoset, void* deviceinstanceid, void* hwndparent, uint32_t openflags, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinstanceid, hwndparent, openflags, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinstanceid;
    (void)hwndparent;
    (void)openflags;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceA(int64_t deviceinfoset, void* devicepath, uint32_t openflags, void* deviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, devicepath, openflags, deviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)devicepath;
    (void)openflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceRegKey(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceRegKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, reserved, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)reserved;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiOpenDeviceInterfaceW(int64_t deviceinfoset, void* devicepath, uint32_t openflags, void* deviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiOpenDeviceInterfaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, devicepath, openflags, deviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)devicepath;
    (void)openflags;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterCoDeviceInstallers(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRegisterCoDeviceInstallers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRegisterDeviceInfo(int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* compareproc, void* comparecontext, void* dupdeviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRegisterDeviceInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, flags, compareproc, comparecontext, dupdeviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)flags;
    (void)compareproc;
    (void)comparecontext;
    (void)dupdeviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDevice(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRemoveDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRemoveDeviceInterface(int64_t deviceinfoset, void* deviceinterfacedata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRemoveDeviceInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiRestartDevices(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiRestartDevices");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectBestCompatDrv(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSelectBestCompatDrv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectDevice(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSelectDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSelectOEMDrv(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSelectOEMDrv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassInstallParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassInstallParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, classinstallparams, classinstallparamssize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)classinstallparams;
    (void)classinstallparamssize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyExW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassPropertyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, flags, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassPropertyW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, propertykey, propertytype, propertybuffer, propertybuffersize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyA(void* classguid, uint32_t property, void* propertybuffer, uint32_t propertybuffersize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassRegistryPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, property, propertybuffer, propertybuffersize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetClassRegistryPropertyW(void* classguid, uint32_t property, void* propertybuffer, uint32_t propertybuffersize, void* machinename, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetClassRegistryPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(classguid, property, propertybuffer, propertybuffersize, machinename, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)classguid;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)machinename;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInstallParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInstallParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, deviceinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)deviceinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfaceDefault(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t flags, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInterfaceDefault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, flags, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceInterfacePropertyW(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceInterfacePropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinterfacedata, propertykey, propertytype, propertybuffer, propertybuffersize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinterfacedata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDevicePropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, propertykey, propertytype, propertybuffer, propertybuffersize, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)propertykey;
    (void)propertytype;
    (void)propertybuffer;
    (void)propertybuffersize;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertybuffer, uint32_t propertybuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceRegistryPropertyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, property, propertybuffer, propertybuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDeviceRegistryPropertyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertybuffer, uint32_t propertybuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDeviceRegistryPropertyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, property, propertybuffer, propertybuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)property;
    (void)propertybuffer;
    (void)propertybuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDriverInstallParamsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetDriverInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetDriverInstallParamsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata, driverinstallparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    (void)driverinstallparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDevice(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetSelectedDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetSelectedDriverA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiSetSelectedDriverW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiSetSelectedDriverW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata, driverinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)driverinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDiUnremoveDevice(int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDiUnremoveDevice");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListA(void* diskspace, void* reserved1, uint32_t reserved2, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDuplicateDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, reserved1, reserved2, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)diskspace;
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupDuplicateDiskSpaceListW(void* diskspace, void* reserved1, uint32_t reserved2, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupDuplicateDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, reserved1, reserved2, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)diskspace;
    (void)reserved1;
    (void)reserved2;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsA(void* infhandle, uint32_t arg_1_index, void* buffer, uint32_t size, void* sizeneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupEnumInfSectionsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, arg_1_index, buffer, size, sizeneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)arg_1_index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupEnumInfSectionsW(void* infhandle, uint32_t arg_1_index, void* buffer, uint32_t size, void* sizeneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupEnumInfSectionsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, arg_1_index, buffer, size, sizeneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)arg_1_index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineA(void* infhandle, void* section, void* key, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindFirstLineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, section, key, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    (void)key;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindFirstLineW(void* infhandle, void* section, void* key, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindFirstLineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, section, key, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    (void)key;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextLine(void* contextin, void* contextout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindNextLine");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contextin, contextout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contextin;
    (void)contextout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineA(void* contextin, void* key, void* contextout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindNextMatchLineA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contextin, key, contextout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contextin;
    (void)key;
    (void)contextout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFindNextMatchLineW(void* contextin, void* key, void* contextout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFindNextMatchLineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(contextin, key, contextout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)contextin;
    (void)key;
    (void)contextout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListA(void* list, uint32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFreeSourceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(list, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)list;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupFreeSourceListW(void* list, uint32_t count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupFreeSourceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(list, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)list;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationA(void* queuehandle, void* backupparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetBackupInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, backupparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)backupparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBackupInformationW(void* queuehandle, void* backupparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetBackupInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, backupparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)backupparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetBinaryField(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetBinaryField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFieldCount(void* context) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFieldCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)context;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoA(void* sourcefilename, void* actualsourcefilename, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcefilename;
    (void)actualsourcefilename;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExA(void* sourcefilename, void* actualsourcefilenamebuffer, uint32_t actualsourcefilenamebufferlen, void* requiredbufferlen, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen, requiredbufferlen, sourcefilesize, targetfilesize, compressiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcefilename;
    (void)actualsourcefilenamebuffer;
    (void)actualsourcefilenamebufferlen;
    (void)requiredbufferlen;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoExW(void* sourcefilename, void* actualsourcefilenamebuffer, uint32_t actualsourcefilenamebufferlen, void* requiredbufferlen, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilename, actualsourcefilenamebuffer, actualsourcefilenamebufferlen, requiredbufferlen, sourcefilesize, targetfilesize, compressiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcefilename;
    (void)actualsourcefilenamebuffer;
    (void)actualsourcefilenamebufferlen;
    (void)requiredbufferlen;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileCompressionInfoW(void* sourcefilename, void* actualsourcefilename, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileCompressionInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefilename, actualsourcefilename, sourcefilesize, targetfilesize, compressiontype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)sourcefilename;
    (void)actualsourcefilename;
    (void)sourcefilesize;
    (void)targetfilesize;
    (void)compressiontype;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueCount(void* filequeue, uint32_t subqueuefileop, void* numoperations) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileQueueCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filequeue, subqueuefileop, numoperations);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filequeue;
    (void)subqueuefileop;
    (void)numoperations;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetFileQueueFlags(void* filequeue, void* flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetFileQueueFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filequeue, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filequeue;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationA(void* filename, void* alternateplatforminfo, void* localename, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfDriverStoreLocationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)alternateplatforminfo;
    (void)localename;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfDriverStoreLocationW(void* filename, void* alternateplatforminfo, void* localename, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfDriverStoreLocationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, alternateplatforminfo, localename, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)alternateplatforminfo;
    (void)localename;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListA(void* directorypath, uint32_t infstyle, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfFileListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directorypath, infstyle, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directorypath;
    (void)infstyle;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfFileListW(void* directorypath, uint32_t infstyle, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfFileListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(directorypath, infstyle, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)directorypath;
    (void)infstyle;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationA(void* infspec, uint32_t searchcontrol, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infspec, searchcontrol, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infspec;
    (void)searchcontrol;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfInformationW(void* infspec, uint32_t searchcontrol, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infspec, searchcontrol, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infspec;
    (void)searchcontrol;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameA(void* driverstorelocation, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfPublishedNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverstorelocation, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverstorelocation;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetInfPublishedNameW(void* driverstorelocation, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetInfPublishedNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(driverstorelocation, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)driverstorelocation;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetIntField(void* context, uint32_t fieldindex, void* integervalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetIntField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, fieldindex, integervalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)fieldindex;
    (void)integervalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexA(void* infhandle, void* section, uint32_t arg_2_index, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineByIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, section, arg_2_index, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    (void)arg_2_index;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineByIndexW(void* infhandle, void* section, uint32_t arg_2_index, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineByIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, section, arg_2_index, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    (void)arg_2_index;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountA(void* infhandle, void* section) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineCountA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, section);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineCountW(void* infhandle, void* section) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineCountW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, section);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextA(void* context, void* infhandle, void* section, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineTextA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, infhandle, section, key, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)infhandle;
    (void)section;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetLineTextW(void* context, void* infhandle, void* section, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetLineTextW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, infhandle, section, key, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)infhandle;
    (void)section;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldA(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetMultiSzFieldA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetMultiSzFieldW(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetMultiSzFieldW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetNonInteractiveMode(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetNonInteractiveMode");
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationA(void* infhandle, void* infcontext, void* filename, void* sourceid, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileLocationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)sourceid;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileLocationW(void* infhandle, void* infcontext, void* filename, void* sourceid, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileLocationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, filename, sourceid, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)sourceid;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeA(void* infhandle, void* infcontext, void* filename, void* section, void* filesize, uint32_t roundingfactor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileSizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, filename, section, filesize, roundingfactor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)section;
    (void)filesize;
    (void)roundingfactor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceFileSizeW(void* infhandle, void* infcontext, void* filename, void* section, void* filesize, uint32_t roundingfactor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceFileSizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, filename, section, filesize, roundingfactor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)filename;
    (void)section;
    (void)filesize;
    (void)roundingfactor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoA(void* infhandle, uint32_t sourceid, uint32_t infodesired, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sourceid, infodesired, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sourceid;
    (void)infodesired;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetSourceInfoW(void* infhandle, uint32_t sourceid, uint32_t infodesired, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetSourceInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sourceid, infodesired, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sourceid;
    (void)infodesired;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldA(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetStringFieldA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetStringFieldW(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetStringFieldW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, fieldindex, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)fieldindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathA(void* infhandle, void* infcontext, void* section, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetTargetPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, section, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)section;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetTargetPathW(void* infhandle, void* infcontext, void* section, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetTargetPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, section, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)section;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

uint64_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupGetThreadLogToken(void) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupGetThreadLogToken");
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallback(void* ownerwindow) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitDefaultQueueCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ownerwindow);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ownerwindow;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitDefaultQueueCallbackEx(void* ownerwindow, void* alternateprogresswindow, uint32_t progressmessage, uint32_t reserved1, void* reserved2) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitDefaultQueueCallbackEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ownerwindow, alternateprogresswindow, progressmessage, reserved1, reserved2);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)ownerwindow;
    (void)alternateprogresswindow;
    (void)progressmessage;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogA(void* logfilename, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitializeFileLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)logfilename;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInitializeFileLogW(void* logfilename, uint32_t flags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInitializeFileLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, flags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)logfilename;
    (void)flags;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileA(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExA(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context, void* filewasinuse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context, filewasinuse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    (void)filewasinuse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileExW(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context, void* filewasinuse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context, filewasinuse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    (void)filewasinuse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFileW(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, infcontext, sourcefile, sourcepathroot, destinationname, copystyle, copymsghandler, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)infcontext;
    (void)sourcefile;
    (void)sourcepathroot;
    (void)destinationname;
    (void)copystyle;
    (void)copymsghandler;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionA(void* infhandle, void* layoutinfhandle, void* filequeue, void* sectionname, void* sourcerootpath, uint32_t copyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFilesFromInfSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)layoutinfhandle;
    (void)filequeue;
    (void)sectionname;
    (void)sourcerootpath;
    (void)copyflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFilesFromInfSectionW(void* infhandle, void* layoutinfhandle, void* filequeue, void* sectionname, void* sourcerootpath, uint32_t copyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFilesFromInfSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, layoutinfhandle, filequeue, sectionname, sourcerootpath, copyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)layoutinfhandle;
    (void)filequeue;
    (void)sectionname;
    (void)sourcerootpath;
    (void)copyflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionA(void* owner, void* infhandle, void* sectionname, uint32_t flags, void* relativekeyroot, void* sourcerootpath, uint32_t copyflags, void* msghandler, void* context, int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFromInfSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(owner, infhandle, sectionname, flags, relativekeyroot, sourcerootpath, copyflags, msghandler, context, deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)owner;
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)relativekeyroot;
    (void)sourcerootpath;
    (void)copyflags;
    (void)msghandler;
    (void)context;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallFromInfSectionW(void* owner, void* infhandle, void* sectionname, uint32_t flags, void* relativekeyroot, void* sourcerootpath, uint32_t copyflags, void* msghandler, void* context, int64_t deviceinfoset, void* deviceinfodata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallFromInfSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(owner, infhandle, sectionname, flags, relativekeyroot, sourcerootpath, copyflags, msghandler, context, deviceinfoset, deviceinfodata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)owner;
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)relativekeyroot;
    (void)sourcerootpath;
    (void)copyflags;
    (void)msghandler;
    (void)context;
    (void)deviceinfoset;
    (void)deviceinfodata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionA(void* infhandle, void* sectionname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sectionname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExA(void* infhandle, void* sectionname, uint32_t flags, int64_t deviceinfoset, void* deviceinfodata, void* reserved1, void* reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sectionname, flags, deviceinfoset, deviceinfodata, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionExW(void* infhandle, void* sectionname, uint32_t flags, int64_t deviceinfoset, void* deviceinfodata, void* reserved1, void* reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sectionname, flags, deviceinfoset, deviceinfodata, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    (void)deviceinfoset;
    (void)deviceinfodata;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupInstallServicesFromInfSectionW(void* infhandle, void* sectionname, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupInstallServicesFromInfSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, sectionname, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)sectionname;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetA(void* cabinetfile, uint32_t reserved, void* msghandler, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupIterateCabinetA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cabinetfile, reserved, msghandler, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cabinetfile;
    (void)reserved;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupIterateCabinetW(void* cabinetfile, uint32_t reserved, void* msghandler, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupIterateCabinetW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cabinetfile, reserved, msghandler, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cabinetfile;
    (void)reserved;
    (void)msghandler;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorA(void* messagestring, uint32_t severity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(messagestring, severity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)messagestring;
    (void)severity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogErrorW(void* messagestring, uint32_t severity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(messagestring, severity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)messagestring;
    (void)severity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileA(void* fileloghandle, void* logsectionname, void* sourcefilename, void* targetfilename, uint32_t checksum, void* disktagfile, void* diskdescription, void* otherinfo, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum, disktagfile, diskdescription, otherinfo, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)sourcefilename;
    (void)targetfilename;
    (void)checksum;
    (void)disktagfile;
    (void)diskdescription;
    (void)otherinfo;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupLogFileW(void* fileloghandle, void* logsectionname, void* sourcefilename, void* targetfilename, uint32_t checksum, void* disktagfile, void* diskdescription, void* otherinfo, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupLogFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileloghandle, logsectionname, sourcefilename, targetfilename, checksum, disktagfile, diskdescription, otherinfo, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)sourcefilename;
    (void)targetfilename;
    (void)checksum;
    (void)disktagfile;
    (void)diskdescription;
    (void)otherinfo;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileA(void* filename, void* infhandle, void* errorline) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenAppendInfFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, infhandle, errorline);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)infhandle;
    (void)errorline;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenAppendInfFileW(void* filename, void* infhandle, void* errorline) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenAppendInfFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, infhandle, errorline);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filename;
    (void)infhandle;
    (void)errorline;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenFileQueue(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenFileQueue");
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileA(void* filename, void* infclass, uint32_t infstyle, void* errorline) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenInfFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, infclass, infstyle, errorline);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)infclass;
    (void)infstyle;
    (void)errorline;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenInfFileW(void* filename, void* infclass, uint32_t infstyle, void* errorline) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenInfFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filename, infclass, infstyle, errorline);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)filename;
    (void)infclass;
    (void)infstyle;
    (void)errorline;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenLog(int32_t erase) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(erase);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)erase;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_devices_deviceanddriverinstallation_SetupOpenMasterInf(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupOpenMasterInf");
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreA(void* queuehandle, void* backuppath, uint32_t restoreflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPrepareQueueForRestoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, backuppath, restoreflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)backuppath;
    (void)restoreflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPrepareQueueForRestoreW(void* queuehandle, void* backuppath, uint32_t restoreflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPrepareQueueForRestoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, backuppath, restoreflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)backuppath;
    (void)restoreflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskA(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* filesought, void* tagfile, uint32_t diskpromptstyle, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPromptForDiskA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle, pathbuffer, pathbuffersize, pathrequiredsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)filesought;
    (void)tagfile;
    (void)diskpromptstyle;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptForDiskW(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* filesought, void* tagfile, uint32_t diskpromptstyle, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPromptForDiskW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, diskname, pathtosource, filesought, tagfile, diskpromptstyle, pathbuffer, pathbuffersize, pathrequiredsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)diskname;
    (void)pathtosource;
    (void)filesought;
    (void)tagfile;
    (void)diskpromptstyle;
    (void)pathbuffer;
    (void)pathbuffersize;
    (void)pathrequiredsize;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupPromptReboot(void* filequeue, void* owner, int32_t scanonly) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupPromptReboot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filequeue, owner, scanonly);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filequeue;
    (void)owner;
    (void)scanonly;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListA(void* diskspace, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryDrivesInDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryDrivesInDiskSpaceListW(void* diskspace, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryDrivesInDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogA(void* fileloghandle, void* logsectionname, void* targetfilename, int32_t desiredinfo, void* dataout, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryFileLogA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileloghandle, logsectionname, targetfilename, desiredinfo, dataout, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    (void)desiredinfo;
    (void)dataout;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryFileLogW(void* fileloghandle, void* logsectionname, void* targetfilename, int32_t desiredinfo, void* dataout, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryFileLogW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileloghandle, logsectionname, targetfilename, desiredinfo, dataout, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    (void)desiredinfo;
    (void)dataout;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationA(void* infinformation, uint32_t infindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfFileInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infinformation, infindex, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfFileInformationW(void* infinformation, uint32_t infindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfFileInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infinformation, infindex, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationA(void* infinformation, uint32_t infindex, void* alternateplatforminfo, void* originalfileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfOriginalFileInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infinformation, infindex, alternateplatforminfo, originalfileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)alternateplatforminfo;
    (void)originalfileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfOriginalFileInformationW(void* infinformation, uint32_t infindex, void* alternateplatforminfo, void* originalfileinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfOriginalFileInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infinformation, infindex, alternateplatforminfo, originalfileinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)alternateplatforminfo;
    (void)originalfileinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationA(void* infinformation, uint32_t infindex, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfVersionInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infinformation, infindex, key, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueryInfVersionInformationW(void* infinformation, uint32_t infindex, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueryInfVersionInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infinformation, infindex, key, returnbuffer, returnbuffersize, requiredsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infinformation;
    (void)infindex;
    (void)key;
    (void)returnbuffer;
    (void)returnbuffersize;
    (void)requiredsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListA(uint32_t flags, void* list, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySourceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, list, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)list;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySourceListW(uint32_t flags, void* list, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySourceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, list, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)list;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveA(void* diskspace, void* drivespec, void* spacerequired, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySpaceRequiredOnDriveA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, drivespec, spacerequired, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)drivespec;
    (void)spacerequired;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQuerySpaceRequiredOnDriveW(void* diskspace, void* drivespec, void* spacerequired, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQuerySpaceRequiredOnDriveW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, drivespec, spacerequired, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)drivespec;
    (void)spacerequired;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyA(void* queuehandle, void* sourcerootpath, void* sourcepath, void* sourcefilename, void* sourcedescription, void* sourcetagfile, void* targetdirectory, void* targetfilename, uint32_t copystyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)sourcepath;
    (void)sourcefilename;
    (void)sourcedescription;
    (void)sourcetagfile;
    (void)targetdirectory;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectA(void* copyparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyIndirectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(copyparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)copyparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyIndirectW(void* copyparams) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyIndirectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(copyparams);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)copyparams;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionA(void* queuehandle, void* sourcerootpath, void* infhandle, void* listinfhandle, void* section, uint32_t copystyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopySectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    (void)copystyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopySectionW(void* queuehandle, void* sourcerootpath, void* infhandle, void* listinfhandle, void* section, uint32_t copystyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopySectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, sourcerootpath, infhandle, listinfhandle, section, copystyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    (void)copystyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueCopyW(void* queuehandle, void* sourcerootpath, void* sourcepath, void* sourcefilename, void* sourcedescription, void* sourcetagfile, void* targetdirectory, void* targetfilename, uint32_t copystyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueCopyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, sourcerootpath, sourcepath, sourcefilename, sourcedescription, sourcetagfile, targetdirectory, targetfilename, copystyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)sourcerootpath;
    (void)sourcepath;
    (void)sourcefilename;
    (void)sourcedescription;
    (void)sourcetagfile;
    (void)targetdirectory;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyA(void* queuehandle, void* infhandle, void* sourcerootpath, void* sourcefilename, void* targetfilename, uint32_t copystyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDefaultCopyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)sourcerootpath;
    (void)sourcefilename;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDefaultCopyW(void* queuehandle, void* infhandle, void* sourcerootpath, void* sourcefilename, void* targetfilename, uint32_t copystyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDefaultCopyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, infhandle, sourcerootpath, sourcefilename, targetfilename, copystyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)sourcerootpath;
    (void)sourcefilename;
    (void)targetfilename;
    (void)copystyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteA(void* queuehandle, void* pathpart1, void* pathpart2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, pathpart1, pathpart2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)pathpart1;
    (void)pathpart2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionA(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, infhandle, listinfhandle, section);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteSectionW(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, infhandle, listinfhandle, section);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueDeleteW(void* queuehandle, void* pathpart1, void* pathpart2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueDeleteW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, pathpart1, pathpart2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)pathpart1;
    (void)pathpart2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameA(void* queuehandle, void* sourcepath, void* sourcefilename, void* targetpath, void* targetfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)sourcepath;
    (void)sourcefilename;
    (void)targetpath;
    (void)targetfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionA(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameSectionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, infhandle, listinfhandle, section);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameSectionW(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameSectionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, infhandle, listinfhandle, section);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)infhandle;
    (void)listinfhandle;
    (void)section;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupQueueRenameW(void* queuehandle, void* sourcepath, void* sourcefilename, void* targetpath, void* targetfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupQueueRenameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, sourcepath, sourcefilename, targetpath, targetfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)sourcepath;
    (void)sourcefilename;
    (void)targetpath;
    (void)targetfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryA(void* fileloghandle, void* logsectionname, void* targetfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFileLogEntryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileloghandle, logsectionname, targetfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFileLogEntryW(void* fileloghandle, void* logsectionname, void* targetfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFileLogEntryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileloghandle, logsectionname, targetfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileloghandle;
    (void)logsectionname;
    (void)targetfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListA(void* diskspace, void* targetfilespec, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, targetfilespec, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromDiskSpaceListW(void* diskspace, void* targetfilespec, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, targetfilespec, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)targetfilespec;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListA(uint32_t flags, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromSourceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveFromSourceListW(uint32_t flags, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveFromSourceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListA(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveInstallSectionFromDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveInstallSectionFromDiskSpaceListW(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveInstallSectionFromDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, layoutinfhandle, sectionname, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)layoutinfhandle;
    (void)sectionname;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListA(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveSectionFromDiskSpaceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRemoveSectionFromDiskSpaceListW(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRemoveSectionFromDiskSpaceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(diskspace, infhandle, listinfhandle, sectionname, operation, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)diskspace;
    (void)infhandle;
    (void)listinfhandle;
    (void)sectionname;
    (void)operation;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorA(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRenameErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupRenameErrorW(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupRenameErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, dialogtitle, sourcefile, targetfile, win32errorcode, style);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hwndparent;
    (void)dialogtitle;
    (void)sourcefile;
    (void)targetfile;
    (void)win32errorcode;
    (void)style;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueA(void* filequeue, uint32_t flags, void* window, void* callbackroutine, void* callbackcontext, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupScanFileQueueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filequeue, flags, window, callbackroutine, callbackcontext, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filequeue;
    (void)flags;
    (void)window;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupScanFileQueueW(void* filequeue, uint32_t flags, void* window, void* callbackroutine, void* callbackcontext, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupScanFileQueueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filequeue, flags, window, callbackroutine, callbackcontext, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filequeue;
    (void)flags;
    (void)window;
    (void)callbackroutine;
    (void)callbackcontext;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdA(void* infhandle, uint32_t id, void* directory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, id, directory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExA(void* infhandle, uint32_t id, void* directory, uint32_t flags, uint32_t reserved1, void* reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, id, directory, flags, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    (void)flags;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdExW(void* infhandle, uint32_t id, void* directory, uint32_t flags, uint32_t reserved1, void* reserved2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, id, directory, flags, reserved1, reserved2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    (void)flags;
    (void)reserved1;
    (void)reserved2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetDirectoryIdW(void* infhandle, uint32_t id, void* directory) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetDirectoryIdW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infhandle, id, directory);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)id;
    (void)directory;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformA(void* queuehandle, void* alternateplatforminfo, void* alternatedefaultcatalogfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetFileQueueAlternatePlatformA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)alternateplatforminfo;
    (void)alternatedefaultcatalogfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueAlternatePlatformW(void* queuehandle, void* alternateplatforminfo, void* alternatedefaultcatalogfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetFileQueueAlternatePlatformW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(queuehandle, alternateplatforminfo, alternatedefaultcatalogfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)queuehandle;
    (void)alternateplatforminfo;
    (void)alternatedefaultcatalogfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetFileQueueFlags(void* filequeue, uint32_t flagmask, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetFileQueueFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filequeue, flagmask, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filequeue;
    (void)flagmask;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetNonInteractiveMode(int32_t noninteractiveflag) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetNonInteractiveMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(noninteractiveflag);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)noninteractiveflag;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideA(void* override) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetPlatformPathOverrideA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(override);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)override;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetPlatformPathOverrideW(void* override) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetPlatformPathOverrideW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(override);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)override;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListA(uint32_t flags, void* sourcelist, uint32_t sourcecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetSourceListA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, sourcelist, sourcecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)sourcelist;
    (void)sourcecount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetSourceListW(uint32_t flags, void* sourcelist, uint32_t sourcecount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetSourceListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, sourcelist, sourcecount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)sourcelist;
    (void)sourcecount;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_SetupSetThreadLogToken(uint64_t logtoken) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupSetThreadLogToken");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(logtoken);
        return;
    }
    errno = ENOSYS;
#else
    (void)logtoken;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTermDefaultQueueCallback(void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupTermDefaultQueueCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupTerminateFileLog(void* fileloghandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupTerminateFileLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileloghandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileloghandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallNewlyCopiedInfs(void* filequeue, uint32_t flags, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupUninstallNewlyCopiedInfs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filequeue, flags, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filequeue;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfA(void* inffilename, uint32_t flags, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupUninstallOEMInfA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inffilename, flags, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inffilename;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupUninstallOEMInfW(void* inffilename, uint32_t flags, void* reserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupUninstallOEMInfW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(inffilename, flags, reserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)inffilename;
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileA(void* infname, void* altplatforminfo, void* infsignerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupVerifyInfFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infname, altplatforminfo, infsignerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infname;
    (void)altplatforminfo;
    (void)infsignerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_SetupVerifyInfFileW(void* infname, void* altplatforminfo, void* infsignerinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupVerifyInfFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(infname, altplatforminfo, infsignerinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infname;
    (void)altplatforminfo;
    (void)infsignerinfo;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_SetupWriteTextLogInfLine(uint64_t logtoken, uint32_t flags, void* infhandle, void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupWriteTextLogInfLine");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(logtoken, flags, infhandle, context);
        return;
    }
    errno = ENOSYS;
#else
    (void)logtoken;
    (void)flags;
    (void)infhandle;
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesA(void* hwndparent, void* hardwareid, void* fullinfpath, uint32_t installflags, void* brebootrequired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDriverForPlugAndPlayDevicesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hardwareid, fullinfpath, installflags, brebootrequired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)hardwareid;
    (void)fullinfpath;
    (void)installflags;
    (void)brebootrequired;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_UpdateDriverForPlugAndPlayDevicesW(void* hwndparent, void* hardwareid, void* fullinfpath, uint32_t installflags, void* brebootrequired) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("newdev.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateDriverForPlugAndPlayDevicesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndparent, hardwareid, fullinfpath, installflags, brebootrequired);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndparent;
    (void)hardwareid;
    (void)fullinfpath;
    (void)installflags;
    (void)brebootrequired;
    errno = ENOSYS;
    return -1;
#endif
}

