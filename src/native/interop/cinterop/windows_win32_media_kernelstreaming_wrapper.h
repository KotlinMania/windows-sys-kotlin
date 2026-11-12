#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator(void* connectionhandle, void* allocatorframing, void* allocatorhandle);
int32_t windowssysWindowsWin32MediaKernelstreamingKsCreateAllocator2(void* connectionhandle, void* allocatorframing, void* allocatorhandle);
uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreateClock(void* connectionhandle, void* clockcreate, void* clockhandle);
int32_t windowssysWindowsWin32MediaKernelstreamingKsCreateClock2(void* connectionhandle, void* clockcreate, void* clockhandle);
uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreatePin(void* filterhandle, void* arg1Connect, uint32_t desiredaccess, void* connectionhandle);
int32_t windowssysWindowsWin32MediaKernelstreamingKsCreatePin2(void* filterhandle, void* arg1Connect, uint32_t desiredaccess, void* connectionhandle);
uint32_t windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode(void* parenthandle, void* nodecreate, uint32_t desiredaccess, void* nodehandle);
int32_t windowssysWindowsWin32MediaKernelstreamingKsCreateTopologyNode2(void* parenthandle, void* nodecreate, uint32_t desiredaccess, void* nodehandle);
int32_t windowssysWindowsWin32MediaKernelstreamingKsGetMediaTypeCount(void* filterhandle, uint32_t pinfactoryid, void* mediatypecount);
int32_t windowssysWindowsWin32MediaKernelstreamingKsGetMultiplePinFactoryItems(void* filterhandle, uint32_t pinfactoryid, uint32_t propertyid, void* items);
int32_t windowssysWindowsWin32MediaKernelstreamingKsOpenDefaultDevice(void* category, uint32_t access, void* devicehandle);
int32_t windowssysWindowsWin32MediaKernelstreamingKsResolveRequiredAttributes(void* datarange, void* attributes);
int32_t windowssysWindowsWin32MediaKernelstreamingKsSynchronousDeviceControl(void* handle, uint32_t iocontrol, void* inbuffer, uint32_t inlength, void* outbuffer, uint32_t outlength, void* bytesreturned);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WRAPPER_H */
