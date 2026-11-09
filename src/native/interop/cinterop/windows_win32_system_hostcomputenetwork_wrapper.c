#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_hostcomputenetwork_wrapper.h"
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

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint(void* endpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(endpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)endpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService(void* guestnetworkservice) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseGuestNetworkService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guestnetworkservice);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guestnetworkservice;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer(void* loadbalancer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseLoadBalancer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadbalancer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loadbalancer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace(void* arg_0_namespace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_namespace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_namespace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork(void* network) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCloseNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(network);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)network;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint(void* network, void* id, void* settings, void* endpoint, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(network, id, settings, endpoint, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)network;
    (void)id;
    (void)settings;
    (void)endpoint;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService(void* id, void* settings, void* guestnetworkservice, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateGuestNetworkService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, settings, guestnetworkservice, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)settings;
    (void)guestnetworkservice;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer(void* id, void* settings, void* loadbalancer, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateLoadBalancer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, settings, loadbalancer, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)settings;
    (void)loadbalancer;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace(void* id, void* settings, void* arg_2_namespace, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, settings, arg_2_namespace, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)settings;
    (void)arg_2_namespace;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork(void* id, void* settings, void* network, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnCreateNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, settings, network, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)settings;
    (void)network;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint(void* id, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService(void* id, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteGuestNetworkService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer(void* id, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteLoadBalancer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace(void* id, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork(void* id, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnDeleteNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints(void* query, void* endpoints, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateEndpoints");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(query, endpoints, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)query;
    (void)endpoints;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations(void* returncount, void* portentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateGuestNetworkPortReservations");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(returncount, portentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)returncount;
    (void)portentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers(void* query, void* loadbalancer, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateLoadBalancers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(query, loadbalancer, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)query;
    (void)loadbalancer;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces(void* query, void* namespaces, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateNamespaces");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(query, namespaces, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)query;
    (void)namespaces;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks(void* query, void* networks, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnEnumerateNetworks");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(query, networks, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)query;
    (void)networks;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations(void* portentries) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnFreeGuestNetworkPortReservations");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(portentries);
        return;
    }
    errno = ENOSYS;
#else
    (void)portentries;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint(void* endpoint, void* settings, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(endpoint, settings, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)endpoint;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService(void* guestnetworkservice, void* settings, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyGuestNetworkService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guestnetworkservice, settings, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guestnetworkservice;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer(void* loadbalancer, void* settings, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyLoadBalancer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadbalancer, settings, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loadbalancer;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace(void* arg_0_namespace, void* settings, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_namespace, settings, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_namespace;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork(void* network, void* settings, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnModifyNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(network, settings, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)network;
    (void)settings;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint(void* id, void* endpoint, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenEndpoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, endpoint, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)endpoint;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer(void* id, void* loadbalancer, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenLoadBalancer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, loadbalancer, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)loadbalancer;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace(void* id, void* arg_1_namespace, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, arg_1_namespace, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)arg_1_namespace;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork(void* id, void* network, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnOpenNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, network, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)network;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses(void* endpoint, void* query, void* addresses, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointAddresses");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(endpoint, query, addresses, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)endpoint;
    (void)query;
    (void)addresses;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties(void* endpoint, void* query, void* properties, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(endpoint, query, properties, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)endpoint;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats(void* endpoint, void* query, void* stats, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryEndpointStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(endpoint, query, stats, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)endpoint;
    (void)query;
    (void)stats;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties(void* loadbalancer, void* query, void* properties, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryLoadBalancerProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(loadbalancer, query, properties, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)loadbalancer;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties(void* arg_0_namespace, void* query, void* properties, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryNamespaceProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_namespace, query, properties, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_namespace;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties(void* network, void* query, void* properties, void* errorrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnQueryNetworkProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(network, query, properties, errorrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)network;
    (void)query;
    (void)properties;
    (void)errorrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback(void* guestnetworkservice, void* callback, void* context, void* callbackhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnRegisterGuestNetworkServiceCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guestnetworkservice, callback, context, callbackhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guestnetworkservice;
    (void)callback;
    (void)context;
    (void)callbackhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback(void* callback, void* context, void* callbackhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnRegisterServiceCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callback, context, callbackhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callback;
    (void)context;
    (void)callbackhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle(void* portreservationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReleaseGuestNetworkServicePortReservationHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(portreservationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)portreservationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort(void* guestnetworkservice, int32_t protocol, int32_t access, uint16_t port, void* portreservationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guestnetworkservice, protocol, access, port, portreservationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guestnetworkservice;
    (void)protocol;
    (void)access;
    (void)port;
    (void)portreservationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange(void* guestnetworkservice, uint16_t portcount, void* portrangereservation, void* portreservationhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnReserveGuestNetworkServicePortRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guestnetworkservice, portcount, portrangereservation, portreservationhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)guestnetworkservice;
    (void)portcount;
    (void)portrangereservation;
    (void)portreservationhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback(void* callbackhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnUnregisterGuestNetworkServiceCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback(void* callbackhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computenetwork.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcnUnregisterServiceCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(callbackhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)callbackhandle;
    errno = ENOSYS;
    return -1;
#endif
}

