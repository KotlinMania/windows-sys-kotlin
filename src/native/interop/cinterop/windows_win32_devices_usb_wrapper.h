#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_usb_WinUsb_AbortPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssys_windows_win32_devices_usb_WinUsb_FlushPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssys_windows_win32_devices_usb_WinUsb_Free(void* interfacehandle);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetAdjustedFrameNumber(void* currentframenumber, int64_t timestamp);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetAssociatedInterface(void* interfacehandle, uint8_t associatedinterfaceindex, void* associatedinterfacehandle);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetCurrentAlternateSetting(void* interfacehandle, void* settingnumber);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumber(void* interfacehandle, void* currentframenumber, void* timestamp);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetCurrentFrameNumberAndQpc(void* interfacehandle, void* frameqpcinfo);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetDescriptor(void* interfacehandle, uint8_t descriptortype, uint8_t arg_2_index, uint16_t languageid, void* buffer, uint32_t bufferlength, void* lengthtransferred);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetOverlappedResult(void* interfacehandle, void* lpoverlapped, void* lpnumberofbytestransferred, int32_t bwait);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, void* valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_WinUsb_GetPowerPolicy(void* interfacehandle, uint32_t policytype, void* valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_WinUsb_Initialize(void* devicehandle, void* interfacehandle);
void* windowssys_windows_win32_devices_usb_WinUsb_ParseConfigurationDescriptor(void* configurationdescriptor, void* startposition, int32_t interfacenumber, int32_t alternatesetting, int32_t interfaceclass, int32_t interfacesubclass, int32_t interfaceprotocol);
void* windowssys_windows_win32_devices_usb_WinUsb_ParseDescriptors(void* descriptorbuffer, uint32_t totallength, void* startposition, int32_t descriptortype);
int32_t windowssys_windows_win32_devices_usb_WinUsb_QueryDeviceInformation(void* interfacehandle, uint32_t informationtype, void* bufferlength, void* buffer);
int32_t windowssys_windows_win32_devices_usb_WinUsb_QueryInterfaceSettings(void* interfacehandle, uint8_t alternateinterfacenumber, void* usbaltinterfacedescriptor);
int32_t windowssys_windows_win32_devices_usb_WinUsb_QueryPipe(void* interfacehandle, uint8_t alternateinterfacenumber, uint8_t pipeindex, void* pipeinformation);
int32_t windowssys_windows_win32_devices_usb_WinUsb_QueryPipeEx(void* interfacehandle, uint8_t alternatesettingnumber, uint8_t pipeindex, void* pipeinformationex);
int32_t windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_WinUsb_ReadIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_WinUsb_ReadPipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_WinUsb_RegisterIsochBuffer(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* isochbufferhandle);
int32_t windowssys_windows_win32_devices_usb_WinUsb_ResetPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssys_windows_win32_devices_usb_WinUsb_SetCurrentAlternateSetting(void* interfacehandle, uint8_t settingnumber);
int32_t windowssys_windows_win32_devices_usb_WinUsb_SetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, uint32_t valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_WinUsb_SetPowerPolicy(void* interfacehandle, uint32_t policytype, uint32_t valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_WinUsb_StartTrackingForTimeSync(void* interfacehandle, void* starttrackinginfo);
int32_t windowssys_windows_win32_devices_usb_WinUsb_StopTrackingForTimeSync(void* interfacehandle, void* stoptrackinginfo);
int32_t windowssys_windows_win32_devices_usb_WinUsb_UnregisterIsochBuffer(void* isochbufferhandle);
int32_t windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_WinUsb_WriteIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_WinUsb_WritePipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H */
