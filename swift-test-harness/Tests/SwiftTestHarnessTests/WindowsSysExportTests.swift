import WindowsSys
import Testing

@Suite
struct WindowsSysExportTests {
    @Test
    func swiftModuleLoads() {
        #expect(Bool(true), "WindowsSys swift module imported cleanly")
    }
}
