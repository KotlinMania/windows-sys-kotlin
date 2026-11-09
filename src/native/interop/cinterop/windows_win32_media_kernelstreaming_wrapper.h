#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator(void* connectionhandle, void* allocatorframing, void* allocatorhandle);
int32_t windowssys_windows_win32_media_kernelstreaming_KsCreateAllocator2(void* connectionhandle, void* allocatorframing, void* allocatorhandle);
uint32_t windowssys_windows_win32_media_kernelstreaming_KsCreateClock(void* connectionhandle, void* clockcreate, void* clockhandle);
int32_t windowssys_windows_win32_media_kernelstreaming_KsCreateClock2(void* connectionhandle, void* clockcreate, void* clockhandle);
uint32_t windowssys_windows_win32_media_kernelstreaming_KsCreatePin(void* filterhandle, void* arg_1_connect, uint32_t desiredaccess, void* connectionhandle);
int32_t windowssys_windows_win32_media_kernelstreaming_KsCreatePin2(void* filterhandle, void* arg_1_connect, uint32_t desiredaccess, void* connectionhandle);
uint32_t windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode(void* parenthandle, void* nodecreate, uint32_t desiredaccess, void* nodehandle);
int32_t windowssys_windows_win32_media_kernelstreaming_KsCreateTopologyNode2(void* parenthandle, void* nodecreate, uint32_t desiredaccess, void* nodehandle);
int32_t windowssys_windows_win32_media_kernelstreaming_KsGetMediaTypeCount(void* filterhandle, uint32_t pinfactoryid, void* mediatypecount);
int32_t windowssys_windows_win32_media_kernelstreaming_KsGetMultiplePinFactoryItems(void* filterhandle, uint32_t pinfactoryid, uint32_t propertyid, void* items);
int32_t windowssys_windows_win32_media_kernelstreaming_KsOpenDefaultDevice(void* category, uint32_t access, void* devicehandle);
int32_t windowssys_windows_win32_media_kernelstreaming_KsResolveRequiredAttributes(void* datarange, void* attributes);
int32_t windowssys_windows_win32_media_kernelstreaming_KsSynchronousDeviceControl(void* handle, uint32_t iocontrol, void* inbuffer, uint32_t inlength, void* outbuffer, uint32_t outlength, void* bytesreturned);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WINDOWS_WIN32_MEDIA_KERNELSTREAMING_WRAPPER_H */
