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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmpWaitNoPendingInstallEvents(uint32_t dwtimeout) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConf(void* plclogconf, uint32_t dndevinst, int32_t priority, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddEmptyLogConfEx(void* plclogconf, uint32_t dndevinst, int32_t priority, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIda(uint32_t dndevinst, void* pszid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdw(uint32_t dndevinst, void* pszid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExA(uint32_t dndevinst, void* pszid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddIdExW(uint32_t dndevinst, void* pszid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddRange(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDes(void* prdresdes, uint64_t lclogconf, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmAddResDesEx(void* prdresdes, uint64_t lclogconf, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineA(void* uncservername, void* phmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmConnectMachineW(void* uncservername, void* phmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeA(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeW(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExA(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateDevNodeExW(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmCreateRangeList(void* prlh, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKey(void* classguid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteClassKeyEx(void* classguid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKey(uint32_t dndevnode, uint32_t ulhardwareprofile, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDevNodeKeyEx(uint32_t dndevnode, uint32_t ulhardwareprofile, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyA(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyW(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExA(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteDeviceInterfaceKeyExW(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDeleteRange(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflict(uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, void* pbconflictdetected, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDetectResourceConflictEx(uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, void* pbconflictdetected, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisableDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDisconnectMachine(int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmDupRangeList(uint64_t rlhold, uint64_t rlhnew, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnableDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClasses(uint32_t ulclassindex, void* classguid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateClassesEx(uint32_t ulclassindex, void* classguid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsA(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsW(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExA(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmEnumerateEnumeratorsExW(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFindRange(void* pullstart, uint64_t ullstart, uint32_t ullength, uint64_t ullalignment, uint64_t ullend, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFirstRange(uint64_t rlh, void* pullstart, void* pullend, void* preelement, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConf(uint64_t lclogconftobefreed, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfEx(uint64_t lclogconftobefreed, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeLogConfHandle(uint64_t lclogconf) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeRangeList(uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDes(void* prdresdes, uint64_t rdresdes, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesEx(void* prdresdes, uint64_t rdresdes, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResDesHandle(uint64_t rdresdes) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmFreeResourceConflictHandle(uint64_t clconflictlist) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChild(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetChildEx(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameA(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameW(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExA(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassKeyNameExW(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameA(void* classguid, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameW(void* classguid, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExA(void* classguid, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassNameExW(void* classguid, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyExW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeys(void* classguid, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassPropertyKeysEx(void* classguid, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyA(void* classguid, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetClassRegistryPropertyW(void* classguid, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepth(void* puldepth, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDepthEx(void* puldepth, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyA(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyW(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExA(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeCustomPropertyExW(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyW(uint32_t dndevinst, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyExW(uint32_t dndevinst, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeys(uint32_t dndevinst, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodePropertyKeysEx(uint32_t dndevinst, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyA(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyW(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExA(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeRegistryPropertyExW(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatus(void* pulstatus, void* pulproblemnumber, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDevNodeStatusEx(void* pulstatus, void* pulproblemnumber, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIda(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdw(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExA(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdExW(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListA(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListW(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExA(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListExW(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeA(void* pullen, void* pszfilter, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeW(void* pullen, void* pszfilter, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExA(void* pullen, void* pszfilter, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdListSizeExW(void* pullen, void* pszfilter, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSize(void* pullen, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceIdSizeEx(void* pullen, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasA(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasW(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExA(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceAliasExW(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListA(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListW(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExA(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListExW(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeA(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeW(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExA(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfaceListSizeExW(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyW(void* pszdeviceinterface, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyExW(void* pszdeviceinterface, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysW(void* pszdeviceinterface, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetDeviceInterfacePropertyKeysExW(void* pszdeviceinterface, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConf(void* plclogconf, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetFirstLogConfEx(void* plclogconf, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalState(void* pulstate, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetGlobalStateEx(void* pulstate, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsA(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsW(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExA(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHwProfFlagsExW(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoA(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoW(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExA(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetHardwareProfileInfoExW(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriority(uint64_t lclogconf, void* ppriority, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetLogConfPriorityEx(uint64_t lclogconf, void* ppriority, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConf(void* plclogconf, uint64_t lclogconf, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextLogConfEx(void* plclogconf, uint64_t lclogconf, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDes(void* prdresdes, uint64_t rdresdes, uint32_t forresource, void* presourceid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetNextResDesEx(void* prdresdes, uint64_t rdresdes, uint32_t forresource, void* presourceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParent(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetParentEx(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesData(uint64_t rdresdes, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataEx(uint64_t rdresdes, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSize(void* pulsize, uint64_t rdresdes, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResDesDataSizeEx(void* pulsize, uint64_t rdresdes, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictCount(uint64_t clconflictlist, void* pulcount) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsA(uint64_t clconflictlist, uint32_t ulindex, void* pconflictdetails) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetResourceConflictDetailsW(uint64_t clconflictlist, uint32_t ulindex, void* pconflictdetails) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSibling(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetSiblingEx(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint16_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersion(void) {
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

uint16_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmGetVersionEx(int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmIntersectRangeList(uint64_t rlhold1, uint64_t rlhold2, uint64_t rlhnew, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmInvertRangeList(uint64_t rlhold, uint64_t rlhnew, uint64_t ullmaxvalue, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresent(void* pbpresent) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsDockStationPresentEx(void* pbpresent, int64_t hmachine) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailable(uint16_t wversion) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmIsVersionAvailableEx(uint16_t wversion, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeA(void* pdndevinst, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeW(void* pdndevinst, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExA(void* pdndevinst, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmLocateDevNodeExW(void* pdndevinst, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmMapCrToWin32Err(uint32_t cmreturncode, uint32_t defaulterr) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmMergeRangeList(uint64_t rlhold1, uint64_t rlhold2, uint64_t rlhnew, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDes(void* prdresdes, uint64_t rdresdes, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmModifyResDesEx(void* prdresdes, uint64_t rdresdes, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNode(uint32_t dnfromdevinst, uint32_t dntodevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmMoveDevNodeEx(uint32_t dnfromdevinst, uint32_t dntodevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmNextRange(void* preelement, void* pullstart, void* pullend, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyA(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyW(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExA(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenClassKeyExW(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKey(uint32_t dndevnode, uint32_t samdesired, uint32_t ulhardwareprofile, uint32_t disposition, void* phkdevice, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDevNodeKeyEx(uint32_t dndevnode, uint32_t samdesired, uint32_t ulhardwareprofile, uint32_t disposition, void* phkdevice, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyA(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyW(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExA(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmOpenDeviceInterfaceKeyExW(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeA(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeW(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExA(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryAndRemoveSubTreeExW(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeData(void* pdata, uint32_t datalen, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeDataEx(void* pdata, uint32_t datalen, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSize(void* pulsize, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryArbitratorFreeSizeEx(void* pulsize, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTree(uint32_t dnancestor, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryRemoveSubTreeEx(uint32_t dnancestor, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmQueryResourceConflictList(void* pclconflictlist, uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmReenumerateDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriver(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceDriverEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceA(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceW(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExA(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterDeviceInterfaceExW(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRegisterNotification(void* pfilter, void* pcontext, void* pcallback, void* pnotifycontext) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTree(uint32_t dnancestor, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRemoveSubTreeEx(uint32_t dnancestor, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectA(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectW(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExA(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestDeviceEjectExW(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPc(void) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRequestEjectPcEx(int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetection(uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmRunDetectionEx(uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassPropertyExW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyA(void* classguid, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetClassRegistryPropertyW(void* classguid, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblem(uint32_t dndevinst, uint32_t ulproblem, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeProblemEx(uint32_t dndevinst, uint32_t ulproblem, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyW(uint32_t dndevinst, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodePropertyExW(uint32_t dndevinst, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyA(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyW(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExA(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDevNodeRegistryPropertyExW(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyW(void* pszdeviceinterface, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetDeviceInterfacePropertyExW(void* pszdeviceinterface, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProf(uint32_t ulhardwareprofile, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfEx(uint32_t ulhardwareprofile, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsA(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsW(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExA(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetHwProfFlagsExW(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmSetupDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmTestRangeAvailable(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmUninstallDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceA(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceW(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExA(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterDeviceInterfaceExW(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_cmUnregisterNotification(void* notifycontext) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverA(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diInstallDriverW(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diRollbackDriver(int64_t deviceinfoset, void* deviceinfodata, void* hwndparent, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diShowUpdateDriver(void* hwndparent, void* filepath, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverA(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_diUninstallDriverW(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

void windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionA(void* window, void* modulehandle, void* commandline, int32_t showcommand) {
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

void windowssys_windows_win32_devices_deviceanddriverinstallation_installHinfSectionW(void* window, void* modulehandle, void* commandline, int32_t showcommand) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListA(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddInstallSectionToDiskSpaceListW(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListA(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddSectionToDiskSpaceListW(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListA(void* diskspace, void* targetfilespec, int64_t filesize, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToDiskSpaceListW(void* diskspace, void* targetfilespec, int64_t filesize, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListA(uint32_t flags, void* source) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAddToSourceListW(uint32_t flags, void* source) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListA(void* diskspace, void* driveroot, int64_t amount, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupAdjustDiskSpaceListW(void* diskspace, void* driveroot, int64_t amount, void* reserved1, uint32_t reserved2) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorA(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupBackupErrorW(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCancelTemporarySourceList(void) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseFileQueue(void* queuehandle) {
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

void windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseInfFile(void* infhandle) {
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

void windowssys_windows_win32_devices_deviceanddriverinstallation_setupCloseLog(void) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueA(void* owner, void* queuehandle, void* msghandler, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCommitFileQueueW(void* owner, void* queuehandle, void* msghandler, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionA(void* infhandle, void* sectionname, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupConfigureWmiFromInfSectionW(void* infhandle, void* sectionname, uint32_t flags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorA(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* sourcefile, void* targetpathfile, uint32_t win32errorcode, uint32_t style, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyErrorW(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* sourcefile, void* targetpathfile, uint32_t win32errorcode, uint32_t style, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfA(void* sourceinffilename, void* oemsourcemedialocation, uint32_t oemsourcemediatype, uint32_t copystyle, void* destinationinffilename, uint32_t destinationinffilenamesize, void* requiredsize, void* destinationinffilenamecomponent) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupCopyOEMInfW(void* sourceinffilename, void* oemsourcemedialocation, uint32_t oemsourcemediatype, uint32_t copystyle, void* destinationinffilename, uint32_t destinationinffilenamesize, void* requiredsize, void* destinationinffilenamecomponent) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListA(void* reserved1, uint32_t reserved2, uint32_t flags) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupCreateDiskSpaceListW(void* reserved1, uint32_t reserved2, uint32_t flags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileA(void* sourcefilename, void* targetfilename, void* compressiontype) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDecompressOrCopyFileW(void* sourcefilename, void* targetfilename, void* compressiontype) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackA(void* context, uint32_t notification, uint64_t param1, uint64_t param2) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDefaultQueueCallbackW(void* context, uint32_t notification, uint64_t param1, uint64_t param2) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorA(void* hwndparent, void* dialogtitle, void* file, uint32_t win32errorcode, uint32_t style) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDeleteErrorW(void* hwndparent, void* dialogtitle, void* file, uint32_t win32errorcode, uint32_t style) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDestroyDiskSpaceList(void* diskspace) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiAskForOEMDisk(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoList(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExA(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildClassInfoListExW(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiBuildDriverInfoList(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCallClassInstaller(uint32_t installfunction, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCancelDriverInfoSearch(int64_t deviceinfoset) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiChangeState(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameA(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExA(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameExW(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassGuidsFromNameW(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidA(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExA(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidExW(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiClassNameFromGuidW(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, void* infhandle, void* infsectionname) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDevRegKeyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, void* infhandle, void* infsectionname) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoA(int64_t deviceinfoset, void* devicename, void* classguid, void* devicedescription, void* hwndparent, uint32_t creationflags, void* deviceinfodata) {
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

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoList(void* classguid, void* hwndparent) {
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

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExA(void* classguid, void* hwndparent, void* machinename, void* reserved) {
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

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoListExW(void* classguid, void* hwndparent, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInfoW(int64_t deviceinfoset, void* devicename, void* classguid, void* devicedescription, void* hwndparent, uint32_t creationflags, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceA(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, void* referencestring, uint32_t creationflags, void* deviceinterfacedata) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyA(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired, void* infhandle, void* infsectionname) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceRegKeyW(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired, void* infhandle, void* infsectionname) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiCreateDeviceInterfaceW(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, void* referencestring, uint32_t creationflags, void* deviceinterfacedata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDevRegKey(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInfo(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceData(int64_t deviceinfoset, void* deviceinterfacedata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDeleteDeviceInterfaceRegKey(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyClassImageList(void* classimagelistdata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDeviceInfoList(int64_t deviceinfoset) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiDestroyDriverInfoList(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInfo(int64_t deviceinfoset, uint32_t memberindex, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDeviceInterfaces(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, uint32_t memberindex, void* deviceinterfacedata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoA(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype, uint32_t memberindex, void* driverinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiEnumDriverInfoW(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype, uint32_t memberindex, void* driverinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionA(void* context, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualModelsSectionW(void* context, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallA(void* infhandle, void* infsectionname, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExA(void* infhandle, void* infsectionname, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallExW(void* infhandle, void* infsectionname, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetActualSectionToInstallW(void* infhandle, void* infsectionname, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassBitmapIndex(void* classguid, void* miniiconindex) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionA(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExA(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionExW(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDescriptionW(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsA(int64_t deviceinfoset, void* deviceinfodata, void* propertysheetheader, uint32_t propertysheetheaderpagelistsize, void* requiredsize, uint32_t propertysheettype) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevPropertySheetsW(int64_t deviceinfoset, void* deviceinfodata, void* propertysheetheader, uint32_t propertysheetheaderpagelistsize, void* requiredsize, uint32_t propertysheettype) {
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

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsA(void* classguid, void* enumerator, void* hwndparent, uint32_t flags) {
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

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExA(void* classguid, void* enumerator, void* hwndparent, uint32_t flags, int64_t deviceinfoset, void* machinename, void* reserved) {
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

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsExW(void* classguid, void* enumerator, void* hwndparent, uint32_t flags, int64_t deviceinfoset, void* machinename, void* reserved) {
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

int64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassDevsW(void* classguid, void* enumerator, void* hwndparent, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageIndex(void* classimagelistdata, void* classguid, void* imageindex) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageList(void* classimagelistdata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExA(void* classimagelistdata, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassImageListExW(void* classimagelistdata, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyExW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeys(void* classguid, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyKeysExW(void* classguid, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassPropertyW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyA(void* classguid, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetClassRegistryPropertyW(void* classguid, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyA(int64_t deviceinfoset, void* deviceinfodata, void* custompropertyname, uint32_t flags, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetCustomDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* custompropertyname, uint32_t flags, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListClass(int64_t deviceinfoset, void* classguid) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailA(int64_t deviceinfoset, void* deviceinfosetdetaildata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInfoListDetailW(int64_t deviceinfoset, void* deviceinfosetdetaildata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstanceid, uint32_t deviceinstanceidsize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInstanceIdW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstanceid, uint32_t deviceinstanceidsize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceAlias(int64_t deviceinfoset, void* deviceinterfacedata, void* aliasinterfaceclassguid, void* aliasdeviceinterfacedata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailA(int64_t deviceinfoset, void* deviceinterfacedata, void* deviceinterfacedetaildata, uint32_t deviceinterfacedetaildatasize, void* requiredsize, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfaceDetailW(int64_t deviceinfoset, void* deviceinterfacedata, void* deviceinterfacedetaildata, uint32_t deviceinterfacedetaildatasize, void* requiredsize, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyKeys(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceInterfacePropertyW(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyKeys(int64_t deviceinfoset, void* deviceinfodata, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDeviceRegistryPropertyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinfodetaildata, uint32_t driverinfodetaildatasize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInfoDetailW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinfodetaildata, uint32_t driverinfodetaildatasize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetDriverInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameA(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExA(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameExW(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileFriendlyNameW(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileList(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExA(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetHwProfileListExW(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassA(void* infname, void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetINFClassW(void* infname, void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetSelectedDriverW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiGetWizardPage(int64_t deviceinfoset, void* deviceinfodata, void* installwizarddata, uint32_t pagetype, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassA(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExA(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue, void* interfaceclassguid, void* reserved1, void* reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassExW(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue, void* interfaceclassguid, void* reserved1, void* reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallClassW(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDeviceInterfaces(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiInstallDriverFiles(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadClassIcon(void* classguid, void* largeicon, void* miniiconindex) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiLoadDeviceIcon(int64_t deviceinfoset, void* deviceinfodata, uint32_t cxicon, uint32_t cyicon, uint32_t flags, void* hicon) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKey(void* classguid, uint32_t samdesired) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExA(void* classguid, uint32_t samdesired, uint32_t flags, void* machinename, void* reserved) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenClassRegKeyExW(void* classguid, uint32_t samdesired, uint32_t flags, void* machinename, void* reserved) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDevRegKey(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, uint32_t samdesired) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoA(int64_t deviceinfoset, void* deviceinstanceid, void* hwndparent, uint32_t openflags, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInfoW(int64_t deviceinfoset, void* deviceinstanceid, void* hwndparent, uint32_t openflags, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceA(int64_t deviceinfoset, void* devicepath, uint32_t openflags, void* deviceinterfacedata) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceRegKey(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiOpenDeviceInterfaceW(int64_t deviceinfoset, void* devicepath, uint32_t openflags, void* deviceinterfacedata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterCoDeviceInstallers(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRegisterDeviceInfo(int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* compareproc, void* comparecontext, void* dupdeviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRemoveDeviceInterface(int64_t deviceinfoset, void* deviceinterfacedata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiRestartDevices(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectBestCompatDrv(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSelectOEMDrv(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyExW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassPropertyW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyA(void* classguid, uint32_t property, void* propertybuffer, uint32_t propertybuffersize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetClassRegistryPropertyW(void* classguid, uint32_t property, void* propertybuffer, uint32_t propertybuffersize, void* machinename, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfaceDefault(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t flags, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceInterfacePropertyW(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertybuffer, uint32_t propertybuffersize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDeviceRegistryPropertyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertybuffer, uint32_t propertybuffersize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetDriverInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiSetSelectedDriverW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupDiUnremoveDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListA(void* diskspace, void* reserved1, uint32_t reserved2, uint32_t flags) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupDuplicateDiskSpaceListW(void* diskspace, void* reserved1, uint32_t reserved2, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsA(void* infhandle, uint32_t arg_1_index, void* buffer, uint32_t size, void* sizeneeded) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupEnumInfSectionsW(void* infhandle, uint32_t arg_1_index, void* buffer, uint32_t size, void* sizeneeded) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineA(void* infhandle, void* section, void* key, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindFirstLineW(void* infhandle, void* section, void* key, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextLine(void* contextin, void* contextout) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineA(void* contextin, void* key, void* contextout) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupFindNextMatchLineW(void* contextin, void* key, void* contextout) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListA(void* list, uint32_t count) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupFreeSourceListW(void* list, uint32_t count) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationA(void* queuehandle, void* backupparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBackupInformationW(void* queuehandle, void* backupparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetBinaryField(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFieldCount(void* context) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoA(void* sourcefilename, void* actualsourcefilename, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExA(void* sourcefilename, void* actualsourcefilenamebuffer, uint32_t actualsourcefilenamebufferlen, void* requiredbufferlen, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoExW(void* sourcefilename, void* actualsourcefilenamebuffer, uint32_t actualsourcefilenamebufferlen, void* requiredbufferlen, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileCompressionInfoW(void* sourcefilename, void* actualsourcefilename, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueCount(void* filequeue, uint32_t subqueuefileop, void* numoperations) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetFileQueueFlags(void* filequeue, void* flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationA(void* filename, void* alternateplatforminfo, void* localename, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfDriverStoreLocationW(void* filename, void* alternateplatforminfo, void* localename, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListA(void* directorypath, uint32_t infstyle, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfFileListW(void* directorypath, uint32_t infstyle, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationA(void* infspec, uint32_t searchcontrol, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfInformationW(void* infspec, uint32_t searchcontrol, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameA(void* driverstorelocation, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetInfPublishedNameW(void* driverstorelocation, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetIntField(void* context, uint32_t fieldindex, void* integervalue) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexA(void* infhandle, void* section, uint32_t arg_2_index, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineByIndexW(void* infhandle, void* section, uint32_t arg_2_index, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountA(void* infhandle, void* section) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineCountW(void* infhandle, void* section) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextA(void* context, void* infhandle, void* section, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetLineTextW(void* context, void* infhandle, void* section, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldA(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetMultiSzFieldW(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetNonInteractiveMode(void) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationA(void* infhandle, void* infcontext, void* filename, void* sourceid, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileLocationW(void* infhandle, void* infcontext, void* filename, void* sourceid, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeA(void* infhandle, void* infcontext, void* filename, void* section, void* filesize, uint32_t roundingfactor) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceFileSizeW(void* infhandle, void* infcontext, void* filename, void* section, void* filesize, uint32_t roundingfactor) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoA(void* infhandle, uint32_t sourceid, uint32_t infodesired, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetSourceInfoW(void* infhandle, uint32_t sourceid, uint32_t infodesired, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldA(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetStringFieldW(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathA(void* infhandle, void* infcontext, void* section, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetTargetPathW(void* infhandle, void* infcontext, void* section, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

uint64_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupGetThreadLogToken(void) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallback(void* ownerwindow) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitDefaultQueueCallbackEx(void* ownerwindow, void* alternateprogresswindow, uint32_t progressmessage, uint32_t reserved1, void* reserved2) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogA(void* logfilename, uint32_t flags) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupInitializeFileLogW(void* logfilename, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileA(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExA(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context, void* filewasinuse) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileExW(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context, void* filewasinuse) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFileW(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionA(void* infhandle, void* layoutinfhandle, void* filequeue, void* sectionname, void* sourcerootpath, uint32_t copyflags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFilesFromInfSectionW(void* infhandle, void* layoutinfhandle, void* filequeue, void* sectionname, void* sourcerootpath, uint32_t copyflags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionA(void* owner, void* infhandle, void* sectionname, uint32_t flags, void* relativekeyroot, void* sourcerootpath, uint32_t copyflags, void* msghandler, void* context, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallFromInfSectionW(void* owner, void* infhandle, void* sectionname, uint32_t flags, void* relativekeyroot, void* sourcerootpath, uint32_t copyflags, void* msghandler, void* context, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionA(void* infhandle, void* sectionname, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExA(void* infhandle, void* sectionname, uint32_t flags, int64_t deviceinfoset, void* deviceinfodata, void* reserved1, void* reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionExW(void* infhandle, void* sectionname, uint32_t flags, int64_t deviceinfoset, void* deviceinfodata, void* reserved1, void* reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupInstallServicesFromInfSectionW(void* infhandle, void* sectionname, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetA(void* cabinetfile, uint32_t reserved, void* msghandler, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupIterateCabinetW(void* cabinetfile, uint32_t reserved, void* msghandler, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorA(void* messagestring, uint32_t severity) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogErrorW(void* messagestring, uint32_t severity) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileA(void* fileloghandle, void* logsectionname, void* sourcefilename, void* targetfilename, uint32_t checksum, void* disktagfile, void* diskdescription, void* otherinfo, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupLogFileW(void* fileloghandle, void* logsectionname, void* sourcefilename, void* targetfilename, uint32_t checksum, void* disktagfile, void* diskdescription, void* otherinfo, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileA(void* filename, void* infhandle, void* errorline) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenAppendInfFileW(void* filename, void* infhandle, void* errorline) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenFileQueue(void) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileA(void* filename, void* infclass, uint32_t infstyle, void* errorline) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenInfFileW(void* filename, void* infclass, uint32_t infstyle, void* errorline) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenLog(int32_t erase) {
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

void* windowssys_windows_win32_devices_deviceanddriverinstallation_setupOpenMasterInf(void) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreA(void* queuehandle, void* backuppath, uint32_t restoreflags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupPrepareQueueForRestoreW(void* queuehandle, void* backuppath, uint32_t restoreflags) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskA(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* filesought, void* tagfile, uint32_t diskpromptstyle, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptForDiskW(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* filesought, void* tagfile, uint32_t diskpromptstyle, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupPromptReboot(void* filequeue, void* owner, int32_t scanonly) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListA(void* diskspace, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryDrivesInDiskSpaceListW(void* diskspace, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogA(void* fileloghandle, void* logsectionname, void* targetfilename, int32_t desiredinfo, void* dataout, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryFileLogW(void* fileloghandle, void* logsectionname, void* targetfilename, int32_t desiredinfo, void* dataout, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationA(void* infinformation, uint32_t infindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfFileInformationW(void* infinformation, uint32_t infindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationA(void* infinformation, uint32_t infindex, void* alternateplatforminfo, void* originalfileinfo) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfOriginalFileInformationW(void* infinformation, uint32_t infindex, void* alternateplatforminfo, void* originalfileinfo) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationA(void* infinformation, uint32_t infindex, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueryInfVersionInformationW(void* infinformation, uint32_t infindex, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListA(uint32_t flags, void* list, void* count) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySourceListW(uint32_t flags, void* list, void* count) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveA(void* diskspace, void* drivespec, void* spacerequired, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQuerySpaceRequiredOnDriveW(void* diskspace, void* drivespec, void* spacerequired, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyA(void* queuehandle, void* sourcerootpath, void* sourcepath, void* sourcefilename, void* sourcedescription, void* sourcetagfile, void* targetdirectory, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectA(void* copyparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyIndirectW(void* copyparams) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionA(void* queuehandle, void* sourcerootpath, void* infhandle, void* listinfhandle, void* section, uint32_t copystyle) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopySectionW(void* queuehandle, void* sourcerootpath, void* infhandle, void* listinfhandle, void* section, uint32_t copystyle) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueCopyW(void* queuehandle, void* sourcerootpath, void* sourcepath, void* sourcefilename, void* sourcedescription, void* sourcetagfile, void* targetdirectory, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyA(void* queuehandle, void* infhandle, void* sourcerootpath, void* sourcefilename, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDefaultCopyW(void* queuehandle, void* infhandle, void* sourcerootpath, void* sourcefilename, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteA(void* queuehandle, void* pathpart1, void* pathpart2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionA(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteSectionW(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueDeleteW(void* queuehandle, void* pathpart1, void* pathpart2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameA(void* queuehandle, void* sourcepath, void* sourcefilename, void* targetpath, void* targetfilename) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionA(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameSectionW(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupQueueRenameW(void* queuehandle, void* sourcepath, void* sourcefilename, void* targetpath, void* targetfilename) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryA(void* fileloghandle, void* logsectionname, void* targetfilename) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFileLogEntryW(void* fileloghandle, void* logsectionname, void* targetfilename) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListA(void* diskspace, void* targetfilespec, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromDiskSpaceListW(void* diskspace, void* targetfilespec, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListA(uint32_t flags, void* source) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveFromSourceListW(uint32_t flags, void* source) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListA(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveInstallSectionFromDiskSpaceListW(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListA(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRemoveSectionFromDiskSpaceListW(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorA(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

uint32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupRenameErrorW(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueA(void* filequeue, uint32_t flags, void* window, void* callbackroutine, void* callbackcontext, void* result) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupScanFileQueueW(void* filequeue, uint32_t flags, void* window, void* callbackroutine, void* callbackcontext, void* result) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdA(void* infhandle, uint32_t id, void* directory) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExA(void* infhandle, uint32_t id, void* directory, uint32_t flags, uint32_t reserved1, void* reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdExW(void* infhandle, uint32_t id, void* directory, uint32_t flags, uint32_t reserved1, void* reserved2) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetDirectoryIdW(void* infhandle, uint32_t id, void* directory) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformA(void* queuehandle, void* alternateplatforminfo, void* alternatedefaultcatalogfile) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueAlternatePlatformW(void* queuehandle, void* alternateplatforminfo, void* alternatedefaultcatalogfile) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetFileQueueFlags(void* filequeue, uint32_t flagmask, uint32_t flags) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetNonInteractiveMode(int32_t noninteractiveflag) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideA(void* override) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetPlatformPathOverrideW(void* override) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListA(uint32_t flags, void* sourcelist, uint32_t sourcecount) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetSourceListW(uint32_t flags, void* sourcelist, uint32_t sourcecount) {
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

void windowssys_windows_win32_devices_deviceanddriverinstallation_setupSetThreadLogToken(uint64_t logtoken) {
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

void windowssys_windows_win32_devices_deviceanddriverinstallation_setupTermDefaultQueueCallback(void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupTerminateFileLog(void* fileloghandle) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallNewlyCopiedInfs(void* filequeue, uint32_t flags, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfA(void* inffilename, uint32_t flags, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupUninstallOEMInfW(void* inffilename, uint32_t flags, void* reserved) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileA(void* infname, void* altplatforminfo, void* infsignerinfo) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_setupVerifyInfFileW(void* infname, void* altplatforminfo, void* infsignerinfo) {
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

void windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLog(uint64_t logtoken, uint32_t category, uint32_t flags, void* messagestr, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef void (*km_fn_t)(uint64_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupWriteTextLog");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr(logtoken, category, flags, messagestr); break;
            case 1: km_fn_ptr(logtoken, category, flags, messagestr, (intptr_t)km_va0); break;
            case 2: km_fn_ptr(logtoken, category, flags, messagestr, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr(logtoken, category, flags, messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr(logtoken, category, flags, messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
        return;
    }
    errno = ENOSYS;
#else
    (void)logtoken;
    (void)category;
    (void)flags;
    (void)messagestr;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogError(uint64_t logtoken, uint32_t category, uint32_t logflags, uint32_t error, void* messagestr, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
#ifdef _WIN32
    typedef void (*km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("setupapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetupWriteTextLogError");
        }
    }
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_fn_ptr(logtoken, category, logflags, error, messagestr); break;
            case 1: km_fn_ptr(logtoken, category, logflags, error, messagestr, (intptr_t)km_va0); break;
            case 2: km_fn_ptr(logtoken, category, logflags, error, messagestr, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_fn_ptr(logtoken, category, logflags, error, messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_fn_ptr(logtoken, category, logflags, error, messagestr, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
        return;
    }
    errno = ENOSYS;
#else
    (void)logtoken;
    (void)category;
    (void)logflags;
    (void)error;
    (void)messagestr;
    (void)km_vac;
    (void)km_va0;
    (void)km_va1;
    (void)km_va2;
    (void)km_va3;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_devices_deviceanddriverinstallation_setupWriteTextLogInfLine(uint64_t logtoken, uint32_t flags, void* infhandle, void* context) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesA(void* hwndparent, void* hardwareid, void* fullinfpath, uint32_t installflags, void* brebootrequired) {
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

int32_t windowssys_windows_win32_devices_deviceanddriverinstallation_updateDriverForPlugAndPlayDevicesW(void* hwndparent, void* hardwareid, void* fullinfpath, uint32_t installflags, void* brebootrequired) {
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

