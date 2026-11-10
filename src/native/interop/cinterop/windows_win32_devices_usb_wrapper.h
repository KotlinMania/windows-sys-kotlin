#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_devices_usb_winUsbAbortPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssys_windows_win32_devices_usb_winUsbFlushPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssys_windows_win32_devices_usb_winUsbFree(void* interfacehandle);
int32_t windowssys_windows_win32_devices_usb_winUsbGetAdjustedFrameNumber(void* currentframenumber, int64_t timestamp);
int32_t windowssys_windows_win32_devices_usb_winUsbGetAssociatedInterface(void* interfacehandle, uint8_t associatedinterfaceindex, void* associatedinterfacehandle);
int32_t windowssys_windows_win32_devices_usb_winUsbGetCurrentAlternateSetting(void* interfacehandle, void* settingnumber);
int32_t windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumber(void* interfacehandle, void* currentframenumber, void* timestamp);
int32_t windowssys_windows_win32_devices_usb_winUsbGetCurrentFrameNumberAndQpc(void* interfacehandle, void* frameqpcinfo);
int32_t windowssys_windows_win32_devices_usb_winUsbGetDescriptor(void* interfacehandle, uint8_t descriptortype, uint8_t arg_2_index, uint16_t languageid, void* buffer, uint32_t bufferlength, void* lengthtransferred);
int32_t windowssys_windows_win32_devices_usb_winUsbGetOverlappedResult(void* interfacehandle, void* lpoverlapped, void* lpnumberofbytestransferred, int32_t bwait);
int32_t windowssys_windows_win32_devices_usb_winUsbGetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, void* valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_winUsbGetPowerPolicy(void* interfacehandle, uint32_t policytype, void* valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_winUsbInitialize(void* devicehandle, void* interfacehandle);
void* windowssys_windows_win32_devices_usb_winUsbParseConfigurationDescriptor(void* configurationdescriptor, void* startposition, int32_t interfacenumber, int32_t alternatesetting, int32_t interfaceclass, int32_t interfacesubclass, int32_t interfaceprotocol);
void* windowssys_windows_win32_devices_usb_winUsbParseDescriptors(void* descriptorbuffer, uint32_t totallength, void* startposition, int32_t descriptortype);
int32_t windowssys_windows_win32_devices_usb_winUsbQueryDeviceInformation(void* interfacehandle, uint32_t informationtype, void* bufferlength, void* buffer);
int32_t windowssys_windows_win32_devices_usb_winUsbQueryInterfaceSettings(void* interfacehandle, uint8_t alternateinterfacenumber, void* usbaltinterfacedescriptor);
int32_t windowssys_windows_win32_devices_usb_winUsbQueryPipe(void* interfacehandle, uint8_t alternateinterfacenumber, uint8_t pipeindex, void* pipeinformation);
int32_t windowssys_windows_win32_devices_usb_winUsbQueryPipeEx(void* interfacehandle, uint8_t alternatesettingnumber, uint8_t pipeindex, void* pipeinformationex);
int32_t windowssys_windows_win32_devices_usb_winUsbReadIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_winUsbReadIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_winUsbReadPipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_winUsbRegisterIsochBuffer(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* isochbufferhandle);
int32_t windowssys_windows_win32_devices_usb_winUsbResetPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssys_windows_win32_devices_usb_winUsbSetCurrentAlternateSetting(void* interfacehandle, uint8_t settingnumber);
int32_t windowssys_windows_win32_devices_usb_winUsbSetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, uint32_t valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_winUsbSetPowerPolicy(void* interfacehandle, uint32_t policytype, uint32_t valuelength, void* value);
int32_t windowssys_windows_win32_devices_usb_winUsbStartTrackingForTimeSync(void* interfacehandle, void* starttrackinginfo);
int32_t windowssys_windows_win32_devices_usb_winUsbStopTrackingForTimeSync(void* interfacehandle, void* stoptrackinginfo);
int32_t windowssys_windows_win32_devices_usb_winUsbUnregisterIsochBuffer(void* isochbufferhandle);
int32_t windowssys_windows_win32_devices_usb_winUsbWriteIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_winUsbWriteIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, void* overlapped);
int32_t windowssys_windows_win32_devices_usb_winUsbWritePipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H */
