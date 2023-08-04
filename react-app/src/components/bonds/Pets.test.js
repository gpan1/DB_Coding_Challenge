import React from "react";
import { render } from "@testing-library/react";
import { Bonds } from "./Bonds";

describe("<Bonds />", () => {
  it("component should render", () => {
    const { container } = render(<Bonds />);
    expect(container).toBeDefined();
  });
});
