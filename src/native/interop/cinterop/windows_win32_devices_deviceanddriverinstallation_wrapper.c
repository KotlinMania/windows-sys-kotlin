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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmpWaitNoPendingInstallEvents(uint32_t dwtimeout) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConf(void* plclogconf, uint32_t dndevinst, int32_t priority, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddEmptyLogConfEx(void* plclogconf, uint32_t dndevinst, int32_t priority, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIda(uint32_t dndevinst, void* pszid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdw(uint32_t dndevinst, void* pszid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExA(uint32_t dndevinst, void* pszid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddIdExW(uint32_t dndevinst, void* pszid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddRange(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDes(void* prdresdes, uint64_t lclogconf, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmAddResDesEx(void* prdresdes, uint64_t lclogconf, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineA(void* uncservername, void* phmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmConnectMachineW(void* uncservername, void* phmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeA(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeW(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExA(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateDevNodeExW(void* pdndevinst, void* pdeviceid, uint32_t dnparent, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmCreateRangeList(void* prlh, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKey(void* classguid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteClassKeyEx(void* classguid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKey(uint32_t dndevnode, uint32_t ulhardwareprofile, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDevNodeKeyEx(uint32_t dndevnode, uint32_t ulhardwareprofile, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyA(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyW(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExA(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteDeviceInterfaceKeyExW(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDeleteRange(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflict(uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, void* pbconflictdetected, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDetectResourceConflictEx(uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, void* pbconflictdetected, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisableDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDisconnectMachine(int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmDupRangeList(uint64_t rlhold, uint64_t rlhnew, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnableDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClasses(uint32_t ulclassindex, void* classguid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateClassesEx(uint32_t ulclassindex, void* classguid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsA(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsW(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExA(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmEnumerateEnumeratorsExW(uint32_t ulenumindex, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFindRange(void* pullstart, uint64_t ullstart, uint32_t ullength, uint64_t ullalignment, uint64_t ullend, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFirstRange(uint64_t rlh, void* pullstart, void* pullend, void* preelement, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConf(uint64_t lclogconftobefreed, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfEx(uint64_t lclogconftobefreed, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeLogConfHandle(uint64_t lclogconf) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeRangeList(uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDes(void* prdresdes, uint64_t rdresdes, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesEx(void* prdresdes, uint64_t rdresdes, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResDesHandle(uint64_t rdresdes) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmFreeResourceConflictHandle(uint64_t clconflictlist) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChild(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetChildEx(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameA(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameW(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExA(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassKeyNameExW(void* classguid, void* pszkeyname, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameA(void* classguid, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameW(void* classguid, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExA(void* classguid, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassNameExW(void* classguid, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyExW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeys(void* classguid, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassPropertyKeysEx(void* classguid, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyA(void* classguid, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetClassRegistryPropertyW(void* classguid, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepth(void* puldepth, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDepthEx(void* puldepth, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyA(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyW(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExA(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeCustomPropertyExW(uint32_t dndevinst, void* pszcustompropertyname, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyW(uint32_t dndevinst, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyExW(uint32_t dndevinst, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeys(uint32_t dndevinst, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodePropertyKeysEx(uint32_t dndevinst, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyA(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyW(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExA(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeRegistryPropertyExW(uint32_t dndevinst, uint32_t ulproperty, void* pulregdatatype, void* buffer, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatus(void* pulstatus, void* pulproblemnumber, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDevNodeStatusEx(void* pulstatus, void* pulproblemnumber, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIda(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdw(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExA(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdExW(uint32_t dndevinst, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListA(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListW(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExA(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListExW(void* pszfilter, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeA(void* pullen, void* pszfilter, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeW(void* pullen, void* pszfilter, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExA(void* pullen, void* pszfilter, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdListSizeExW(void* pullen, void* pszfilter, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSize(void* pullen, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceIdSizeEx(void* pullen, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasA(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasW(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExA(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceAliasExW(void* pszdeviceinterface, void* aliasinterfaceguid, void* pszaliasdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListA(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListW(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExA(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListExW(void* interfaceclassguid, void* pdeviceid, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeA(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeW(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExA(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfaceListSizeExW(void* pullen, void* interfaceclassguid, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyW(void* pszdeviceinterface, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyExW(void* pszdeviceinterface, void* propertykey, void* propertytype, void* propertybuffer, void* propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysW(void* pszdeviceinterface, void* propertykeyarray, void* propertykeycount, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetDeviceInterfacePropertyKeysExW(void* pszdeviceinterface, void* propertykeyarray, void* propertykeycount, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConf(void* plclogconf, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetFirstLogConfEx(void* plclogconf, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalState(void* pulstate, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetGlobalStateEx(void* pulstate, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsA(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsW(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExA(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHwProfFlagsExW(void* pdeviceid, uint32_t ulhardwareprofile, void* pulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoA(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoW(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExA(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetHardwareProfileInfoExW(uint32_t ulindex, void* phwprofileinfo, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriority(uint64_t lclogconf, void* ppriority, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetLogConfPriorityEx(uint64_t lclogconf, void* ppriority, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConf(void* plclogconf, uint64_t lclogconf, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextLogConfEx(void* plclogconf, uint64_t lclogconf, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDes(void* prdresdes, uint64_t rdresdes, uint32_t forresource, void* presourceid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetNextResDesEx(void* prdresdes, uint64_t rdresdes, uint32_t forresource, void* presourceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParent(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetParentEx(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesData(uint64_t rdresdes, void* buffer, uint32_t bufferlen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataEx(uint64_t rdresdes, void* buffer, uint32_t bufferlen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSize(void* pulsize, uint64_t rdresdes, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResDesDataSizeEx(void* pulsize, uint64_t rdresdes, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictCount(uint64_t clconflictlist, void* pulcount) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsA(uint64_t clconflictlist, uint32_t ulindex, void* pconflictdetails) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetResourceConflictDetailsW(uint64_t clconflictlist, uint32_t ulindex, void* pconflictdetails) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSibling(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetSiblingEx(void* pdndevinst, uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint16_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersion(void) {
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

uint16_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmGetVersionEx(int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIntersectRangeList(uint64_t rlhold1, uint64_t rlhold2, uint64_t rlhnew, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmInvertRangeList(uint64_t rlhold, uint64_t rlhnew, uint64_t ullmaxvalue, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresent(void* pbpresent) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsDockStationPresentEx(void* pbpresent, int64_t hmachine) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailable(uint16_t wversion) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmIsVersionAvailableEx(uint16_t wversion, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeA(void* pdndevinst, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeW(void* pdndevinst, void* pdeviceid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExA(void* pdndevinst, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmLocateDevNodeExW(void* pdndevinst, void* pdeviceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMapCrToWin32Err(uint32_t cmreturncode, uint32_t defaulterr) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMergeRangeList(uint64_t rlhold1, uint64_t rlhold2, uint64_t rlhnew, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDes(void* prdresdes, uint64_t rdresdes, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmModifyResDesEx(void* prdresdes, uint64_t rdresdes, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNode(uint32_t dnfromdevinst, uint32_t dntodevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmMoveDevNodeEx(uint32_t dnfromdevinst, uint32_t dntodevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmNextRange(void* preelement, void* pullstart, void* pullend, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyA(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyW(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExA(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenClassKeyExW(void* classguid, void* pszclassname, uint32_t samdesired, uint32_t disposition, void* phkclass, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKey(uint32_t dndevnode, uint32_t samdesired, uint32_t ulhardwareprofile, uint32_t disposition, void* phkdevice, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDevNodeKeyEx(uint32_t dndevnode, uint32_t samdesired, uint32_t ulhardwareprofile, uint32_t disposition, void* phkdevice, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyA(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyW(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExA(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmOpenDeviceInterfaceKeyExW(void* pszdeviceinterface, uint32_t samdesired, uint32_t disposition, void* phkdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeA(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeW(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExA(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryAndRemoveSubTreeExW(uint32_t dnancestor, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeData(void* pdata, uint32_t datalen, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeDataEx(void* pdata, uint32_t datalen, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSize(void* pulsize, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryArbitratorFreeSizeEx(void* pulsize, uint32_t dndevinst, uint32_t resourceid, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTree(uint32_t dnancestor, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryRemoveSubTreeEx(uint32_t dnancestor, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmQueryResourceConflictList(void* pclconflictlist, uint32_t dndevinst, uint32_t resourceid, void* resourcedata, uint32_t resourcelen, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmReenumerateDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriver(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceDriverEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceA(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceW(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExA(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterDeviceInterfaceExW(uint32_t dndevinst, void* interfaceclassguid, void* pszreference, void* pszdeviceinterface, void* pullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRegisterNotification(void* pfilter, void* pcontext, void* pcallback, void* pnotifycontext) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTree(uint32_t dnancestor, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRemoveSubTreeEx(uint32_t dnancestor, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectA(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectW(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExA(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestDeviceEjectExW(uint32_t dndevinst, void* pvetotype, void* pszvetoname, uint32_t ulnamelength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPc(void) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRequestEjectPcEx(int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetection(uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmRunDetectionEx(uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassPropertyExW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyA(void* classguid, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetClassRegistryPropertyW(void* classguid, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblem(uint32_t dndevinst, uint32_t ulproblem, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeProblemEx(uint32_t dndevinst, uint32_t ulproblem, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyW(uint32_t dndevinst, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodePropertyExW(uint32_t dndevinst, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyA(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyW(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExA(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDevNodeRegistryPropertyExW(uint32_t dndevinst, uint32_t ulproperty, void* buffer, uint32_t ullength, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyW(void* pszdeviceinterface, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetDeviceInterfacePropertyExW(void* pszdeviceinterface, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProf(uint32_t ulhardwareprofile, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfEx(uint32_t ulhardwareprofile, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsA(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsW(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExA(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetHwProfFlagsExW(void* pdeviceid, uint32_t ulconfig, uint32_t ulvalue, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmSetupDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmTestRangeAvailable(uint64_t ullstartvalue, uint64_t ullendvalue, uint64_t rlh, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNode(uint32_t dndevinst, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUninstallDevNodeEx(uint32_t dndevinst, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceA(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceW(void* pszdeviceinterface, uint32_t ulflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExA(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterDeviceInterfaceExW(void* pszdeviceinterface, uint32_t ulflags, int64_t hmachine) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationCmUnregisterNotification(void* notifycontext) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverA(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiInstallDriverW(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiRollbackDriver(int64_t deviceinfoset, void* deviceinfodata, void* hwndparent, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiShowUpdateDriver(void* hwndparent, void* filepath, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDevice(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverA(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationDiUninstallDriverW(void* hwndparent, void* infpath, uint32_t flags, void* needreboot) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionA(void* window, void* modulehandle, void* commandline, int32_t showcommand) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationInstallHinfSectionW(void* window, void* modulehandle, void* commandline, int32_t showcommand) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListA(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddInstallSectionToDiskSpaceListW(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListA(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddSectionToDiskSpaceListW(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListA(void* diskspace, void* targetfilespec, int64_t filesize, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToDiskSpaceListW(void* diskspace, void* targetfilespec, int64_t filesize, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListA(uint32_t flags, void* source) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAddToSourceListW(uint32_t flags, void* source) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListA(void* diskspace, void* driveroot, int64_t amount, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupAdjustDiskSpaceListW(void* diskspace, void* driveroot, int64_t amount, void* reserved1, uint32_t reserved2) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorA(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupBackupErrorW(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCancelTemporarySourceList(void) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseFileQueue(void* queuehandle) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseInfFile(void* infhandle) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCloseLog(void) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueA(void* owner, void* queuehandle, void* msghandler, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCommitFileQueueW(void* owner, void* queuehandle, void* msghandler, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionA(void* infhandle, void* sectionname, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupConfigureWmiFromInfSectionW(void* infhandle, void* sectionname, uint32_t flags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorA(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* sourcefile, void* targetpathfile, uint32_t win32errorcode, uint32_t style, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyErrorW(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* sourcefile, void* targetpathfile, uint32_t win32errorcode, uint32_t style, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfA(void* sourceinffilename, void* oemsourcemedialocation, uint32_t oemsourcemediatype, uint32_t copystyle, void* destinationinffilename, uint32_t destinationinffilenamesize, void* requiredsize, void* destinationinffilenamecomponent) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCopyOEMInfW(void* sourceinffilename, void* oemsourcemedialocation, uint32_t oemsourcemediatype, uint32_t copystyle, void* destinationinffilename, uint32_t destinationinffilenamesize, void* requiredsize, void* destinationinffilenamecomponent) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListA(void* reserved1, uint32_t reserved2, uint32_t flags) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupCreateDiskSpaceListW(void* reserved1, uint32_t reserved2, uint32_t flags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileA(void* sourcefilename, void* targetfilename, void* compressiontype) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDecompressOrCopyFileW(void* sourcefilename, void* targetfilename, void* compressiontype) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackA(void* context, uint32_t notification, uint64_t param1, uint64_t param2) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDefaultQueueCallbackW(void* context, uint32_t notification, uint64_t param1, uint64_t param2) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorA(void* hwndparent, void* dialogtitle, void* file, uint32_t win32errorcode, uint32_t style) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDeleteErrorW(void* hwndparent, void* dialogtitle, void* file, uint32_t win32errorcode, uint32_t style) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDestroyDiskSpaceList(void* diskspace) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiAskForOEMDisk(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoList(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExA(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildClassInfoListExW(uint32_t flags, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiBuildDriverInfoList(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCallClassInstaller(uint32_t installfunction, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCancelDriverInfoSearch(int64_t deviceinfoset) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiChangeState(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameA(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExA(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameExW(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassGuidsFromNameW(void* classname, void* classguidlist, uint32_t classguidlistsize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidA(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExA(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidExW(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiClassNameFromGuidW(void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, void* infhandle, void* infsectionname) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDevRegKeyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, void* infhandle, void* infsectionname) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoA(int64_t deviceinfoset, void* devicename, void* classguid, void* devicedescription, void* hwndparent, uint32_t creationflags, void* deviceinfodata) {
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

int64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoList(void* classguid, void* hwndparent) {
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

int64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExA(void* classguid, void* hwndparent, void* machinename, void* reserved) {
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

int64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoListExW(void* classguid, void* hwndparent, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInfoW(int64_t deviceinfoset, void* devicename, void* classguid, void* devicedescription, void* hwndparent, uint32_t creationflags, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceA(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, void* referencestring, uint32_t creationflags, void* deviceinterfacedata) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyA(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired, void* infhandle, void* infsectionname) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceRegKeyW(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired, void* infhandle, void* infsectionname) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiCreateDeviceInterfaceW(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, void* referencestring, uint32_t creationflags, void* deviceinterfacedata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDevRegKey(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInfo(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceData(int64_t deviceinfoset, void* deviceinterfacedata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDeleteDeviceInterfaceRegKey(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyClassImageList(void* classimagelistdata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDeviceInfoList(int64_t deviceinfoset) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiDestroyDriverInfoList(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInfo(int64_t deviceinfoset, uint32_t memberindex, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDeviceInterfaces(int64_t deviceinfoset, void* deviceinfodata, void* interfaceclassguid, uint32_t memberindex, void* deviceinterfacedata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoA(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype, uint32_t memberindex, void* driverinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiEnumDriverInfoW(int64_t deviceinfoset, void* deviceinfodata, uint32_t drivertype, uint32_t memberindex, void* driverinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionA(void* context, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualModelsSectionW(void* context, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallA(void* infhandle, void* infsectionname, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExA(void* infhandle, void* infsectionname, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallExW(void* infhandle, void* infsectionname, void* alternateplatforminfo, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetActualSectionToInstallW(void* infhandle, void* infsectionname, void* infsectionwithext, uint32_t infsectionwithextsize, void* requiredsize, void* extension) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassBitmapIndex(void* classguid, void* miniiconindex) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionA(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExA(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionExW(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDescriptionW(void* classguid, void* classdescription, uint32_t classdescriptionsize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsA(int64_t deviceinfoset, void* deviceinfodata, void* propertysheetheader, uint32_t propertysheetheaderpagelistsize, void* requiredsize, uint32_t propertysheettype) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevPropertySheetsW(int64_t deviceinfoset, void* deviceinfodata, void* propertysheetheader, uint32_t propertysheetheaderpagelistsize, void* requiredsize, uint32_t propertysheettype) {
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

int64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsA(void* classguid, void* enumerator, void* hwndparent, uint32_t flags) {
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

int64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExA(void* classguid, void* enumerator, void* hwndparent, uint32_t flags, int64_t deviceinfoset, void* machinename, void* reserved) {
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

int64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsExW(void* classguid, void* enumerator, void* hwndparent, uint32_t flags, int64_t deviceinfoset, void* machinename, void* reserved) {
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

int64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassDevsW(void* classguid, void* enumerator, void* hwndparent, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageIndex(void* classimagelistdata, void* classguid, void* imageindex) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageList(void* classimagelistdata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExA(void* classimagelistdata, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassImageListExW(void* classimagelistdata, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyExW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeys(void* classguid, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyKeysExW(void* classguid, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassPropertyW(void* classguid, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyA(void* classguid, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetClassRegistryPropertyW(void* classguid, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyA(int64_t deviceinfoset, void* deviceinfodata, void* custompropertyname, uint32_t flags, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetCustomDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* custompropertyname, uint32_t flags, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListClass(int64_t deviceinfoset, void* classguid) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailA(int64_t deviceinfoset, void* deviceinfosetdetaildata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInfoListDetailW(int64_t deviceinfoset, void* deviceinfosetdetaildata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstanceid, uint32_t deviceinstanceidsize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInstanceIdW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstanceid, uint32_t deviceinstanceidsize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceAlias(int64_t deviceinfoset, void* deviceinterfacedata, void* aliasinterfaceclassguid, void* aliasdeviceinterfacedata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailA(int64_t deviceinfoset, void* deviceinterfacedata, void* deviceinterfacedetaildata, uint32_t deviceinterfacedetaildatasize, void* requiredsize, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfaceDetailW(int64_t deviceinfoset, void* deviceinterfacedata, void* deviceinterfacedetaildata, uint32_t deviceinterfacedetaildatasize, void* requiredsize, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyKeys(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceInterfacePropertyW(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyKeys(int64_t deviceinfoset, void* deviceinfodata, void* propertykeyarray, uint32_t propertykeycount, void* requiredpropertykeycount, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* propertykey, void* propertytype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDeviceRegistryPropertyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertyregdatatype, void* propertybuffer, uint32_t propertybuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinfodetaildata, uint32_t driverinfodetaildatasize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInfoDetailW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinfodetaildata, uint32_t driverinfodetaildatasize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetDriverInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameA(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExA(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameExW(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileFriendlyNameW(uint32_t hwprofile, void* friendlyname, uint32_t friendlynamesize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileList(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExA(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetHwProfileListExW(void* hwprofilelist, uint32_t hwprofilelistsize, void* requiredsize, void* currentlyactiveindex, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassA(void* infname, void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetINFClassW(void* infname, void* classguid, void* classname, uint32_t classnamesize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetSelectedDriverW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiGetWizardPage(int64_t deviceinfoset, void* deviceinfodata, void* installwizarddata, uint32_t pagetype, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassA(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExA(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue, void* interfaceclassguid, void* reserved1, void* reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassExW(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue, void* interfaceclassguid, void* reserved1, void* reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallClassW(void* hwndparent, void* inffilename, uint32_t flags, void* filequeue) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDeviceInterfaces(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiInstallDriverFiles(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadClassIcon(void* classguid, void* largeicon, void* miniiconindex) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiLoadDeviceIcon(int64_t deviceinfoset, void* deviceinfodata, uint32_t cxicon, uint32_t cyicon, uint32_t flags, void* hicon) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKey(void* classguid, uint32_t samdesired) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExA(void* classguid, uint32_t samdesired, uint32_t flags, void* machinename, void* reserved) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenClassRegKeyExW(void* classguid, uint32_t samdesired, uint32_t flags, void* machinename, void* reserved) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDevRegKey(int64_t deviceinfoset, void* deviceinfodata, uint32_t scope, uint32_t hwprofile, uint32_t keytype, uint32_t samdesired) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoA(int64_t deviceinfoset, void* deviceinstanceid, void* hwndparent, uint32_t openflags, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInfoW(int64_t deviceinfoset, void* deviceinstanceid, void* hwndparent, uint32_t openflags, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceA(int64_t deviceinfoset, void* devicepath, uint32_t openflags, void* deviceinterfacedata) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceRegKey(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t reserved, uint32_t samdesired) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiOpenDeviceInterfaceW(int64_t deviceinfoset, void* devicepath, uint32_t openflags, void* deviceinterfacedata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterCoDeviceInstallers(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRegisterDeviceInfo(int64_t deviceinfoset, void* deviceinfodata, uint32_t flags, void* compareproc, void* comparecontext, void* dupdeviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRemoveDeviceInterface(int64_t deviceinfoset, void* deviceinterfacedata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiRestartDevices(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectBestCompatDrv(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSelectOEMDrv(void* hwndparent, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* classinstallparams, uint32_t classinstallparamssize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyExW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassPropertyW(void* classguid, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyA(void* classguid, uint32_t property, void* propertybuffer, uint32_t propertybuffersize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetClassRegistryPropertyW(void* classguid, uint32_t property, void* propertybuffer, uint32_t propertybuffersize, void* machinename, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* deviceinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfaceDefault(int64_t deviceinfoset, void* deviceinterfacedata, uint32_t flags, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceInterfacePropertyW(int64_t deviceinfoset, void* deviceinterfacedata, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDevicePropertyW(int64_t deviceinfoset, void* deviceinfodata, void* propertykey, uint32_t propertytype, void* propertybuffer, uint32_t propertybuffersize, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyA(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertybuffer, uint32_t propertybuffersize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDeviceRegistryPropertyW(int64_t deviceinfoset, void* deviceinfodata, uint32_t property, void* propertybuffer, uint32_t propertybuffersize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetDriverInstallParamsW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata, void* driverinstallparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverA(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiSetSelectedDriverW(int64_t deviceinfoset, void* deviceinfodata, void* driverinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDiUnremoveDevice(int64_t deviceinfoset, void* deviceinfodata) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListA(void* diskspace, void* reserved1, uint32_t reserved2, uint32_t flags) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupDuplicateDiskSpaceListW(void* diskspace, void* reserved1, uint32_t reserved2, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsA(void* infhandle, uint32_t arg1Index, void* buffer, uint32_t size, void* sizeneeded) {
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
        return km_fn_ptr(infhandle, arg1Index, buffer, size, sizeneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)arg1Index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupEnumInfSectionsW(void* infhandle, uint32_t arg1Index, void* buffer, uint32_t size, void* sizeneeded) {
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
        return km_fn_ptr(infhandle, arg1Index, buffer, size, sizeneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)arg1Index;
    (void)buffer;
    (void)size;
    (void)sizeneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineA(void* infhandle, void* section, void* key, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindFirstLineW(void* infhandle, void* section, void* key, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextLine(void* contextin, void* contextout) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineA(void* contextin, void* key, void* contextout) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFindNextMatchLineW(void* contextin, void* key, void* contextout) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListA(void* list, uint32_t count) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupFreeSourceListW(void* list, uint32_t count) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationA(void* queuehandle, void* backupparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBackupInformationW(void* queuehandle, void* backupparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetBinaryField(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFieldCount(void* context) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoA(void* sourcefilename, void* actualsourcefilename, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExA(void* sourcefilename, void* actualsourcefilenamebuffer, uint32_t actualsourcefilenamebufferlen, void* requiredbufferlen, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoExW(void* sourcefilename, void* actualsourcefilenamebuffer, uint32_t actualsourcefilenamebufferlen, void* requiredbufferlen, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileCompressionInfoW(void* sourcefilename, void* actualsourcefilename, void* sourcefilesize, void* targetfilesize, void* compressiontype) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueCount(void* filequeue, uint32_t subqueuefileop, void* numoperations) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetFileQueueFlags(void* filequeue, void* flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationA(void* filename, void* alternateplatforminfo, void* localename, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfDriverStoreLocationW(void* filename, void* alternateplatforminfo, void* localename, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListA(void* directorypath, uint32_t infstyle, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfFileListW(void* directorypath, uint32_t infstyle, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationA(void* infspec, uint32_t searchcontrol, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfInformationW(void* infspec, uint32_t searchcontrol, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameA(void* driverstorelocation, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetInfPublishedNameW(void* driverstorelocation, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetIntField(void* context, uint32_t fieldindex, void* integervalue) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexA(void* infhandle, void* section, uint32_t arg2Index, void* context) {
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
        return km_fn_ptr(infhandle, section, arg2Index, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    (void)arg2Index;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineByIndexW(void* infhandle, void* section, uint32_t arg2Index, void* context) {
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
        return km_fn_ptr(infhandle, section, arg2Index, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)infhandle;
    (void)section;
    (void)arg2Index;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountA(void* infhandle, void* section) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineCountW(void* infhandle, void* section) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextA(void* context, void* infhandle, void* section, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetLineTextW(void* context, void* infhandle, void* section, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldA(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetMultiSzFieldW(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetNonInteractiveMode(void) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationA(void* infhandle, void* infcontext, void* filename, void* sourceid, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileLocationW(void* infhandle, void* infcontext, void* filename, void* sourceid, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeA(void* infhandle, void* infcontext, void* filename, void* section, void* filesize, uint32_t roundingfactor) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceFileSizeW(void* infhandle, void* infcontext, void* filename, void* section, void* filesize, uint32_t roundingfactor) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoA(void* infhandle, uint32_t sourceid, uint32_t infodesired, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetSourceInfoW(void* infhandle, uint32_t sourceid, uint32_t infodesired, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldA(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetStringFieldW(void* context, uint32_t fieldindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathA(void* infhandle, void* infcontext, void* section, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetTargetPathW(void* infhandle, void* infcontext, void* section, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

uint64_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupGetThreadLogToken(void) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallback(void* ownerwindow) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitDefaultQueueCallbackEx(void* ownerwindow, void* alternateprogresswindow, uint32_t progressmessage, uint32_t reserved1, void* reserved2) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogA(void* logfilename, uint32_t flags) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInitializeFileLogW(void* logfilename, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileA(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExA(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context, void* filewasinuse) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileExW(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context, void* filewasinuse) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFileW(void* infhandle, void* infcontext, void* sourcefile, void* sourcepathroot, void* destinationname, uint32_t copystyle, void* copymsghandler, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionA(void* infhandle, void* layoutinfhandle, void* filequeue, void* sectionname, void* sourcerootpath, uint32_t copyflags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFilesFromInfSectionW(void* infhandle, void* layoutinfhandle, void* filequeue, void* sectionname, void* sourcerootpath, uint32_t copyflags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionA(void* owner, void* infhandle, void* sectionname, uint32_t flags, void* relativekeyroot, void* sourcerootpath, uint32_t copyflags, void* msghandler, void* context, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallFromInfSectionW(void* owner, void* infhandle, void* sectionname, uint32_t flags, void* relativekeyroot, void* sourcerootpath, uint32_t copyflags, void* msghandler, void* context, int64_t deviceinfoset, void* deviceinfodata) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionA(void* infhandle, void* sectionname, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExA(void* infhandle, void* sectionname, uint32_t flags, int64_t deviceinfoset, void* deviceinfodata, void* reserved1, void* reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionExW(void* infhandle, void* sectionname, uint32_t flags, int64_t deviceinfoset, void* deviceinfodata, void* reserved1, void* reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupInstallServicesFromInfSectionW(void* infhandle, void* sectionname, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetA(void* cabinetfile, uint32_t reserved, void* msghandler, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupIterateCabinetW(void* cabinetfile, uint32_t reserved, void* msghandler, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorA(void* messagestring, uint32_t severity) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogErrorW(void* messagestring, uint32_t severity) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileA(void* fileloghandle, void* logsectionname, void* sourcefilename, void* targetfilename, uint32_t checksum, void* disktagfile, void* diskdescription, void* otherinfo, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupLogFileW(void* fileloghandle, void* logsectionname, void* sourcefilename, void* targetfilename, uint32_t checksum, void* disktagfile, void* diskdescription, void* otherinfo, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileA(void* filename, void* infhandle, void* errorline) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenAppendInfFileW(void* filename, void* infhandle, void* errorline) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenFileQueue(void) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileA(void* filename, void* infclass, uint32_t infstyle, void* errorline) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenInfFileW(void* filename, void* infclass, uint32_t infstyle, void* errorline) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenLog(int32_t erase) {
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

void* windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupOpenMasterInf(void) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreA(void* queuehandle, void* backuppath, uint32_t restoreflags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPrepareQueueForRestoreW(void* queuehandle, void* backuppath, uint32_t restoreflags) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskA(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* filesought, void* tagfile, uint32_t diskpromptstyle, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptForDiskW(void* hwndparent, void* dialogtitle, void* diskname, void* pathtosource, void* filesought, void* tagfile, uint32_t diskpromptstyle, void* pathbuffer, uint32_t pathbuffersize, void* pathrequiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupPromptReboot(void* filequeue, void* owner, int32_t scanonly) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListA(void* diskspace, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryDrivesInDiskSpaceListW(void* diskspace, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogA(void* fileloghandle, void* logsectionname, void* targetfilename, int32_t desiredinfo, void* dataout, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryFileLogW(void* fileloghandle, void* logsectionname, void* targetfilename, int32_t desiredinfo, void* dataout, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationA(void* infinformation, uint32_t infindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfFileInformationW(void* infinformation, uint32_t infindex, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationA(void* infinformation, uint32_t infindex, void* alternateplatforminfo, void* originalfileinfo) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfOriginalFileInformationW(void* infinformation, uint32_t infindex, void* alternateplatforminfo, void* originalfileinfo) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationA(void* infinformation, uint32_t infindex, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueryInfVersionInformationW(void* infinformation, uint32_t infindex, void* key, void* returnbuffer, uint32_t returnbuffersize, void* requiredsize) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListA(uint32_t flags, void* list, void* count) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySourceListW(uint32_t flags, void* list, void* count) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveA(void* diskspace, void* drivespec, void* spacerequired, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQuerySpaceRequiredOnDriveW(void* diskspace, void* drivespec, void* spacerequired, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyA(void* queuehandle, void* sourcerootpath, void* sourcepath, void* sourcefilename, void* sourcedescription, void* sourcetagfile, void* targetdirectory, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectA(void* copyparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyIndirectW(void* copyparams) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionA(void* queuehandle, void* sourcerootpath, void* infhandle, void* listinfhandle, void* section, uint32_t copystyle) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopySectionW(void* queuehandle, void* sourcerootpath, void* infhandle, void* listinfhandle, void* section, uint32_t copystyle) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueCopyW(void* queuehandle, void* sourcerootpath, void* sourcepath, void* sourcefilename, void* sourcedescription, void* sourcetagfile, void* targetdirectory, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyA(void* queuehandle, void* infhandle, void* sourcerootpath, void* sourcefilename, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDefaultCopyW(void* queuehandle, void* infhandle, void* sourcerootpath, void* sourcefilename, void* targetfilename, uint32_t copystyle) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteA(void* queuehandle, void* pathpart1, void* pathpart2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionA(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteSectionW(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueDeleteW(void* queuehandle, void* pathpart1, void* pathpart2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameA(void* queuehandle, void* sourcepath, void* sourcefilename, void* targetpath, void* targetfilename) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionA(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameSectionW(void* queuehandle, void* infhandle, void* listinfhandle, void* section) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupQueueRenameW(void* queuehandle, void* sourcepath, void* sourcefilename, void* targetpath, void* targetfilename) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryA(void* fileloghandle, void* logsectionname, void* targetfilename) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFileLogEntryW(void* fileloghandle, void* logsectionname, void* targetfilename) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListA(void* diskspace, void* targetfilespec, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromDiskSpaceListW(void* diskspace, void* targetfilespec, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListA(uint32_t flags, void* source) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveFromSourceListW(uint32_t flags, void* source) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListA(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveInstallSectionFromDiskSpaceListW(void* diskspace, void* infhandle, void* layoutinfhandle, void* sectionname, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListA(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRemoveSectionFromDiskSpaceListW(void* diskspace, void* infhandle, void* listinfhandle, void* sectionname, uint32_t operation, void* reserved1, uint32_t reserved2) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorA(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

uint32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupRenameErrorW(void* hwndparent, void* dialogtitle, void* sourcefile, void* targetfile, uint32_t win32errorcode, uint32_t style) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueA(void* filequeue, uint32_t flags, void* window, void* callbackroutine, void* callbackcontext, void* result) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupScanFileQueueW(void* filequeue, uint32_t flags, void* window, void* callbackroutine, void* callbackcontext, void* result) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdA(void* infhandle, uint32_t id, void* directory) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExA(void* infhandle, uint32_t id, void* directory, uint32_t flags, uint32_t reserved1, void* reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdExW(void* infhandle, uint32_t id, void* directory, uint32_t flags, uint32_t reserved1, void* reserved2) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetDirectoryIdW(void* infhandle, uint32_t id, void* directory) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformA(void* queuehandle, void* alternateplatforminfo, void* alternatedefaultcatalogfile) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueAlternatePlatformW(void* queuehandle, void* alternateplatforminfo, void* alternatedefaultcatalogfile) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetFileQueueFlags(void* filequeue, uint32_t flagmask, uint32_t flags) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetNonInteractiveMode(int32_t noninteractiveflag) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideA(void* override) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetPlatformPathOverrideW(void* override) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListA(uint32_t flags, void* sourcelist, uint32_t sourcecount) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetSourceListW(uint32_t flags, void* sourcelist, uint32_t sourcecount) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupSetThreadLogToken(uint64_t logtoken) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTermDefaultQueueCallback(void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupTerminateFileLog(void* fileloghandle) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallNewlyCopiedInfs(void* filequeue, uint32_t flags, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfA(void* inffilename, uint32_t flags, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupUninstallOEMInfW(void* inffilename, uint32_t flags, void* reserved) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileA(void* infname, void* altplatforminfo, void* infsignerinfo) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupVerifyInfFileW(void* infname, void* altplatforminfo, void* infsignerinfo) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLog(uint64_t logtoken, uint32_t category, uint32_t flags, void* messagestr, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogError(uint64_t logtoken, uint32_t category, uint32_t logflags, uint32_t error, void* messagestr, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3) {
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

void windowssysWindowsWin32DevicesDeviceanddriverinstallationSetupWriteTextLogInfLine(uint64_t logtoken, uint32_t flags, void* infhandle, void* context) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesA(void* hwndparent, void* hardwareid, void* fullinfpath, uint32_t installflags, void* brebootrequired) {
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

int32_t windowssysWindowsWin32DevicesDeviceanddriverinstallationUpdateDriverForPlugAndPlayDevicesW(void* hwndparent, void* hardwareid, void* fullinfpath, uint32_t installflags, void* brebootrequired) {
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

