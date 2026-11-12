#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32DevicesUsbWinUsbAbortPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssysWindowsWin32DevicesUsbWinUsbFlushPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssysWindowsWin32DevicesUsbWinUsbFree(void* interfacehandle);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetAdjustedFrameNumber(void* currentframenumber, int64_t timestamp);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetAssociatedInterface(void* interfacehandle, uint8_t associatedinterfaceindex, void* associatedinterfacehandle);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetCurrentAlternateSetting(void* interfacehandle, void* settingnumber);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumber(void* interfacehandle, void* currentframenumber, void* timestamp);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetCurrentFrameNumberAndQpc(void* interfacehandle, void* frameqpcinfo);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetDescriptor(void* interfacehandle, uint8_t descriptortype, uint8_t arg2Index, uint16_t languageid, void* buffer, uint32_t bufferlength, void* lengthtransferred);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetOverlappedResult(void* interfacehandle, void* lpoverlapped, void* lpnumberofbytestransferred, int32_t bwait);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, void* valuelength, void* value);
int32_t windowssysWindowsWin32DevicesUsbWinUsbGetPowerPolicy(void* interfacehandle, uint32_t policytype, void* valuelength, void* value);
int32_t windowssysWindowsWin32DevicesUsbWinUsbInitialize(void* devicehandle, void* interfacehandle);
void* windowssysWindowsWin32DevicesUsbWinUsbParseConfigurationDescriptor(void* configurationdescriptor, void* startposition, int32_t interfacenumber, int32_t alternatesetting, int32_t interfaceclass, int32_t interfacesubclass, int32_t interfaceprotocol);
void* windowssysWindowsWin32DevicesUsbWinUsbParseDescriptors(void* descriptorbuffer, uint32_t totallength, void* startposition, int32_t descriptortype);
int32_t windowssysWindowsWin32DevicesUsbWinUsbQueryDeviceInformation(void* interfacehandle, uint32_t informationtype, void* bufferlength, void* buffer);
int32_t windowssysWindowsWin32DevicesUsbWinUsbQueryInterfaceSettings(void* interfacehandle, uint8_t alternateinterfacenumber, void* usbaltinterfacedescriptor);
int32_t windowssysWindowsWin32DevicesUsbWinUsbQueryPipe(void* interfacehandle, uint8_t alternateinterfacenumber, uint8_t pipeindex, void* pipeinformation);
int32_t windowssysWindowsWin32DevicesUsbWinUsbQueryPipeEx(void* interfacehandle, uint8_t alternatesettingnumber, uint8_t pipeindex, void* pipeinformationex);
int32_t windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped);
int32_t windowssysWindowsWin32DevicesUsbWinUsbReadIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, uint32_t numberofpackets, void* isopacketdescriptors, void* overlapped);
int32_t windowssysWindowsWin32DevicesUsbWinUsbReadPipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped);
int32_t windowssysWindowsWin32DevicesUsbWinUsbRegisterIsochBuffer(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* isochbufferhandle);
int32_t windowssysWindowsWin32DevicesUsbWinUsbResetPipe(void* interfacehandle, uint8_t pipeid);
int32_t windowssysWindowsWin32DevicesUsbWinUsbSetCurrentAlternateSetting(void* interfacehandle, uint8_t settingnumber);
int32_t windowssysWindowsWin32DevicesUsbWinUsbSetPipePolicy(void* interfacehandle, uint8_t pipeid, uint32_t policytype, uint32_t valuelength, void* value);
int32_t windowssysWindowsWin32DevicesUsbWinUsbSetPowerPolicy(void* interfacehandle, uint32_t policytype, uint32_t valuelength, void* value);
int32_t windowssysWindowsWin32DevicesUsbWinUsbStartTrackingForTimeSync(void* interfacehandle, void* starttrackinginfo);
int32_t windowssysWindowsWin32DevicesUsbWinUsbStopTrackingForTimeSync(void* interfacehandle, void* stoptrackinginfo);
int32_t windowssysWindowsWin32DevicesUsbWinUsbUnregisterIsochBuffer(void* isochbufferhandle);
int32_t windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipe(void* bufferhandle, uint32_t offset, uint32_t length, void* framenumber, void* overlapped);
int32_t windowssysWindowsWin32DevicesUsbWinUsbWriteIsochPipeAsap(void* bufferhandle, uint32_t offset, uint32_t length, int32_t continuestream, void* overlapped);
int32_t windowssysWindowsWin32DevicesUsbWinUsbWritePipe(void* interfacehandle, uint8_t pipeid, void* buffer, uint32_t bufferlength, void* lengthtransferred, void* overlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_USB_WINDOWS_WIN32_DEVICES_USB_WRAPPER_H */
