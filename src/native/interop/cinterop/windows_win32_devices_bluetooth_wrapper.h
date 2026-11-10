#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDevice(void* hwndparent, void* hradio, void* pbtbi, void* pszpasskey, uint32_t ulpasskeylength);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateDeviceEx(void* hwndparentin, void* hradioin, void* pbtdiinout, void* pbtoobdata, int32_t authenticationrequirement);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothAuthenticateMultipleDevices(void* hwndparent, void* hradio, uint32_t cdevices, void* rgbtdi);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothDisplayDeviceProperties(void* hwndparent, void* pbtdi);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothEnableDiscovery(void* hradio, int32_t fenabled);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothEnableIncomingConnections(void* hradio, int32_t fenabled);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothEnumerateInstalledServices(void* hradio, void* pbtdi, void* pcserviceinout, void* pguidservices);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothFindDeviceClose(void* hfind);
void* windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstDevice(void* pbtsp, void* pbtdi);
void* windowssys_windows_win32_devices_bluetooth_bluetoothFindFirstRadio(void* pbtfrp, void* phradio);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothFindNextDevice(void* hfind, void* pbtdi);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothFindNextRadio(void* hfind, void* phradio);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothFindRadioClose(void* hfind);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTAbortReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTBeginReliableWrite(void* hdevice, void* reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTEndReliableWrite(void* hdevice, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristicValue(void* hdevice, void* characteristic, uint32_t characteristicvaluedatasize, void* characteristicvalue, void* characteristicvaluesizerequired, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetCharacteristics(void* hdevice, void* service, uint16_t characteristicsbuffercount, void* characteristicsbuffer, void* characteristicsbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptorValue(void* hdevice, void* descriptor, uint32_t descriptorvaluedatasize, void* descriptorvalue, void* descriptorvaluesizerequired, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetDescriptors(void* hdevice, void* characteristic, uint16_t descriptorsbuffercount, void* descriptorsbuffer, void* descriptorsbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetIncludedServices(void* hdevice, void* parentservice, uint16_t includedservicesbuffercount, void* includedservicesbuffer, void* includedservicesbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTGetServices(void* hdevice, uint16_t servicesbuffercount, void* servicesbuffer, void* servicesbufferactual, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTRegisterEvent(void* hservice, int32_t eventtype, void* eventparameterin, void* callback, void* callbackcontext, void* peventhandle, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetCharacteristicValue(void* hdevice, void* characteristic, void* characteristicvalue, uint64_t reliablewritecontext, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTSetDescriptorValue(void* hdevice, void* descriptor, void* descriptorvalue, uint32_t flags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothGATTUnregisterEvent(int64_t eventhandle, uint32_t flags);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothGetDeviceInfo(void* hradio, void* pbtdi);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothGetRadioInfo(void* hradio, void* pradioinfo);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothIsConnectable(void* hradio);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothIsDiscoverable(void* hradio);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothIsVersionAvailable(uint8_t majorversion, uint8_t minorversion);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthentication(void* pbtdi, void* phreghandle, void* pfncallback, void* pvparam);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothRegisterForAuthenticationEx(void* pbtdiin, void* phreghandleout, void* pfncallbackin, void* pvparam);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothRemoveDevice(void* paddress);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothSdpEnumAttributes(void* psdpstream, uint32_t cbstreamsize, void* pfncallback, void* pvparam);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetAttributeValue(void* precordstream, uint32_t cbrecordlength, uint16_t usattributeid, void* pattributedata);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetContainerElementData(void* pcontainerstream, uint32_t cbcontainerlength, void* pelement, void* pdata);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetElementData(void* psdpstream, uint32_t cbsdpstreamlength, void* pdata);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSdpGetString(void* precordstream, uint32_t cbrecordlength, void* pstringdata, uint16_t usstringoffset, void* pszstring, void* pcchstringlength);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevices(void* pbtsdp);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothSelectDevicesFree(void* pbtsdp);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponse(void* hradio, void* pbtdi, void* pszpasskey);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSendAuthenticationResponseEx(void* hradioin, void* pauthresponse);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSetLocalServiceInfo(void* hradioin, void* pclassguid, uint32_t ulinstance, void* pserviceinfoin);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothSetServiceState(void* hradio, void* pbtdi, void* pguidservice, uint32_t dwserviceflags);
int32_t windowssys_windows_win32_devices_bluetooth_bluetoothUnregisterAuthentication(int64_t hreghandle);
uint32_t windowssys_windows_win32_devices_bluetooth_bluetoothUpdateDeviceRecord(void* pbtdi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_BLUETOOTH_WINDOWS_WIN32_DEVICES_BLUETOOTH_WRAPPER_H */
