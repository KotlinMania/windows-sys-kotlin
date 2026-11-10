#ifndef WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_devices_display_brushobjHGetColorTransform(void* pbo);
void* windowssys_windows_win32_devices_display_brushobjPvAllocRbrush(void* pbo, uint32_t cj);
void* windowssys_windows_win32_devices_display_brushobjPvGetRbrush(void* pbo);
uint32_t windowssys_windows_win32_devices_display_brushobjUlGetBrushColor(void* pbo);
int32_t windowssys_windows_win32_devices_display_clipobjBEnum(void* pco, uint32_t cj, void* pul);
uint32_t windowssys_windows_win32_devices_display_clipobjCEnumStart(void* pco, int32_t ball, uint32_t itype, uint32_t idirection, uint32_t climit);
void* windowssys_windows_win32_devices_display_clipobjPpoGetPath(void* pco);
int32_t windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply(void* hmonitor, void* pszasciicapabilitiesstring, uint32_t dwcapabilitiesstringlengthincharacters);
int32_t windowssys_windows_win32_devices_display_degaussMonitor(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_destroyPhysicalMonitor(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_destroyPhysicalMonitors(uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray);
int32_t windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo(void* requestpacket);
int32_t windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo(void* setpacket);
void windowssys_windows_win32_devices_display_engAcquireSemaphore(void* hsem);
int32_t windowssys_windows_win32_devices_display_engAlphaBlend(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* prclsrc, void* pblendobj);
int32_t windowssys_windows_win32_devices_display_engAssociateSurface(void* hsurf, void* hdev, uint32_t flhooks);
int32_t windowssys_windows_win32_devices_display_engBitBlt(void* psotrg, void* psosrc, void* psomask, void* pco, void* pxlo, void* prcltrg, void* pptlsrc, void* pptlmask, void* pbo, void* pptlbrush, uint32_t rop4);
int32_t windowssys_windows_win32_devices_display_engCheckAbort(void* pso);
void* windowssys_windows_win32_devices_display_engComputeGlyphSet(int32_t ncodepage, int32_t nfirstchar, int32_t cchars);
int32_t windowssys_windows_win32_devices_display_engCopyBits(void* psodest, void* psosrc, void* pco, void* pxlo, void* prcldest, void* pptlsrc);
void* windowssys_windows_win32_devices_display_engCreateClip(void);
void* windowssys_windows_win32_devices_display_engCreatePalette(uint32_t imode, uint32_t ccolors, void* pulcolors, uint32_t flred, uint32_t flgreen, uint32_t flblue);
void* windowssys_windows_win32_devices_display_engCreateSemaphore(void);
void windowssys_windows_win32_devices_display_engDeleteClip(void* pco);
int32_t windowssys_windows_win32_devices_display_engDeletePalette(void* hpal);
void windowssys_windows_win32_devices_display_engDeletePath(void* ppo);
void windowssys_windows_win32_devices_display_engDeleteSemaphore(void* hsem);
int32_t windowssys_windows_win32_devices_display_engDeleteSurface(void* hsurf);
int32_t windowssys_windows_win32_devices_display_engEraseSurface(void* pso, void* prcl, uint32_t icolor);
int32_t windowssys_windows_win32_devices_display_engFillPath(void* pso, void* ppo, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix, uint32_t floptions);
void* windowssys_windows_win32_devices_display_engFindResource(void* h, int32_t iname, int32_t itype, void* pulsize);
void windowssys_windows_win32_devices_display_engFreeModule(void* h);
void windowssys_windows_win32_devices_display_engGetCurrentCodePage(void* oemcodepage, void* ansicodepage);
void* windowssys_windows_win32_devices_display_engGetDriverName(void* hdev);
void* windowssys_windows_win32_devices_display_engGetPrinterDataFileName(void* hdev);
int32_t windowssys_windows_win32_devices_display_engGradientFill(void* psodest, void* pco, void* pxlo, void* pvertex, uint32_t nvertex, void* pmesh, uint32_t nmesh, void* prclextents, void* pptlditherorg, uint32_t ulmode);
int32_t windowssys_windows_win32_devices_display_engLineTo(void* pso, void* pco, void* pbo, int32_t x1, int32_t y1, int32_t x2, int32_t y2, void* prclbounds, uint32_t mix);
void* windowssys_windows_win32_devices_display_engLoadModule(void* pwsz);
void* windowssys_windows_win32_devices_display_engLockSurface(void* hsurf);
int32_t windowssys_windows_win32_devices_display_engMarkBandingSurface(void* hsurf);
void windowssys_windows_win32_devices_display_engMultiByteToUnicodeN(void* unicodestring, uint32_t maxbytesinunicodestring, void* bytesinunicodestring, void* multibytestring, uint32_t bytesinmultibytestring);
int32_t windowssys_windows_win32_devices_display_engMultiByteToWideChar(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring);
int32_t windowssys_windows_win32_devices_display_engPaint(void* pso, void* pco, void* pbo, void* pptlbrushorg, uint32_t mix);
int32_t windowssys_windows_win32_devices_display_engPlgBlt(void* psotrg, void* psosrc, void* psomsk, void* pco, void* pxlo, void* pca, void* pptlbrushorg, void* pptfx, void* prcl, void* pptl, uint32_t imode);
int32_t windowssys_windows_win32_devices_display_engQueryEMFInfo(void* hdev, void* pemfinfo);
void windowssys_windows_win32_devices_display_engQueryLocalTime(void* param0);
void windowssys_windows_win32_devices_display_engReleaseSemaphore(void* hsem);
int32_t windowssys_windows_win32_devices_display_engStretchBlt(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode);
int32_t windowssys_windows_win32_devices_display_engStretchBltROP(void* psodest, void* psosrc, void* psomask, void* pco, void* pxlo, void* pca, void* pptlhtorg, void* prcldest, void* prclsrc, void* pptlmask, uint32_t imode, void* pbo, uint32_t rop4);
int32_t windowssys_windows_win32_devices_display_engStrokeAndFillPath(void* pso, void* ppo, void* pco, void* pxo, void* pbostroke, void* plineattrs, void* pbofill, void* pptlbrushorg, uint32_t mixfill, uint32_t floptions);
int32_t windowssys_windows_win32_devices_display_engStrokePath(void* pso, void* ppo, void* pco, void* pxo, void* pbo, void* pptlbrushorg, void* plineattrs, uint32_t mix);
int32_t windowssys_windows_win32_devices_display_engTextOut(void* pso, void* pstro, void* pfo, void* pco, void* prclextra, void* prclopaque, void* pbofore, void* pboopaque, void* pptlorg, uint32_t mix);
int32_t windowssys_windows_win32_devices_display_engTransparentBlt(void* psodst, void* psosrc, void* pco, void* pxlo, void* prcldst, void* prclsrc, uint32_t transcolor, uint32_t bcalledfrombitblt);
void windowssys_windows_win32_devices_display_engUnicodeToMultiByteN(void* multibytestring, uint32_t maxbytesinmultibytestring, void* bytesinmultibytestring, void* unicodestring, uint32_t bytesinunicodestring);
void windowssys_windows_win32_devices_display_engUnlockSurface(void* pso);
int32_t windowssys_windows_win32_devices_display_engWideCharToMultiByte(uint32_t codepage, void* widecharstring, int32_t bytesinwidecharstring, void* multibytestring, int32_t bytesinmultibytestring);
uint32_t windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles(void* pfo, void* phg);
uint32_t windowssys_windows_win32_devices_display_fontobjCGetGlyphs(void* pfo, uint32_t imode, uint32_t cglyph, void* phg, void* ppvglyph);
void* windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs(void* pfo, uint32_t imode);
void* windowssys_windows_win32_devices_display_fontobjPfdg(void* pfo);
void* windowssys_windows_win32_devices_display_fontobjPifi(void* pfo);
void* windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile(void* pfo, void* pcjfile);
void* windowssys_windows_win32_devices_display_fontobjPxoGetXform(void* pfo);
void windowssys_windows_win32_devices_display_fontobjVGetInfo(void* pfo, uint32_t cjsize, void* pfi);
int32_t windowssys_windows_win32_devices_display_getAutoRotationState(void* pstate);
int32_t windowssys_windows_win32_devices_display_getCapabilitiesStringLength(void* hmonitor, void* pdwcapabilitiesstringlengthincharacters);
int32_t windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences(void* porientation);
uint32_t windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(uint32_t flags, void* numpatharrayelements, void* nummodeinfoarrayelements);
int32_t windowssys_windows_win32_devices_display_getMonitorBrightness(void* hmonitor, void* pdwminimumbrightness, void* pdwcurrentbrightness, void* pdwmaximumbrightness);
int32_t windowssys_windows_win32_devices_display_getMonitorCapabilities(void* hmonitor, void* pdwmonitorcapabilities, void* pdwsupportedcolortemperatures);
int32_t windowssys_windows_win32_devices_display_getMonitorColorTemperature(void* hmonitor, void* pctcurrentcolortemperature);
int32_t windowssys_windows_win32_devices_display_getMonitorContrast(void* hmonitor, void* pdwminimumcontrast, void* pdwcurrentcontrast, void* pdwmaximumcontrast);
int32_t windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, void* pdwminimumposition, void* pdwcurrentposition, void* pdwmaximumposition);
int32_t windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, void* pdwminimumwidthorheight, void* pdwcurrentwidthorheight, void* pdwmaximumwidthorheight);
int32_t windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, void* pdwminimumdrive, void* pdwcurrentdrive, void* pdwmaximumdrive);
int32_t windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, void* pdwminimumgain, void* pdwcurrentgain, void* pdwmaximumgain);
int32_t windowssys_windows_win32_devices_display_getMonitorTechnologyType(void* hmonitor, void* pdtydisplaytechnologytype);
int32_t windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR(void* hmonitor, void* pdwnumberofphysicalmonitors);
int32_t windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR(void* hmonitor, uint32_t dwphysicalmonitorarraysize, void* pphysicalmonitorarray);
int32_t windowssys_windows_win32_devices_display_getTimingReport(void* hmonitor, void* pmtrmonitortimingreport);
int32_t windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply(void* hmonitor, uint8_t bvcpcode, void* pvct, void* pdwcurrentvalue, void* pdwmaximumvalue);
int32_t windowssys_windows_win32_devices_display_htGet8BppformatPalette(void* ppaletteentry, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma);
int32_t windowssys_windows_win32_devices_display_htGet8BppmaskPalette(void* ppaletteentry, int32_t use8bppmaskpal, uint8_t cmymask, uint16_t redgamma, uint16_t greengamma, uint16_t bluegamma);
int32_t windowssys_windows_win32_devices_display_pathobjBEnum(void* ppo, void* ppd);
int32_t windowssys_windows_win32_devices_display_pathobjBEnumClipLines(void* ppo, uint32_t cb, void* pcl);
void windowssys_windows_win32_devices_display_pathobjVEnumStart(void* ppo);
void windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines(void* ppo, void* pco, void* pso, void* pla);
void windowssys_windows_win32_devices_display_pathobjVGetBounds(void* ppo, void* prectfx);
uint32_t windowssys_windows_win32_devices_display_queryDisplayConfig(uint32_t flags, void* numpatharrayelements, void* patharray, void* nummodeinfoarrayelements, void* modeinfoarray, void* currenttopologyid);
int32_t windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_strobjBEnum(void* pstro, void* pc, void* ppgpos);
int32_t windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly(void* pstro, void* pc, void* ppgpos);
int32_t windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths(void* pso, uint32_t ifirst, uint32_t c, void* pptqd);
uint32_t windowssys_windows_win32_devices_display_strobjDwGetCodePage(void* pstro);
void windowssys_windows_win32_devices_display_strobjVEnumStart(void* pstro);
int32_t windowssys_windows_win32_devices_display_saveCurrentMonitorSettings(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_saveCurrentSettings(void* hmonitor);
int32_t windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(int32_t orientation);
int32_t windowssys_windows_win32_devices_display_setDisplayConfig(uint32_t numpatharrayelements, void* patharray, uint32_t nummodeinfoarrayelements, void* modeinfoarray, uint32_t flags);
int32_t windowssys_windows_win32_devices_display_setMonitorBrightness(void* hmonitor, uint32_t dwnewbrightness);
int32_t windowssys_windows_win32_devices_display_setMonitorColorTemperature(void* hmonitor, int32_t ctcurrentcolortemperature);
int32_t windowssys_windows_win32_devices_display_setMonitorContrast(void* hmonitor, uint32_t dwnewcontrast);
int32_t windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition(void* hmonitor, int32_t ptpositiontype, uint32_t dwnewposition);
int32_t windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize(void* hmonitor, int32_t stsizetype, uint32_t dwnewdisplayareawidthorheight);
int32_t windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive(void* hmonitor, int32_t dtdrivetype, uint32_t dwnewdrive);
int32_t windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain(void* hmonitor, int32_t gtgaintype, uint32_t dwnewgain);
int32_t windowssys_windows_win32_devices_display_setVCPFeature(void* hmonitor, uint8_t bvcpcode, uint32_t dwnewvalue);
int32_t windowssys_windows_win32_devices_display_xformobjBApplyXform(void* pxo, uint32_t imode, uint32_t cpoints, void* pvin, void* pvout);
uint32_t windowssys_windows_win32_devices_display_xformobjIGetXform(void* pxo, void* pxform);
uint32_t windowssys_windows_win32_devices_display_xlateobjCGetPalette(void* pxlo, uint32_t ipal, uint32_t cpal, void* ppal);
void* windowssys_windows_win32_devices_display_xlateobjHGetColorTransform(void* pxlo);
uint32_t windowssys_windows_win32_devices_display_xlateobjIXlate(void* pxlo, uint32_t icolor);
void* windowssys_windows_win32_devices_display_xlateobjPiVector(void* pxlo);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_DEVICES_DISPLAY_WINDOWS_WIN32_DEVICES_DISPLAY_WRAPPER_H */
